package co.edu.unbosque.model.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import co.edu.unbosque.controller.DBConnectionForTest;
import co.edu.unbosque.model.ParticipantDTO;
import co.edu.unbosque.model.ParticipantDTOTest;
import co.edu.unbosque.model.PersonDTO;

/**
 * This class represents a data access object (DAO) for managing ParticipantDAO
 * objects.
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
		ParticipantDTO aux= new ParticipantDTO("mc2", "1234", "Nicolas", 1234, date, "Aguazul", 5, "");
		
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO participant (username, userpassword, personname, document, dateofbirth, cityofbirth, participatedsessions, nickname) VALUES(?,?,?,?,?,?,?,?);"));
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
			e.printStackTrace();
		}
		
		long document = list.get(0).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement("DELETE FROM participant WHERE document=?;"));
			dbcon.getPreparedstatement().setLong(1, document);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertEquals(aux, list.get(0));
	}
	
	@Test
	public void containsPassword() {
		
		start("ContainsPassword");

		counter++;
		
		ArrayList<ParticipantDTO> list = new ArrayList<ParticipantDTO>();
		
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		ParticipantDTO aux = new ParticipantDTO("mc", "1234", "Nicolas", 1052836658, date, "Aguazul", 5, "");
		list.add(aux);
		
		boolean aux2 = false;
		if (list.get(0).getPassword().equals("1234")) {
			aux2 = true;
		}
		
		assertEquals(true, aux2);
	}
	
	
	
	
}
