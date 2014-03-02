<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
@import "http://localhost:8080/FingertipsWebApp/dojo/dojo/resources/dojo.css";

@import
	"http://localhost:8080/FingertipsWebApp/dojo/dijit/themes/claro/claro.css";

@import
	"http://localhost:8080/FingertipsWebApp/dojo/dojox/grid/enhanced/resources/claro/EnhancedGrid.css"
	;

@import
	"http://localhost:8080/FingertipsWebApp/dojo/dojox/grid/enhanced/resources/EnhancedGrid_rtl.css"
	;
</style>
<link rel="stylesheet" type="text/css"
	href="http://localhost:8080/FingertipsWebApp/dojo/dijit/themes/dijit.css">

<link rel="stylesheet" type="text/css"
	href="http://localhost:8080/FingertipsWebApp/resources/fingertips.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script>
	dojoConfig = {
		parseOnLoad : true
	}
</script>
<script type="text/javascript"
	src="http://localhost:8080/FingertipsWebApp/dojo/dojo/dojo.js"></script>
<style>
/*Grid need a explicit width/height by default*/
#grid {
	width: 800px;
	height: 500px;
}
</style>

<script type="text/javascript">
	dojo.require("dijit.layout.TabContainer");
	dojo.require("dijit.layout.ContentPane");
	dojo.ready(function() {
	});
	dojo.require("dijit.form.Form");
	dojo.require("dijit.form.Textarea");
	dojo.require("dojox.form.Uploader");
	dojo.require("dijit/form/Button");
	dojo.require("dijit.form.RadioButton");
	dojo.require("dijit/form/ValidationTextBox");
</script>
</head>
<body class="claro">
	<div id="wrapper">
		<div id="header">
			<div id="menubar"
				style="background-color: #000000; height: 30px; padding-top: 10px">
				<table
					style="border: 0px solid #9f9f9f; width: 1050px; margin-left: 150px;"
					cellspacing="0">
					<tr>
						<td style="width: 550px;"><span class="anchor">Fingertips</span>
						</td>
						<td style="width: 300px"><span class="anchor">Welcome!
								Bipin Kumar Joshi</span>
						</td>
						<td><a href="#" class="anchor">Home</a>
						</td>
						<td><a href="#" class="anchor">Profile</a>
						</td>
						<td><a href="#" class="anchor">Logout</a>
						</td>
					</tr>
				</table>
			</div>
			<div id="pageTitle" style="margin-top: 20px; margin-left: 150px;">
				<h1 style="color: #ffffff; padding-top: 15px">Review Exam</h1>
			</div>
		</div>
		<div id="content">
			<div id="reviewContent">
				<div>
					<b style="font-size: large;">Exam no. 123</b>
				</div>
				<div>
					<table
						style="border: 0px solid #9f9f9f; background-color: #BCD8F4; width: 1050.0px; margin-top: 20px"
						cellspacing="10">
						<tr valign="top">
							<td style="font-weight: bold;">1.</td>
							<td style="width: 600px;">Which of the following methods can
								be used to charge a metal sphere positively without touching it
								. Select the best</td>
							<td style="width: 200px"></td>
							<td><button data-dojo-type="dijit/form/Button" type="submit"
									name="edit" value="edit">Edit</button>
								<button data-dojo-type="dijit/form/Button" type="submit"
									name="delete" value="delete">Delete</button>
							</td>
						</tr>
						<tr valign="top">
							<td style="color: green; font-weight: bold;">A</td>
							<td>Connect the positive terminal a battery and float the
								other end of the battery</td>
							<td></td>
						</tr>
						<tr valign="top">
							<td>B</td>
							<td>Bring a negatively charged rod near the sphere and touch
								it to ground for a short while</td>
							<td></td>
						</tr>
						<tr valign="top">
							<td>C</td>
							<td>Rub it with a piece of fur</td>
							<td></td>
						</tr>
						<tr valign="top">
							<td>D</td>
							<td>Rub it with a piece of silk</td>
							<td></td>
						</tr>

					</table>
					<table
						style="border: 0px solid #9f9f9f; background-color: #f1f1f1; width: 1050.0px; margin-top: 10px"
						cellspacing="10">
						<tr valign="top">
							<td style="font-weight: bold;">2.</td>
							<td style="width: 600px;">Which of the following methods can
								be used to charge a metal sphere positively without touching it
								. Select the best</td>
							<td style="width: 200px"><img border="0"
								src="../../resources/logo.png" width="100" height="100">
							</td>
							<td><button data-dojo-type="dijit/form/Button" type="submit"
									name="edit" value="edit">Edit</button>
								<button data-dojo-type="dijit/form/Button" type="submit"
									name="delete" value="delete">Delete</button>
							</td>
						</tr>
						<tr valign="top">
							<td style="color: green; font-weight: bold;">A</td>
							<td>Connect the positive terminal a battery and float the
								other end of the battery</td>
							<td></td>
						</tr>
						<tr valign="top">
							<td>B</td>
							<td>Bring a negatively charged rod near the sphere and touch
								it to ground for a short while</td>
							<td></td>
						</tr>
						<tr valign="top">
							<td>C</td>
							<td>Rub it with a piece of fur</td>
							<td></td>
						</tr>
						<tr valign="top">
							<td>D</td>
							<td>Rub it with a piece of silk</td>
							<td></td>
						</tr>

					</table>

					<table
						style="border: 0px solid #9f9f9f; background-color: #BCD8F4; width: 1050.0px; margin-top: 10px"
						cellspacing="10">
						<tr valign="top">
							<td style="font-weight: bold;">3.</td>
							<td style="width: 600px;">Which of the following methods can
								be used to charge a metal sphere positively without touching it
								. Select the best</td>
							<td style="width: 200px"></td>
							<td><button data-dojo-type="dijit/form/Button" type="submit"
									name="edit" value="edit">Edit</button>
								<button data-dojo-type="dijit/form/Button" type="submit"
									name="delete" value="delete">Delete</button>
							</td>
						</tr>
						<tr valign="top">
							<td style="color: green; font-weight: bold;">A</td>
							<td>Connect the positive terminal a battery and float the
								other end of the battery</td>
							<td></td>
						</tr>
						<tr valign="top">
							<td>B</td>
							<td>Bring a negatively charged rod near the sphere and touch
								it to ground for a short while</td>
							<td></td>
						</tr>
						<tr valign="top">
							<td>C</td>
							<td>Rub it with a piece of fur</td>
							<td></td>
						</tr>
						<tr valign="top">
							<td>D</td>
							<td>Rub it with a piece of silk</td>
							<td></td>
						</tr>

					</table>
				</div>
				<div
					style="margin-top: 20px; margin-left: -100px; margin-bottom: 20px"
					align="center">
					<button data-dojo-type="dijit/form/Button" type="submit"
						name="save" value="save">Save as draft</button>
					<button data-dojo-type="dijit/form/Button" type="submit"
						name="submit" value="submit">Submit</button>
				</div>
			</div>

		</div>
		<div id="footer">
			<a href="#" class="anchor">About Us</a>
		</div>
	</div>

	<script type="text/javascript">
		function readImage(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();
				reader.onload = function(e) {
					$('#questionImage').attr('src', e.target.result);
				};
				reader.readAsDataURL(input.files[0]);
			}
		}
		function readRadio1Image(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();
				reader.onload = function(e) {
					$('#option1Image').attr('src', e.target.result);
				};
				reader.readAsDataURL(input.files[0]);
			}
		}
		function readRadio2Image(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();
				reader.onload = function(e) {
					$('#option2Image').attr('src', e.target.result);
				};
				reader.readAsDataURL(input.files[0]);
			}
		}
		function readRadio3Image(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();
				reader.onload = function(e) {
					$('#option3Image').attr('src', e.target.result);
				};
				reader.readAsDataURL(input.files[0]);
			}
		}
		function readRadio4Image(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();
				reader.onload = function(e) {
					$('#option4Image').attr('src', e.target.result);
				};
				reader.readAsDataURL(input.files[0]);
			}
		}
	</script>
</body>
</html>