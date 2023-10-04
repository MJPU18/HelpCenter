package co.edu.unbosque.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The DBConnection class handles database connections. It provides methods to
 * initialize a connection, close database resources, and getters/setters for
 * database connection parameters.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class DBConnectionForTest {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedstatement = null;
	private ResultSet resultset = null;
	private final String IP = "35.239.57.35";
	private final String PORT = "3306";
	private final String DATABASE = "urregoJuan";
	private final String USERNAME = "root";
	private final String PASSWORD = "programacion2";

	/**
	 * Create an object of class DBConnection
	 */
	public DBConnectionForTest() {
	}

	/**
	 * Initializes the database connection.
	 */
	public void initConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connect = DriverManager.getConnection("jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE, USERNAME,
					PASSWORD);
			System.out.println("Successfully connection.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Closes the database resources.
	 */
	public void close() {
		try {
			if (resultset != null) {
				resultset.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connect != null) {
				connect.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the database connection.
	 *
	 * @return The database connection.
	 */
	public Connection getConnect() {
		return connect;
	}

	/**
	 * Sets the database connection.
	 *
	 * @param connect :The database connection to set.
	 */
	public void setConnect(Connection connect) {
		this.connect = connect;
	}

	/**
	 * Gets the SQL statement.
	 *
	 * @return The SQL statement.
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * Sets the SQL statement.
	 *
	 * @param statement :The SQL statement to set.
	 */
	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	/**
	 * Gets the prepared statement.
	 *
	 * @return The prepared statement.
	 */
	public PreparedStatement getPreparedstatement() {
		return preparedstatement;
	}

	/**
	 * Sets the prepared statement.
	 *
	 * @param preparedstatement :The prepared statement to set.
	 */
	public void setPreparedstatement(PreparedStatement preparedstatement) {
		this.preparedstatement = preparedstatement;
	}

	/**
	 * Gets the result set.
	 *
	 * @return The result set.
	 */
	public ResultSet getResultset() {
		return resultset;
	}

	/**
	 * Sets the result set.
	 *
	 * @param resultset :The result set to set.
	 */
	public void setResultset(ResultSet resultset) {
		this.resultset = resultset;
	}

	/**
	 * Gets the IP address of the MySQL server.
	 *
	 * @return The IP address of the MySQL server.
	 */
	public String getIP() {
		return IP;
	}

	/**
	 * Gets the port number of the MySQL server.
	 *
	 * @return The port number of the MySQL server.
	 */
	public String getPORT() {
		return PORT;
	}

	/**
	 * Gets the name of the database.
	 *
	 * @return The name of the database.
	 */
	public String getDATABASE() {
		return DATABASE;
	}

	/**
	 * Gets the database username.
	 *
	 * @return The database username.
	 */
	public String getUSERNAME() {
		return USERNAME;
	}

	/**
	 * Gets the database password.
	 *
	 * @return The database password.
	 */
	public String getPASSWORD() {
		return PASSWORD;
	}

}
