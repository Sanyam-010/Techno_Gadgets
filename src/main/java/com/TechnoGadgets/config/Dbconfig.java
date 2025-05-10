package com.TechnoGadgets.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DbConfig is a configuration class for managing database connections. It
 * handles the connection to a MySQL database using JDBC.
 */
public class Dbconfig {

	// Database configuration information
	private static final String DB_NAME = "techno_gadgets";
	private static final String URL = "jdbc:mysql://localhost:3306/" +DB_NAME;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	/**
	 * Establishes a connection to the database.
	 *
	 * @return Connection object for the database
	 * @throws SQLException           if a database access error occurs
	 * @throws ClassNotFoundException if the JDBC driver class is not found
	 */
	public static Connection getDbConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getDbConnection();
            if (connection != null) {
                System.out.println("Database connection successful: " + connection);
            } else {
                System.out.println("Failed to establish database connection.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Database connection error: " + e.getMessage());
        } finally {
            // Close connection
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.out.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }

}