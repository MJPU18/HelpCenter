<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Psychologist Acces</title>
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
<script src="js/regpsych.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>

</head>
<body>

	<DIV class="header">

		<div class="backbutton">
			<button type="button" class="fa fa-home fa-2x"
				onclick="window.history.back();"></button>
		</div>
	</DIV>

	<form action="usercontrollerservlet" method="post">
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="showparticipants">Show Participants</button>
		</div>

	</form>
	<form action="usercontrollerservlet" method="post">
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="showservice">Show Service</button>
		</div>

	</form>

	<div class="col-12">
		<button class="btn btn-primary" id="method" name="method"
			value="update" onclick="showRegistrationPartForm();">Register
			Participants</button>
	</div>
	<div class="col-12">
		<button class="btn btn-primary" id="method" name="method"
			value="update" onclick="showRegistrationServiceForm();">Register
			Service</button>
	</div>
	<!-- form registrar participantes -->
	<form class="row g-3 container" id="participantpsychform"
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
				name="method" value="partconf" onclick="hideRegistrationPartForm();">Confirm</button>
		</div>
	</form>
	<!-- form registrar servicio -->
	<form class="row g-3 container" id="servicepsychform"
		action="usercontrollerservlet" method="post">

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
				placeholder="Name"></input>
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
				placeholder="Date of Birth" onchange="validateYear(this)"></input>
		</div>
		<div class="col-12">
			<label for="participantcity" class="form-label">City:</label> <input
				type="text" class="form-control" id="servicecity" name="servicecity"
				placeholder="City"></input>
		</div>
		<div class="col-md-6">
			<label for="participantnickname" class="form-label">Salary:</label> <input
				type="text" class="form-control" id="servicesalary"
				name="servicesalary" placeholder="Nickname"></input>
		</div>
		<div class="col-md-6">
			<label for="participatedsessions" class="form-label">Cleanned
				Sessions:</label> <input type="number" class="form-control"
				id="sessionscleaned" name="sessionscleaned"
				placeholder="Participated Sessions" min="0"></input>
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="method"
				name="method" value="servconf"
				onclick="hideRegistrationServiceForm();">Confirm</button>
		</div>
	</form>
</body>
</html>