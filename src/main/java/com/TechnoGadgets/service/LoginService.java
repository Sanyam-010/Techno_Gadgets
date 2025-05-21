package com.TechnoGadgets.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.TechnoGadgets.config.Dbconfig;
import com.TechnoGadgets.model.CustomerModel;
import com.TechnoGadgets.util.PasswordUtil;

public class LoginService {

    public CustomerModel validateUser(String username, String inputPassword) {
        CustomerModel user = checkUserInTable("customer", username, inputPassword);
        if (user != null) return user;

        // If not found in customer table, check admin table
        return checkUserInTable("admin", username, inputPassword);
    }

    private CustomerModel checkUserInTable(String tableName, String username, String inputPassword) {
        try (Connection conn = Dbconfig.getDbConnection()) {
            String sql = "SELECT * FROM " + tableName + " WHERE username = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String encryptedPassword = rs.getString("password");
                String decryptedPassword = PasswordUtil.decrypt(encryptedPassword, username);

                if (decryptedPassword != null && decryptedPassword.equals(inputPassword)) {
                    // Build CustomerModel (used for both admin and customer)
                    return new CustomerModel(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("username"),
                        rs.getInt("phone_number"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getDate("date_of_birth").toLocalDate(),
                        rs.getString("image_path"),
                        rs.getString("role")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
