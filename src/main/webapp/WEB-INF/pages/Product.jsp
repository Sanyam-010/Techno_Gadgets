<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.TechnoGadgets.model.ProductModel" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Products</title>  <style>
    body {
      margin: 0;
      font-family: 'Poppins', sans-serif;
      background-color: #0d0d0d;
      color: #ffffff;
    }

    main {
      padding: 2rem;
    }

    h1 {
      color: #ffffff;
      font-size: 2.5rem;
      margin-bottom: 2rem;
      text-align: center;
    }

    .product-list {
      display: flex;
      flex-wrap: wrap;
      justify-content: center;
      gap: 2rem;
    }

    .product-card {
      background-color: #1a1a1a;
      border: 1px solid #333;
      border-radius: 10px;
      width: 280px;
      padding: 1.5rem;
      text-align: center;
      transition: transform 0.3s ease;
    }

    .product-card:hover {
      transform: scale(1.03);
    }

    .product-card img {
      width: 100%;
      height: auto;
      border-radius: 8px;
      margin-bottom: 1rem;
    }

    .product-card p {
      font-size: 1rem;
      margin: 0.5rem 0;
    }

    .product-card label {
      display: block;
      margin: 1rem 0 0.5rem;
    }

    .product-card input[type="number"] {
      width: 60px;
      padding: 0.5rem;
      border: 1px solid #444;
      border-radius: 6px;
      background-color: #2e2e2e;
      color: #fff;
    }

    .product-card button {
      margin-top: 1rem;
      margin-right: 0.5rem;
      padding: 0.6rem 1.2rem;
      font-size: 0.95rem;
      border: none;
      border-radius: 20px;
      cursor: pointer;
      background-color: #ffffff;
      color: #000000;
      transition: background-color 0.3s ease;
    }

    .product-card button:hover {
      background-color: #cccccc;
    }
  </style>
</head>
<body>

<jsp:include page="Header.jsp" />

<main>
  <h1>Our Products</h1>
  <div class="product-list">
    <%
      List<ProductModel> products = (List<ProductModel>) request.getAttribute("products");
      if (products != null && !products.isEmpty()) {
        for (ProductModel product : products) {
    %>
    <div class="product-card">
      <form action="<%= request.getContextPath() %>/cart" method="post">
        <img src="<%= request.getContextPath() %>/image/<%= product.getImage_path() %>" alt="<%= product.getProductName() %>">
        <p><strong>Product:</strong> <%= product.getProductName() %></p>
        <p><strong>Price:</strong> Rs. <%= product.getPrice() %></p>
        <p><strong>Available:</strong> <%= product.getQuantity() %> pcs</p>

        <input type="hidden" name="productId" value="<%= product.getProductId() %>">
        <input type="hidden" name="productName" value="<%= product.getProductName() %>">
        <input type="hidden" name="price" value="<%= product.getPrice() %>">
        <input type="hidden" name="imagePath" value="<%= product.getImage_path() %>">

        <label for="qty">Qty:</label>
        <input type="number" name="quantity" value="1" min="1" max="<%= product.getQuantity() %>" required>

        <div>
          <button type="submit" name="action" value="add">Add to Cart</button>
          <button type="submit" name="action" value="buy">Buy Now</button>
        </div>
      </form>
    </div>
    <%
        }
      } else {
    %>
    <p style="text-align: center;">No products available at the moment.</p>
    <%
      }
    %>
  </div>
</main>

<jsp:include page="Footer.jsp" />

</body>
</html>
