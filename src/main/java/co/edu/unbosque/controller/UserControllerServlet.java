package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.Year;

import co.edu.unbosque.model.GeneralServiceDTO;
import co.edu.unbosque.model.ParticipantDTO;
import co.edu.unbosque.model.PsychologistDTO;
import co.edu.unbosque.model.persistence.GeneralServiceDAO;
import co.edu.unbosque.model.persistence.ParticipantDAO;
import co.edu.unbosque.model.persistence.PsychologistDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 * class that establishes the connection between html and java logic.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */

public class UserControllerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2049146257453431686L;
	private GeneralServiceDAO gdao;
	private ParticipantDAO pdao;
	private PsychologistDAO sdao;

	/**
	 * Class's own empty constructor
	 */
	public UserControllerServlet() {

		gdao = new GeneralServiceDAO();
		pdao = new ParticipantDAO();
		sdao = new PsychologistDAO();
		System.out.println("List Service: \n");
		for(GeneralServiceDTO serv: gdao.getListGeneralService()) {
			System.out.println(serv.toString()+",\n");
		}
		for(ParticipantDTO part: pdao.getListParticipants()) {
			System.out.println(part.toString()+",\n");
		}
		for(PsychologistDTO psyco: sdao.getListPsychologists()) {
			System.out.println(psyco.toString()+",\n");
		}

	}

	// read
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	// create
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String method = req.getParameter("method");

		System.out.println(method);

		if (method.equals("login")) {

		} else if (method.equals("adminlogin")) {

		} else if (method.equals("partconf")) {

			String username = req.getParameter("participantusername");
			String password = req.getParameter("participantpassword");
			String name = req.getParameter("participantname");
			String document = req.getParameter("participantdocument");
			Date birth = Date.valueOf(req.getParameter("participantdateofbirth"));
			String city = req.getParameter("participantcity");
			String nickname = req.getParameter("participantnickname");
			String psessions = req.getParameter("participatedsessions");

			pdao.create(new ParticipantDTO(username, password, name, Long.parseLong(document), birth, city,
					Integer.parseInt(psessions), nickname));
			System.out.println("List Participants: \n");
			for(ParticipantDTO part: pdao.getListParticipants()) {
				System.out.println(part.toString()+",\n");
			}

		} else if (method.equals("psychconf")) {

			String username = req.getParameter("psychologistusername");
			String password = req.getParameter("psychologistpassword");
			String name = req.getParameter("psychologistname");
			String document = req.getParameter("psychologistdocument");
			Date birth = Date.valueOf(req.getParameter("psychologistdateofbirth"));
			String city = req.getParameter("psychologistcity");
			String gYear = req.getParameter("gradyear");
			String daysService = req.getParameter("daysinservice");
			String sSupported = req.getParameter("sessionssupported");
			String Salary = req.getParameter("psychologistsalary");

			sdao.create(new PsychologistDTO(username, password, name, Long.parseLong(document), birth, city,
					Year.parse(gYear), Integer.parseInt(daysService), Integer.parseInt(sSupported),
					Double.parseDouble(Salary)));
			System.out.println("List Ppsychologist: \n");
			for(PsychologistDTO psyco: sdao.getListPsychologists()) {
				System.out.println(psyco.toString()+",\n");
			}

		} else if (method.equals("servconf")) {

			String username = req.getParameter("serviceusername");
			String password = req.getParameter("servicepassword");
			String name = req.getParameter("servicename");
			String document = req.getParameter("servicedocument");
			Date birth = Date.valueOf(req.getParameter("servicedateofbirth"));
			String city = req.getParameter("servicecity");
			String salary = req.getParameter("servicesalary");
			String csessions = req.getParameter("sessionscleaned");

			gdao.create(new GeneralServiceDTO(username, password, name, Long.parseLong(document), birth, city,
					Double.parseDouble(salary), Integer.parseInt(csessions)));
			System.out.println("List Service: \n");
			for(GeneralServiceDTO serv: gdao.getListGeneralService()) {
				System.out.println(serv.toString()+",\n");
			}
		}
		out.close();
	}

	// update
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPut(req, resp);
	}

	// delete
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doDelete(req, resp);
	}

	@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.doHead(arg0, arg1);
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doOptions(req, resp);
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.doTrace(arg0, arg1);
	}

}
