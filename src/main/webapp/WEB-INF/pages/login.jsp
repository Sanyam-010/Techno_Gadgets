<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>

  <!-- ✅ Keep your current CSS link -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" />

  <!-- Fonts -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com">
  <link href="https://fonts.googleapis.com/css2?family=Libre+Bodoni:ital,wght@0,400..700;1,400..700&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
</head>

<body>
  <div class="loginmain">
    <div class="loginsection">
      <div class="logintitle">Login</div>

      <!-- ✅ ADDED FORM with action and POST -->
      <form class="logintable" action="login" method="post">

        <div class="email">
          Email address or username
          <input name="username" placeholder="Email or Username " required>
        </div>

        <div class="email" id="pass">
          Password
          <input name="password" type="password" placeholder="Enter your password " required>
        </div>

        <div class="loginbutton">
          <button type="submit">Log in</button>
        </div>

        <div class="forgotpassword">
          <p>Forgot your password</p>
        </div>

        <div class="forgotpassword" id="regis">
          Don't have an account? <p><a href="register">Register here.</a></p>
        </div>

        <!-- ✅ Optional error message -->
        <% String error = (String) request.getAttribute("error"); %>
        <% if (error != null) { %>
          <p class="error-msg" style="color: red;"><%= error %></p>
        <% } %>

      </form>
    </div>
  </div>
</body>
</html>
