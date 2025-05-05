package com.TechnoGadgets.service;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.TechnoGadgets.config.Dbconfig;
import com.TechnoGadgets.model.CustomerModel;


/**
 * RegisterService handles the registration of new students. It manages database
 * interactions for student registration.
 */
public class RegisterService {

	private Connection dbConn;

	/**
	 * Constructor initializes the database connection.
	 */
	public RegisterService() {
		try {
			this.dbConn = Dbconfig.getDbConnection();
		} catch (SQLException | ClassNotFoundException ex) {
			System.err.println("Database connection error: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	/**
	 * Registers a new student in the database.
	 *
	 * @param studentModel the student details to be registered
	 * @return Boolean indicating the success of the operation
	 */
	public Boolean addCustomer(CustomerModel customerModel) {
		if (dbConn == null) {
			System.err.println("Database connection is not available.");
			return null;
		}

		String CustomerQuery = "SELECT custome_id FROM customer WHERE name = ?";
		String insertQuery = "INSERT INTO student (first_name,last_name,phone_number,"
				+ "gender,email,password,address,date_of_birth) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (PreparedStatement custStmt = dbConn.prepareStatement(CustomerQuery);
				PreparedStatement insertStmt = dbConn.prepareStatement(insertQuery)) {

//			// Fetch program ID
//			custStmt.setInt(1, CustomerModel.getCustomer_id());
//			ResultSet result = custStmt.executeQuery();
//			int customerId = result.next() ? result.getInt("customer_id") : 1;

			// Insert customer table
			insertStmt.setString(1, customerModel.getFirstName());
			insertStmt.setString(2, customerModel.getLastName());
			insertStmt.setInt(3, customerModel.getPhone());
			insertStmt.setString(4, customerModel.getGender());
			insertStmt.setString(5, customerModel.getEmail());
			insertStmt.setString(6, customerModel.getPassword());
			insertStmt.setDate(7, Date.valueOf(customerModel.getDob()));
			insertStmt.setString(8, customerModel.getAddress());
			insertStmt.setString(9, customerModel.getDob());
			
			

			return insertStmt.executeUpdate() > 0;
		} catch (SQLException e) {
			System.err.println("Error during Customer Registration: " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}
}