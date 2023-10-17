(function() {
	console.log("Hello World!");
	console.log("appAddress: " + appAddress);
	console.log("appPort: " + appPort);
	var currentPageUrl = window.location.href;
	console.log("currentPageUrl: " + currentPageUrl);
	/*** 
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


document.getElementById("idForm").addEventListener("submit", function(event) {
	event.preventDefault(); // Prevent form submission
	validateForm();
});

function openPopup(message) {
	const popupContainer = document.getElementById('popupContainer');
	const popupMessage = document.getElementById('popupMessage');
	popupMessage.textContent = message;
	popupContainer.style.display = 'block';
}

document.getElementById('closePopupButton').addEventListener('click', closePopup);
function closePopup() {
	const popupContainer = document.getElementById('popupContainer');
	popupContainer.style.display = 'none';
}


function validateForm() {
	const item = document.getElementById('idskuNo').value;
	const batch = document.getElementById('idbatchNo').value;
	const ssc = document.getElementById('idsscNo').value;
	if (isNullOrEmpty(item) & isNullOrEmpty(batch) & isNullOrEmpty(ssc)) {
		//alert('Please fill at least one value.');
		this.openPopup('Please fill at least one value.');
		return;
	}
	return validateValues(item, batch, ssc);
}

async function validateValues(item, batch, ssc) {
	if (!isNullOrEmpty(item) & !isNullOrEmpty(batch) & !isNullOrEmpty(ssc)) {
		const itemCount = await fetchItemCount(item);
		const batchCount = await fetchBatchCount(batch);
		const sscCount = await fetchSSCCount(ssc);
		if (itemCount > 0 & batchCount > 0 & sscCount > 0) {
			document.getElementById('idForm').submit();
		} else if (itemCount > 0 & batchCount > 0 & sscCount === 0) {
			//alert('SSCC not found in database.');
			this.openPopup('SSCC not found in database.');
			return;
		} else if (itemCount > 0 & batchCount === 0 & sscCount > 0) {
			//alert('Batch not found in database.');
			this.openPopup('Batch not found in database.');
			return;
		} else if (itemCount === 0 & batchCount > 0 & sscCount > 0) {
			//alert('Item not found in database.');
			this.openPopup('Item not found in database.');
			return;
		} else if (itemCount > 0 & batchCount === 0 & sscCount === 0) {
			//alert('Batch and SSCC not found in database.');
			this.openPopup('Batch and SSCC not found in database.');
			return;
		} else if (itemCount === 0 & batchCount > 0 & sscCount === 0) {
			//alert('Item and SSCC not found in database.');
			this.openPopup('Item and SSCC not found in database.');
			return;
		} else if (itemCount === 0 & batchCount === 0 & sscCount > 0) {
			this.openPopup('Item and Batch not found in database.');
			//alert('Item and Batch not found in database.');
			return;
		} else
			//alert('Item, Batch and SSCC not found in database.');
			this.openPopup('Item, Batch and SSCC not found in database.');
		return;
	}
	if (!isNullOrEmpty(item) & !isNullOrEmpty(batch) & isNullOrEmpty(ssc)) {
		const itemCount = await fetchItemCount(item);
		const batchCount = await fetchBatchCount(batch);
		if (itemCount === 0 & batchCount === 0) {
			//alert('Item and batch not found in database.');
			this.openPopup('Item and batch not found in database.');
			return;
		} else if (itemCount === 0) {
			//alert('Item not found in database.');
			this.openPopup('Item not found in database.');
			return;
		} else if (batchCount === 0) {
			//alert('Batch not found in database.');
			this.openPopup('Batch not found in database.');
			return;
		} else
			document.getElementById('idForm').submit();
	}
	if (!isNullOrEmpty(item) & isNullOrEmpty(batch) & !isNullOrEmpty(ssc)) {
		const itemCount = await fetchItemCount(item);
		const sscCount = await fetchSSCCount(ssc);
		if (itemCount === 0 & sscCount === 0) {
			//alert('Item and SSCC not found in database.');
			this.openPopup('Item and SSCC not found in database.');
			return;
		} else if (itemCount === 0) {
			//alert('Item not found in database.');
			this.openPopup('Item not found in database.');
			return;
		} else if (sscCount === 0) {
			//alert('SSCC not found in database.');
			this.openPopup('SSCC not found in database.');
			return;
		} else
			document.getElementById('idForm').submit();
	}
	if (isNullOrEmpty(item) & !isNullOrEmpty(batch) & !isNullOrEmpty(ssc)) {
		const batchCount = await fetchBatchCount(batch);
		const sscCount = await fetchSSCCount(ssc);
		if (batchCount === 0 & sscCount === 0) {
			//alert('Batch and SSCC not found in database.');
			this.openPopup('Batch and SSCC not found in database.');
			return;
		} else if (batchCount === 0) {
			//alert('Batch not found in database.');
			this.openPopup('Batch not found in database.');
			return;
		} else if (sscCount === 0) {
			//alert('SSCC not found in database.');
			this.openPopup('SSCC not found in database.');
			return;
		} else
			document.getElementById('idForm').submit();
	}
	if (!isNullOrEmpty(item) & isNullOrEmpty(batch) & isNullOrEmpty(ssc)) {
		const itemCount = await fetchItemCount(item);
		if (itemCount === 0) {
			//alert('Item not found in database.');
			this.openPopup('Item not found in database.');
			return;
		} else
			document.getElementById('idForm').submit();
	}
	if (isNullOrEmpty(item) & !isNullOrEmpty(batch) & isNullOrEmpty(ssc)) {
		const batchCount = await fetchBatchCount(batch);
		if (batchCount === 0) {
			//alert('Batch not found in database.');
			this.openPopup('Batch not found in database.');
			return;
		} else
			document.getElementById('idForm').submit();
	}
	if (isNullOrEmpty(item) & isNullOrEmpty(batch) & !isNullOrEmpty(ssc)) {
		const sscCount = await fetchSSCCount(ssc);
		if (sscCount === 0) {
			//alert('SSCC not found in database.');
			this.openPopup('SSCC not found in database.');
			return;
		} else
			document.getElementById('idForm').submit();
	}
}

function isNullOrEmpty(value) {
	return value === null || value === '';
}

async function fetchBatchCount(value) {
	const url = 'http://' + appAddress + ':' + appPort + '/internalCheck/validatelot?batchNumber=' + value;
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

async function fetchItemCount(value) {
	const url = 'http://' + appAddress + ':' + appPort + '/internalCheck/validateitem?itemNumber=' + value;
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

async function fetchSSCCount(value) {
	const url = 'http://' + appAddress + ':' + appPort + '/internalCheck/validatessc?sscNumber=' + value;
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


/*** 

document.getElementById("idInventoryForm").addEventListener("submit", function(event) {
	event.preventDefault(); // Prevent form submission
	validateInventoryForm();
});
*/
function validateInventoryForm(){
	const owner = document.getElementById('owner').value;
	if (isNullOrEmpty(owner)) {
		this.openInventoryPopup('Please fill the owner value!');
		//document.getElementById('idInventoryForm').submit();
		return;
	} else if (fetchOwnerCount(owner) === 0) {
		this.openInventoryPopup('Owner not found in database: ' + owner + "!");
		return;
	} else
		document.getElementById('idInventoryForm').submit();
};

function openInventoryPopup(message) {
	const popupContainer = document.getElementById('popupInventoryContainer');
	const popupMessage = document.getElementById('popupInventoryMessage');
	popupMessage.textContent = message;
	popupContainer.style.display = 'block';
}

/** 
document.getElementById('closeInventoryPopupButton').addEventListener('click', closeInventoryPopup);
function closeInventoryPopup() {
	const popupContainer = document.getElementById('popupInventoryContainer');
	popupContainer.style.display = 'none';
}

*/


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
