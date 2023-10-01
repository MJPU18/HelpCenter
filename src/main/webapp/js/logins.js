document.addEventListener("DOMContentLoaded", function() {
	var buttons = document.querySelectorAll('.btn');
	buttons.forEach(function(button) {
		button.addEventListener("click", function() {

			var selectionbutton = this.textContent;
			document.querySelector(".h3log").textContent = "Login " + selectionbutton;



		});

	});


});