<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Registration</title>
  <!-- ✅ Corrected filename -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Register.css" />
</head>
<body>
  <div class="form-container">
    <h1 class="form-title">Registration Form</h1>
    <p class="form-subtitle">
      Already have an account?
      <a href="${pageContext.request.contextPath}/login.jsp">Log in</a>
    </p>

    <% 
      String err = (String) request.getAttribute("error");
      String ok  = (String) request.getAttribute("success");
      if (err != null) {
    %>
      <p class="message error"><%= err %></p>
    <% 
      } else if (ok != null) {
    %>
      <p class="message success"><%= ok %></p>
    <%
      }
    %>

    <form 
      class="registration-form" 
      action="${pageContext.request.contextPath}/register" 
      method="post" 
      enctype="multipart/form-data"
    >

      <div class="form-group">
        <label for="firstname" class="form-label">First Name</label>
        <input type="text" id="firstname" name="firstName" class="form-input" required />
      </div>
      <div class="form-group">
        <label for="lastname" class="form-label">Last Name</label>
        <input type="text" id="lastname" name="lastName" class="form-input" required />
      </div>

      <div class="form-group">
        <label for="username" class="form-label">Username</label>
        <input type="text" id="username" name="username" class="form-input" required />
      </div>
      <div class="form-group">
        <label for="dob" class="form-label">Date of Birth</label>
        <input type="date" id="dob" name="dob" class="form-input" required />
      </div>

      <div class="form-group">
        <label for="gender" class="form-label">Gender</label>
        <select id="gender" name="gender" class="form-input" required>
          <option value="" disabled selected>Select</option>
          <option value="male">Male</option>
          <option value="female">Female</option>
        </select>
      </div>
      <div class="form-group">
        <label for="email" class="form-label">Email</label>
        <input type="email" id="email" name="email" class="form-input" required />
      </div>

      <div class="form-group">
        <label for="phone" class="form-label">Phone Number</label>
        <input type="tel" id="phone" name="phoneNumber" class="form-input" required />
      </div>
      <div class="form-group">
        <label for="role" class="form-label">Role</label>
        <select id="role" name="subject" class="form-input" required>
          <option value="" disabled selected>Role</option>
          <option value="customer">Customer</option>
          <option value="admin">Admin</option>
        </select>
      </div>

      <div class="form-group">
        <label for="password" class="form-label">Password</label>
        <input type="password" id="password" name="password" class="form-input" required />
      </div>
      <div class="form-group">
        <label for="confirm-password" class="form-label">Retype Password</label>
        <input type="password" id="confirm-password" name="retypePassword" class="form-input" required />
      </div>

 
      <div class="form-group file-group" style="grid-column: span 2;">
        <label for="profilepicture" class="form-label">Profile Picture</label>
        <input type="file" id="profilepicture" name="image" class="form-input" accept="image/*" />
      </div>

      <p class="note-text" style="grid-column: span 2;">
        Use at least 8 characters with letters, numbers &amp; symbols
      </p>
      <p class="terms-text" style="grid-column: span 2;">
        By creating an account, you agree to our
        <a href="#">Terms of Use</a> and
        <a href="#">Privacy Policy</a>.
      </p>

      <button type="submit" class="btn-submit">Create an account</button>
    </form>
  </div>
</body>
</html>
