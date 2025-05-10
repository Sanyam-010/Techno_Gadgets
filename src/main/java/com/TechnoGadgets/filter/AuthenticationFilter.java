//package com.TechnoGadgets.filter;
//import com.TechnoGadgets.controller.AboutController;
//import com.TechnoGadgets.config.Dbconfig;
//import com.TechnoGadgets.controller.ProductController;
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import com.TechnoGadgets.util.CookieUtil;
//import com.TechnoGadgets.util.SessionUtil;
//
//@WebFilter(asyncSupported = true, urlPatterns = "/*")
//public class AuthenticationFilter implements Filter {
//
////	private static final String LOGIN = "/login";
////	private static final String REGISTER = "/register";
////	private static final String HOME = "/home";
////	private static final String ROOT = "/";
////	private static final String DASHBOARD = "/dashboard";
////	private static final String MODIFY_STUDENTS = "/modifyStudents";
////	private static final String STUDENT_UPDATE = "/studentUpdate";
////	private static final String ADMIN_ORDER = "/adminOrder";
////	private static final String ABOUT = "/about";
////	private static final String PORTFOLIO = "/portfolio";
////	private static final String CONTACT = "/contact";
////	private static final String ORDER_LIST = "/orderlist";
////	private static final String CART_LIST = "/cartlist";
//
//	private static final String LOGIN = "/login";
//	private static final String REGISTER ="/register" ;
//	private static final String DASHBOARD = "/dash";
//	private static final String Root ="/";
//	private static final String About="/about";
//	private static final String Contact="/contact";
//	private static final String Dashboard="/dash";
//	private static final String Home ="/home";
//	private static final String Order = "/order";
//	private static final String Product ="/ProductController";
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		// Initialization logic, if required
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//
//		HttpServletRequest req = (HttpServletRequest) request;
//		HttpServletResponse res = (HttpServletResponse) response;
//
//		String uri = req.getRequestURI();
//		
//		// Allow access to resources
//		if (uri.endsWith(".png") || uri.endsWith(".jpg") || uri.endsWith(".css")) {
//			chain.doFilter(request, response);
//			return;
//		}
//		
//		boolean isLoggedIn = SessionUtil.getAttribute(req, "username") != null;
//		String userRole = CookieUtil.getCookie(req, "role") != null ? CookieUtil.getCookie(req, "role").getValue()
//				: null;
//
//		if ("admin".equals(userRole)) {
//			// Admin is logged in
//			if (uri.endsWith(LOGIN) || uri.endsWith(REGISTER)) {
//				res.sendRedirect(req.getContextPath() + DASHBOARD);
//			} 
//			else if (uri.endsWith(DASHBOARD) || uri.endsWith(MODIFY_STUDENTS) || uri.endsWith(STUDENT_UPDATE)
//					|| uri.endsWith(ADMIN_ORDER) || uri.endsWith(HOME) || uri.endsWith(ROOT)) {
//				chain.doFilter(request, response);
//			} 
//			else if (uri.endsWith(ORDER_LIST) || uri.endsWith(CART_LIST)) {
//				res.sendRedirect(req.getContextPath() + DASHBOARD);
//			}
//			else {
//				res.sendRedirect(req.getContextPath() + DASHBOARD);
//			}
//		} 
//		else if ("customer".equals(userRole)) {
//			// User is logged in
//			if (uri.endsWith(LOGIN) || uri.endsWith(REGISTER)) {
//				res.sendRedirect(req.getContextPath() + Home);
//			} 
//			else if (uri.endsWith(Home) || uri.endsWith(Root) || uri.endsWith(About) || uri.endsWith(PORTFOLIO)
//					|| uri.endsWith(Contact) || uri.endsWith(ORDER_LIST) || uri.endsWith(CART_LIST)) {
//				chain.doFilter(request, response);
//			} 
//			else if (uri.endsWith(DASHBOARD) || uri.endsWith(MODIFY_STUDENTS) || uri.endsWith(STUDENT_UPDATE)
//					|| uri.endsWith(ADMIN_ORDER)) {
//				res.sendRedirect(req.getContextPath() + Home);
//			} 
//			else {
//				res.sendRedirect(req.getContextPath() + Home);
//			}
//		} 
//		else {
//			// Not logged in
//			if (uri.endsWith(LOGIN) || uri.endsWith(REGISTER) || uri.endsWith(Home) || uri.endsWith(Root)) {
//				chain.doFilter(request, response);
//			}
//			else {
//				res.sendRedirect(req.getContextPath() + LOGIN);
//			}
//		}
//	}
//
//	@Override
//	public void destroy() {
//		// Cleanup logic if neede
//	}
//}