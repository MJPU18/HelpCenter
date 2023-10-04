package co.edu.unbosque.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Class homonymous to DBConnection in terms of functions in which the results
 * of each entry that may exist are tested.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */

public class DBConnectionTest {

	DBConnection db = new DBConnection();

	private static int counter = 0;

	/**
	 * Function used to tell the user when the test is starting.
	 * 
	 * @param name: the identifying label of the class to know what test is starting
	 *              in real time.
	 */

	public static void start(String name) {
		System.out.println("\n test called: " + name + ", number: " + counter + " starting");
	}

	/**
	 * Design that always appears at the beginning and indicates the title of the
	 * class being tested.
	 */

	@BeforeAll

	public static void banner() {

		System.err.println("\n______________ Starting all DBConnection unit tests _____________");

	}

	/**
	 * Database initialization is tested with a positive result.
	 */

	@Test

	public void initConnectionSucessful() {

		Connection connect = null;

		start("initConnectionSucessful");
		counter++;

		boolean runServer = true;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			runServer = false;
		}
		try {
			connect = DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD());
		} catch (SQLException e) {
			runServer = false;
		}

		assertEquals(true, runServer);

	}

	@Test

	/**
	 * Database initialization is tested with a negative result.
	 */

	public void initConnectionWrong() {

		Connection connect = null;

		String Porterr = "1101";

		start("initConnectionWrong");
		counter++;

		boolean runServer = true;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			runServer = false;
		}
		try {
			connect = DriverManager.getConnection("jdbc:mysql://" + db.getIP() + ":" + Porterr + "/" + db.getDATABASE(),
					db.getUSERNAME(), db.getPASSWORD());
		} catch (SQLException e) {
			runServer = false;
		}

		assertEquals(true, runServer);

	}

	@Test

	/**
	 * The test is carried out that the database is ending its execution with a
	 * favorable result.
	 */

	public void closeSuccesfull() {

		start("closeSuccesfull");
		counter++;

		boolean runServer = true;

		try {
			if (db.getResultset() != null) {
				db.getResultset().close();
			}
			if (db.getStatement() != null) {
				db.getStatement().close();
			}
			if (db.getConnect() != null) {
				db.getConnect().close();
			}
		} catch (SQLException e) {
			runServer = false;
		}

		assertEquals(true, runServer);

	}

	@Test

	/**
	 * The test is carried out that the database is ending its execution with a
	 * unfavorable result
	 */

	public void closeWrong() {

		start("closeWrong");
		counter++;

		boolean runServer = true;

		try {
			if (db.getResultset() != null) {
				db.getResultset().close();
			}
			if (db.getStatement() != null) {
				db.getStatement().close();
			}
			if (db.getConnect() != null) {
				db.getConnect().close();
			}
			throw new SQLException();
		} catch (SQLException e) {
			runServer = false;
		}

		assertEquals(true, runServer);

	}

	@Test

	/**
	 * Obtains the connect attribute information successfully.
	 */

	public void getConnectSucessful() {

		start("getConnectSucessful");
		counter++;

		assertEquals(null, db.getConnect());

	}

	/**
	 * Obtains the connect attribute information unsuccessfully.
	 */

	@Test

	public void getConnectWrong() {

		start("getConnectWrong");
		counter++;

		Connection connect = null;

		try {
			connect = DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD());
		} catch (SQLException e) {

		}

		assertEquals(connect, db.getConnect());

	}

	@Test

	/**
	 * Obtains the statement attribute information successfully.
	 */

	public void getStatementSucessful() {

		start("getStatementSucessful");
		counter++;

		assertEquals(null, db.getStatement());

	}

	/**
	 * Obtains the statement attribute information unsuccessfully.
	 */

	@Test

	public void getStatementWrong() {

		start("getStatementWrong");
		counter++;

		Statement statement = null;
		try {
			db.setConnect(DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD()));
		} catch (SQLException e) {
		}

		try {
			statement = db.getConnect().createStatement();
		} catch (SQLException e) {

		}

		assertEquals(statement, db.getConnect());

	}

	@Test

	/**
	 * Obtains the preparedStatement attribute information successfully.
	 */

	public void getPreparedStatementSuccesful() {

		start("getPreparedStatementSuccesful");
		counter++;

		assertEquals(null, db.getPreparedstatement());

	}

	@Test

	/**
	 * Obtains the preparedStatement attribute information unsuccessfully.
	 */

	public void getPreparedStatementWrong() {

		start("getPreparedStatementWrong");
		counter++;

		PreparedStatement ps = null;

		try {
			db.setConnect(DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD()));
		} catch (SQLException e) {
		}

		try {
			ps = db.getConnect().prepareStatement(
					"UPDATE generalservice SET username=?, userpassword=?, personname=?, document=?, dateofbirth=?, cityofbirth=?, salary=?, sessionscleaned=? WHERE document=?;");

		} catch (Exception e) {
			// TOexceptionDO: handle
		}

		assertEquals(ps, db.getPreparedstatement());

	}

	@Test

	/**
	 * Obtains the resultSet attribute information successfully.
	 */

	public void getResultSetSuccesful() {

		start("getResultSetSuccesful");
		counter++;

		assertEquals(null, db.getResultset());

	}

	@Test

	/**
	 * Obtains the resultSet attribute information unsuccessfully.
	 */

	public void getResultSetWrong() {

		start("getResultSetWrong");
		counter++;

		ResultSet rs = null;

		try {
			db.setConnect(DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD()));
			db.setStatement(db.getConnect().createStatement());
			rs = db.getStatement().executeQuery("SELECT *FROM generalservice;");
		} catch (SQLException e) {
		}

		assertEquals(rs, db.getResultset());

	}

	@Test

	/**
	 * Obtains the IP attribute information successfully.
	 */

	public void getIPSucessful() {
		start("getIPSucessful");
		counter++;

		String aux = db.getIP();

		assertEquals("35.239.57.35", aux);

	}

	@Test

	/**
	 * Obtains the IP attribute information unsuccessfully.
	 */

	public void getIPWrong() {
		start("getIPWrong");
		counter++;

		String aux = db.getIP();

		assertEquals("0", aux);

	}

	@Test

	/**
	 * Obtains the DATABASE attribute information successfully.
	 */

	public void getDATABASESucessful() {
		start("getDATABASESucessful");
		counter++;

		String aux = db.getDATABASE();

		assertEquals("urregoJuan", aux);

	}

	@Test

	/**
	 * Obtains the DATABASE attribute information unsuccessfully.
	 */

	public void getDATABASEWrong() {
		start("getDATABASEWrong");
		counter++;

		String aux = db.getDATABASE();

		assertEquals("uyabanNicolas", aux);

	}

	@Test

	/**
	 * Obtains the PASSWORD attribute information successfully.
	 */

	public void getPASSWORDSucessful() {
		start("getPASSWORDSucessful");
		counter++;

		String aux = db.getPASSWORD();

		assertEquals("programacion2", aux);

	}

	@Test

	public void getPASSWORDWrong() {
		start("getPASSWORDWrong");
		counter++;

		String aux = db.getDATABASE();

		assertEquals("", aux);

	}

	@Test

	/**
	 * Obtains the PORT attribute information successfully.
	 */

	public void getPORTSucessful() {
		start("getPORTSucessful");
		counter++;

		String aux = db.getPORT();

		assertEquals("3306", aux);

	}

	@Test

	public void getPORTWrong() {
		start("getPORTWrong");
		counter++;

		String aux = db.getPORT();

		assertEquals("", aux);

	}

	@Test

	/**
	 * Obtains the USERNAME attribute information successfully.
	 */

	public void getUSERNAMESucessful() {
		start("getUSERNAMESucessful");
		counter++;

		String aux = db.getUSERNAME();

		assertEquals("root", aux);

	}

	@Test

	public void getUSERNAMEWrong() {
		start("getUSERNAMEWrong");
		counter++;

		String aux = db.getUSERNAME();

		assertEquals("", aux);

	}

	@Test

	/**
	 * modifies the Connect attribute information successfully.
	 */

	public void setConnectSucessful() {

		start("setConnectSucessful");
		counter++;

		Connection connect = null;

		try {
			connect = DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD());
		} catch (SQLException e) {

		}

		db.setConnect(connect);

		assertEquals(connect, db.getConnect());

	}

	@Test

	public void setConnectWrong() {

		start("setConnectWrong");
		counter++;

		Connection connect = null;

		try {
			connect = DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD());
		} catch (SQLException e) {

		}

		db.setConnect(connect);

		assertEquals(null, db.getConnect());

	}

	@Test

	/**
	 * modifies the statement attribute information successfully.
	 */

	public void setStatementSucessful() {

		start("setStatementSucessful");
		counter++;

		Statement statement = null;
		try {
			db.setConnect(DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD()));
		} catch (SQLException e) {
		}

		try {
			statement = db.getConnect().createStatement();
		} catch (SQLException e) {

		}

		db.setStatement(statement);

		assertEquals(statement, db.getStatement());

	}

	@Test

	public void setStatementWrong() {

		start("setStatementWrong");
		counter++;

		Statement statement = null;
		try {
			db.setConnect(DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD()));
		} catch (SQLException e) {
		}

		try {
			statement = db.getConnect().createStatement();
		} catch (SQLException e) {

		}

		db.setStatement(statement);

		assertEquals(null, db.getConnect());

	}

	@Test

	/**
	 * modifies the preparedStatement attribute information successfully.
	 */

	public void setPreparedStatementSuccesful() {

		start("setPreparedStatementSuccesful");
		counter++;

		PreparedStatement ps = null;

		try {
			db.setConnect(DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD()));
			ps = db.getConnect().prepareStatement(
					"UPDATE generalservice SET username=?, userpassword=?, personname=?, document=?, dateofbirth=?, cityofbirth=?, salary=?, sessionscleaned=? WHERE document=?;");

		} catch (SQLException e) {
		} catch (Exception e) {
			// TOexceptionDO: handle
		}

		db.setPreparedstatement(ps);

		assertEquals(ps, db.getPreparedstatement());

	}

	@Test

	public void setPreparedStatementWrong() {

		start("setPreparedStatementWrong");
		counter++;

		PreparedStatement ps = null;

		try {
			db.setConnect(DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD()));
			ps = db.getConnect().prepareStatement(
					"UPDATE generalservice SET username=?, userpassword=?, personname=?, document=?, dateofbirth=?, cityofbirth=?, salary=?, sessionscleaned=? WHERE document=?;");

		} catch (SQLException e) {
		} catch (Exception e) {
			// TOexceptionDO: handle
		}

		db.setPreparedstatement(ps);

		assertEquals(null, db.getPreparedstatement());

	}

	@Test

	/**
	 * modifies the resultSet attribute information successfully.
	 */

	public void setResultSetSuccesful() {

		start("setResultSetSuccesful");
		counter++;

		ResultSet rs = null;

		try {
			db.setConnect(DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD()));
			db.setStatement(db.getConnect().createStatement());
			rs = db.getStatement().executeQuery("SELECT *FROM generalservice;");
		} catch (SQLException e) {
		}

		db.setResultset(rs);

		assertEquals(rs, db.getResultset());

	}

	@Test

	public void setResultSetWrong() {

		start("setResultSetWrong");
		counter++;

		ResultSet rs = null;

		try {
			db.setConnect(DriverManager.getConnection(
					"jdbc:mysql://" + db.getIP() + ":" + db.getPORT() + "/" + db.getDATABASE(), db.getUSERNAME(),
					db.getPASSWORD()));
			db.setStatement(db.getConnect().createStatement());
			rs = db.getStatement().executeQuery("SELECT *FROM generalservice;");
		} catch (SQLException e) {
		}

		db.setResultset(rs);

		assertEquals(null, db.getResultset());

	}

	/**
	 * modifies the DATABASE attribute information successfully.
	 */

	@AfterAll

	/**
	 * 
	 * function that ends the tests with a sign indicating the number of tests
	 * performed and their values.
	 */

	public static void end() {

		System.err.println("\n have been executed " + counter + " test");

	}

}
