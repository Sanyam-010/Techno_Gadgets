<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Login</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/login.css" />

<link rel="preconnect" href="https://fonts.googleapis.com">

<link rel="preconnect" href="https://fonts.gstatic.com">

<link
	href="https://fonts.googleapis.com/css2?family=Libre+Bodoni:ital,wght@0,400..700;1,400..700&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
	rel="stylesheet">

</head>

<body>

	<div class="loginmain">

		<div class="loginsection">

			<div class="logintitle">Login</div>

			<div class="logintable">

				<div class="email">

					Email address or username <input name="email"
						placeholder="Email or Username ">

				</div>

				<div class="email" id="pass">

					Password <input name="password" type="password"
						placeholder="Enter your password ">

				</div>

				<div class="loginbutton">

					<button type="submit">Log in</button>

				</div>

				<div class="forgotpassword">

					<p>Forgot your password</p>

				</div>

				<div class="forgotpassword" id="regis">

					Don't have an account?
					<p>Register here.</p>

				</div>

			</div>





		</div>



	</div>



</body>

</html>

