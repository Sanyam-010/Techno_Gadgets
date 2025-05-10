package com.TechnoGadgets.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.TechnoGadgets.config.Dbconfig;
import com.TechnoGadgets.model.CustomerModel;

/**
 * RegisterService handles customer registration by interacting with the database.
 */
public class RegisterService {

    private Connection dbConn;

    public RegisterService() {
    	
        try {
        	//bd object 
            this.dbConn = Dbconfig.getDbConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Database connection error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    /**
     * Registers a new customer in the database.
     * @param customerModel The customer details to be registered
     * @return Boolean indicating success (true) or failure (false)
     */
    public Boolean addCustomer(CustomerModel customerModel) {
        if (dbConn == null) {
            System.err.println("Database connection is not available.");
            return null;
        }

        String insertQuery = "INSERT INTO customers (first_name,last_name,username,dob,gender,email,number,password,image_path"
        		+ " VALUES (?, ?, ?, ?, ?, ?, ?,?,?)";

        try (PreparedStatement insertStmt = dbConn.prepareStatement(insertQuery)) {
            insertStmt.setString(1, customerModel.getFirstName());
            insertStmt.setString(2, customerModel.getLastname());
            insertStmt.setString(3, customerModel.getUsername());
            insertStmt.setDate(4, java.sql.Date.valueOf(customerModel.getDob()));
            insertStmt.setString(5, customerModel.getGender());
            insertStmt.setString(6, customerModel.getEmail());
            insertStmt.setString(7,customerModel.getPhone());
            insertStmt.setString(8, customerModel.getPassword());
            insertStmt.setString(9, customerModel.getProfilepicture());
            return insertStmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error during customer registration: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
