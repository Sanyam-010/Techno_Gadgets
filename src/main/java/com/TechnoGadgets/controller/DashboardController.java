package com.TechnoGadgets.controller;

import com.TechnoGadgets.service.adminService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class DashboardController
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/dash" })
public class DashboardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DashboardController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		adminService service = new adminService();

		int totalSales = service.getTotalSalesCount();
		String topCustomer = service.getTopCustomerName();
		String bestProduct = service.getMostSellingProductName();
		List<String> top10Customers = service.getTop10Customers();

		request.setAttribute("totalSales", totalSales);
		request.setAttribute("topCustomer", topCustomer);
		request.setAttribute("bestProduct", bestProduct);
		request.setAttribute("top10Customers", top10Customers);

		// Forward to JSP
		request.getRequestDispatcher("/WEB-INF/pages/dashboard.jsp").forward(request, response);//viper
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
