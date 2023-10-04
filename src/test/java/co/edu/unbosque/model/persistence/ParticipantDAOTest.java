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
import co.edu.unbosque.model.ParticipantDTO;

/**
 * Class homonymous to ParticipantDAO in terms of functions in which the
 * results of each entry that may exist are tested.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class ParticipantDAOTest {

	DBConnectionForTest dbcon = new DBConnectionForTest();

	private static int counter = 0;

	public static void start(String name) {
		System.out.println("\n test called: " + name + ", number: " + counter + " starting");
	}

	@BeforeAll

	public static void banner() {

		System.err.println("\n______________ Starting all ParticipantDAO unit tests _____________");

	}

	@Test
	public void create() {

		start("create");

		counter++;

		ArrayList<ParticipantDTO> list = new ArrayList<ParticipantDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		ParticipantDTO aux = new ParticipantDTO("mc", "1234", "Nicolas", 1052836658, date, "Aguazul", 5, "AA");

		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO participants (username, userpassword, personname, document, dateofbirth, cityofbirth, participatedsessions, nickname) VALUES(?,?,?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, aux.getUserName());
			dbcon.getPreparedstatement().setString(2, aux.getPassword());
			dbcon.getPreparedstatement().setString(3, aux.getName());
			dbcon.getPreparedstatement().setLong(4, aux.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(aux.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, aux.getCityOfBirth());
			dbcon.getPreparedstatement().setInt(7, aux.getParticipatedSessions());
			dbcon.getPreparedstatement().setString(8, aux.getNickName());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			list.add(aux);
		} catch (SQLException e) {
		}

		long document = list.get(0).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(
					dbcon.getConnect().prepareStatement("DELETE FROM participants WHERE document=?;"));
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

		ArrayList<ParticipantDTO> list = new ArrayList<ParticipantDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		ParticipantDTO aux = new ParticipantDTO("mc", "1234", "Nicolas", 1052836658, date, "Aguazul", 5, "AA");

		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO participants (username, userpassword, personname, document, dateofbirth, cityofbirth, participatedsessions, nickname) VALUES(?,?,?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, aux.getUserName());
			dbcon.getPreparedstatement().setString(2, aux.getPassword());
			dbcon.getPreparedstatement().setString(3, aux.getName());
			dbcon.getPreparedstatement().setLong(4, aux.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(aux.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, aux.getCityOfBirth());
			dbcon.getPreparedstatement().setInt(7, aux.getParticipatedSessions());
			dbcon.getPreparedstatement().setString(8, aux.getNickName());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			list.add(aux);
		} catch (SQLException e) {
		}

		long adocument = list.get(0).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"UPDATE participants SET username=?, userpassword=?, personname=?, document=?, dateofbirth=?, cityofbirth=?, participatedsessions=?, nickname=? WHERE document=?;"));
			dbcon.getPreparedstatement().setString(1, aux.getUserName());
			dbcon.getPreparedstatement().setString(2, aux.getPassword());
			dbcon.getPreparedstatement().setString(3, aux.getName());
			dbcon.getPreparedstatement().setLong(4, aux.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(aux.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, aux.getCityOfBirth());
			dbcon.getPreparedstatement().setInt(7, aux.getParticipatedSessions());
			dbcon.getPreparedstatement().setString(8, aux.getNickName());
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
					dbcon.getConnect().prepareStatement("DELETE FROM participants WHERE document=?;"));
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

		ArrayList<ParticipantDTO> list = new ArrayList<ParticipantDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		ParticipantDTO aux = new ParticipantDTO("mc", "1234", "Nicolas", 1052836658, date, "Aguazul", 5, "AA");

		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO participants (username, userpassword, personname, document, dateofbirth, cityofbirth, participatedsessions, nickname) VALUES(?,?,?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, aux.getUserName());
			dbcon.getPreparedstatement().setString(2, aux.getPassword());
			dbcon.getPreparedstatement().setString(3, aux.getName());
			dbcon.getPreparedstatement().setLong(4, aux.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(aux.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, aux.getCityOfBirth());
			dbcon.getPreparedstatement().setInt(7, aux.getParticipatedSessions());
			dbcon.getPreparedstatement().setString(8, aux.getNickName());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			list.add(aux);
		} catch (SQLException e) {
		}

		long document = list.get(0).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(
					dbcon.getConnect().prepareStatement("DELETE FROM participants WHERE document=?;"));
			dbcon.getPreparedstatement().setLong(1, document);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			list.remove(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		boolean b = false;
		if (list.isEmpty()) {
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

		ArrayList<ParticipantDTO> list = new ArrayList<ParticipantDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		ParticipantDTO aux = new ParticipantDTO("mc", "1234", "Nicolas", 1052836658, date, "Aguazul", 5, "AA");
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

		ArrayList<ParticipantDTO> list = new ArrayList<ParticipantDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		ParticipantDTO aux = new ParticipantDTO("mc", "1234", "Nicolas", 1052836658, date, "Aguazul", 5, "AA");
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

		ArrayList<ParticipantDTO> list = new ArrayList<ParticipantDTO>();
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		ParticipantDTO aux = new ParticipantDTO("mc", "1234", "Nicolas", 1052836658, date, "Aguazul", 5, "AA");
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
