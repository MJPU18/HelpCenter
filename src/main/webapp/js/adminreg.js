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
//delete
function showDelPartForm() {
	var form = document.getElementById("formdeletepart");
	form.style.display = "flex";
}
function hideDelPartForm() {
	var form = document.getElementById("formdeletepart");
	form.style.display = "none";
}
function showDelPsychForm() {
	var form = document.getElementById("formdeletepsych");
	form.style.display = "flex";
}
function hideDelPsychForm() {
	var form = document.getElementById("formdeletepsych");
	form.style.display = "none";
}
function showDelServForm() {
	var form = document.getElementById("formdeleteserv");
	form.style.display = "flex";
}
function hideDelServForm() {
	var form = document.getElementById("formdeleteserv");
	form.style.display = "none";
}
window.onload = function() {
	hideRegPartForm();
	hideUptPartForm();
	hideRegServForm();
	hideUptServForm();
	hideRegPsychForm();
	hideUptPsychForm();
	hideDelPartForm();
	hideDelPsychForm();
	hideDelServForm();
}

document.addEventListener("DOMContentLoaded", function() {

	document.getElementById("gradyear").addEventListener('input', function() {

		var gradYear = this.value;
		var currentYear = new Date().getFullYear();
		var serviceDays = (currentYear - gradYear) * 365;
		document.getElementById("daysinservice").value = serviceDays;
	});

});

document.addEventListener("DOMContentLoaded", function() {

	document.getElementById("psycactgradyear").addEventListener('input', function() {

		var gradYear = this.value;
		var currentYear = new Date().getFullYear();
		var serviceDays = (currentYear - gradYear) * 365;
		document.getElementById("psycactdaysinservice").value = serviceDays;
	});

});


function validateAdminRegPart() {

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

function validateAdminRegServ() {

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

function validateAdminRegPsycho() {

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

function validateAdminPartUpdate() {

	var indexPart = document.getElementById("partactindex").value;
	var username = document.getElementById("partactusername").value;
	var password = document.getElementById("partactpassword").value;
	var name = document.getElementById("partactname").value;
	var participantdocument = document.getElementById("partactdocument").value;
	var dateofbirth = document.getElementById("partactdateofbirth").value;
	var city = document.getElementById("partactcity").value;
	var nickname = document.getElementById("partactnickname").value;
	var psessions = document.getElementById("participatedsessions").value;

	if (indexPart == "" || username == "" || password == "" || name == "" || participantdocument == "" || dateofbirth == "" || city == "" || nickname == "" || psessions == "") {
		alert("All the spaces must be complete");
		return false;
	}

}

function validateAdminServUpdate() {

	var indexServ = document.getElementById("servactindex").value;
	var username = document.getElementById("servactusername").value;
	var password = document.getElementById("servactpassword").value;
	var name = document.getElementById("servactname").value;
	var participantdocument = document.getElementById("servactdocument").value;
	var dateofbirth = document.getElementById("servactdateofbirth").value;
	var city = document.getElementById("servactcity").value;
	
	var salary = document.getElementById("servactsalary").value;
	var csessions = document.getElementById("sessionscleannedact").value;

	if (indexServ == "" || username == "" || password == "" || name == "" || participantdocument == "" || dateofbirth == "" || city == "" 
	|| salary == "" || csessions == "") {
		alert("All the spaces must be complete");
		return false;
	}

}

function validateAdminPsychoUpdate() {

	var indexPsy = document.getElementById("psycactindex").value;
	var username = document.getElementById("psycactusername").value;
	var password = document.getElementById("psycactpassword").value;
	var name = document.getElementById("psycactname").value;
	var participantdocument = document.getElementById("psycactdocument").value;
	var dateofbirth = document.getElementById("psycactdateofbirth").value;
	var city = document.getElementById("psycactcity").value;
	
	var graduationyear = document.getElementById("psycactgradyear").value;
	var daysinservice = document.getElementById("psycactdaysinservice").value;
	var sessionssupported = document.getElementById("psycactsessionss").value;
	var salary = document.getElementById("psycactsalary").value;

	if (indexPsy == "" || username == "" || password == "" || name == "" || participantdocument == "" || dateofbirth == "" || city == ""
	|| graduationyear == "" || daysinservice == "" || sessionssupported == "" || salary == "") {
		alert("All the spaces must be complete");
		return false;
	}

}

function validateAdminDeletePart(){
	
	var indexparticipant = document.getElementById("deletepart").value;
	
	if(indexparticipant == ""){
		alert("The space must be complete");
		return false;
	}
	
}

function validateAdminDeletePart(){
	
	var indexpsychologist = document.getElementById("deletepsych").value;
	
	if(indexpsychologist == ""){
		alert("The space must be complete");
		return false;
	}
	
}

function validateAdminDeletePart(){
	
	var indexservice = document.getElementById("deleteserv").value;
	
	if(indexservice == ""){
		alert("The space must be complete");
		return false;
	}
	
}

