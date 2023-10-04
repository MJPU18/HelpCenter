package co.edu.unbosque.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import co.edu.unbosque.model.GeneralServiceDTO;
import co.edu.unbosque.model.ParticipantDTO;
import co.edu.unbosque.model.PersonDTO;
import co.edu.unbosque.model.PsychologistDTO;
import co.edu.unbosque.model.persistence.GeneralServiceDAO;
import co.edu.unbosque.model.persistence.ParticipantDAO;
import co.edu.unbosque.model.persistence.PsychologistDAO;

/**
 * 
 * Class homonymous to UserControllerServlet in terms of functions in which the
 * results of each entry that may exist are tested.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */

public class UserControllerServletTest {

	private static int counter = 0;

	public static void start(String name) {
		System.out.println("\n test called: " + name + ", number: " + counter + " starting");
	}

	@BeforeAll

	public static void banner() {

		System.err.println("\n______________ Starting all DBConnection unit tests _____________");

	}

	public boolean doPost(String type) {

		ParticipantDAO a = new ParticipantDAO();
		PsychologistDAO b = new PsychologistDAO();
		GeneralServiceDAO c = new GeneralServiceDAO();

		Random rd = new Random();
		Random rd2 = new Random();
		Random rd3 = new Random();

		String method = type;

		if (method.equalsIgnoreCase("partconf")) {

			String username = rd2.nextLong() + "";
			String password = rd.nextLong() + "";
			String name = "New Test";
			long document = rd3.nextLong();
			String date = "2000-01-01";
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String city = "Pacho";
			String nickname = "Jarto777";
			String psessions = "5";

			a.create(new ParticipantDTO(username, password, name, document, LocalDate.parse(date, format), city,
					Integer.parseInt(psessions), nickname));

			return true;

		} else if (method.equalsIgnoreCase("psychconf")) {

			String username = rd2.nextLong() + "";
			String password = rd.nextLong() + "";
			String name = "New Test";
			long document = rd3.nextLong();
			String date = "2000-01-01";
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String city = "Pacho";
			String year = "2000";
			String daysService = "13";
			String sSupported = "2";
			String salary = "10000000";

			b.create(new PsychologistDTO(username, password, name, document, LocalDate.parse(date), city,
					Year.parse(year), Integer.parseInt(daysService), Integer.parseInt(sSupported),
					Double.parseDouble(salary)));

			return true;

		} else if (method.equalsIgnoreCase("servconf")) {

			String username = rd2.nextLong() + "";
			String password = rd.nextLong() + "";
			String name = "New Test";
			long document = rd3.nextLong();
			String date = "2000-01-01";
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String city = "Pacho";
			String csessions = "2";
			String salary = "10000000";

			c.create(new GeneralServiceDTO(username, password, name, document, LocalDate.parse(date), city,
					Double.parseDouble(salary), Integer.parseInt(csessions)));

			return true;

		} else if (method.equalsIgnoreCase("show")) {

			ArrayList<PersonDTO> general = new ArrayList<PersonDTO>();

			for (PersonDTO personDTO : a.getListParticipants()) {

				general.add((ParticipantDTO) personDTO);

			}

			for (PersonDTO personDTO : b.getListPsychologists()) {

				general.add((PsychologistDTO) personDTO);

			}

			for (PersonDTO personDTO : c.getListGeneralService()) {

				general.add((GeneralServiceDTO) personDTO);

			}

			return true;

		} else if (method.equalsIgnoreCase("updatepartconf")) {

			String username = rd2.nextLong() + "";
			String password = rd.nextLong() + "";
			String name = "New Test";
			long document = rd3.nextLong();
			String date = "2000-01-01";
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String city = "Pacho";
			String nickname = "Jarto777";
			String psessions = "5";

			a.update(0, new ParticipantDTO(username, password, name, document, LocalDate.parse(date, format), city,
					Integer.parseInt(psessions), nickname));

			return true;

		}

		else if (method.equalsIgnoreCase("psycactconf")) {

			String username = rd2.nextLong() + "";
			String password = rd.nextLong() + "";
			String name = "New Test";
			long document = rd3.nextLong();
			String date = "2000-01-01";
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String city = "Pacho";
			String year = "2000";
			String daysService = "13";
			String sSupported = "2";
			String salary = "10000000";

			b.update(0,
					new PsychologistDTO(username, password, name, document, LocalDate.parse(date), city,
							Year.parse(year), Integer.parseInt(daysService), Integer.parseInt(sSupported),
							Double.parseDouble(salary)));

			return true;

		}

		else if (method.equalsIgnoreCase("updateservconf")) {

			String username = rd2.nextLong() + "";
			String password = rd.nextLong() + "";
			String name = "New Test";
			long document = rd3.nextLong();
			String date = "2000-01-01";
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String city = "Pacho";
			String csessions = "2";
			String salary = "10000000";

			c.create(new GeneralServiceDTO(username, password, name, document, LocalDate.parse(date), city,
					Double.parseDouble(salary), Integer.parseInt(csessions)));

			c.update(0, new GeneralServiceDTO(username, password, name, document, LocalDate.parse(date), city,
					Double.parseDouble(salary), Integer.parseInt(csessions)));

			return true;

		} else if (method.equals("partdelete")) {

			int index = 0;
			a.delete(index);
			return true;

		} else if (method.equals("psychdelete")) {

			int index = 0;
			b.delete(index);
			return true;

		} else if (method.equals("servdelete")) {

			int index = 0;
			c.delete(index);
			return true;

		}

		return false;

	}

	@Test

	public void doPostPartConfig() {

		start("doPostPartConfig");
		counter++;

		boolean aux = doPost("partconf");

		assertEquals(true, aux);

	}

	@Test

	public void doPostPsychconfig() {

		start("doPostPsychconfig");
		counter++;

		boolean aux = doPost("psychconf");

		assertEquals(true, aux);

	}

	@Test

	public void doPostServConfig() {

		start("doPostServConfig");
		counter++;

		boolean aux = doPost("servconf");

		assertEquals(true, aux);

	}

	@Test

	public void doPostShow() {

		start("doPostShow");
		counter++;

		boolean aux = doPost("show");

		assertEquals(true, aux);

	}

	@Test

	public void doPostUpdatePartConf() {

		start("doPostShow");
		counter++;

		boolean aux = doPost("updatepartconf");

		assertEquals(true, aux);

	}

	@Test

	public void doPostPsycActConf() {

		start("doPostPsycActConf");
		counter++;

		boolean aux = doPost("psycactconf");

		assertEquals(true, aux);

	}

	@Test

	public void doPostUpdateServConf() {

		start("doPostUpdateServConf");
		counter++;

		boolean aux = doPost("updateservconf");

		assertEquals(true, aux);

	}

	@Test

	public void doPostPartDelete() {

		start("doPostPartDelete");
		counter++;

		boolean aux = doPost("partdelete");

		assertEquals(true, aux);

	}

	@Test

	public void doPostPsychDelete() {

		start("doPostPsychDelete");
		counter++;

		boolean aux = doPost("psychdelete");

		assertEquals(true, aux);

	}

	@Test

	public void doPostServDelete() {

		start("doPostServDelete");
		counter++;

		boolean aux = doPost("servdelete");

		assertEquals(true, aux);

	}

}
