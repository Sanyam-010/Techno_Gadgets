<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Usermanagement</title>
<link rel="stylesheet" href="usermanagement.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/usermanagement.css"/>
<link
	href="https://fonts.googleapis.com/css2?family=Libre+Bodoni:ital,wght@0,400..700;1,400..700&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
	rel="stylesheet">
</head>
<body>
	<div class="main">
		<div class="sidenav">
			<ul>
				<li><a href="dashboard.html">Dashboard</a></li>
				<li><a href="projectmanagement.html">Product management</a></li>
				<li><a href="addproduct.html">Add product</a></li>
				<li><a href="removeproduct.html">Remove product</a></li>
				<li><a href="ordermanagement.html">Order management</a></li>
				<li><a href="usermanagement.html">User management</a></li>
			</ul>
		</div>
		<div class="mainview">
			<div class="header">
				<p>User Management</p>
				<div class="managebutton">
					<button>Update user</button>
					<label for="userid">Search</label> <input type="text"
						placeholder="User Id" id="userid">
				</div>
			</div>
			<div class="usertable">
				<table>
					<tr class="tablehead">
						<td>ID</td>
						<td>User name</td>
						<td>Age</td>
						<td>Address</td>
						<td>Phone Number</td>
					</tr>
					<tr>
						<td>1.</td>
						<td>Dev Shrestha</td>
						<td>20</td>
						<td>Kamalpokhari</td>
						<td>9876463356</td>
					</tr>
					<tr>
						<td>2.</td>
						<td>Hari</td>
						<td>35</td>
						<td>Butwal</td>
						<td>9643477342</td>
					</tr>
					<tr>
						<td>3.</td>
						<td>Alex</td>
						<td>15</td>
						<td>Kathmandu</td>
						<td>9848234348</td>
					</tr>
					<tr>
						<td>4.</td>
						<td>Anuj Kharel</td>
						<td>23</td>
						<td>Baneshwor</td>
						<td>9234343746</td>
					</tr>
					<tr>
						<td>5.</td>
						<td>Aayush shrestha</td>
						<td>30</td>
						<td>Ilam</td>
						<td>9834324673</td>
					</tr>
					<tr>
						<td>6.</td>
						<td>Trilok</td>
						<td>25</td>
						<td>Lalitpur</td>
						<td>9887232236</td>
					</tr>
				</table>
			</div>
		</div>
</body>
</html>
