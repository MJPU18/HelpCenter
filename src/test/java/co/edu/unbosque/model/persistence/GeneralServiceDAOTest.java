package co.edu.unbosque.model.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import co.edu.unbosque.connection.controller.DBConnectionForTest;
import co.edu.unbosque.model.GeneralServiceDTO;

/**
 Class homonymous to GeneralServiceDAO in terms of functions in which the
 * results of each entry that may exist are tested.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class GeneralServiceDAOTest {

	DBConnectionForTest dbcon = new DBConnectionForTest();

	private static int counter = 0;

	public static void start(String name) {
		System.out.println("\n test called: " + name + ", number: " + counter + " starting");
	}

	@BeforeAll

	public static void banner() {

		System.err.println("\n______________ Starting all GeneralServiceDAO unit tests _____________");

	}

	@Test
	public void create() {

		start("create");

		counter++;

		ArrayList<GeneralServiceDTO> list = new ArrayList<GeneralServiceDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		GeneralServiceDTO aux = new GeneralServiceDTO("mc", "1234", "Nicolas", 1052836658, date, "aguazul", 200000, 6);

		try {
			dbcon.initConnection();
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO generalservice (username, userpassword, personname, document, dateofbirth, cityofbirth, salary, sessionscleaned) VALUES(?,?,?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, aux.getUserName());
			dbcon.getPreparedstatement().setString(2, aux.getPassword());
			dbcon.getPreparedstatement().setString(3, aux.getName());
			dbcon.getPreparedstatement().setLong(4, aux.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(aux.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, aux.getCityOfBirth());
			dbcon.getPreparedstatement().setDouble(7, aux.getSalary());
			dbcon.getPreparedstatement().setInt(8, aux.getSessionsCleaned());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			list.add(aux);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		long document = list.get(0).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(
					dbcon.getConnect().prepareStatement("DELETE FROM generalservice WHERE document=?;"));
			dbcon.getPreparedstatement().setLong(1, document);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertEquals(aux, list.get(0));
	}

	@Test
	public void uptade() {
		
		start("update");

		counter++;
		
		ArrayList<GeneralServiceDTO> list = new ArrayList<GeneralServiceDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		GeneralServiceDTO aux = new GeneralServiceDTO("mc", "1234", "Nicolas", 1052836658, date, "aguazul", 200000, 6);

		try {
			dbcon.initConnection();
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO generalservice (username, userpassword, personname, document, dateofbirth, cityofbirth, salary, sessionscleaned) VALUES(?,?,?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, aux.getUserName());
			dbcon.getPreparedstatement().setString(2, aux.getPassword());
			dbcon.getPreparedstatement().setString(3, aux.getName());
			dbcon.getPreparedstatement().setLong(4, aux.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(aux.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, aux.getCityOfBirth());
			dbcon.getPreparedstatement().setDouble(7, aux.getSalary());
			dbcon.getPreparedstatement().setInt(8, aux.getSessionsCleaned());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			list.add(aux);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		long adocument = list.get(0).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"UPDATE generalservice SET username=?, userpassword=?, personname=?, document=?, dateofbirth=?, cityofbirth=?, salary=?, sessionscleaned=? WHERE document=?;"));
			dbcon.getPreparedstatement().setString(1, aux.getUserName());
			dbcon.getPreparedstatement().setString(2, aux.getPassword());
			dbcon.getPreparedstatement().setString(3, aux.getName());
			dbcon.getPreparedstatement().setLong(4, aux.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(aux.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, aux.getCityOfBirth());
			dbcon.getPreparedstatement().setDouble(7, aux.getSalary());
			dbcon.getPreparedstatement().setInt(8, aux.getSessionsCleaned());
			dbcon.getPreparedstatement().setLong(9, adocument);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			list.set(0, aux);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(
					dbcon.getConnect().prepareStatement("DELETE FROM generalservice WHERE document=?;"));
			dbcon.getPreparedstatement().setLong(1, adocument);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertEquals(aux, list.get(0));

	}

	@Test
	public void delete() {

		start("delete");

		counter++;
		
		ArrayList<GeneralServiceDTO> list = new ArrayList<GeneralServiceDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		GeneralServiceDTO aux = new GeneralServiceDTO("mc", "1234", "Nicolas", 1052836658, date, "aguazul", 200000, 6);

		try {
			dbcon.initConnection();
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO generalservice (username, userpassword, personname, document, dateofbirth, cityofbirth, salary, sessionscleaned) VALUES(?,?,?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, aux.getUserName());
			dbcon.getPreparedstatement().setString(2, aux.getPassword());
			dbcon.getPreparedstatement().setString(3, aux.getName());
			dbcon.getPreparedstatement().setLong(4, aux.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(aux.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, aux.getCityOfBirth());
			dbcon.getPreparedstatement().setDouble(7, aux.getSalary());
			dbcon.getPreparedstatement().setInt(8, aux.getSessionsCleaned());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			list.add(aux);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		long document = list.get(0).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(
					dbcon.getConnect().prepareStatement("DELETE FROM generalservice WHERE document=?;"));
			dbcon.getPreparedstatement().setLong(1, document);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			list.remove(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		boolean b = false;
		if(list.isEmpty()) {
			b = true;
		}
		
		assertEquals(true, b);
	}

	@Test
	public void loadData() {

		start("loadData");

		counter++;

	}

	@Test
	public void containsUser() {

		start("containsUser");

		counter++;
		
		ArrayList<GeneralServiceDTO> list = new ArrayList<GeneralServiceDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		GeneralServiceDTO aux = new GeneralServiceDTO("mc", "1234", "Nicolas", 1052836658, date, "aguazul", 200000, 6);
		list.add(aux);
		
		boolean aux2 = false;
		if (list.get(0).getUserName().equals("mc") && list.get(0).getPassword().equals("1234")) {
			aux2 = true;
		}
		assertEquals(true, aux2);

	}

	@Test
	public void ContainsUsername() {

		start("ContainsUsername");

		counter++;
		ArrayList<GeneralServiceDTO> list = new ArrayList<GeneralServiceDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		GeneralServiceDTO aux = new GeneralServiceDTO("mc", "1234", "Nicolas", 1052836658, date, "aguazul", 200000, 6);
		list.add(aux);
		
		boolean aux2 = false;
		if (list.get(0).getUserName().equals("mc")) {
			aux2 = true;
		}
		assertEquals(true, aux2);
	}

	@Test
	public void containsPassword() {

		start("containsPassword");

		counter++;
		
		ArrayList<GeneralServiceDTO> list = new ArrayList<GeneralServiceDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		GeneralServiceDTO aux = new GeneralServiceDTO("mc", "1234", "Nicolas", 1052836658, date, "aguazul", 200000, 6);
		list.add(aux);
		
		boolean aux2 = false;
		if (list.get(0).getPassword().equals("1234")) {
			aux2 = true;
		}
		assertEquals(true, aux2);
	}

	@AfterAll
	public static void end() {

		System.err.println("\n have been executed " + counter + " test");

	}

}
