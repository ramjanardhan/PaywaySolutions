<!doctype html>

<html lang="en-US">
<head>
<meta charset="UTF-8" />
<title>PayWay Financial Solutions</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<style>/* Style inputs with type="text", select elements and textareas */
input[type=text], select, textarea {
	width: 100%; /* Full width */
	padding: 12px; /* Some padding */
	border: 1px solid #ccc; /* Gray border */
	border-radius: 4px; /* Rounded borders */
	box-sizing: border-box;
	/* Make sure that padding and width stays in place */
	margin-top: 6px; /* Add a top margin */
	margin-bottom: 16px; /* Bottom margin */
	resize: vertical
		/* Allow the user to vertically resize the textarea (not horizontally) */
}

/* Style the submit button with a specific background color etc */
input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

/* When moving the mouse over the submit button, add a darker green color */
input[type=submit]:hover {
	background-color: #45a049;
}

/* Add a background color and some padding around the form */
.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>
</head>
<body>
	<div id="wrap">

		<nav id="mainnav">

			<h1 id="textlogo">
				PayWay <span> Solutions</span>
			</h1>
			<ul>

				<li><a href="index.html">Home</a></li>
				<li class="active"><a href="services.html">Services</a></li>
				<li><a href="about.html">About</a></li>


			</ul>
		</nav>

		<section id="content" class="normalpage">
			<section id="page">
				<section id="fourcols">
					<header class="subhead">
						<h2>Update your contact information here</h2>
					</header>
					<!--  <div>Name : <input type="text" name="name" id="name"/></div><br> -->
					<!-- <div>Mobile No : <input type="text" name="name" id="name"/></div><br> -->
					<!-- <div>E-Mail : <input type="text" name="name" id="name"/></div><br> -->
					<!-- <div>Address : <textarea id="address" name="address"></textarea></div><br> -->
					<!-- <div> <input type="submit" value="Submit"> -->

					<div class="container">
						<form action="action_page.php">

							<label for="name">Name</label> <input type="text" id="name"
								name="name" placeholder="Your name.."> <label
								for="mobile">Mobile No</label> <input type="text" id="mobile"
								name="mobile" placeholder="Your mobile number.."> <label
								for="email">E-Mail</label> <input type="text" id="email"
								name="email" placeholder="Your email.."> <label
								for="address">Address</label>
							<textarea id="address" name="address"
								placeholder="Write your address.." style="height: 200px"></textarea>

							<label for="loan">Type of loan</label> <select id="loan"
								name="loan">
								<option value="Hoam">Hoam Loan</option>
								<option value="Personal">Personal Loan</option>
								<option value="Education">Education Loan</option>
								<option value="Mortgage">Mortagage Loan</option>
							</select> <input type="submit" value="Submit">

						</form>
					</div>



				</section>
			</section>
	</div>

	<footer>

		<div id="bottom">
			<a href="#">Home</a> | <a href="#">About Us</a> | <a href="#">Contact
				Us</a> |<a href="#"> Support</a> | <a href="#">Products</a> | <a
				href="#">Services</a>
			<div class="clear"></div>
		</div>
		<div id="credits">
			2018 &copy; All Rights Reserved. <a href="#">PayWay Financial
				Solutions</a>
		</div>
	</footer>

</body>

</html>
