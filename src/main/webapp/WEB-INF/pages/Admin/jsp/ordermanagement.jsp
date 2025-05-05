<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>productmanagement</title>
<link rel="stylesheet" href="ordermanagement.css">
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
				<p>Order Management</p>
			</div>
			<div class="managebutton">
				<button>Update Order</button>
				<label for="orderid">Search</label> <input type="text"
					placeholder="Order Id" id="orderid">
			</div>
			<div class="ordertable">
				<table>
					<thead>
						<tr>
							<th>ID</th>
							<th>Order Name</th>
							<th>Price</th>
							<th>Quantity</th>
							<th>Delivery Address</th>
							<th>Order Status</th>
							<th>Action</th>
							<!-- New column -->
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1.</td>
							<td>Headphone</td>
							<td>3000</td>
							<td>2</td>
							<td>Kathmandu</td>
							<td>Pending</td>
							<td><button class="edit-btn">Edit</button></td>
						</tr>
						<tr>
							<td>2.</td>
							<td>Mouse</td>
							<td>1200</td>
							<td>1</td>
							<td>Butwal</td>
							<td>Delivered</td>
							<td><button class="edit-btn">Edit</button></td>
						</tr>
						<tr>
							<td>3.</td>
							<td>Backlight</td>
							<td>1500</td>
							<td>2</td>
							<td>Dhangadhi</td>
							<td>Shipped</td>
							<td><button class="edit-btn">Edit</button></td>
						</tr>
						<tr>
							<td>4.</td>
							<td>Microphone</td>
							<td>2000</td>
							<td>4</td>
							<td>Kathmandu</td>
							<td>Pending</td>
							<td><button class="edit-btn">Edit</button></td>
						</tr>
						<tr>
							<td>5.</td>
							<td>Controller</td>
							<td>3000</td>
							<td>2</td>
							<td>Lalitpur</td>
							<td>Pending</td>
							<td><button class="edit-btn">Edit</button></td>
						</tr>
						<tr>
							<td>6.</td>
							<td>Keyboard</td>
							<td>1000</td>
							<td>1</td>
							<td>Kathmandu</td>
							<td>Delivered</td>
							<td><button class="edit-btn">Edit</button></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
</body>
</html>