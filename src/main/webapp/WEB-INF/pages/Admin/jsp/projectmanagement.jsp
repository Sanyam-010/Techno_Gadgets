<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>productmanagement</title>
<link rel="stylesheet" href="productmanagementstyle.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
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
				<p>Product Management</p>
				<div class="managebutton">
					<a href="addproduct.html"><button>Add product</button></a> <a
						href="removeproduct.html"><button>Remove product</button></a>
				</div>
			</div>
			<div class="product-table">
				<table>
					<thead>
						<tr>
							<th>Product ID</th>
							<th>Product Name</th>
							<th>Quantity</th>
							<th>Price</th>
							<th>Description</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>Headphone</td>
							<td>20</td>
							<td>2000</td>
							<td>This is a headphone.</td>
							<td><button class="edit-btn">Edit</button></td>
							<!-- Button -->
						</tr>
						<tr>
							<td>2</td>
							<td>Mouse</td>
							<td>10</td>
							<td>2500</td>
							<td>This is a mouse.</td>
							<td><button class="edit-btn">Edit</button></td>
							<!-- Button -->
						</tr>
						<tr>
							<td>3</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td><button class="edit-btn">Edit</button></td>
							<!-- Button -->
						</tr>
						<tr>
							<td>4</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td><button class="edit-btn">Edit</button></td>
							<!-- Button -->
						</tr>
						<tr>
							<td>5</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td><button class="edit-btn">Edit</button></td>
							<!-- Button -->
						</tr>
						<tr>
							<td>6</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td><button class="edit-btn">Edit</button></td>
							<!-- Button -->
						</tr>
						<tr>
							<td>7</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td>Home</td>
							<td><button class="edit-btn">Edit</button></td>
							<!-- Button -->
						</tr>
					</tbody>
				</table>
			</div>
		</div>
</body>
</html>