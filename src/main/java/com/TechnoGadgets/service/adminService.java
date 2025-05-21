package com.TechnoGadgets.service;

import com.TechnoGadgets.config.Dbconfig;
import java.sql.*;
import java.util.*;

public class adminService {

    public int getTotalCustomers() {
        String sql = "SELECT COUNT(*) FROM customer WHERE role = 'customer'";
        try (Connection conn = Dbconfig.getDbConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getInt(1) : 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getTopCustomerName() {
        String sql = "SELECT c.username, COUNT(*) AS total_orders " +
                     "FROM order_item oi JOIN customer c ON oi.customer_id = c.customer_id " +
                     "GROUP BY oi.customer_id ORDER BY total_orders DESC LIMIT 1";
        try (Connection conn = Dbconfig.getDbConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getString("username") : "N/A";
        } catch (Exception e) {
            e.printStackTrace();
            return "N/A";
        }
    }

    public int getTotalSalesCount() {
        String sql = "SELECT COUNT(*) FROM payment";
        try (Connection conn = Dbconfig.getDbConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getInt(1) : 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getMostSellingProductName() {
        String sql = "SELECT p.productName, COUNT(*) AS total_sold " +
                     "FROM order_item oi JOIN product p ON oi.product_id = p.productId " +
                     "GROUP BY p.productId ORDER BY total_sold DESC LIMIT 1";
        try (Connection conn = Dbconfig.getDbConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getString("productName") : "N/A";
        } catch (Exception e) {
            e.printStackTrace();
            return "N/A";
        }
    }

    public List<String> getTop10Customers() {
        List<String> topCustomers = new ArrayList<>();
        String sql = "SELECT c.username, COUNT(*) AS orders " +
                     "FROM order_item oi JOIN customer c ON oi.customer_id = c.customer_id " +
                     "GROUP BY oi.customer_id ORDER BY orders DESC LIMIT 10";
        try (Connection conn = Dbconfig.getDbConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                topCustomers.add(rs.getString("username") + " - " + rs.getInt("orders") + " orders");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return topCustomers;
    }
}
