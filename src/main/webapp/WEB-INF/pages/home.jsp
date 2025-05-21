<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%
    String name = (String) session.getAttribute("firstname"); //storing first name inside session
    if (name == null) {
        response.sendRedirect("login"); //checking vaidation in name 
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Techno Gadgets Nepal</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/home.css" />
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com">
  <link href="https://fonts.googleapis.com/css2?family=Libre+Bodoni:ital,wght@0,400..700;1,400..700&family=Poppins:wght@100;400;600;900&display=swap" rel="stylesheet">
</head>
<body>
  <div class="main">
    <nav>
      <div class="logoimg">
        <img src="Techno__1_-removebg-preview.png" alt="Logo">
      </div>
      <div class="menu">
        <ul>
          <li><a href="${pageContext.request.contextPath}/home">Home</a></li>
          <li><a href="${pageContext.request.contextPath}/about">About us</a></li>
          <li><a href="${pageContext.request.contextPath}/ProductController">Products</a></li>
          <li><a href="${pageContext.request.contextPath}/contact">Contact us</a></li>
          <li><a href="${pageContext.request.contextPath}/login">Join us</a></li>
        </ul>
      </div>
      <div class="menubutton">
        <a href="${pageContext.request.contextPath}/login"><button id="button2">Login</button></a>
        <a href="${pageContext.request.contextPath}/register"><button id="button1">Register</button></a> 
      </div>
    </nav>
    <div style="text-align: center; margin-top: 20px;">
      <h2>Welcome, <%= name %>!</h2>
    </div>

    <div class="maindiv">
      <div class="firstcontent">
        <p class="maintag">Techno Gadgets Nepal</p>
        <p class="subtag">We serve the most amazing gadgets all over the world.</p>
        <p class="subtag">Join us in Nepal's best gadget store.</p>
        <div class="mainbutton">
          <button class="mainbutton1">Buy now</button>
          <button class="mainbutton2">Learn more</button>
        </div>
      </div>
      <div class="secondcontent">
        <img src="pictures/pngtree-office-essentials-technology-and-gadgets-illustration-featuring-laptop-printer-camera-tablet-image_3748458-removebg-preview.png" alt="second image">
      </div>
    </div>

    <div class="title">
      <p>Popular</p>
    </div>
    <div class="middlesection">
      <div class="images">
        <img src="pictures/download-removebg-preview (2).png" alt="">
        <img src="pictures/download-removebg-preview (3).png" alt="">
        <img src="pictures/download-removebg-preview (4).png" alt="">
      </div>

      <div class="title">
        <p>Trending</p>
      </div>
      <div class="trending">
        <img src="pictures/download-removebg-preview (1).png" alt="">
        <img src="pictures/download-removebg-preview (3).png" alt="">
        <img src="pictures/download-removebg-preview (4).png" alt="">
      </div>
    </div>

    <footer>
      <div class="menu" id="secondmenu">
        <ul>
          <li><a href="#">Home</a></li>
          <li><a href="#">About us</a></li>
          <li><a href="#">Products</a></li>
          <li><a href="#">Contact us</a></li>
          <li><a href="#">Join us</a></li>
        </ul>
      </div>
      <div class="socials">
        <p>Socials</p>
        <div class="icons">
          <a href="https://www.youtube.com/"><img src="https://img.icons8.com/?size=100&id=19318&format=png&color=000000" alt="youtube"></a>
          <a href="https://www.instagram.com"><img src="https://img.icons8.com/?size=100&id=Xy10Jcu1L2Su&format=png&color=000000" alt="instagram"></a>
          <a href="https://www.facebook.com"><img src="https://img.icons8.com/?size=100&id=uLWV5A9vXIPu&format=png&color=000000" alt="facebook"></a>
        </div>
      </div>
    </footer>
  </div>
</body>
</html>
