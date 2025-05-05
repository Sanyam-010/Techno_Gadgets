
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Contact Us</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/contact.css" />

<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@400;600&display=swap"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

</head>

<body>



	<div class="contact-container">

		<!-- Left: Contact Info -->

		<section class="contact-info">

			<h2>Contact Information</h2>

			<p class="desc">We'd love to hear from you! Reach out anytime.</p>



			<div class="info-item">

				<i class="fas fa-map-marker-alt"></i>

				<div>

					<h4>Address</h4>

					<p>Kamal Pokhari, Kathmandu</p>

				</div>

			</div>



			<div class="info-item">

				<i class="fas fa-envelope"></i>

				<div>

					<h4>Email</h4>

					<p>support@example.com</p>

				</div>

			</div>



			<div class="info-item">

				<i class="fas fa-phone-alt"></i>

				<div>

					<h4>Phone</h4>

					<p>+977-9801234567</p>

				</div>

			</div>



			<div class="social-links">

				<a href="#"><i class="fab fa-facebook"></i></a> <a href="#"><i
					class="fab fa-instagram"></i></a> <a href="#"><i
					class="fab fa-linkedin"></i></a> <a href="#"><i
					class="fab fa-whatsapp"></i></a>

			</div>

		</section>



		<!-- Right: Contact Form -->

		<section class="contact-form">

			<h2>Send a Message</h2>

			<form id="form">

				<div class="form-group">

					<label for="name">Full Name</label> <input type="text" id="name"
						placeholder="Enter your name" required>

				</div>

				<div class="form-group">

					<label for="email">Email Address</label> <input type="email"
						id="email" placeholder="you@example.com" required>

				</div>

				<div class="form-group">

					<label for="phone">Phone Number</label> <input type="tel"
						id="phone" placeholder="+977-98XXXXXXXX" required>

				</div>

				<div class="form-group">

					<label for="message">Your Message</label>

					<textarea id="message" rows="5"
						placeholder="Type your message here..." required></textarea>

				</div>

				<button type="submit">Send Message</button>

			</form>

		</section>

	</div>



</body>

</html>



