<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Registration</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/register.css" />
	</head>
<body>
  <div class="form-container">
    
  </div><div class="form-box">
      <h2>Registration Form</h2>
      <p>Already have an account? <a href="#">Log in</a></p>

      <form id="signupForm">
        <div class="row">
          <div class="field">
            <label>First Name</label>
            <input type="text" id="firstName" required>
          </div>
          <div class="field">
            <label>Last Name</label>
            <input type="text" id="lastName" required>
          </div>
        </div>

        <div class="row">
          <div class="field">
            <label>Phone</label>
            <input type="text" id="phone" required>
          </div>
          <div class="field">
            <label>Gender</label>
            <select id="gender" required>
              <option value="" disabled selected>Select</option>
              <option>Male</option>
              <option>Female</option>
              <option>Other</option>
            </select>
          </div>
        </div>

        <div class="row">
          <div class="field">
            <label>Date of Birth</label>
            <input type="date" id="dob" required>
          </div>
          <div class="field">
            <label>Email</label>
            <input type="email" id="email" required>
          </div>
        </div>

        <div class="row">
          <div class="field">
            <label>Password</label>
            <input type="password" id="password" required>
          </div>
          <div class="field">
            <label>Confirm</label>
            <input type="password" id="confirmPassword" required>
          </div>
        </div>

        <p class="note">Use at least 8 characters with letters, numbers & symbols</p>

        <p class="terms">
          By creating an account, you agree to our <a href="#">Terms of Use</a> and <a href="#">Privacy Policy</a>
        </p>

        <button type="submit" id="submitBtn">Create an account</button>
      </form>
    </div>
</body>
</html>