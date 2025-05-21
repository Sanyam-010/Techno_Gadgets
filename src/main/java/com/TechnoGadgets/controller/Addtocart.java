package com.TechnoGadgets.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.TechnoGadgets.model.ProductModel;
import com.TechnoGadgets.service.ProductService;

public class Addtocart extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final ProductService productService = new ProductService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession();
        String action = req.getParameter("action");
        int productId = Integer.parseInt(req.getParameter("productId"));
        String productName = req.getParameter("productName");
        int price = Integer.parseInt(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        String imagePath = req.getParameter("imagePath");  

        @SuppressWarnings("unchecked")
        List<ProductModel> cart = (List<ProductModel>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
        }

        if ("add".equalsIgnoreCase(action)) {
            ProductModel item = new ProductModel(productId, productName, price, quantity, imagePath); // ✅ updated
            cart.add(item);
            session.setAttribute("cart", cart);
            resp.sendRedirect("Addtocart.jsp");

        } else if ("buyNow".equalsIgnoreCase(action)) {
            boolean success = productService.decreaseStock(productId, quantity);
            if (success) {
                session.setAttribute("message", "Purchase successful for " + productName);
            } else {
                session.setAttribute("error", "Not enough stock for " + productName);
            }
            resp.sendRedirect("Addtocart.jsp");

        } else if ("remove".equalsIgnoreCase(action)) {
            cart.removeIf(item -> item.getProductId() == productId);
            session.setAttribute("cart", cart);
            resp.sendRedirect("Addtocart.jsp");
        }
    }
}