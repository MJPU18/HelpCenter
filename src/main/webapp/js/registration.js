function validateYear(input) {
	var year = parseInt(input.value);
	if (year < 1900 || year > 2100) {
		document.getElementById("dateofbirth").classList.add("text-danger");
		document.getElementById("dateofbirth").classList.remove("text-dark");
		input = "";
	} else {
		document.getElementById("dateofbirth").classList.remove("text-danger");
		document.getElementById("dateofbirth").classList.add("text-dark");
	}
}

function validateDocument(input) {
	if (input.value.length != 10) {
		document.getElementById("document").classList.add("text-danger");
		document.getElementById("document").classList.remove("text-dark");
		alert("Invalid document")
		input = "";
	}
	else {
		document.getElementById("document").classList.remove("text-danger");
		document.getElementById("document").classList.add("text-dark");
	}
}


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
	var form = document.getElementById("psychologistform");
	form.style.display = "flex";
	hideLogin();
}

function hidePsychologistForm() {
	var form = document.getElementById("psychologistform");
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

document.addEventListener('DOMContentLoaded', function() {

	document.getElementById("psychologistform").addEventListener('submit', function(event) {
		event.preventDefault();
	});

});

