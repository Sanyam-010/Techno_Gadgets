package com.TechnoGadgets.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.TechnoGadgets.config.Dbconfig;
import com.TechnoGadgets.model.CustomerModel;

public class RegisterService {

    private Connection dbConn;

    public RegisterService() {
        try {
            this.dbConn = Dbconfig.getDbConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Database connection error: " + ex.getMessage());
        }
    }

    public Boolean addCustomer(CustomerModel customerModel) {
        if (dbConn == null) return false;

        String insertQuery = "INSERT INTO customer (first_name, last_name, username, phone_number, gender, email, password, date_of_birth, image_path, role) "
                           + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement insertStmt = dbConn.prepareStatement(insertQuery)) {
            insertStmt.setString(1, customerModel.getFirst_name());
            insertStmt.setString(2, customerModel.getLast_name());
            insertStmt.setString(3, customerModel.getUsername());
            insertStmt.setInt(4, customerModel.getPhone_number());
            insertStmt.setString(5, customerModel.getGender());
            insertStmt.setString(6, customerModel.getEmail());
            insertStmt.setString(7, customerModel.getPassword());
            insertStmt.setDate(8, java.sql.Date.valueOf(customerModel.getDob()));
            insertStmt.setString(9, customerModel.getImage_path());
            insertStmt.setString(10, customerModel.getRole());

            int rowsAffected = insertStmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.err.println("Error during customer registration: " + e.getMessage());
            return false;
        }
    }
}
