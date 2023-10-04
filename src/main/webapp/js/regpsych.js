function hideRegistrationPartForm() {
	var form = document.getElementById("participantpsychform");
	form.style.display = "none";
}
function showRegistrationPartForm() {
	var form = document.getElementById("participantpsychform");
	form.style.display = "flex";
}
function hideRegistrationServiceForm() {
	var form = document.getElementById("servicepsychform");
	form.style.display = "none";
}
function showRegistrationServiceForm() {
	var form = document.getElementById("servicepsychform");
	form.style.display = "flex";
}

window.onload = function() {
	hideRegistrationPartForm();
	hideRegistrationServiceForm();
}

function validatePsychoRegPart() {

	var username = document.getElementById("participantusername").value;
	var password = document.getElementById("participantpassword").value;
	var name = document.getElementById("participantname").value;
	var participantdocument = document.getElementById("participantdocument").value;
	var dateofbirth = document.getElementById("participantdateofbirth").value;
	var city = document.getElementById("participantcity").value;
	var nickname = document.getElementById("participantnickname").value;
	var psessions = document.getElementById("participatedsessions").value;

	if (username == "" || password == "" || name == "" || participantdocument == "" || dateofbirth == "" || city == "" || nickname == "" || psessions == "") {
		alert("All the spaces must be complete");
		return false;
	}

}

function validatePsychoRegServ() {

	var username = document.getElementById("serviceusername").value;
	var password = document.getElementById("servicepassword").value;
	var name = document.getElementById("servicename").value;
	var participantdocument = document.getElementById("servicedocument").value;
	var dateofbirth = document.getElementById("servicedateofbirth").value;
	var city = document.getElementById("servicecity").value;
	
	var salary = document.getElementById("servicesalary").value;
	var csessions = document.getElementById("sessionscleaned").value;

	if (username == "" || password == "" || name == "" || participantdocument == "" || dateofbirth == "" || city == "" 
	|| salary == "" || csessions == "") {
		alert("All the spaces must be complete");
		return false;
	}

}