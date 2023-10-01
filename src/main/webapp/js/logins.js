document.addEventListener("DOMContentLoaded", function() {
	var buttons = document.querySelectorAll('.btn');
	buttons.forEach(function(button) {
		button.addEventListener("click", function() {

			var selectionbutton = this.textContent;
			document.querySelector(".h3log").textContent = "Login " + selectionbutton;

			switch (selectionbutton) {
				case "Participants": {
					document.querySelector(".formlogin").action = "index.jsp/participants";
					break;
				}
				case "Psychologist": {
					document.querySelector(".formlogin").action = "index.jsp/psychologist";
					break;
				}
				case "Service": {
					document.querySelector(".formlogin").action = "index.jsp/serviceperson";
					break;
				}
			}

		});

	});


});