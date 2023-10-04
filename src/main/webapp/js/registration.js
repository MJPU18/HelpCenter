function showAdmin() {
	var form = document.getElementById("adminform");
	form.style.display = "block";
	hideLogin();
}

function hideAdmin() {
	var form = document.getElementById("adminform");
	form.style.display = "none";
}

/*--------------------*/
function showParticipantForm() {
	var form = document.getElementById("participantform");
	form.style.display = "flex";
	hideLogin();
}

function hideParticipantForm() {
	var form = document.getElementById("participantform");
	form.style.display = "none";
}

/*-------------------------*/

function showPsychologistForm() {
	var form = document.getElementById("psychform");
	form.style.display = "flex";
	hideLogin();
}

function hidePsychologistForm() {
	var form = document.getElementById("psychform");
	form.style.display = "none";
}



/*-------------------------*/
function showServiceForm() {
	var form = document.getElementById("serviceform");
	form.style.display = "flex";
	hideLogin();
}

function hideServiceForm() {
	var form = document.getElementById("serviceform");
	form.style.display = "none";
}
/*-------------------------*/

function showLogin() {
	var form = document.getElementById("loginform");
	form.style.display = "block";
}

function hideLogin() {
	var form = document.getElementById("loginform");
	form.style.display = "none";
}

function hideStart() {
	var div = document.getElementById("start");
	div.style.display = "none";
}

function showStart() {
	var div = document.getElementById("start");
	div.style.display = "flex";
}

window.onload = function() {
	hideLogin();
	hideAdmin();
	hideParticipantForm();
	hideServiceForm();
	hidePsychologistForm();
}

var selectedUserType = null;



function showForm() {

	if (selectedUserType == "Participants") {
		showParticipantForm();
		hideServiceForm();
		hidePsychologistForm();
	}
	else if (selectedUserType == "Psychologist") {
		showPsychologistForm();
		document.getElementById("gradyear").addEventListener('input', function() {

			var gradYear = this.value;
			var currentYear = new Date().getFullYear();
			var serviceDays = (currentYear - gradYear) * 365;
			document.getElementById("daysinservice").value = serviceDays;

		});
		hideParticipantForm();
		hideServiceForm();
	}
	else if (selectedUserType == "Service") {
		showServiceForm();
		hideParticipantForm();
		hidePsychologistForm();
	}
}

document.addEventListener('DOMContentLoaded', function() {

	document.querySelector('.btn-group').addEventListener('click', function(event) {
		if (event.target.tagName === "BUTTON") {
			selectedUserType = event.target.textContent.trim();
		}
	});
});

function validatePartReg() {

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

function validatePsychoReg() {

	var username = document.getElementById("psychologistusername").value;
	var password = document.getElementById("psychologistpassword").value;
	var name = document.getElementById("psychologistname").value;
	var participantdocument = document.getElementById("psychologistdocument").value;
	var dateofbirth = document.getElementById("psychologistdateofbirth").value;
	var city = document.getElementById("psychologistcity").value;
	
	var graduationyear = document.getElementById("gradyear").value;
	var daysinservice = document.getElementById("daysinservice").value;
	var sessionssupported = document.getElementById("sessionssupported").value;
	var salary = document.getElementById("psychologistsalary").value;

	if (username == "" || password == "" || name == "" || participantdocument == "" || dateofbirth == "" || city == ""
	|| graduationyear == "" || daysinservice == "" || sessionssupported == "" || salary == "") {
		alert("All the spaces must be complete");
		return false;
	}

}

function validateServReg() {

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

