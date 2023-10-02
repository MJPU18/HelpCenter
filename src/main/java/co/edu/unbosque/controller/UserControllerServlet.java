package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

import co.edu.unbosque.model.GeneralServiceDTO;
import co.edu.unbosque.model.ParticipantDTO;
import co.edu.unbosque.model.PsychologistDTO;
import co.edu.unbosque.model.persistence.GeneralServiceDAO;
import co.edu.unbosque.model.persistence.ParticipantDAO;
import co.edu.unbosque.model.persistence.PsychologistDAO;
import jakarta.servlet.RequestDispatcher;
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

	}

	// read
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	// create
	/**
	 *
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String method = req.getParameter("method");
		System.out.println(method);

		if (method.equals("login")) {
			boolean credentialsParticipant = pdao.containsUser(req.getParameter("usernamelog"),
					req.getParameter("passwordlog"));
			boolean credentialsPsychologist = sdao.containsUser(req.getParameter("usernamelog"),
					req.getParameter("passwordlog"));
			boolean credentialsService = gdao.containsUser(req.getParameter("usernamelog"),
					req.getParameter("passwordlog"));
			if (credentialsParticipant || req.getParameter("usernamelog").equals("pruebapart")) {

				RequestDispatcher dispatcher = req.getRequestDispatcher("/participantacces.jsp");

				dispatcher.forward(req, resp);

			} else if (credentialsPsychologist || req.getParameter("usernamelog").equals("pruebapsych")) {

				RequestDispatcher dispatcher = req.getRequestDispatcher("psychologistacces.jsp");

				dispatcher.forward(req, resp);

			} else if (credentialsService || req.getParameter("usernamelog").equals("pruebaserv")) {

				RequestDispatcher dispatcher = req.getRequestDispatcher("serviceacces.jsp");

				dispatcher.forward(req, resp);
			}
		} else if (method.equals("adminlogin")) {

			if (req.getParameter("adminusername").equals("admin")
					&& req.getParameter("adminpassword").equals("pene1234.")) {

				RequestDispatcher dispatcher = req.getRequestDispatcher("adminacces.jsp");

				dispatcher.forward(req, resp);

			}

		} else if (method.equals("partconf")) {

			String username = req.getParameter("participantusername");
			String password = req.getParameter("participantpassword");
			String name = req.getParameter("participantname");
			String document = req.getParameter("participantdocument");
			String[] date = req.getParameter("participantdateofbirth").split("/");
			LocalDate birth = LocalDate.of(Integer.parseInt(date[2]), Month.of(Integer.parseInt(date[1])),
					Integer.parseInt(date[0]));
			String city = req.getParameter("participantcity");
			String nickname = req.getParameter("participantnickname");
			String psessions = req.getParameter("participatedsessions");

			pdao.create(new ParticipantDTO(username, password, name, Long.parseLong(document), birth, city,
					Integer.parseInt(psessions), nickname));
			System.out.println(pdao.getListParticipants().get(0).toString());

		} else if (method.equals("psychconf")) {

			String username = req.getParameter("psychologistusername");
			String password = req.getParameter("psychologistpassword");
			String name = req.getParameter("psychologistname");
			String document = req.getParameter("psychologistdocument");
			String[] date = req.getParameter("psychologistdateofbirth").split("/");
			LocalDate birth = LocalDate.of(Integer.parseInt(date[2]), Month.of(Integer.parseInt(date[1])),
					Integer.parseInt(date[0]));
			String city = req.getParameter("psychologistcity");
			String gYear = req.getParameter("gradyear");
			String daysService = req.getParameter("daysinservice");
			String sSupported = req.getParameter("sessionssupported");
			String Salary = req.getParameter("psychologistsalary");

			sdao.create(new PsychologistDTO(username, password, name, Long.parseLong(document), birth, city,
					Year.parse(gYear), Integer.parseInt(daysService), Integer.parseInt(sSupported),
					Double.parseDouble(Salary)));
			System.out.println(sdao.getListPsychologists().get(0).getName());

		} else if (method.equals("servconf")) {

			String username = req.getParameter("serviceusername");
			String password = req.getParameter("servicepassword");
			String name = req.getParameter("servicename");
			String document = req.getParameter("servicedocument");
			String[] date = req.getParameter("servicedateofbirth").split("/");
			LocalDate birth = LocalDate.of(Integer.parseInt(date[2]), Month.of(Integer.parseInt(date[1])),
					Integer.parseInt(date[0]));
			String city = req.getParameter("servicecity");
			String salary = req.getParameter("servicesalary");
			String csessions = req.getParameter("sessionscleaned");

			gdao.create(new GeneralServiceDTO(username, password, name, Long.parseLong(document), birth, city,
					Double.parseDouble(salary), Integer.parseInt(csessions)));

			System.out.println(gdao.getListGeneralService().get(0).toString());
		} else if (method.contains("show")) {

			out.println("<html>");
			out.println("<head>");
			out.println("<title id=\"showtable\">Tabla de " + method + " </title>");
			out.println("<link\r\n"
					+ "    href= \"  https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n"
					+ "    rel=\"stylesheet\"\r\n"
					+ "    integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n"
					+ "    crossorigin=\"anonymous\">");
			out.println("<script\r\n" + "    src=\"\"\r\n"
					+ "    integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n"
					+ "    crossorigin=\"anonymous\"></script>");
			out.println("<link rel=\"stylesheet\"\r\n"
					+ "	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"></link>");//casa
			out.println("<link rel=\"stylesheet\" href=\"styles/styles.css\"></link>");
			out.println(
					"<script src=\"js/logins.js\"></script>\r\n" + "<script src=\"js/registration.js\"></script>\r\n");
			out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"></meta>\r\n");
			out.println("</head>");
			out.println("<body>");
			out.println("<div class=\"header sticky-top\">");
			out.println("<form action=\"index.jsp\">");
			out.println(
					"<input type=\"submit\" value = \"back\"class =\"btn btn-outline-primary\" onclick= \"window.history.back();\"");
			out.print("</form>");
			out.print("</div>");
			out.print("<div class=\"table2\">");//modify
			out.println("<table class=\"table table-dark table-striped-columns\" id=\"tabla\">");//inicio tabla
			out.println("<thead>");
			out.println("<tr>");
			out.println("<th>index</th>");
			out.println("<th>Username</th>");
			out.println("<th>Name</th>");
			out.println("<th>Document</th>");
			out.println("<th>Date Of Birth</th>");
			out.println("<th>City Of Birth</th>");

			if (method.contains("participants")) {
				out.println("<th>Participated Sessions</th>");
				out.println("<th>Nick Name</th>");
				out.println("</tr>");
				out.println("</thead>");
				out.println("<tbody>");
				pdao.getListParticipants()
						.forEach(p -> out.println("<tr><td>" + pdao.getListParticipants().indexOf(p) + "</td><td>"
								+ p.getUserName() + "</td><td>" + p.getName() + "</td><td>" + p.getDocument()
								+ "</td><td>" + p.getDateOfBirth() + "</td><td>" + p.getCityOfBirth() + "</td><td>"
								+ p.getParticipatedSessions() + "</td><td>" + p.getNickName() + "</td></tr>"));

			} else if (method.contains("psychologist")) {
				out.println("<th>Year of Graduation</th>");
				out.println("<th>Days In Service</th>");
				out.println("<th>Supported Sessions</th>");
				out.println("<th>Salary</th>");
				out.println("</tr>");
				out.println("</thead>");
				out.println("<tbody>");
				sdao.getListPsychologists()
						.forEach(s -> out.println("<tr><td>" + sdao.getListPsychologists().indexOf(s) + "</td><td>"
								+ s.getUserName() + "</td><td>" + s.getName() + "</td><td>" + s.getDocument()
								+ "</td><td>" + s.getDateOfBirth() + "</td><td>" + s.getCityOfBirth() + "</td><td>"
								+ s.getYearOfGraduation() + "</td><td>" + s.getDaysInService() + "</td><td>"
								+ s.getSuportedSessions() + "</td><td>" + s.getSalary() + "</td></tr>"));

			} else if (method.contains("service")) {
				out.println("<th>Sessions Cleaned</th>");
				out.println("<th>Salary</th>");
				out.println("</tr>");
				out.println("</thead>");
				out.println("<tbody>");
				gdao.getListGeneralService()
						.forEach(g -> out.println("<tr><td>" + gdao.getListGeneralService().indexOf(g) + "</td><td>"
								+ g.getUserName() + "</td><td>" + g.getName() + "</td><td>" + g.getDocument()
								+ "</td><td>" + g.getDateOfBirth() + "</td><td>" + g.getCityOfBirth() + "</td><td>"
								+ g.getSessionsCleaned() + "</td><td>" + g.getSalary() + "</td></tr>"));

			}
//			out.println("<div class=\"header sticky-top\">");
//			out.println("<form action=\"index.jsp\">");
//			out.println(
//					"<input type=\"submit\" value = \"back\"class =\"btn btn-outline-primary\" onclick= \"window.history.back();\"");
//			out.print("</form>");
//			out.print("</div>");
			out.println("</tbody>");
			out.println("</table>");//final tabla
			out.println("</div>");
			out.println("</body");
			out.println("</html");
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
