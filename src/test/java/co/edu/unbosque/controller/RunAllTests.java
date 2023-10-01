package co.edu.unbosque.controller;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import co.edu.unbosque.model.ParticipantDTO;
import co.edu.unbosque.model.PersonDTO;

public class RunAllTests {

//	private GeneralServiceDTOTest a = new GeneralServiceDTOTest();
//	private ParticipantDTOTest b = new ParticipantDTOTest();

	private static int counter = 0;

	public static void start(String name) {
		System.out.println("\n test called: " + name + ", number: " + counter + " starting");
	}

	@BeforeAll

	public static void banner() {

		System.err.println("\n______________ Starting all unit tests for the project _____________");

	}

	@Test

	public void constructorParticipantSuccessfulall() {

		start("constructorParticipantSuccessful");

		counter++;

		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(sessions, nickName);

		assertEquals(aux, aux);

	}

	@Test

	public void constructorParticipantWrongall() {

		start("constructorParticipantWrong");

		counter++;

		int sessions = 6;
		String nickName = "Tester";

		int sessions2 = 6;
		String nickName2 = "Tester";

		ParticipantDTO aux = new ParticipantDTO(sessions, nickName);

		ParticipantDTO aux2 = new ParticipantDTO(sessions, nickName);

		assertEquals(aux, aux2);

	}

	@Test

	public void constructorWithHerencyParticipantSuccessfulall() {

		start("constructorWithHerencyParticipantSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux2 = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals(aux, aux);

	}

	@Test

	public void constructorWithHerencyParticipantWrongall() {

		start("constructorWithHerencyParticipantWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux2 = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals(aux, aux2);

	}

	@Test

	public void getParticipatedSessionsSuccessfulall() {

		start("getParticipatedSessionsSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals(6, aux.getParticipatedSessions());

	}

	@Test

	public void getParticipatedSessionsWrongall() {

		start("getParticipatedSessionsWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals(12, aux.getParticipatedSessions());

	}

	@Test

	public void getNickNameSuccessfulall() {

		start("getNickNameSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals("Tester", aux.getNickName());

	}

	@Test

	public void getNickNameWrongall() {

		start("getNickNameWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals("Noname", aux.getNickName());

	}

	@Test

	public void setParticipatedSessionsSuccessfulall() {

		start("setParticipatedSessionsSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		aux.setParticipatedSessions(8);

		assertEquals(8, aux.getParticipatedSessions());

	}

	@Test

	public void setParticipatedSessionsWrongall() {

		start("setParticipatedSessionsWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		aux.setParticipatedSessions(8);

		assertEquals(6, aux.getParticipatedSessions());

	}

	@Test

	public void setNickNameSuccessfulall() {

		start("setNickNameSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		aux.setNickName("Change");

		assertEquals("Change", aux.getNickName());

	}

	@Test

	public void setNickNameWrongall() {

		start("setNickNameWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		aux.setNickName("Change");

		assertEquals("Tester", aux.getNickName());

	}

	@Test

	public void constructorParticipantSuccessful() {

		start("constructorParticipantSuccessful");

		counter++;

		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(sessions, nickName);

		assertEquals(aux, aux);

	}

	@Test

	public void constructorParticipantWrong() {

		start("constructorParticipantWrong");

		counter++;

		int sessions = 6;
		String nickName = "Tester";

		int sessions2 = 6;
		String nickName2 = "Tester";

		ParticipantDTO aux = new ParticipantDTO(sessions, nickName);

		ParticipantDTO aux2 = new ParticipantDTO(sessions, nickName);

		assertEquals(aux, aux2);

	}

	@Test

	public void constructorWithHerencyParticipantSuccessful() {

		start("constructorWithHerencyParticipantSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux2 = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals(aux, aux);

	}

	@Test

	public void constructorWithHerencyParticipantWrong() {

		start("constructorWithHerencyParticipantWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux2 = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals(aux, aux2);

	}

	@Test

	public void getParticipatedSessionsSuccessful() {

		start("getParticipatedSessionsSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals(6, aux.getParticipatedSessions());

	}

	@Test

	public void getParticipatedSessionsWrong() {

		start("getParticipatedSessionsWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals(12, aux.getParticipatedSessions());

	}

	@Test

	public void getNickNameSuccessful() {

		start("getNickNameSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals("Tester", aux.getNickName());

	}

	@Test

	public void getNickNameWrong() {

		start("getNickNameWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		assertEquals("Noname", aux.getNickName());

	}

	@Test

	public void setParticipatedSessionsSuccessful() {

		start("setParticipatedSessionsSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		aux.setParticipatedSessions(8);

		assertEquals(8, aux.getParticipatedSessions());

	}

	@Test

	public void setParticipatedSessionsWrong() {

		start("setParticipatedSessionsWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		aux.setParticipatedSessions(8);

		assertEquals(6, aux.getParticipatedSessions());

	}

	@Test

	public void setNickNameSuccessful() {

		start("setNickNameSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		aux.setNickName("Change");

		assertEquals("Change", aux.getNickName());

	}

	@Test

	public void setNickNameWrong() {

		start("setNickNameWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		aux.setNickName("Change");

		assertEquals("Tester", aux.getNickName());

	}

	@Test

	public void constructorPersonSuccessful() {

		start("constructorPersonSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals(aux, aux);

	}

	@Test

	public void constructorPersonWrong() {

		start("constructorPersonWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);
		PersonDTO aux2 = new PersonDTO(userName, password, name, document, date, city);

		assertEquals(aux, aux2);

	}

	@Test

	public void getUserNameSuccessful() {

		start("getUserNameSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals("test123", aux.getUserName());

	}

	@Test

	public void getUserNameWrong() {

		start("getUserNameWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals("test1234", aux.getUserName());

	}

	@Test

	public void getPasswordSuccessful() {

		start("getPasswordSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals("test123", aux.getPassword());

	}

	@Test

	public void getPasswordWrong() {

		start("getPasswordWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals("test1234", aux.getPassword());

	}

	@Test

	public void getNameSuccessful() {

		start("getNameSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals("New Test", aux.getName());

	}

	@Test

	public void getNameWrong() {

		start("getNameWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals("New", aux.getName());

	}

	@Test

	public void getDocumentSuccessful() {

		start("getDocumentSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals(0000000000, aux.getDocument());

	}

	@Test

	public void getDocumentWrong() {

		start("getDocumentWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals(0000000001, aux.getDocument());

	}

	@Test

	public void getDateSuccessful() {

		start("getDateSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		Date dateaux = new Date(01, 01, 2000);

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals(dateaux, aux.getDateOfBirth());

	}

	@Test

	public void getDateWrong() {

		start("getDateWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		Date dateaux = new Date(01, 01, 2001);

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals(dateaux, aux.getDateOfBirth());

	}

	@Test

	public void getCitySuccessful() {

		start("getCitySuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals("Pacho", aux.getCityOfBirth());

	}

	@Test

	public void getCityWrong() {

		start("getCityWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		assertEquals("Bogota", aux.getCityOfBirth());

	}

	@Test

	public void setUserNameSuccessful() {

		start("setUserNameSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setUserName("newname");

		assertEquals("newname", aux.getUserName());

	}

	@Test

	public void setUserNameWrong() {

		start("setUserNameWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setUserName("newname");

		assertEquals("test1234", aux.getUserName());

	}

	@Test

	public void setPasswordSuccessful() {

		start("setPasswordSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setPassword("4321");

		assertEquals("4321", aux.getPassword());

	}

	@Test

	public void setPasswordWrong() {

		start("setPasswordWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setPassword("4321");

		assertEquals("test123", aux.getPassword());

	}

	@Test

	public void setNameSuccessful() {

		start("setNameSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setName("Noname");

		assertEquals("Noname", aux.getName());

	}

	@Test

	public void setNameWrong() {

		start("setNameWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setName("Noname");

		assertEquals("New Test", aux.getName());

	}

	@Test

	public void setDocumentSuccessful() {

		start("setDocumentSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setDocument(00000000001);

		assertEquals(0000000001, aux.getDocument());

	}

	@Test

	public void setDocumentWrong() {

		start("setDocumentWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setDocument(00000000001);

		assertEquals(0000000000, aux.getDocument());

	}

	@Test

	public void setDateSuccessful() {

		start("setDateSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		Date dateaux = new Date(01, 01, 2001);

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setDateOfBirth(dateaux);

		assertEquals(dateaux, aux.getDateOfBirth());

	}

	@Test

	public void setDateWrong() {

		start("setDateWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		Date dateaux = new Date(01, 01, 2001);

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setDateOfBirth(dateaux);

		assertEquals(date, aux.getDateOfBirth());

	}

	@Test

	public void setCitySuccessful() {

		start("setCitySuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setCityOfBirth("Bogota");

		assertEquals("Bogota", aux.getCityOfBirth());

	}

	@Test

	public void setCityWrong() {

		start("setCityWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		Date date = new Date(01, 01, 2000);
		String city = "Pacho";

		PersonDTO aux = new PersonDTO(userName, password, name, document, date, city);

		aux.setCityOfBirth("Bogota");

		assertEquals("Pacho", aux.getCityOfBirth());

	}

	@AfterAll
	public static void end() {

		System.err.println("\n have been executed " + counter + " test");

	}

}
