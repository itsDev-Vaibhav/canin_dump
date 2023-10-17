(function() {
	console.log("Hello World!");
	console.log("appAddress: " + appAddress);
	console.log("appPort: " + appPort);
	var currentPageUrl = window.location.href;
	console.log("currentPageUrl: " + currentPageUrl);
	/** 
	const val = compareUrl(currentPageUrl);
	var element = document.getElementById(val);
	if (element) {
    	element.style.display = "none";
  	}
  	*/
})();

function compareUrl(url) {
	if (url.toLowerCase() === "http://" + appAddress + ":" + appPort + "/welcome" || url.toLowerCase() === "http://" + appAddress + ":" + appPort + "/") {
		return "idTransaction";
	}
	
	if (url.toLowerCase() === "http://" + appAddress + ":" + appPort + "/inventory") {
		return "idInventory";
	}
}

function isNullOrEmpty(value) {
	return value === null || value === '';
}

document.getElementById("idInventoryForm").addEventListener("submit", function(event) {
	event.preventDefault(); // Prevent form submission
	validateInventoryForm();
});

function validateInventoryForm(){
	const owner = document.getElementById('owner').value;
	if (isNullOrEmpty(owner)) {
		this.openInventoryPopup('Please fill the owner value!');
		//document.getElementById('idInventoryForm').submit();
		return;
	}
	return validateOwner(owner);
};

async function validateOwner(value) {
	//const ownerCount = await fetchOwnerCount(value);
	//if (ownerCount === 0) {
		//this.openInventoryPopup('Owner not found in database: '+value+"!");
		//return;
	//}
	document.getElementById('idInventoryForm').submit();
};

function openInventoryPopup(message) {
	const popupContainer = document.getElementById('popupInventoryContainer');
	const popupMessage = document.getElementById('popupInventoryMessage');
	popupMessage.textContent = message;
	popupContainer.style.display = 'block';
}

document.getElementById('closeInventoryPopupButton').addEventListener('click', closeInventoryPopup);
function closeInventoryPopup() {
	const popupContainer = document.getElementById('popupInventoryContainer');
	popupContainer.style.display = 'none';
}



async function fetchOwnerCount(value) {
	const url = 'http://' + appAddress + ':' + appPort + '/internalCheck/validateOwner?owner=' + value;
	try {
		const response = await fetch(url);
		// Check if the response is successful (status code in the range of 200-299)
		if (!response.ok) {
			throw new Error('Network response was not ok');
		}
		const data = await response.json();
		return data;
	} catch (error) {
		console.error('Error fetching data:', error);
		return null;
	}
}