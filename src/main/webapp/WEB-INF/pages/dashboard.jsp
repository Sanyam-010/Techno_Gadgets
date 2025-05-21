<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%
	//session 
    String name = (String) session.getAttribute("firstname");// storing first in session 
    if (name == null) {
        response.sendRedirect("login"); 
        //if the information is incorrect page will redirect to  login page
        
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="dashboard.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/addproduct.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Libre+Bodoni:ital,wght@0,400..700;1,400..700&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900&display=swap" rel="stylesheet">
</head>
<body>
    <div class="main">
        <div class="sidenav">
            <ul>
                <li><a href="${pageContext.request.contextPath}/dashboard">Dashboard</a></li>
                <li><a href="${pageContext.request.contextPath}/projectmanagement">Project Management</a></li>
                <li><a href="${pageContext.request.contextPath}/addproduct">Add Product</a></li>
                <li><a href="${pageContext.request.contextPath}/removeproduct">Remove Product</a></li>
                <li><a href="${pageContext.request.contextPath}/ordermanagement">Order Management</a></li>
                <li><a href="${pageContext.request.contextPath}/usermanagement">User Management</a></li>
            </ul>
        </div>

        <div class="mainview">
            <div class="nav">
                <div class="search">
                    <div class="searchicon">
                        <img src="pictures/icons8-search.gif" alt="search gif">
                        <input type="text" placeholder="Search">
                    </div>
                    <div class="profile">
                        <a href="#"><img src="pictures/blank-profile-picture-973460_960_720.webp" alt="profile pic" id="profileid"></a>
                        <a href="#"><img src="pictures/icons8-notification-50.png" alt="notification"></a>
                    </div>
                </div>
            </div>

            <!-- ✅ Show welcome message -->
            <div style="text-align: center; margin-top: 20px;">
                <h2>Welcome, <%= name %>!</h2>
            </div>

            <div class="view">
                <div class="view1 shape">Top customer:</div>
                <div class="view2 shape">Total sales:</div>
                <div class="view3 shape">Most selling product:</div>
            </div>

            <div class="insight">
                <div class="graph"></div>
                <div class="data">Top 10 customers:</div>
            </div>
        </div>
    </div>
</body>
</html>
