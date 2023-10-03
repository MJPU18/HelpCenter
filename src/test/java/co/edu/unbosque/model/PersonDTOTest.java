package co.edu.unbosque.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Class homonymous to PersonDTO in terms of functions in which the results of
 * each entry that may exist are tested.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */

public class PersonDTOTest {

	private static int counter = 0;

	public static void start(String name) {
		System.out.println("\n test called: " + name + ", number: " + counter + " starting");
	}

	@BeforeAll

	public static void banner() {

		System.err.println("\n______________ Starting all ParticipantDTO unit tests _____________");

	}

	@Test

	public void constructorPersonSuccessful() {

		start("constructorPersonSuccessful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";

		LocalDate dateaux = LocalDate.of(2000, Month.of(01), 01);

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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";

		LocalDate dateaux = LocalDate.of(2000, Month.of(01), 02);

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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";

		LocalDate dateaux = LocalDate.of(2000, Month.of(01), 01);

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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";

		LocalDate dateaux = LocalDate.of(2000, Month.of(01), 02);

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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
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
