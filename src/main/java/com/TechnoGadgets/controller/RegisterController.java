package com.TechnoGadgets.controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import com.TechnoGadgets.config.Dbconfig;

import com.TechnoGadgets.util.ValidationUtil;
import com.TechnoGadgets.util.PasswordUtil;

import com.TechnoGadgets.model.CustomerModel;
import com.TechnoGadgets.model.AdminModel;

import com.TechnoGadgets.util.ImageUtil;

import com.TechnoGadgets.service.RegisterService;
import com.TechnoGadgets.util.RedirectionUtil;

/**
 * auther SAMYAM ViPeR
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/register" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
public class RegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private ImageUtil imageUtil;
	private RegisterService registerService;
	private RedirectionUtil redirectionUtil;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        request.getRequestDispatcher("/WEB-INF/pages/Register.jsp").forward(request, response);
    }
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			CustomerModel customermodel = customermodel(req, resp);
			Boolean isAdded = registerService.addcustomer(customermodel);

			if (isAdded == null) {
				redirectionUtil.setMsgAndRedirect(req, resp, "error",
						"An unexpected error occurred. Please try again later!", RedirectionUtil.registerUrl);
			} else if (isAdded) {
				if (uploadImage(req)) {
					redirectionUtil.setMsgAndRedirect(req, resp, "success", "Your account is successfully created!",
							RedirectionUtil.loginUrl);
				} else {
					redirectionUtil.setMsgAndRedirect(req, resp, "error",
							"Could not upload the image. Please try again later!", RedirectionUtil.registerUrl);
				}
			} else {
				redirectionUtil.setMsgAndRedirect(req, resp, "error",
						"Could not register your account. Please try again later!", RedirectionUtil.registerUrl);
			}
		} catch (Exception e) {
			redirectionUtil.setMsgAndRedirect(req, resp, "error",
					"An unexpected error occurred. Please try again later!", RedirectionUtil.registerUrl);
			e.printStackTrace(); // Log the exception
		}
	}

	private CustomerModel (HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		return null;
	}
	private CustomerModel extractStudentModel(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("getLastname");
		String username=req.getParameter("Username");
		LocalDate dob = LocalDate.parse(req.getParameter("dob"));
		String gender = req.getParameter("Gender");
		String email  = req.getParameter("Phone");
		String phone = req.getParameter("Phone");
		String password = req.getParameter("Password");
		String profilepicture = req.getParameter("Profilepicture");
		
		String retypePassword = req.getParameter("retypePassword");

		if (password == null || !password.equals(retypePassword)) {
			redirectionUtil.setMsgAndRedirect(req, resp, "error", "Please correct your password & retype-password!",
					RedirectionUtil.registerUrl);
		}

		password = PasswordUtil.encrypt(username, password);

		Part image = req.getPart("image");
		String imageUrl = imageUtil.getImageNameFromPart(image);

		return new CustomerModel(firstName, lastName, username, dob, gender, email, phone, password, profilepicture);
	}

	private boolean uploadImage(HttpServletRequest req) throws IOException, ServletException {
		Part image = req.getPart("image");
		return imageUtil.uploadImage(image, req.getServletContext().getRealPath("/"), "student");
	}

}