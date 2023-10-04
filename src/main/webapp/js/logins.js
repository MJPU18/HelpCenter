document.addEventListener("DOMContentLoaded", function() {
	var buttons = document.querySelectorAll('.btn');
	buttons.forEach(function(button) {
		button.addEventListener("click", function() {

			var selectionbutton = this.textContent;
			document.querySelector(".h3log").textContent = "Login " + selectionbutton;



		});

	});


});

document.addEventListener("DOMContentLoaded", function() {
	var shapes = document.querySelectorAll(".shape");
	for (var i = 0; i < shapes.length; i++) {
		shapes[i].style.display = "none";
	}
});

function showFigure() {
	var shapes = document.querySelectorAll(".shape");
	for (var i = 0; i < shapes.length; i++) {
		shapes[i].style.display = "block";
	}
}

function hideFigure() {
	var shapes = document.querySelectorAll(".shape");
	for (var i = 0; i < shapes.length; i++) {
		shapes[i].style.display = "none";
	}
}



function validateLogin() {

	var username = document.forms["login"]["usernamelog"].value;
	var password = document.forms["login"]["passwordlog"].value;
	if (username.value == "" || password.value == "") {
		alert("Both spaces must be complete");
		return false;
	}
}

function validateLoginAdmin() {

	var username = document.forms["loginadmin"]["adminusername"].value;
	var password = document.forms["loginadmin"]["adminpassword"].value;
	if (username == "" || password == "") {
		alert("Both spaces must be complete");
		return false;
	}
}






