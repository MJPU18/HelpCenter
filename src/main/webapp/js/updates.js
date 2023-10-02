function hideUpdateParticipantForm() {
	var form = document.getElementById("formupdateparticipants");
	form.style.display = "none";
}
function showUpdateParticipantForm() {
	var form = document.getElementById("formupdateparticipants");
	form.style.display = "flex";
}
window.onload = function() {
	hideUpdateParticipantForm();
}