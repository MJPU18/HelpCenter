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

function validatePartUpdate() {

	var indexPart = document.getElementById("partactindex").value;
	var username = document.getElementById("partactusername").value;
	var password = document.getElementById("partactpassword").value;
	var name = document.getElementById("partactname").value;
	var participantdocument = document.getElementById("partactdocument").value;
	var dateofbirth = document.getElementById("partactdateofbirth").value;
	var city = document.getElementById("partactcity").value;
	var nickname = document.getElementById("partactnickname").value;
	var psessions = document.getElementById("participatedsessionsact").value;

	if (indexPart == "" || username == "" || password == "" || name == "" || participantdocument == "" || dateofbirth == "" || city == "" || nickname == "" || psessions == "") {
		alert("All the spaces must be complete");
		return false;
	}

}

