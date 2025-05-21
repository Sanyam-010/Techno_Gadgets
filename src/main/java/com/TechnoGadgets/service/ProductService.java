package com.TechnoGadgets.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.TechnoGadgets.config.Dbconfig;
import com.TechnoGadgets.model.ProductModel;

public class ProductService {

    //To fetch all the product
    public List<ProductModel> getAllProducts() {
        List<ProductModel> products = new ArrayList<>();
        String query = "SELECT * FROM product";

        try (Connection conn = Dbconfig.getDbConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                ProductModel p = new ProductModel(
                    rs.getInt("productId"),
                    rs.getString("productName"),
                    rs.getInt("price"),
                    rs.getInt("quantity"),
                    rs.getString("image_path") 
                );
                products.add(p);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return products;
    }

    // this method is used to decrease the product after purchase
    public boolean decreaseStock(int productId, int quantity) {
        String updateQuery = "UPDATE product SET quantity = quantity - ? WHERE productId = ? AND quantity >= ?";

        try (Connection conn = Dbconfig.getDbConnection();
             PreparedStatement stmt = conn.prepareStatement(updateQuery)) {

            stmt.setInt(1, quantity);
            stmt.setInt(2, productId);
            stmt.setInt(3, quantity);

            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
