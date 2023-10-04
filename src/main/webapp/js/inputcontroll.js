function validateInput(input){
	input.value = input.value.replace(/[^a-zA-ZáéíóúÁÉÍÓÚñÑ ]/g,'');
}

function validateYear(input) {
	var date = new Date(input.value);
	var year = date.getFullYear();
	if (year < 1900 || year > 2100) {
		alert("Invalid year, the year must be between 1900 and 2100")
		input.value = "";
	} 
}

function validateDocument(input) {
	if (input.value.length != 10) {
		alert("Invalid document, the document must have 10 digits")
		input.value = "";
	}	
}

function validateNumber(input){
	if(input.value < 0){
		input.value = "";
	}
}

function validateGradYear(input){
	if(input.value < 1900 || input.value > 2100 || input.value < 0){
		alert("Invalid graduation year, must be between 1900 and 2100");
		input.value = "";
	}
}
