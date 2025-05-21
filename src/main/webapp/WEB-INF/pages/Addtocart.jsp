<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Cart</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/addtocart.css" />
</head>

<body>
  <header></header>

  <main>
    <div class="select-all-container">
      <input type="checkbox" id="selectAll" />
      <label for="selectAll">Select All Item</label>
    </div>

    <div class="cartlist">

      <!-- Example item start -->
      <div class="list-iteams-one">
        <form action="cart" method="post">
          <img src="image/ringlight.jpg" alt="ringlight-image" id="iteam-list-one-img" />
          <p class="product-name">Product Name: Ring Light</p>
          <p class="price-one">Price: 1500</p>

          <label>Qty:</label>
          <input type="number" name="quantity" value="1" min="1" class="amount" />

          <input type="hidden" name="productId" value="1" />
          <input type="hidden" name="productName" value="Ring Light" />
          <input type="hidden" name="price" value="1500" />

          <button type="submit" name="action" value="buyNow">Buy Now</button>
          <button type="submit" name="action" value="remove">Remove</button>
        </form>
      </div>
      <div class="orderdetails">
        <p class="order-details-text" id="location">Location</p>
        <p class="order-details-text" id="ordersummary">Order Summary</p>
        <p class="order-details-text" id="total-items">Total-Items No:</p>
        <p class="order-details-text" id="shipping-fee">Shipping-Fee Rs:</p>

        <div class="buttons-input">
          <input type="text" value="Enter Voucher"
                 style="padding: 10px 20px; border: 1px solid black; font-size: 16px; text-align: center;"
                 class="buttons-input-action" id="input-voucher" />
          <button class="buttons-input-action" id="applybutton">Apply</button>
        </div>

        <hr id="line" />
        <p id="total">Total Rs:</p>
        <button id="checkout">Checkout</button>
      </div>
    </div>
  </main>

  <footer></footer>
</body>
</html>
