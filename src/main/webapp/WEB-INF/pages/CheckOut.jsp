<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Delivery Checkout</title>
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap"
	rel="stylesheet">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/checkout.css" />
</head>
<body>
	<div class="checkout-container">
		<div class="delivery-box">
			<h2>Delivery Information</h2>
			<form>
				<label for="name">Full Name:</label> <input type="text" id="name"
					placeholder="Your Name"> <label for="address">Address:</label>
				<input type="text" id="address" placeholder="Street, Apt"> <label
					for="phone">Phone Number:</label> <input type="text" id="phone"
					placeholder="Mobile Number"> <label for="region">Region:</label>
				<input type="text" id="region" placeholder="e.g., Bagmati">

				<label for="city">City:</label> <input type="text" id="city"
					placeholder="e.g., Kathmandu">

				<button type="submit">Save</button>
			</form>
		</div>

		<div class="checkout-box">
			<h2>Checkout</h2>
			<div class="summary">
				<p>Order Summary:</p>
				<p>
					Total items: <span>3</span>
				</p>
				<p>
					Delivery fee: <span>$5.00</span>
				</p>
				<p>
					Total: <span>$65.00</span>
				</p>
			</div>
			<button class="proceed">Proceed</button>
		</div>
	</div>
</body>
</html>
