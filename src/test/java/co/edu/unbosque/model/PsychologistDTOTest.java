package co.edu.unbosque.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Class homonymous to PsychologistDTO in terms of functions in which the
 * results of each entry that may exist are tested.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class PsychologistDTOTest {

	private static int counter = 0;

	public static void start(String name) {
		System.out.println("\n test called: " + name + ", number: " + counter + " starting");
	}

	@BeforeAll

	public static void banner() {

		System.err.println("\n______________ Starting all PsychologistDTO unit tests _____________");

	}

	@Test

	public void constructorPsychologistSuccesful() {

		start("constructorPsychologistSuccesful");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(aux, aux);

	}

	@Test

	public void constructorPsychologistWrong() {

		start("constructorPsychologistWrong");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);
		PsychologistDTO aux2 = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(aux, aux2);

	}

	@Test

	public void constructorWithHerencyPsychologistSuccesful() {

		start("constructorWithHerencyPsychologistSuccesful");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";
		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(userName, password, name, document, date, city, year, days, sessions,
				salary);

		assertEquals(aux, aux);

	}

	@Test

	public void constructorWithHerencyPsychologistWrong() {

		start("constructorWithHerencyPsychologistWrong");

		counter++;

		String userName = "test123";
		String password = "test123";
		String name = "New Test";
		long document = 0000000000;
		LocalDate date = LocalDate.of(2000, Month.of(01), 01);
		String city = "Pacho";
		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(userName, password, name, document, date, city, year, days, sessions,
				salary);

		PsychologistDTO aux2 = new PsychologistDTO(userName, password, name, document, date, city, year, days, sessions,
				salary);

		assertEquals(aux, aux2);

	}

	@Test

	public void setYearOfGraduationSuccesful() {

		start("setYearOfGraduationSuccesful");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		Year year2 = Year.of(2005);

		aux.setYearOfGraduation(year2);

		assertEquals(year2, aux.getYearOfGraduation());

	}

	@Test

	public void setYearOfGraduationWrong() {

		start("setYearOfGraduationWrong");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		Year year2 = Year.of(2005);

		aux.setYearOfGraduation(year2);

		assertEquals(year, aux.getYearOfGraduation());

	}

	@Test

	public void setDaysInServiceSuccesful() {

		start("setDaysInServiceSuccesful");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		aux.setDaysInService(31);

		assertEquals(31, aux.getDaysInService());

	}

	@Test

	public void setDaysInServiceWrong() {

		start("setYearOfGraduationWrong");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		aux.setDaysInService(31);

		assertEquals(days, aux.getDaysInService());

	}

	@Test

	public void setSuportedSessionsSuccesful() {

		start("setSuportedSessionsSuccesful");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		aux.setSuportedSessions(10);

		assertEquals(10, aux.getSuportedSessions());

	}

	@Test

	public void setSuportedSessionsWrong() {

		start("setSuportedSessionsWrong");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		aux.setSuportedSessions(10);

		assertEquals(sessions, aux.getSuportedSessions());

	}

	@Test

	public void setSalarySuccesful() {

		start("setSalarySuccesful");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		aux.setSalary(1000001);

		assertEquals(1000001, aux.getSalary());

	}

	@Test

	public void setSalaryWrong() {

		start("setSalaryWrong");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		aux.setSalary(1000001);

		assertEquals(salary, aux.getSalary());

	}

	@Test

	public void getYearOfGraduationSuccesful() {

		start("getYearOfGraduationSuccesful");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(year, aux.getYearOfGraduation());

	}

	@Test

	public void getYearOfGraduationWrong() {

		start("getYearOfGraduationWrong");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		Year year2 = Year.of(2005);

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(year2, aux.getYearOfGraduation());

	}

	@Test

	public void getDaysInServiceSuccesful() {

		start("getDaysInServiceSuccesful");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(days, aux.getDaysInService());

	}

	@Test

	public void getDaysInServiceWrong() {

		start("getYearOfGraduationWrong");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(28, aux.getDaysInService());

	}

	@Test

	public void getSuportedSessionsSuccesful() {

		start("getSuportedSessionsSuccesful");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(sessions, aux.getSuportedSessions());

	}

	@Test

	public void getSuportedSessionsWrong() {

		start("getSuportedSessionsWrong");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(0, aux.getSuportedSessions());

	}

	@Test

	public void getSalarySuccesful() {

		start("getSalarySuccesful");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(salary, aux.getSalary());

	}

	@Test

	public void getSalaryWrong() {

		start("getSalaryWrong");

		counter++;

		Year year = Year.of(2000);
		int days = 30;
		int sessions = 6;
		double salary = 1000000;

		PsychologistDTO aux = new PsychologistDTO(year, days, sessions, salary);

		assertEquals(0, aux.getSalary());

	}

	@AfterAll
	public static void end() {

		System.err.println("\n have been executed " + counter + " test");

	}

}
