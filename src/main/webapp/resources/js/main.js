$(document).ready(function() {
	if(isLogged()) {
		$("#login_block").css('display', 'none');
	} else {
		$("#logout_block").css('display', 'none');
	}
});

function isLogged() {
	//Add logic
	return false;
}

function loadLots() {
	//ajax
}