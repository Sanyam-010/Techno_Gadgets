package com.TechnoGadgets.controller;

import com.TechnoGadgets.model.CustomerModel;
import com.TechnoGadgets.service.LoginService;
import com.TechnoGadgets.util.RedirectionUtil;
import com.TechnoGadgets.util.ValidationUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private final ValidationUtil validationUtil = new ValidationUtil();
    private final RedirectionUtil redirectionUtil = new RedirectionUtil();
    private final LoginService loginService = new LoginService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (validationUtil.isNullOrEmpty(username) || validationUtil.isNullOrEmpty(password)) {
            redirectionUtil.setMsgAndRedirect(req, resp, "error",
                    "Please fill all the fields!", "/WEB-INF/pages/login.jsp");
            return;
        }

        CustomerModel user = loginService.validateUser(username, password);

        if (user == null) {
            redirectionUtil.setMsgAndRedirect(req, resp, "error",
                    "Invalid username or password!", "/WEB-INF/pages/login.jsp");
            return;
        }

        // Store user info in session
        HttpSession session = req.getSession();
        session.setAttribute("username", user.getUsername());
        session.setAttribute("firstname", user.getFirst_name());
        session.setAttribute("role", user.getRole());

        //Redirect based on role
        if ("admin".equalsIgnoreCase(user.getRole())) {
            req.getRequestDispatcher("/WEB-INF/pages/dashboard.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(req, resp);
        }
    }
}
