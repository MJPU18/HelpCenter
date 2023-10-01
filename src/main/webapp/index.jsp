<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<title>Help Center</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous"></link>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"></link>

<link rel="stylesheet" href="styles/styles.css"></link>
<script src="js/logins.js"></script>
<script src="js/registration.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>

</head>



<body>
	<DIV class="header">

		<div class="backbutton">
			<button type="button" class="fa fa-home fa-2x"
				onclick="showStart(); hideAdmin(); hideLogin(); hideParticipantForm(); hidePsychologistForm(); hideServiceForm()"></button>
		</div>
		<DIV class="btn-group" role="group"
			aria-label="Basic outlined example">
			<button type="button" class="btn btn-outline-primary"
				onclick="selectedUserType = 'Participants'; hideStart(); hideAdmin(); hideParticipantForm(); hidePsychologistForm(); hideServiceForm(); showLogin()">Participants</button>
			<button type="button" class="btn btn-outline-primary"
				onclick="selectedUserType = 'Psychologist';  hideStart(); hideAdmin(); hideParticipantForm(); hidePsychologistForm(); hideServiceForm(); showLogin()">Psychologist</button>
			<button type="button" class="btn btn-outline-primary"
				onclick="selectedUserType = 'Service'; hideStart(); hideAdmin(); hideParticipantForm(); hidePsychologistForm(); hideServiceForm(); showLogin() ">Service</button>
		</DIV>
	</DIV>

	<div id="start">
		<!-- aqui va el inicio o lo que sea -->
	</div>

	<form class="formlogin" id="loginform" action="usercontrollerservlet"
		method="post">
		<H3 class="h3log">Login Participants</H3>

		<LABEL class="label" for="usernamelog">Username</LABEL> <INPUT
			class="input" type="text" placeholder="username" id="usernamelog"
			name="usernamelog" /> <LABEL class="label" for="passwordlog">Password</LABEL>
		<INPUT class="input" type="password" placeholder="password"
			id="passwordlog" name="passwordlog" />

		<BUTTON class="buttonlogin" name="method" value="login">Log
			In</BUTTON>

		<DIV class="container2">
			<a href="#" class="access" onclick="showForm(); return false;">register</a>
			<a href="#" class="access2" onclick="showAdmin();">admin</a>
		</DIV>
	</form>


	<form class="formlogin2" id="adminform" action="usercontrollerservlet"
		method="post">

		<LABEL class="label" for="adminusername">Username*</LABEL> <INPUT
			class="input" type="text" placeholder="username" id="adminusername"
			name="adminusername" /> <LABEL class="label" for="adminpassword">Password*</LABEL>
		<INPUT class="input" type="password" placeholder="password"
			id="adminpassword" name="adminpassword" />

		<BUTTON class="buttonlogin" name="method" value="adminlogin">Log
			In</BUTTON>
	</form>





	<!--                             form participant                                   -->
	<form class="row g-3 container" id="participantform"
		action="usercontrollerservlet" method="post">
		<div class="col-md-6">
			<label for="participantusername" class="form-label">Username:</label>
			<input type="text" class="form-control" id="participantusername"
				name="participantusername" placeholder="Username"></input>
		</div>
		<div class="col-md-6">
			<label for="participantpassword" class="form-label">Password:</label>
			<input type="password" class="form-control" id="participantpassword"
				name="participantpassword" placeholder="Password"></input>
		</div>
		<div class="col-12">
			<label for="participantname" class="form-label">Name:</label> <input
				type="text" class="form-control" id="participantname"
				name="participantname" placeholder="Name"></input>
		</div>

		<div class="col-md-6">
			<label for="participantdocument" class="form-label">Document:</label>
			<input type="text" class="form-control" id="participantdocument"
				name="participantdocument" placeholder="Document" step="1"
				onkeypress="return event.charCode &gt;= 48 &amp;&amp; event.charCode &lt;= 57"
				onblur="validateDocument(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantdateofbirth" class="form-label">Date
				of Birth</label> <input type="date" class="form-control"
				id="participantdateofbirth" name="participantdateofbirth"
				placeholder="Date of Birth" onchange="validateYear(this)"></input>
		</div>


		<div class="col-12">
			<label for="participantcity" class="form-label">City:</label> <input
				type="text" class="form-control" id="participantcity"
				name="participantcity" placeholder="City"></input>
		</div>

		<div class="col-md-6">
			<label for="participantnickname" class="form-label">Nickname:</label>
			<input type="text" class="form-control" id="participantnickname"
				name="participantnickname" placeholder="Nickname"></input>
		</div>

		<div class="col-md-6">
			<label for="participatedsessions" class="form-label">Participated
				Sessions:</label> <input type="number" class="form-control"
				id="participatedsessions" name="participatedsessions"
				placeholder="Participated Sessions" min="0"></input>
		</div>

		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="partconf"
				onclick="hideParticipantForm(); showStart()">Confirm</button>
		</div>

	</form>

	<!--                           form psychologist                                -->

	<form class="row g-3 container" id="psychologistform"
		action="usercontrollerservlet" method="post">
		<div class="col-md-6">
			<label for="psychologistusername" class="form-label">Username:</label>
			<input type="text" class="form-control" id="psychologistusername"
				name="psychologistusername" placeholder="Username"></input>
		</div>
		<div class="col-md-6">
			<label for="psychologistpassword" class="form-label">Password:</label>
			<input type="password" class="form-control" id="psychologistpassword"
				name="psychologistpassword" placeholder="Password"></input>
		</div>
		<div class="col-12">
			<label for="psychologistname" class="form-label">Name:</label> <input
				type="text" class="form-control" id="psychologistname"
				name="psychologistname" placeholder="Name"></input>
		</div>

		<div class="col-md-6">
			<label for="psychologistdocument" class="form-label">Document:</label>
			<input type="text" class="form-control" id="psychologistdocument"
				name="psychologistdocument" placeholder="Document" step="1"
				onkeypress="return event.charCode &gt;= 48 &amp;&amp; event.charCode &lt;= 57"
				onblur="validateDocument(this)" min="0"></input>
		</div>
		<div class="col-md-6">
			<label for="psychologistdateofbirth" class="form-label">Date
				of Birth</label> <input type="date" class="form-control"
				id="psychologistdateofbirth" name="psychologistdateofbirth"
				placeholder="Date of Birth" onchange="validateYear(this)"></input>
		</div>


		<div class="col-12">
			<label for="psychologistcity" class="form-label">City:</label> <input
				type="text" class="form-control" id="psychologistcity"
				name="psychologistcity" placeholder="City"></input>
		</div>

		<div class="col-md-6">
			<label for="gradyear" class="form-label">Graduation Year:</label> <input
				type="number" class="form-control" id="gradyear" name="gradyear"
				min="1950" max="2100" step="1" placeholder="Graduation Year"></input>
		</div>

		<div class="col-md-6">
			<label for="daysinservice" class="form-label">Days in
				Service:</label> <input type="number" class="form-control"
				id="daysinservice" name="daysinservice"
				placeholder="Days in service" readonly="readonly"></input>
		</div>

		<div class="col-md-6">
			<label for="servicesalary" class="form-label">Sessions
				Supported:</label> <input type="number" class="form-control"
				id="sessionssupported" name="sessionssupported"
				placeholder="Sessions Supported" min="0" step="1"></input>
		</div>

		<div class="col-md-6">
			<label for="psychologistsalary" class="form-label">Salary:</label> <input
				type="number" class="form-control" id="psychologistsalary"
				name="psychologistsalary" placeholder="Salary" min="0"></input>
		</div>


		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="psychconf" accesskey=""
				onclick="hidePsychologistForm(); showStart()">Confirm</button>
		</div>

	</form>

	<!--                         form service                         -->

	<form class="row g-3 container" id="serviceform"
		action="usercontrollerservlet" method="post">
		<div class="col-md-6">
			<label for="serviceusername" class="form-label">Username:</label> <input
				type="text" class="form-control" id="serviceusername"
				name="serviceusername" placeholder="Username"></input>
		</div>
		<div class="col-md-6">
			<label for="servicepassword" class="form-label">Password:</label> <input
				type="password" class="form-control" id="servicepassword"
				name="servicepassword" placeholder="Password"></input>
		</div>
		<div class="col-12">
			<label for="servicename" class="form-label">Name:</label> <input
				type="text" class="form-control" id="servicename" name="servicename"
				placeholder="Name"></input>
		</div>

		<div class="col-md-6">
			<label for="servicedocument" class="form-label">Document:</label> <input
				type="text" class="form-control" id="servicedocument"
				name="servicedocument" placeholder="Document" step="1"
				onkeypress="return event.charCode &gt;= 48 &amp;&amp; event.charCode &lt;= 57"
				onblur="validateDocument(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="servicedateofbirth" class="form-label">Date of
				Birth</label> <input type="date" class="form-control"
				id="servicedateofbirth" name="servicedateofbirth"
				placeholder="Date of Birth" onchange="validateYear(this)"></input>
		</div>


		<div class="col-12">
			<label for="servicecity" class="form-label">City:</label> <input
				type="text" class="form-control" id="servicecity" name="servicecity"
				placeholder="City"></input>
		</div>

		<div class="col-md-6">
			<label for="servicesalary" class="form-label">Salary:</label> <input
				type="number" class="form-control" id="servicesalary"
				name="servicesalary" placeholder="Salary" min="0"></input>
		</div>

		<div class="col-md-6">
			<label for="sessionscleaned" class="form-label">Sessions
				Cleaned:</label> <input type="number" class="form-control"
				id="sessionscleaned" name="sessionscleaned"
				placeholder="Sessions Cleaned" min="0"></input>
		</div>

		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="servconf"
				onclick="hideServiceForm(); showStart()">Confirm</button>
		</div>

	</form>

</body>
</html>