<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Order History</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/order.css" />
</head>
<body>
  <h1 class="title">Order History</h1>
  <div class="order-container">
    <!-- Order 1 -->
    <div class="order-card">
      <div class="order-header">
        <span><strong>Order #10012001</strong></span>
        <span>April 01, 2025</span>
        <span>Order Total: Rs. 4,500</span>
        <span class="manage">Track Order ▼</span>
      </div>
      <div class="order-details">
        <div class="product">
          <img src="images/Ringlight.jpg" alt="LED Ring Light"/>
          <div class="product-info">
            <div><strong>LED Ring Light</strong></div>
            <div>Adjustable tripod stand</div>
            <div>Qty: 1</div>
          </div>
        </div>
        <div class="shipping-info">
          <strong>Shipping To</strong>
          <div>Pratik Shrestha</div>
          <div>Gokarna 04</div>
          <div>Kathmandu</div>
        </div>
        <div class="status">
          <strong>Status</strong>
          <div class="status-text">Dispatched</div>
        </div>
      </div>
    </div>

    <!-- Order 2 -->
    <div class="order-card">
      <div class="order-header">
        <span><strong>Order #10012002</strong></span>
        <span>April 03, 2025</span>
        <span>Order Total: Rs. 2,300</span>
        <span class="manage">Track Order ▼</span>
      </div>
      <div class="order-details">
        <div class="product">
          <img src="images/Boom stand.jpg" alt="Boom Arm Stand"/>
          <div class="product-info">
            <div><strong>Boom Arm Stand</strong></div>
            <div>Clamp mount holder</div>
            <div>Qty: 1</div>
          </div>
        </div>
        <div class="shipping-info">
          <strong>Shipping To</strong>
          <div>Rita Bhandari</div>
          <div>Lalitpur 10</div>
          <div>Lalitpur</div>
        </div>
        <div class="status">
          <strong>Status</strong>
          <div class="status-text">Arrived</div>
        </div>
      </div>
    </div>

    <!-- Order 3 -->
    <div class="order-card">
      <div class="order-header">
        <span><strong>Order #10012003</strong></span>
        <span>April 06, 2025</span>
        <span>Order Total: Rs. 7,200</span>
        <span class="manage">Track Order ▼</span>
      </div>
      <div class="order-details">
        <div class="product">
          <img src="images/Jmary wireless mic.png" alt="Wireless Mic"/>
          <div class="product-info">
            <div><strong>Wireless Mic</strong></div>
            <div>Dual-channel VHF system</div>
            <div>Qty: 2</div>
          </div>
        </div>
        <div class="shipping-info">
          <strong>Shipping To</strong>
          <div>Bikash Adhikari</div>
          <div>Pokhara 03</div>
          <div>Kaski</div>
        </div>
        <div class="status">
          <strong>Status</strong>
          <div class="status-text">Delivered</div>
        </div>
      </div>
    </div>

    <!-- Order 4 -->
    <div class="order-card">
      <div class="order-header">
        <span><strong>Order #10012004</strong></span>
        <span>April 08, 2025</span>
        <span>Order Total: Rs. 1,950</span>
        <span class="manage">Track Order ▼</span>
      </div>
      <div class="order-details">
        <div class="product">
          <img src="images/Backdrop Stand.jpeg" alt="Backdrop Stand"/>
          <div class="product-info">
            <div><strong>Backdrop Stand</strong></div>
            <div>Adjustable height 8ft</div>
            <div>Qty: 1</div>
          </div>
        </div>
        <div class="shipping-info">
          <strong>Shipping To</strong>
          <div>Anusha Koirala</div>
          <div>Itahari 07</div>
          <div>Sunsari</div>
        </div>
        <div class="status">
          <strong>Status</strong>
          <div class="status-text">Dispatched</div>
        </div>
      </div>
    </div>

    <!-- Order 5 -->
    <div class="order-card">
      <div class="order-header">
        <span><strong>Order #10012005</strong></span>
        <span>April 11, 2025</span>
        <span>Order Total: Rs. 3,850</span>
        <span class="manage">Track Order ▼</span>
      </div>
      <div class="order-details">
        <div class="product">
          <img src="images/Tripod.jpeg" alt="Tripod 3110"/>
          <div class="product-info">
            <div><strong>Tripod 3110</strong></div>
            <div>Aluminium camera tripod</div>
            <div>Qty: 1</div>
          </div>
        </div>
        <div class="shipping-info">
          <strong>Shipping To</strong>
          <div>Manish Basnet</div>
          <div>Bhaktapur 01</div>
          <div>Bhaktapur</div>
        </div>
        <div class="status">
          <strong>Status</strong>
          <div class="status-text">Arrived</div>
        </div>
      </div>
    </div>

    <!-- Order 6 -->
    <div class="order-card">
      <div class="order-header">
        <span><strong>Order #10012006</strong></span>
        <span>April 13, 2025</span>
        <span>Order Total: Rs. 1,750</span>
        <span class="manage">Track Order ▼</span>
      </div>
      <div class="order-details">
        <div class="product">
          <img src="images/pop filter.jpg" alt="Pop Filter"/>
          <div class="product-info">
            <div><strong>Pop Filter</strong></div>
            <div>Double-layer mesh</div>
            <div>Qty: 2</div>
          </div>
        </div>
        <div class="shipping-info">
          <strong>Shipping To</strong>
          <div>Rekha Subedi</div>
          <div>Birgunj 05</div>
          <div>Parsa</div>
        </div>
        <div class="status">
          <strong>Status</strong>
          <div class="status-text">Delivered</div>
        </div>
      </div>
    </div>

    <!-- Order 7 -->
    <div class="order-card">
      <div class="order-header">
        <span><strong>Order #10012007</strong></span>
        <span>April 15, 2025</span>
        <span>Order Total: Rs. 2,800</span>
        <span class="manage">Track Order ▼</span>
      </div>
      <div class="order-details">
        <div class="product">
          <img src="images/softbox.png" alt="Softbox Light"/>
          <div class="product-info">
            <div><strong>Softbox Light</strong></div>
            <div>Studio lighting setup</div>
            <div>Qty: 1</div>
          </div>
        </div>
        <div class="shipping-info">
          <strong>Shipping To</strong>
          <div>Rajendra Poudel</div>
          <div>Banepa 06</div>
          <div>Kavre</div>
        </div>
        <div class="status">
          <strong>Status</strong>
          <div class="status-text">Dispatched</div>
        </div>
      </div>
    </div>

    <!-- Order 8 -->
    <div class="order-card">
      <div class="order-header">
        <span><strong>Order #10012008</strong></span>
        <span>April 17, 2025</span>
        <span>Order Total: Rs. 3,200</span>
        <span class="manage">Track Order ▼</span>
      </div>
      <div class="order-details">
        <div class="product">
          <img src="images/Ringlight.jpg" alt="Selfie Ring Light"/>
          <div class="product-info">
            <div><strong>Selfie Ring Light</strong></div>
            <div>Desktop makeup ring light</div>
            <div>Qty: 1</div>
          </div>
        </div>
        <div class="shipping-info">
          <strong>Shipping To</strong>
          <div>Alina Gurung</div>
          <div>Dharan 09</div>
          <div>Sunsari</div>
        </div>
        <div class="status">
          <strong>Status</strong>
          <div class="status-text">Delivered</div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>