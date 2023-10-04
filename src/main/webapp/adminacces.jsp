<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADMIN Acces</title>
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
<!-- <script src="js/logins.js"></script> -->
<!-- <script src="js/registration.js"></script> -->
<script src="js/adminreg.js"></script>
<script src="js/inputcontroll.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>

</head>
<body>

	<div class="header sticky-top">
		<div class="backbutton">
			<button type="button" class="fa fa-home fa-2x"
				onclick="window.history.back();"></button>
		</div>
		
		<form action="usercontrollerservlet" method="post">
		<button type="submit" class="btn btn-outline-primary" id="method" name="method" value="showparticipants">Show Participants</button>
		</form>
		
		<form action="usercontrollerservlet" method="post">
		<button type="submit" class="btn btn-outline-primary" id="method" name="method" value="showservice">Show Service</button>
		</form>
		
		<form action="usercontrollerservlet" method="post">
		<button type="submit" class="btn btn-outline-primary" id="method" name="method" value="showpsychologist">Show Psychologist</button>
		</form>
		
		<button class="btn btn-outline-primary" id="method" name="method" value="update" onclick="showRegPartForm(); hideRegServForm() ; hideRegPsychForm() ; hideUptPartForm() ; hideUptServForm() ; hideUptPsychForm() ; hideDelPartForm() ; hideDelPsychForm() ; hideDelServForm()">Register Participants</button>
		
		<button class="btn btn-outline-primary" id="method" name="method" value="update" onclick="showRegPsychForm(); hideRegPartForm() ; hideRegServForm() ; hideUptPartForm() ; hideUptServForm() ; hideUptPsychForm() ; hideDelPartForm() ; hideDelPsychForm() ; hideDelServForm()">Register Psychologist</button>
		
		<button class="btn btn-outline-primary" id="method" name="method" value="update" onclick="showRegServForm(); hideRegPartForm() ; hideRegPsychForm() ; hideUptPartForm() ; hideUptServForm() ; hideUptPsychForm() ; hideDelPartForm() ; hideDelPsychForm() ; hideDelServForm()">Register Service</button>
		
		<button class="btn btn-outline-primary" id="method" name="method"value="update" onclick="showUptPartForm(); hideRegPartForm() ; hideRegServForm() ; hideRegPsychForm() ; hideUptServForm() ; hideUptPsychForm() ; hideDelPartForm() ; hideDelPsychForm() ; hideDelServForm()">Update Participant</button>
		
		<button class="btn btn-outline-primary" id="method" name="method" value="update" onclick="showUptPsychForm(); hideRegPartForm() ; hideRegServForm() ; hideRegPsychForm() ; hideUptPartForm() ; hideUptServForm() ; hideDelPartForm() ; hideDelPsychForm() ; hideDelServForm()">Update Psychologist</button>
		
		<button class="btn btn-outline-primary" id="method" name="method" value="update" onclick="showUptServForm(); hideRegPartForm() ; hideRegServForm() ; hideRegPsychForm() ; hideUptPartForm() ; hideUptPsychForm() ; hideDelPartForm() ; hideDelPsychForm() ; hideDelServForm()">Update Service</button>
		
		<button class="btn btn-outline-primary" id="method" name="method" value="delete" onclick="showDelPartForm(); hideRegPartForm() ; hideRegPsychForm() ; hideRegServForm() ; hideUptPartForm() ; hideUptServForm() ; hideUptPsychForm() ; hideDelPsychForm() ; hideDelServForm()">Delete Participant</button>
		
		<button class="btn btn-outline-primary" id="method" name="method" value="delete" onclick="showDelPsychForm(); hideRegPartForm() ; hideRegPsychForm() ; hideRegServForm() ; hideUptPartForm() ; hideUptServForm() ; hideUptPsychForm() ; hideDelPartForm() ; hideDelServForm()">Delete Psychologist</button>
		
		<button class="btn btn-outline-primary" id="method" name="method" value="delete" onclick="showDelServForm(); hideRegPartForm() ; hideRegPsychForm() ; hideRegServForm() ; hideUptPartForm() ; hideUptServForm() ; hideUptPsychForm() ; hideDelPartForm() ; hideDelPsychForm()">Delete Service</button>
	</div>



	<!--form registrar participantes-->
	<form class="row g-3 container" id="participantadmform"
		action="usercontrollerservlet" method="post" onsubmit="return validateAdminRegPart()">

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
				name="participantname" placeholder="Name" oninput="validateInput(this)"></input>
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
				placeholder="Date of Birth" onblur="validateYear(this)"></input>
		</div>
		<div class="col-12">
			<label for="participantcity" class="form-label">City:</label> <input
				type="text" class="form-control" id="participantcity"
				name="participantcity" placeholder="City" oninput="validateInput(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantnickname" class="form-label">Nickname:</label>
			<input type="text" class="form-control" id="participantnickname"
				name="participantnickname" placeholder="Nickname" oninput="validateInput(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participatedsessions" class="form-label">Participated
				Sessions:</label> <input type="number" class="form-control"
				id="participatedsessions" name="participatedsessions"
				placeholder="Participated Sessions" min="0" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="partconf" onclick="hideRegPartForm();">Confirm</button>
		</div>
	</form>
	<!--form registrar servicio-->
	
	
	<form class="row g-3 container" id="serviceadmform"
		action="usercontrollerservlet" method="post" onsubmit="return validateAdminRegServ()">

		<div class="col-md-6">
			<label for="participantusername" class="form-label">Username:</label>
			<input type="text" class="form-control" id="serviceusername"
				name="serviceusername" placeholder="Username"></input>
		</div>
		<div class="col-md-6">
			<label for="participantpassword" class="form-label">Password:</label>
			<input type="password" class="form-control" id="servicepassword"
				name="servicepassword" placeholder="Password"></input>
		</div>
		<div class="col-12">
			<label for="participantname" class="form-label">Name:</label> <input
				type="text" class="form-control" id="servicename" name="servicename"
				placeholder="Name" oninput="validateInput(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantdocument" class="form-label">Document:</label>
			<input type="text" class="form-control" id="servicedocument"
				name="servicedocument" placeholder="Document" step="1"
				onkeypress="return event.charCode &gt;= 48 &amp;&amp; event.charCode &lt;= 57"
				onblur="validateDocument(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantdateofbirth" class="form-label">Date
				of Birth</label> <input type="date" class="form-control"
				id="servicedateofbirth" name="servicedateofbirth"
				placeholder="Date of Birth" onblur="validateYear(this)"></input>
		</div>
		<div class="col-12">
			<label for="participantcity" class="form-label">City:</label> <input
				type="text" class="form-control" id="servicecity" name="servicecity"
				placeholder="City" oninput="validateInput(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantnickname" class="form-label">Salary:</label> <input
				type="number" class="form-control" id="servicesalary"
				name="servicesalary" placeholder="Salary" oninput="validateNumber(this)" step="0.1"></input>
		</div>
		<div class="col-md-6">
			<label for="participatedsessions" class="form-label">Cleaned
				Sessions:</label> <input type="number" class="form-control"
				id="sessionscleaned" name="sessionscleaned"
				placeholder="Cleaned Sessions" min="0" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="servconf" onclick="hideRegServForm();">Confirm</button>
		</div>
	</form>
	
	
	<!--form psychologist-->
	<form class="row g-3 container" id="psychologistadmform"
		action="usercontrollerservlet" method="post" onsubmit="return validateAdminRegPsycho()">
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
				name="psychologistname" placeholder="Name" oninput="validateInput(this)"></input>
		</div>

		<div class="col-md-6">
			<label for="psychologistdocument" class="form-label">Document:</label>
			<input type="text" class="form-control" id="psychologistdocument"
				name="psychologistdocument" placeholder="Document" step="1"
				onkeypress="return event.charCode &gt;= 48 &amp;&amp; event.charCode &lt;= 57"
				onblur="validateDocument(this)" min="0" onblur="validateDocument(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="psychologistdateofbirth" class="form-label">Date
				of Birth</label> <input type="date" class="form-control"
				id="psychologistdateofbirth" name="psychologistdateofbirth"
				placeholder="Date of Birth" onblur="validateYear(this)"></input>
		</div>


		<div class="col-12">
			<label for="psychologistcity" class="form-label">City:</label> <input
				type="text" class="form-control" id="psychologistcity"
				name="psychologistcity" placeholder="City" oninput="validateInput(this)"></input>
		</div>

		<div class="col-md-6">
			<label for="gradyear" class="form-label">Graduation Year:</label> <input
				type="number" class="form-control" id="gradyear" name="gradyear"
				min="1950" max="2100" step="1" placeholder="Graduation Year" onblur="validateGradYear(this)"></input>
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
				placeholder="Sessions Supported" min="0" step="1" oninput="validateNumber(this)"></input>
		</div>

		<div class="col-md-6">
			<label for="psychologistsalary" class="form-label">Salary:</label> <input
				type="number" class="form-control" id="psychologistsalary"
				name="psychologistsalary" placeholder="Salary" min="0" oninput="validateNumber(this)" step="0.1"></input>
		</div>

		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="psychconf" onclick="hideRegPsychForm();">Confirm</button>
		</div>
	</form>

	<!-- Actualizar forms -->
	<!-- Actualizar participante -->
	<form class="row g-3 container" id="formupdatepartadm"
		action="usercontrollerservlet" method="post" onsubmit="return validateAdminPartUpdate()">

		<div class="col-md-6">
			<label for="participantusername" class="form-label">Index:</label> <input
				type="number" class="form-control" id="partactindex"
				name="partactindex" min="0" placeholder="Index" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantusername" class="form-label">Username:</label>
			<input type="text" class="form-control" id="partactusername"
				name="partactusername" placeholder="Username"></input>
		</div>
		<div class="col-12">
			<label for="participantpassword" class="form-label">Password:</label>
			<input type="password" class="form-control" id="partactpassword"
				name="partactpassword" placeholder="Password"></input>
		</div>
		<div class="col-12">
			<label for="participantname" class="form-label">Name:</label> <input
				type="text" class="form-control" id="partactname" name="partactname"
				placeholder="Name" oninput="validateInput(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantdocument" class="form-label">Document:</label>
			<input type="text" class="form-control" id="partactdocument"
				name="partactdocument" placeholder="Document" step="1"
				onkeypress="return event.charCode &gt;= 48 &amp;&amp; event.charCode &lt;= 57"
				onblur="validateDocument(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantdateofbirth" class="form-label">Date
				of Birth</label> <input type="date" class="form-control"
				id="partactdateofbirth" name="partactdateofbirth"
				placeholder="Date of Birth" onblur="validateYear(this)"></input>
		</div>
		<div class="col-12">
			<label for="participantcity" class="form-label">City:</label> <input
				type="text" class="form-control" id="partactcity" name="partactcity"
				placeholder="City" oninput="validateInput(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantnickname" class="form-label">Nickname:</label>
			<input type="text" class="form-control" id="partactnickname"
				name="partactnickname" placeholder="Nickname" oninput="validateInput(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participatedsessions" class="form-label">Participated
				Sessions:</label> <input type="number" class="form-control"
				id="participatedsessions" name="participatedsessionsact"
				placeholder="Participated Sessions" min="0" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="updatepartconf" onclick="hideUptPartForm();">Confirm</button>
		</div>
	</form>
	
	
	<!-- Actualizar servicio -->
	<form class="row g-3 container" id="formupdateservadm"
		action="usercontrollerservlet" method="post" onsubmit="return validateAdminServUpdate()">

		<div class="col-md-6">
			<label for="participantusername" class="form-label">Index:</label> <input
				type="number" class="form-control" id="servactindex"
				name="servactindex" min="0" placeholder="Index" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantusername" class="form-label">Username:</label>
			<input type="text" class="form-control" id="servactusername"
				name="servactusername" placeholder="Username"></input>
		</div>
		<div class="col-12">
			<label for="participantpassword" class="form-label">Password:</label>
			<input type="password" class="form-control" id="servactpassword"
				name="servactpassword" placeholder="Password"></input>
		</div>
		<div class="col-12">
			<label for="participantname" class="form-label">Name:</label> <input
				type="text" class="form-control" id="servactname" name="servactname"
				placeholder="Name" oninput="validateInput(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantdocument" class="form-label">Document:</label>
			<input type="text" class="form-control" id="servactdocument"
				name="servactdocument" placeholder="Document" step="1"
				onkeypress="return event.charCode &gt;= 48 &amp;&amp; event.charCode &lt;= 57"
				onblur="validateDocument(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantdateofbirth" class="form-label">Date
				of Birth</label> <input type="date" class="form-control"
				id="servactdateofbirth" name="servactdateofbirth"
				placeholder="Date of Birth" onblur="validateYear(this)"></input>
		</div>
		<div class="col-12">
			<label for="participantcity" class="form-label">City:</label> <input
				type="text" class="form-control" id="servactcity" name="servactcity"
				placeholder="City" oninput="validateInput(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="participantnickname" class="form-label">Salary:</label> <input
				type="number" class="form-control" id="servactsalary"
				name="servactsalary" placeholder="Salary" oninput="validateNumber(this)" step="0.1"></input>
		</div>
		<div class="col-md-6">
			<label for="participatedsessions" class="form-label">Cleaned
				Sessions:</label> <input type="number" class="form-control"
				id="sessionscleannedact" name="sessionscleannedact"
				placeholder="Sessions Cleaned" min="0" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="updateservconf" onclick="hideUptServForm();">Confirm</button>
		</div>
	</form>
	
	
	<!-- Actualizar psicologo -->
	<form class="row g-3 container" id="formupdatepsycadm"
		action="usercontrollerservlet" method="post" onsubmit="return validateAdminPsychoUpdate()">
		<div class="col-md-6">
			<label for="psychologistusername" class="form-label">Index:</label> <input
				type="number" class="form-control" id="psycactindex"
				name="psycactindex" min="0" placeholder="Index" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-md-6">
			<label for="psychologistusername" class="form-label">Username:</label>
			<input type="text" class="form-control" id="psycactusername"
				name="psycactusername" placeholder="Username"></input>
		</div>
		<div class="col-md-6">
			<label for="psychologistpassword" class="form-label">Password:</label>
			<input type="password" class="form-control" id="psycactpassword"
				name="psycactpassword" placeholder="Password"></input>
		</div>
		<div class="col-md-6">
			<label for="psychologistname" class="form-label">Name:</label> <input
				type="text" class="form-control" id="psycactname" name="psycactname"
				placeholder="Name" oninput="validateInput(this)"></input>
		</div>

		<div class="col-md-6">
			<label for="psychologistdocument" class="form-label">Document:</label>
			<input type="text" class="form-control" id="psycactdocument"
				name="psycactdocument" placeholder="Document" step="1"
				onkeypress="return event.charCode &gt;= 48 &amp;&amp; event.charCode &lt;= 57"
				onblur="validateDocument(this)" min="0"></input>
		</div>
		<div class="col-md-6">
			<label for="psychologistdateofbirth" class="form-label">Date
				of Birth</label> <input type="date" class="form-control"
				id="psycactdateofbirth" name="psycactdateofbirth"
				placeholder="Date of Birth" onblur="validateYear(this)"></input>
		</div>


		<div class="col-12">
			<label for="psychologistcity" class="form-label">City:</label> <input
				type="text" class="form-control" id="psycactcity" name="psycactcity"
				placeholder="City" oninput="validateInput(this)"></input>
		</div>

		<div class="col-md-6">
			<label for="gradyear" class="form-label">Graduation Year:</label> <input
				type="number" class="form-control" id="psycactgradyear"
				name="psycactgradyear" min="1950" max="2100" step="1"
				placeholder="Graduation Year" onblur="validateGradYear(this)"></input>
		</div>

		<div class="col-md-6">
			<label for="daysinservice" class="form-label">Days in
				Service:</label> <input type="number" class="form-control"
				id="psycactdaysinservice" name="psycactdaysinservice"
				placeholder="Days in service" readonly="readonly"></input>
		</div>

		<div class="col-md-6">
			<label for="servicesalary" class="form-label">Sessions
				Supported:</label> <input type="number" class="form-control"
				id="psycactsessionss" name="psycactsessionss"
				placeholder="Sessions Supported" min="0" step="1" oninput="validateNumber(this)"></input>
		</div>

		<div class="col-md-6">
			<label for="psychologistsalary" class="form-label">Salary:</label> <input
				type="number" class="form-control" id="psycactsalary"
				name="psycactsalary" placeholder="Salary" min="0" oninput="validateNumber(this)" step="0.1"></input>
		</div>

		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="psycactconf" onclick="hideUptPsychForm();">Confirm</button>
		</div>
	</form>

	<!--  delete participant  -->

	<form action="usercontrollerservlet" method="post"
		class="row g-3 container" id="formdeletepart" onsubmit="return validateAdminDeletePart()">
		<div class="col-md-6">
			<label for="deletepart" class="form-label">Index Participant:</label> <input
				type="number" class="form-control" id="deletepart" name="deletepart"
				placeholder="Index" min="0" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="partdelete" onclick="hideDelPartForm();">Confirm</button>
		</div>
	</form>
	
	<!-- delete psychologist -->
	
	<form action="usercontrollerservlet" method="post"
		class="row g-3 container" id="formdeletepsych" onsubmit="return validateAdminDeletePart()">
		<div class="col-md-6">
			<label for="deletepsych" class="form-label">Index Psychologist:</label> <input
				type="number" class="form-control" id="deletepsych" name="deletepsych"
				placeholder="Index" min="0" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="psychdelete" onclick="hideDelPsychForm();">Confirm</button>
		</div>
	</form>
	
	<!-- delete service -->
	
	<form action="usercontrollerservlet" method="post"
		class="row g-3 container" id="formdeleteserv" onsubmit="return validateAdminDeletePart()">
		<div class="col-md-6">
			<label for="deletepart" class="form-label">Index Service:</label> <input
				type="number" class="form-control" id="deleteserv" name="deleteserv"
				placeholder="Index" min="0" oninput="validateNumber(this)"></input>
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="servdelete" onclick="hideDelServForm();">Confirm</button>
		</div>
	</form>
</body>
</html>