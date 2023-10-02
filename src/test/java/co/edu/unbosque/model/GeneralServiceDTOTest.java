package co.edu.unbosque.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Class homonymous to GeneralServiceDTO in terms of functions in which the
 * results of each entry that may exist are tested.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class GeneralServiceDTOTest {

	private static int counter = 0;

	public static void start(String name) {
		System.out.println("\n test called: " + name + ", number: " + counter + " starting");
	}

	@BeforeAll

	public static void banner() {

		System.err.println("\n______________ Starting all GeneralServiceDTO unit tests _____________");

	}

	@Test

	public void constructorGeneralServiceSuccessful() {

		start("constructorGeneralServiceSuccessful");

		counter++;

		double salary = 1000000;
		int sessions = 6;

		GeneralServiceDTO aux = new GeneralServiceDTO(salary, sessions);

		assertEquals(aux, aux);

	}

	@Test

	public void constructorGeneralServiceWrong() {

		start("constructorGeneralServiceWrong");

		counter++;

		double salary = 1000000;
		int sessions = 6;

		double salary2 = 500000000;
		int sessions2 = 12;

		GeneralServiceDTO aux2 = new GeneralServiceDTO(salary2, sessions2);

		GeneralServiceDTO aux = new GeneralServiceDTO(salary, sessions);

		assertEquals(aux, aux2);

	}

	@Test

	public void constructorWithHerencyGeneralServiceSuccessful() {

		start("constructorWithHerencyGeneralServiceSuccessful");

		counter++;

		String nickname = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";
		double salary = 1000000;
		int sessions = 6;

		GeneralServiceDTO aux = new GeneralServiceDTO(nickname, password, name, document, date, city, salary, sessions);

		assertEquals(aux, aux);

	}

	@Test

	public void constructorWithHerencyGeneralServiceWrong() {

		start("constructorWithHerencyGeneralServiceWrong");

		counter++;

		String nickname = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";
		double salary = 1000000;
		int sessions = 6;

		GeneralServiceDTO aux2 = new GeneralServiceDTO(nickname, password, name, document, date, city, salary,
				sessions);

		GeneralServiceDTO aux = new GeneralServiceDTO(nickname, password, name, document, date, city, salary, sessions);

		assertEquals(aux, aux2);

	}

	@Test

	public void getSalarySuccessful() {

		start("getSalarySuccessful");

		counter++;

		String nickname = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";
		double salary = 1000000;
		int sessions = 6;

		GeneralServiceDTO aux2 = new GeneralServiceDTO(nickname, password, name, document, date, city, salary,
				sessions);

		assertEquals(1000000, aux2.getSalary(), 0);

	}

	@Test

	public void getSalaryWrong() {

		start("getSalaryWrong");

		counter++;

		LocalDate aux = LocalDate.of(2000, Month.of(01), 01);

		GeneralServiceDTO aux2 = new GeneralServiceDTO("test123", "test123", "New Test", 0000000000, aux, "Bogota",
				1000000, 6);

		assertEquals(12.55, aux2.getSalary(), 0);

	}

	@Test

	public void getSessionsCleanedSuccessful() {

		start("getSessionsCleanedSuccessful");

		counter++;

		LocalDate aux = LocalDate.of(2000, Month.of(01), 01);

		GeneralServiceDTO aux2 = new GeneralServiceDTO("test123", "test123", "New Test", 0000000000, aux, "Bogota",
				1000000, 6);

		assertEquals(6, aux2.getSessionsCleaned());

	}

	@Test

	public void getSessionsCleanedWrong() {

		start("getSessionsCleanedWrong");

		counter++;

		LocalDate aux = LocalDate.of(2000, Month.of(01), 01);

		GeneralServiceDTO aux2 = new GeneralServiceDTO("test123", "test123", "New Test", 0000000000, aux, "Bogota",
				1000000, 6);

		assertEquals(2, aux2.getSessionsCleaned());

	}

	@Test

	public void setSalarySuccessful() {

		start("setSalarySuccessful");

		counter++;

		String nickname = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";
		double salary = 1000000;
		int sessions = 6;

		GeneralServiceDTO aux = new GeneralServiceDTO(nickname, password, name, document, date, city, salary, sessions);

		aux.setSalary(200);

		assertEquals(200, aux.getSalary(), 0);

	}

	@Test

	public void setSalaryWrong() {

		start("setSalaryWrong");

		counter++;

		String nickname = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";
		double salary = 1000000;
		int sessions = 6;

		GeneralServiceDTO aux = new GeneralServiceDTO(nickname, password, name, document, date, city, salary, sessions);

		aux.setSalary(200);

		assertEquals(1000000, aux.getSalary(), 0);

	}

	@Test

	public void setSessionsCleanedSuccessful() {

		start("setSessionsCleanedSuccessful");

		counter++;

		String nickname = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";
		double salary = 1000000;
		int sessions = 6;

		GeneralServiceDTO aux = new GeneralServiceDTO(nickname, password, name, document, date, city, salary, sessions);

		aux.setSessionsCleaned(7);

		assertEquals(7, aux.getSessionsCleaned());

	}

	@Test

	public void setSessionsCleanedWrong() {

		start("setSessionsCleanedWrong");

		counter++;

		String nickname = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";
		double salary = 1000000;
		int sessions = 6;

		GeneralServiceDTO aux = new GeneralServiceDTO(nickname, password, name, document, date, city, salary, sessions);

		aux.setSessionsCleaned(7);

		assertEquals(6, aux.getSessionsCleaned());

	}

	@AfterAll
	public static void end() {

		System.err.println("\n have been executed " + counter + " test");

	}

}
