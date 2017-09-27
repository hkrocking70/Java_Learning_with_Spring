<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	var cId;
	function countryCall() {
		document.getElementById("state").innerHTML = "";	
		cid = document.getElementById("country").value;

		var select =  document.getElementById("state");
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				var states = this.responseText;
				
				var allStates = states.split("#");
				
				for(var j=0;j<allStates.length;j++){
					var eachState = allStates[j].split("-");
					
					var opt = document.createElement("option");
					opt.textContent = eachState[1];
					opt.value = eachState[0];
					select.appendChild(opt);
					
				}
			}
		};
		xhttp.open("GET", "stateinfo?countryId=" + cid, true);
		xhttp.send();
	}
	
</script>
</head>
<body>
	<h1>Want to Learn Ajax...Follow this page</h1>

	<p>Select Country:</p>
	<select id="country" onchange="countryCall()">
		<option value="0">Choose one option</option>
		<option value="1">India</option>
		<option value="2">USA</option>
		<option value="3">China</option>
	</select>
	<br>

	<p>Select State:</p>
	<select id="state" onchange="stateCall()">
		
	</select>
	<br>

	<p>Select City:</p>
	<select id="city">
		<option></option>
	</select>

</body>
</html>