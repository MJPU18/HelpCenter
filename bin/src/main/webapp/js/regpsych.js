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