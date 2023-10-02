document.addEventListener("DOMContentLoaded", function() {
	var buttons = document.querySelectorAll('.btn');
	buttons.forEach(function(button) {
		button.addEventListener("click", function() {

			var selectionbutton = this.textContent;
			document.querySelector(".h3log").textContent = "Login " + selectionbutton;



		});

	});


});

document.addEventListener("DOMContentLoaded", function(){
	var shapes = document.querySelectorAll(".shape");
	for(var i = 0; i<shapes.length; i++){
		shapes[i].style.display = "none";
	}
});

function showFigure(){
	var shapes = document.querySelectorAll(".shape");
	for(var i = 0; i < shapes.length; i++){
		shapes[i].style.display = "block";
	}
}

function hideFigure(){
	var shapes = document.querySelectorAll(".shape");
	for(var i = 0; i < shapes.length; i++){
		shapes[i].style.display = "none";
	}
}