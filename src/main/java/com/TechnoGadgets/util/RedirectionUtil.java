package com.TechnoGadgets.util;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Utility class to simplify redirection with messages.
 * Author: Viper
 */
public class RedirectionUtil {

    // URLs used across controllers
    public static final String registerUrl = "/register";
    public static final String loginUrl = "/login";
    public static final String homeUrl = "/home";
    public static final String dashboard = "/dash";

    
    public void setMsgAttribute(HttpServletRequest req, String msgType, String msg) {
        req.setAttribute(msgType, msg);
    }


    public void redirectToPage(HttpServletRequest req, HttpServletResponse resp, String page)
            throws ServletException, IOException {
        req.getRequestDispatcher(page).forward(req, resp);
    }

    
    public void setMsgAndRedirect(HttpServletRequest req, HttpServletResponse resp,
                                   String msgType, String msg, String page)
            throws ServletException, IOException {
        setMsgAttribute(req, msgType, msg);
        redirectToPage(req, resp, page);
    }
}
