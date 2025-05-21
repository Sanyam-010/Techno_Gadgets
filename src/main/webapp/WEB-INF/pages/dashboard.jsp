<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.Cookie"%>
<%@ page import="com.TechnoGadgets.service.adminService"%>
<%@ page import="java.util.List"%>
<%@ page session="true"%>
<%
// Session or cookie check
String name = (String) session.getAttribute("firstname");
if (name == null) {
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
	if ("firstname".equals(cookie.getName())) {
		name = cookie.getValue();
		session.setAttribute("firstname", name);
		break;
	}
		}
	}
}

if (name == null) {
	response.sendRedirect("login");
	return;
}

// Get dashboard data
adminService service = new adminService();
int totalSales = service.getTotalSalesCount();
String topCustomer = service.getTopCustomerName();
String bestProduct = service.getMostSellingProductName();
List<String> top10Customers = service.getTop10Customers();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="dashboard.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/addproduct.css" />
<link
	href="https://fonts.googleapis.com/css2?family=Libre+Bodoni&family=Poppins:wght@300;400;600&display=swap"
	rel="stylesheet">
<style>
.stats-container {
	display: flex;
	justify-content: center;
	gap: 30px;
	margin: 40px auto;
	flex-wrap: wrap;
}

.stat-card {
	background-color: #ffffff;
	box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
	padding: 30px 40px;
	border-radius: 12px;
	text-align: center;
	min-width: 250px;
	font-family: 'Poppins', sans-serif;
}

.stat-card h3 {
	font-size: 20px;
	color: #888;
	margin-bottom: 10px;
}

.stat-card p {
	font-size: 28px;
	font-weight: bold;
	color: #333;
}

.data {
	margin-top: 40px;
	background-color: #fff;
	padding: 30px;
	border-radius: 12px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
	max-width: 700px;
	margin-left: auto;
	margin-right: auto;
}

.data h3 {
	margin-bottom: 20px;
	font-size: 24px;
	color: #444;
}

.data ul {
	list-style: none;
	padding: 0;
}

.data ul li {
	padding: 10px 0;
	font-size: 18px;
	border-bottom: 1px solid #eee;
}
</style>
</head>
<body>
	<div class="main">
		<div class="sidenav">
			<ul>
				<li><a href="${pageContext.request.contextPath}/dashboard">Dashboard</a></li>
				<li><a
					href="${pageContext.request.contextPath}/projectmanagement">Project
						Management</a></li>
				<li><a href="${pageContext.request.contextPath}/addproduct">Add
						Product</a></li>
				<li><a href="${pageContext.request.contextPath}/removeproduct">Remove
						Product</a></li>
				<li><a
					href="${pageContext.request.contextPath}/ordermanagement">Order
						Management</a></li>
				<li><a href="${pageContext.request.contextPath}/usermanagement">User
						Management</a></li>
			</ul>
		</div>

		<div class="mainview">
			<div class="nav">
				<div class="search">
					<div class="searchicon">
						<img src="pictures/icons8-search.gif" alt="search gif"> <input
							type="text" placeholder="Search">
					</div>
					<div class="profile">
						<a href="#"><img
							src="pictures/blank-profile-picture-973460_960_720.webp"
							alt="profile pic" id="profileid"></a> <a href="#"><img
							src="pictures/icons8-notification-50.png" alt="notification"></a>
					</div>
				</div>
			</div>

			<div style="text-align: center; margin-top: 20px;">
				<h2>
					Welcome,
					<%=name%>!
				</h2>
			</div>

			<!-- 📊 DASHBOARD CARDS -->
			<div class="stats-container">
				<div class="stat-card">
					<h3>Top Customer</h3>
					<p><%=topCustomer%></p>
				</div>
				<div class="stat-card">
					<h3>Total Sales</h3>
					<p><%=totalSales%></p>
				</div>
				<div class="stat-card">
					<h3>Most Selling Product</h3>
					<p><%=bestProduct%></p>
				</div>
			</div>

			<!-- 🏆 TOP 10 CUSTOMERS -->
			<div class="data">
				<h3>Top 10 Customers</h3>
				<ul>
					<%
					for (String cust : top10Customers) {
					%>
					<li><%=cust%></li>
					<%
					}
					%>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
