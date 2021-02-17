/**
 * 
 */


let marsApiButton = document.querySelectorAll("button[id*='marsApi']")

marsApiButton.forEach(button => button.addEventListener('click',
	function() {
		let checkboxes = document.getElementsByClassName("form-check-input")
		for (let i = 0; i < checkboxes.length; i++) { 
	       checkboxes[i].checked = false;
	     }
		
		const buttonId = this.id
		const roverId = buttonId.split('marsApi')[1]
		let apiData = document.getElementById('marsApiRoverData')
		apiData.value = roverId
		
		document.getElementById('formRoverType').submit()
	}))

updateUI()

let marsSolValue = getUrlParameter("marsSol")
document.getElementById('marsSol').value = marsSolValue

let marsRoverType = getUrlParameter("marsApiRoverData")

highLightButton(marsRoverType)

function getUrlParameter(name) {
	name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
	var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
	var results = regex.exec(location.search);
	return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};

function highLightButton(roverType) {
	if (roverType === '') {
		roverType = 'opportunity'
	}
	document.getElementById('marsApi' + roverType).classList.remove('btn-outline-primary')
	document.getElementById('marsApi' + roverType).classList.add('btn-primary')
}

function updateUI(){
	if( document.getElementById('marsApiRoverData').value==="curiosity"){
		
		let cam = ["FHAZ1", "RHAZ1", "MAST1", "CHEMCAM1", "MAHLI1", "MARDI1", "NAVCAM1"];
		
		cam.forEach((value) => {
		  updateUiExp(value)
		});
	}
	if( document.getElementById('marsApiRoverData').value==="opportunity"){
		
		let cam = ["FHAZ1", "RHAZ1", "MINITES1", "PANCAM1", "NAVCAM1"];
		cam.forEach((value) => {
		  updateUiExp(value)
		});
		
	}
	if( document.getElementById('marsApiRoverData').value==="spirit"){
		let cam = ["FHAZ1", "RHAZ1", "MINITES1", "PANCAM1", "NAVCAM1"];
		cam.forEach((value) => {
		  updateUiExp(value)
		});
		
	}
};

function updateUiExp(value){
	document.getElementById("marsCameras.marsCam"+value).disabled= false;		
}



