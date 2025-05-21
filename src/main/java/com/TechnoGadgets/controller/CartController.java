package com.TechnoGadgets.controller;

import com.TechnoGadgets.model.ProductModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cart")
public class CartController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession();
        String action = req.getParameter("action");

        // Initialize or get existing cart
        List<ProductModel> cart = (List<ProductModel>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
        }

        // Get product data from form
        int productId = Integer.parseInt(req.getParameter("productId"));
        String productName = req.getParameter("productName");
        int price = Integer.parseInt(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        String imagePath = req.getParameter("imagePath");

        ProductModel product = new ProductModel(productId, productName, price, quantity, imagePath);

        if ("add".equalsIgnoreCase(action)) {
            // Add to cart
            cart.add(product);
            session.setAttribute("cart", cart);
            resp.sendRedirect(req.getContextPath() + "/Product.jsp");
        } else if ("buy".equalsIgnoreCase(action)) {
            // Direct purchase
            List<ProductModel> singleItemList = new ArrayList<>();
            singleItemList.add(product);
            session.setAttribute("cart", singleItemList);
            resp.sendRedirect(req.getContextPath() + "/Addtocart.jsp");
        } else if ("checkout".equalsIgnoreCase(action)) {
            // You can implement checkout logic here (DB operations, order saving etc.)
            session.removeAttribute("cart");
            resp.sendRedirect(req.getContextPath() + "/OrderSuccess.jsp"); // You may need to create this JSP
        } else {
            resp.sendRedirect(req.getContextPath() + "/Product.jsp");
        }
    }
}
