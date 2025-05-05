package com.TechnoGadgets.controller;

import java.io.IOException;

import com.TechnoGadgets.util.RedirectionUtil;
import com.TechnoGadgets.util.ValidationUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author samyam VIper
 * 
 * Faster snake like viper 
 * 
 * as if viper viper
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private final ValidationUtil validationUtil = new ValidationUtil();
    private final RedirectionUtil redirectionUtil = new RedirectionUtil();

//    private final String rootURL = "WEB-INF/pages";
//    private final String loginURL = rootURL + "/login";
//    private final String homeURL = rootURL + "/home";

    public LoginController() {
        super(); 
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("pass");

        if (validationUtil.isNullOrEmpty(email) || validationUtil.isNullOrEmpty(password)) {
            redirectionUtil.setMsgAndRedirect(req, resp, "error", "Please fill all the fields!", "/login");
        } 
        else {
            if ("admin".equals(email) && "admin".equals(password)) {
                redirectionUtil.setMsgAndRedirect(req, resp, "success", "Successfully Logged In!", "/home");
            } 
            else if("Customer".equals(email)&& "Customer".equals(password)) {
            	redirectionUtil.setMsgAndRedirect(req, resp, "success", "Successfully Logged In!", "/home");
            }
            	else {
                redirectionUtil.setMsgAndRedirect(req, resp, "error", "Either username or password is incorrect!", "/login");
            }
        }
    }
}