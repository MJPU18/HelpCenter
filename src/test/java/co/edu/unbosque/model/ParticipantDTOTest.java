package co.edu.unbosque.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Class homonymous to ParticipantDTO in terms of functions in which the results
 * of each entry that may exist are tested.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class ParticipantDTOTest extends PersonDTOTest {

	private static int counter = 0;

	public static void start(String name) {
		System.out.println("\n test called: " + name + ", number: " + counter + " starting");
	}

	@BeforeAll

	public static void banner() {

		System.err.println("\n______________ Starting all ParticipantDTO unit tests _____________");

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
		LocalDate date = LocalDate.of(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

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
		LocalDate date = LocalDate.of(01, 01, 2000);
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
		LocalDate date = LocalDate.of(01, 01, 2000);
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
		LocalDate date = LocalDate.of(01, 01, 2000);
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
		LocalDate date = LocalDate.of(01, 01, 2000);
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
		LocalDate date = LocalDate.of(01, 01, 2000);
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
		LocalDate date = LocalDate.of(01, 01, 2000);
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
		LocalDate date = LocalDate.of(01, 01, 2000);
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
		LocalDate date = LocalDate.of(01, 01, 2000);
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
		LocalDate date = LocalDate.of(01, 01, 2000);
		String city = "Pacho";
		int sessions = 6;
		String nickName = "Tester";

		ParticipantDTO aux = new ParticipantDTO(userName, password, name, document, date, city, sessions, nickName);

		aux.setNickName("Change");

		assertEquals("Tester", aux.getNickName());

	}

	@AfterAll
	public static void end() {

		System.err.println("\n have been executed " + counter + " test");

	}

}
