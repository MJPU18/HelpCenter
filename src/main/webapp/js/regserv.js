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

function validateServRegPart() {

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