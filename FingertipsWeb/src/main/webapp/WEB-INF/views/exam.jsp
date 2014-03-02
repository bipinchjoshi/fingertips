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
				<h1 style="color: #ffffff; padding-top: 15px">MCQ Generator</h1>
			</div>
		</div>
		<div id="content">
			<div id="mcqContent">
				<table style="border: 0px solid #9f9f9f;" cellspacing="0" border="1">
					<tr>
						<td
							style="width: 150px; height: 25px; background-color: #21282E; color: white; text-align: center;"><label>Physics</label>
						</td>
						<td
							style="width: 150px; background-color: #6E6E6E; color: white; text-align: center;"><label>Maths</label>
						</td>
						<td
							style="width: 150px; background-color: #6E6E6E; color: white; text-align: center;"><label>Chemistry</label>
						</td>
						<td style="padding-left: 20px; text-align: center; border: 0"><a
							href="#">Delete section</a>
						</td>
					</tr>
				</table>
				<div data-dojo-type="dijit.form.Form" enctype="multipart/form-data"
					method="">
					<table style="border: 0px solid #9f9f9f;" cellspacing="10">
						<tr>
							<td><label for="topic">Topic :</label>
							</td>
							<td><input type="text" id="topic" name="topic"
								required="true" data-dojo-type="dijit/form/ValidationTextBox" />
							</td>
						</tr>
						<tr>
							<td><label for="question">Q</label><label id="questionCount">1.
							</label>
							</td>
							<td><textarea data-dojo-type="dijit.form.Textarea"
									id="question" name="" style="width: 500px; height: 100px"> </textarea>
							</td>
							<td><img id="questionImage" src="#" alt="your image" /><input
								type='file' onchange="readImage(this);"
								style="color: transparent" />
							</td>
						</tr>
						<tr>

							<td><input type="radio"
								data-dojo-type="dijit.form.RadioButton" id="radio_1"
								name="option" value="1" selected="true">
							</td>
							<td><textarea data-dojo-type="dijit.form.Textarea"
									id="option1" name="question" style="width: 500px"> </textarea>
							</td>
							<td><img id="option1Image" src="#" alt="your image" /><input
								type='file' onchange="readRadio1Image(this);"
								style="color: transparent" />
							</td>
						</tr>
						<tr>

							<td><input type="radio"
								data-dojo-type="dijit.form.RadioButton" id="radio_2"
								name="option" value="1" selected="true">
							</td>
							<td><textarea data-dojo-type="dijit.form.Textarea"
									id="option2" name="question" style="width: 500px"> </textarea>
							</td>
							<td><img id="option2Image" src="#" alt="your image" /><input
								type='file' onchange="readRadio2Image(this);"
								style="color: transparent" />
							</td>
						</tr>
						<tr>

							<td><input type="radio"
								data-dojo-type="dijit.form.RadioButton" id="radio_3"
								name="option" value="1" selected="true">
							</td>
							<td><textarea data-dojo-type="dijit.form.Textarea"
									id="option3" name="question" style="width: 500px"> </textarea>
							</td>
							<td><img id="option3Image" src="#" alt="your image" /><input
								type='file' onchange="readRadio3Image(this);"
								style="color: transparent" />
							</td>
						</tr>
						<tr>
							<td><input type="radio"
								data-dojo-type="dijit.form.RadioButton" id="radio_4"
								name="option" value="1" selected="true">
							</td>
							<td><textarea data-dojo-type="dijit.form.Textarea"
									id="option4" name="question" style="width: 500px"> </textarea>
							</td>
							<td><img id="option4Image" src="#" alt="your image" /><input
								type='file' onchange="readRadio4Image(this);"
								style="color: transparent" />
							</td>
						</tr>
						<tr>
							<td><button data-dojo-type="dijit/form/Button" type="submit"
									name="previous" value="previous">Previous</button>
							</td>
							<td><button data-dojo-type="dijit/form/Button" type="submit"
									name="review" value="review">Review</button>
							</td>
							<td><button data-dojo-type="dijit/form/Button" type="submit"
									name="save" value="save">Save as draft</button>
								<button data-dojo-type="dijit/form/Button" type="submit"
									name="next" value="next">Next</button>
							</td>
						</tr>
					</table>

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