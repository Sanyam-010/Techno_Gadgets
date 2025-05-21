package com.TechnoGadgets.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.time.LocalDate;

import com.TechnoGadgets.model.CustomerModel;
import com.TechnoGadgets.service.RegisterService;
import com.TechnoGadgets.util.ImageUtil;
import com.TechnoGadgets.util.PasswordUtil;
import com.TechnoGadgets.util.RedirectionUtil;

@WebServlet(asyncSupported = true, urlPatterns = { "/register" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
public class RegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private final ImageUtil imageUtil = new ImageUtil();
    private final RegisterService registerService = new RegisterService();
    private final RedirectionUtil redirectionUtil = new RedirectionUtil();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Forward to register form
        request.getRequestDispatcher("/WEB-INF/pages/Register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            CustomerModel customerModel = extractCustomerModel(req, resp);
            if (customerModel == null) return;

            boolean isAdded = registerService.addCustomer(customerModel);

            if (!isAdded) {
                redirectionUtil.setMsgAndRedirect(req, resp, "error",
                        "Could not register your account. Please try again later!",
                        "/WEB-INF/pages/Register.jsp");
                return;
            }

            if (!uploadImage(req)) {
                redirectionUtil.setMsgAndRedirect(req, resp, "error",
                        "Account created but image upload failed.",
                        "/WEB-INF/pages/Register.jsp");
                return;
            }

            // Forward to dashboard or homepage JSP (inside WEB-INF)
            if ("admin".equalsIgnoreCase(customerModel.getRole())) {
                req.getRequestDispatcher("/WEB-INF/pages/dashboard.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(req, resp);
            }

        } catch (Exception e) {
            e.printStackTrace();
            redirectionUtil.setMsgAndRedirect(req, resp, "error",
                    "An unexpected error occurred. Please try again later!",
                    "/WEB-INF/pages/Register.jsp");
        }
    }

    private CustomerModel extractCustomerModel(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String first_name = req.getParameter("firstName");
        String last_name = req.getParameter("lastName");
        String username = req.getParameter("username");
        int phone_number = Integer.parseInt(req.getParameter("phoneNumber"));
        String gender = req.getParameter("gender");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String retypePassword = req.getParameter("retypePassword");
        String role = req.getParameter("subject");
        LocalDate dob = LocalDate.parse(req.getParameter("dob"));

        if (password == null || !password.equals(retypePassword)) {
            redirectionUtil.setMsgAndRedirect(req, resp, "error",
                    "Passwords do not match!", "/WEB-INF/pages/Register.jsp");
            return null;
        }

        password = PasswordUtil.encrypt(username, password);
        Part image = req.getPart("image");
        String imagePath = imageUtil.getImageNameFromPart(image);

        return new CustomerModel(first_name, last_name, username, phone_number, gender, email,
                password, dob, imagePath, role);
    }

    private boolean uploadImage(HttpServletRequest req) throws IOException, ServletException {
        Part image = req.getPart("image");
        return imageUtil.uploadImage(image, req.getServletContext().getRealPath("/"), "customer");
    }
}
