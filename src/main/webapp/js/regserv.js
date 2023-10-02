function hideParticipantServForm() {
	var form = document.getElementById("participantservform");
	form.style.display = "none";
}
function showParticipantServForm() {
	var form = document.getElementById("participantservform");
	form.style.display = "flex";
}

window.onload = function() {
	hideParticipantServForm();
}