<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add product</title>
    <link rel="stylesheet" href="addproductstyle.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link rel="stylesheet"href="${pageContext.request.contextPath}/css/addproduct.css" />
	<link href="https://fonts.googleapis.com/css2?family=Libre+Bodoni:ital,wght@0,400..700;1,400..700&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
</head>
<body>
    <div class="main">
        <div class="sidenav">
            <ul>
                <li><a href="dashboard.html">Dashboard</a></li>
                <li><a href="projectmanagement.html">Product management</a></li>
                <li><a href="#">Add product</a></li>
                <li><a href="removeproduct.html">Remove product</a></li>
                <li><a href="ordermanagement.html">Order management</a></li>
                <li><a href="usermanagement.html">User management</a></li>
            </ul>
        </div>
        <div class="mainview">
            <div class="productform">
                <div class="title">Add product</div>
                <div class="mainform">
                    <div class="labels">
                        <label for="productid">Product ID:</label>
                        <label for="productname">Product Name:</label>
                        <label for="price">Price:</label>
                        <label for="availability">Availability:</label>

                    </div>
                    <div class="fields">
                        <input type="text" id="productid" class="fieldsdesign">
                        <input type="text" id="productname" class="fieldsdesign">
                        <input type="text" id="price" class="fieldsdesign">
                        <input type="text" id="availability" class="fieldsdesign">
                        <input type="file" id="image">

                    </div>
                </div>
                <div class="submitbutton">
                    <button>Add Product</button>
                </div>
                
            </div>
        </div>
    
</body>
</html>