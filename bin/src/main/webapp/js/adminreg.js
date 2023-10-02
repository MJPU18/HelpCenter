// participantes
function hideRegPartForm() {
	var form = document.getElementById("participantadmform");
	form.style.display = "none";
}
function showRegPartForm() {
	var form = document.getElementById("participantadmform");
	form.style.display = "flex";
}
// act
function hideUptPartForm() {
	var form = document.getElementById("formupdatepartadm");
	form.style.display = "none";
}
function showUptPartForm() {
	var form = document.getElementById("formupdatepartadm");
	form.style.display = "flex";
}
// servicio
function hideRegServForm() {
	var form = document.getElementById("serviceadmform");
	form.style.display = "none";
}
function showRegServForm() {
	var form = document.getElementById("serviceadmform");
	form.style.display = "flex";
}
// Act
function hideUptServForm() {
	var form = document.getElementById("formupdateservadm");
	form.style.display = "none";
}
function showUptServForm() {
	var form = document.getElementById("formupdateservadm");
	form.style.display = "flex";
}
// psicologos
function hideRegPsychForm() {
	var form = document.getElementById("psychologistadmform");
	form.style.display = "none";
}
function showRegPsychForm() {
	var form = document.getElementById("psychologistadmform");
	form.style.display = "flex";
}
// Act
function hideUptPsychForm() {
	var form = document.getElementById("formupdatepsycadm");
	form.style.display = "none";
}
function showUptPsychForm() {
	var form = document.getElementById("formupdatepsycadm");
	form.style.display = "flex";
}

window.onload = function() {
	hideRegPartForm();
	hideUptPartForm();
	hideRegServForm();
	hideUptServForm();
	hideRegPsychForm();
	hideUptPsychForm();
}