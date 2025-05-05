package com.TechnoGadgets.controller;

import jakarta.servlet.ServletException;
import com.TechnoGadgets.model.CustomerModel;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import com.TechnoGadgets.config.Dbconfig;

/**
 * auther SAMYAM ViPeR
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/register" })
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/WEB-INF/pages/Register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmPassword");
		String url = request.getContextPath() + "/register";
		String dobString = request.getParameter("dob");
		
		LocalDate dob = null;
		try {
		    dob = LocalDate.parse(dobString);  // format yyyy-MM-dd string to date 
		} catch (Exception e) {
		    response.sendRedirect(request.getContextPath() + "/register?error=dobformat");
		    return;
		}

		if (!isValidName(firstname) || !isValidName(lastname)) {
			response.sendRedirect(request.getContextPath() + "?error=name");
			return;
		}

		// should not be in future
		if (dob.isAfter(LocalDate.now())) {
			response.sendRedirect(request.getContextPath() + "?error=birthday");
			return;
		}

		// p validation
		if (!isValidPhoneNumber(phone)) {
			response.sendRedirect(request.getContextPath() + "?error=phone");
			return;
		}

		// 7. p confor
		if (!isValidPassword(password, confirmpassword)) {
			response.sendRedirect(request.getContextPath() + "?error=password");
			return;
		}
	
	// 8. D check
//	if(Dbconfig.isEmailExists(email)||dbController.isPhoneNumberExists(phone))
//
//	{
//		response.sendRedirect(request.getContextPath() + "?error=duplicate");
//		return;
//	}
//
//	// 9. Add to DB (Customer model)
//	CustomerModel customermodel = new customermodel(firstName, lastname, phone, email, phone, password, dob);
//
//	if(result==1)
//	{
//		response.sendRedirect(request.getContextPath() + "/pages/login.html");
//	}else
//	{
//		response.sendRedirect(request.getContextPath() + "?error=general");
}

	private boolean isValidName(String firstname) {
		return !firstname.matches(".*\\d.*") && !firstname.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
	}

	private boolean isValidPhoneNumber(String phone) {
		return phone != null && phone.startsWith("+") && phone.length() == 14;
	}

	private boolean isValidPassword(String password, String confirmpassword) {
		return password != null && password.length() > 6 && password.matches(".*\\d.*")
				&& password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*") && password.matches(".*[A-Z].*")
				&& password.equals(confirmpassword);
		}
}