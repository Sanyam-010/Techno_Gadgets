<!DOCTYPE html>
<html lang="en">
<%
String name = (String) session.getAttribute("firstname");
if (name == null) {
	response.sendRedirect("login"); //checking vaidation in name 
	return;
}
%>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Techno Gadgets</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/Home.css" />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap"
	rel="stylesheet">
</head>
<body>
	<jsp:include page="Header.jsp" />
	<section class="hero">
		<div class="container hero-wrap">
			<div class="hero-text">
				<h1>Discover the Best Tech Gadgets</h1>
				<p>Shop the latest electronics and devices with cutting-edge
					features.</p>
				<div class="btn-group">
					<a href="#" class="btn primary">Shop Now</a> <a href="#"
						class="btn">Learn More</a>
				</div>
			</div>
			<div style="text-align: center; margin-top: 20px;">
				<h2>
					Welcome,
					<%=name%>!
				</h2>
			</div>
			<div class="hero-image">
				<img src="dd.webp" alt="Hero Gadget">
			</div>
		</div>
	</section>

	<section class="section dark">
		<div class="container">
			<h2 class="section-title">Popular Products</h2>
			<div class="grid">
				<div class="card">
					<img src="dd.webp" alt="Smartphone">
					<h3>Smartphone X</h3>
					<p>Advanced camera, AMOLED display, and ultra-fast processor.</p>
				</div>
				<div class="card">
					<img src="dd.webp" alt="Smartwatch">
					<h3>Smartwatch Z</h3>
					<p>Track fitness, messages, and sleep — all from your wrist.</p>
				</div>
				<div class="card">
					<img src="dd.webp" alt="Earbuds">
					<h3>SoundPods</h3>
					<p>Noise-canceling wireless earbuds with premium audio.</p>
				</div>
				<div class="card">
					<img src="dd.webp" alt="Laptop">
					<h3>Laptop Pro</h3>
					<p>Thin, powerful, and ready for productivity and gaming.</p>
				</div>
				<div class="card">
					<img src="dd.webp" alt="Camera">
					<h3>4K Camera</h3>
					<p>Capture ultra-HD photos and videos with pro features.</p>
				</div>
				<div class="card">
					<img src="dd.webp" alt="Speaker">
					<h3>Portable Speaker</h3>
					<p>Loud, clear, and built for travel and outdoor vibes.</p>
				</div>
			</div>
		</div>
	</section>

	<section class="section">
		<div class="container">
			<h2 class="section-title">Customer Reviews</h2>
			<div class="grid">
				<div class="quote">
					<p>“Loved the fast delivery and smooth service. Great gadgets!”</p>
					<span>- Anuj</span>
				</div>
				<div class="quote">
					<p>“This site is my go-to for tech in Nepal. 100% recommended!”</p>
					<span>- Samayam</span>
				</div>
				<div class="quote">
					<p>“Awesome support and unbeatable prices on all items.”</p>
					<span>- Dev</span>
				</div>
			</div>
		</div>
	</section>

	<section class="section dark">
		<div class="container">
			<h2 class="section-title">Stay in Touch</h2>
			<p>Subscribe for the latest deals, new arrivals, and more.</p>
			<form class="newsletter">
				<input type="email" placeholder="Your email address" required>
				<button type="submit">Subscribe</button>
			</form>
		</div>
	</section>
	<jsp:include page="Footer.jsp" />
</body>
</html>