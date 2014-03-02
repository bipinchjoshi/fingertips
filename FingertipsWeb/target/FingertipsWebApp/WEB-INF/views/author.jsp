<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
@import "http://localhost:8080/FingertipsWebApp/dojo/dojo/resources/dojo.css";

@import "http://localhost:8080/FingertipsWebApp/dojo/dijit/themes/claro/claro.css";

@import
	"http://localhost:8080/FingertipsWebApp/dojo/dojox/grid/enhanced/resources/claro/EnhancedGrid.css";

@import "http://localhost:8080/FingertipsWebApp/dojo/dojox/grid/enhanced/resources/EnhancedGrid_rtl.css";
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
<script type="text/javascript" src="http://localhost:8080/FingertipsWebApp/dojo/dojo/dojo.js"></script>

<style>
/*Grid need a explicit width/height by default*/
#grid {
	width: 800px;
	height: 500px;
}
</style>

<script type="text/javascript">
	dojo.require("dojox.grid.EnhancedGrid");
	dojo.require("dojo.data.ItemFileWriteStore");
	dojo.require("dijit.layout.TabContainer");
	dojo.require("dijit.layout.ContentPane");
	dojo.require("dijit/form/RadioButton");
	dojo.require("dijit/form/Textarea");
	dojo.require("dijit/form/TimeTextBox");
	dojo.require("dijit/form/CheckBox");
	dojo.require("dijit/form/ComboBox");
	dojo.require("dijit/form/ValidationTextBox");
	dojo.require("dijit/form/Form");
	dojo.require("dijit/form/Button");
	dojo.require("dijit/Dialog");
	dojo.ready(function() {

		/*set up data store*/
		var data = {
			identifier : 'id',
			items : []
		};
		var data_list = [ {
			col1 : 1,
			col2 : 'EN1231',
			col3 : 'Mock Exam 1',
			col4 : '23/01/2014',
			col5 : 'Competitive',
			col6 : '<a href="#">Edit</a>, <a href="#">Delete</a>'
		}, {
			col1 : 2,
			col2 : 'EN1232',
			col3 : 'Mock Exam 2',
			col4 : '31/01/2014',
			col5 : 'Competitive',
			col6 : '<a href="#">Edit</a>, <a href="#">Delete</a>'
		}, {
			col1 : 3,
			col2 : 'EN1233',
			col3 : 'Mock Exam 3',
			col4 : '02/02/2014',
			col5 : 'School',
			col6 : '<a href="#">Edit</a>, <a href="#">Delete</a>'
		} ];
		var rows = 10;
		for (var i = 0, l = data_list.length; i < rows; i++) {
			data.items.push(dojo.mixin({
				id : i + 1
			}, data_list[i % l]));
		}
		var store = new dojo.data.ItemFileWriteStore({
			data : data
		});

		/*set up layout*/
		var layout = [ [ {
			'name' : 'S.No.',
			'field' : 'id',
			'width' : 'auto'
		}, {
			'name' : 'Exam no.',
			'field' : 'col2',
			'width' : 'auto'
		}, {
			'name' : 'Exam name',
			'field' : 'col3',
			'width' : 'auto'

		}, {
			'name' : 'Date modified',
			'field' : 'col4',
			'width' : 'auto'
		}, {
			'name' : 'Exam Type',
			'field' : 'col5',
			'width' : 'auto'
		}, {
			'name' : 'Action',
			'field' : 'col6',
			'width' : 'auto'
		} ] ];

		/*create a new grid:*/
		var grid = new dojox.grid.EnhancedGrid({
			id : 'grid',
			store : store,
			structure : layout,
			rowSelector : '20px',
			escapeHTMLInData : false
		}, document.createElement('div'));

		/*append the new grid to the div*/
		dojo.byId("draftGrid").appendChild(grid.domNode);

		/*Call startup() to render the grid*/
		grid.startup();
	});
	dojo
			.addOnLoad(function() {

				/*set up data store*/
				var data1 = {
					identifier : 'id',
					items : []
				};
				var data_list1 = [
						{
							col1 : 1,
							col2 : 'EN1231',
							col3 : 'Mock Exam 1',
							col4 : '23/01/2014',
							col5 : 'Competitive',
							col6 : 'Review Pending',
							col7 : ''
						},
						{
							col1 : 2,
							col2 : 'EN1232',
							col3 : 'Mock Exam 2',
							col4 : '31/01/2014',
							col5 : 'Competitive',
							col6 : '<label style="color:Red">Reviewed and returned</label>',
							col7 : '<a href="#">Edit</a>, <a href="#">View comments</a>,<a href="#">Submit as it is</a>'
						},
						{
							col1 : 3,
							col2 : 'EN1233',
							col3 : 'Mock Exam 3',
							col4 : '02/02/2014',
							col5 : 'School',
							col6 : '<label style="color:Green">To be published</label>',
							col7 : '<a href="#">View</a>, <a href="#">Copy</a>, <a href="#">Print</a>',
						},
						{
							col1 : 3,
							col2 : 'EN1233',
							col3 : 'Mock Exam 3',
							col4 : '02/02/2014',
							col5 : 'School',
							col6 : '<label style="color:Green">Published</label>',
							col7 : '<a href="#">View</a>, <a href="#">Copy</a>, <a href="#">Print</a>',
						} ];
				var rows = 10;
				for (var i = 0, l = data_list1.length; i < rows; i++) {
					data1.items.push(dojo.mixin({
						id : i + 1
					}, data_list1[i % l]));
				}
				var store = new dojo.data.ItemFileWriteStore({
					data : data1
				});

				/*set up layout*/
				var layout = [ [ {
					'name' : 'S.No.',
					'field' : 'id',
					'width' : 'auto'
				}, {
					'name' : 'Exam no.',
					'field' : 'col2',
					'width' : 'auto'
				}, {
					'name' : 'Exam name',
					'field' : 'col3',
					'width' : 'auto'

				}, {
					'name' : 'Date modified',
					'field' : 'col4',
					'width' : 'auto'
				}, {
					'name' : 'Exam Type',
					'field' : 'col5',
					'width' : 'auto'
				}, {
					'name' : 'Status',
					'field' : 'col6',
					'width' : 'auto'
				}, {
					'name' : 'Action',
					'field' : 'col7',
					'width' : 'auto'
				} ] ];

				/*create a new grid:*/
				var grid1 = new dojox.grid.EnhancedGrid({
					id : 'grid1',
					store : store,
					structure : layout,
					rowSelector : '20px',
					escapeHTMLInData : false
				}, document.createElement('div'));

				/*append the new grid to the div*/
				dojo.byId("submittedGrid").appendChild(grid1.domNode);

				/*Call startup() to render the grid*/
				grid1.startup();
			});
	/* Results*/
	dojo.addOnLoad(function() {

		/*set up data store*/
		var data2 = {
			identifier : 'id',
			items : []
		};
		var data_list2 = [ {
			col1 : 1,
			col2 : 'EN1231',
			col3 : 'Mock Exam 1',
			col4 : '23/01/2014',
			col5 : 200,
			col6 : 150,
			col7 : 100,
			col8 : 85,
			col9 : 60,
			col10 : 35
		}, {
			col1 : 2,
			col2 : 'EN1232',
			col3 : 'Mock Exam 2',
			col4 : '31/01/2014',
			col5 : 200,
			col6 : 180,
			col7 : 100,
			col8 : 80,
			col9 : 65,
			col10 : 45
		}, {
			col1 : 3,
			col2 : 'EN1233',
			col3 : 'Mock Exam 3',
			col4 : '02/02/2014',
			col5 : 200,
			col6 : 190,
			col7 : 100,
			col8 : 85,
			col9 : 70,
			col10 : 55
		}, {
			col1 : 3,
			col2 : 'EN1233',
			col3 : 'Mock Exam 3',
			col4 : '02/02/2014',
			col5 : 100,
			col6 : 50,
			col7 : 100,
			col8 : 55,
			col9 : 30,
			col10 : 10
		} ];
		var rows = 10;
		for (var i = 0, l = data_list2.length; i < rows; i++) {
			data2.items.push(dojo.mixin({
				id : i + 1
			}, data_list2[i % l]));
		}
		var store = new dojo.data.ItemFileWriteStore({
			data : data2
		});

		/*set up layout*/
		var layout = [ [ {
			'name' : 'S.No.',
			'field' : 'id',
			'width' : 'auto'
		}, {
			'name' : 'Exam no.',
			'field' : 'col2',
			'width' : 'auto'
		}, {
			'name' : 'Exam name',
			'field' : 'col3',
			'width' : 'auto'

		}, {
			'name' : 'Date published',
			'field' : 'col4',
			'width' : 'auto'
		}, {
			'name' : 'Student circulated',
			'field' : 'col5',
			'width' : 'auto'
		}, {
			'name' : 'Student attempted',
			'field' : 'col6',
			'width' : 'auto'
		}, {
			'name' : 'Total marks',
			'field' : 'col7',
			'width' : 'auto'
		}, {
			'name' : 'Highest',
			'field' : 'col8',
			'width' : 'auto'
		}, {
			'name' : 'Average',
			'field' : 'col9',
			'width' : 'auto'
		}, {
			'name' : 'Minimum',
			'field' : 'col10',
			'width' : 'auto'
		} ] ];

		/*create a new grid:*/
		var grid2 = new dojox.grid.EnhancedGrid({
			id : 'grid2',
			store : store,
			structure : layout,
			rowSelector : '20px',
			escapeHTMLInData : false
		}, document.createElement('div'));

		/*append the new grid to the div*/
		dojo.byId("resultGrid").appendChild(grid2.domNode);

		/*Call startup() to render the grid*/
		grid2.startup();
	});

	/* result dialog grid*/
	dojo.addOnLoad(function() {

		/*set up data store*/
		var data3 = {
			identifier : 'id',
			items : []
		};
		var data_list3 = [ {
			col1 : 1,
			col2 : 1001,
			col3 : 'Rohit Sharma',
			col4 : 'rohit@gmail.com',
			col5 : 'X',
			col6 : 80
		}, {
			col1 : 2,
			col2 : 1011,
			col3 : 'Virat Kohli',
			col4 : 'v.k@gmail.com',
			col5 : 'X',
			col6 : 60
		}, {
			col1 : 3,
			col2 : 1051,
			col3 : 'Yuvraj Singh',
			col4 : 'yuvi@gmail.com',
			col5 : 'X',
			col6 : 10
		} ];
		var rows = 10;
		for (var i = 0, l = data_list3.length; i < rows; i++) {
			data3.items.push(dojo.mixin({
				id : i + 1
			}, data_list3[i % l]));
		}
		var store = new dojo.data.ItemFileWriteStore({
			data : data3
		});

		/*set up layout*/
		var layout3 = [ [ {
			'name' : 'S.No.',
			'field' : 'id',
			'width' : 'auto'
		}, {
			'name' : 'Reg. no.',
			'field' : 'col2',
			'width' : 'auto'
		}, {
			'name' : 'Student name',
			'field' : 'col3',
			'width' : 'auto'

		}, {
			'name' : 'Email id',
			'field' : 'col4',
			'width' : 'auto'
		}, {
			'name' : 'Class',
			'field' : 'col5',
			'width' : 'auto'
		}, {
			'name' : 'Marks',
			'field' : 'col6',
			'width' : 'auto'
		} ] ];

		/*create a new grid:*/
		var grid3 = new dojox.grid.EnhancedGrid({
			id : 'grid3',
			store : store,
			structure : layout3,
			rowSelector : '20px',
			escapeHTMLInData : false
		}, document.createElement('div'));

		/*append the new grid to the div*/
		dojo.byId("resultDialogGrid").appendChild(grid3.domNode);

		/*Call startup() to render the grid*/
		grid3.startup();
	});
</script>
</head>
<body class="claro">
	<div id="wrapper">
		<div id="header">
			<div id="menubar"
				style="background-color: #000000; height: 30px; padding-top: 10px;">
				<table
					style="border: 0px solid #9f9f9f; width: 1050px; margin-left: 150px;"
					cellspacing="0">
					<tr>
						<td style="width: 550px;"><span class="anchor">Fingertips</span></td>
						<td style="width: 300px"><span class="anchor">Welcome!
								Bipin Kumar Joshi</span></td>
						<td><a href="#" class="anchor">Home</a></td>
						<td><a href="#" class="anchor">Profile</a></td>
						<td><a href="#" class="anchor">Logout</a></td>
					</tr>
				</table>
			</div>
			<div id="pageTitle" style="margin-top: 20px; margin-left: 150px;">
				<h1 style="color: #ffffff; padding-top: 15px">Author Dashboard</h1>
			</div>
		</div>
		<div id="content">
			<div id="TabContainer" data-dojo-type="dijit.layout.TabContainer"
				data-dojo-props="tabPosition:'left-h'" doLayout="false" >
				<div id="Tab1" style="height: auto;"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="title:'Dashboard'">
					<div id="tabHeader">
						<h2>Dashboard</h2>
					</div>
					<div id="tabBody">
						<label>Welcome, Bipin Kumar Joshi! <br> <br></label> <label>
							You can create new exam, edit or delete draft exam, view or copy
							submitted exam and view exam results.<br> <br>
						</label> <label>To see demo of how to create exam <a href="#">Click
								here </a> <br> <br>In this website you can do below:<br></label>
						<label>1. <a href="#">Create new exam</a> <br>
						</label> <label>2. <a href="#">View draft exam</a> <br></label> <label>3.
							<a href="#">View submitted exam</a> <br>
						</label> <label>4. <a href="#">View exam results</a> <br></label>
					</div>
				</div>
				<div id="Tab2" style="height: auto;"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="title:'Create Exam'">
					<div id="tabHeader">
						<h2>Create multiple choice question paper</h2>
					</div>
					<div id="tabBody">
						<label>Please fill the below exam metadata and click
							'Create' button to create new exam.<br> <br>
						</label>
						<div data-dojo-type="dijit/form/Form" id="createExamForm"
							data-dojo-id="createExamForm" encType="multipart/form-data"
							action="" method="">


							<table style="border: 0px solid #9f9f9f;" cellspacing="10">
								<tr>
									<td><label for="name">Exam name :</label></td>
									<td><input type="text" id="examName" name="examName"
										required="true" data-dojo-type="dijit/form/ValidationTextBox" /></td>
								</tr>
								<tr>
									<td><label for="examType">Exam type :</label></td>
									<td><input type="radio"
										data-dojo-type="dijit.form.RadioButton" id="examType1"
										name="examType" value="1" selected="true"> <label
										for="examType1"> School Exam </label> <input type="radio"
										data-dojo-type="dijit.form.RadioButton" id="examType2"
										name="examType" value="2"> <label for="examType2">
											Competitive Exam </label></td>
								</tr>
								<tr>
									<td></td>
									<td><label for="standard">Standard :</label> <select
										data-dojo-type="dijit/form/ComboBox" id="standard"
										name="standard" style="width: 5em">
											<option>VI</option>
											<option selected>VII</option>
											<option>VIII</option>
											<option>IX</option>
											<option>X</option>
											<option>XI</option>
											<option>XII</option>
									</select><label for="subject" style="padding-left: 20px">Subject
											:</label> <select data-dojo-type="dijit/form/ComboBox" id="subject"
										name="subject" style="width: 10em">
											<option>Physics</option>
											<option selected>Maths</option>
											<option>Chemistry</option>
											<option>English</option>
									</select><label for="chapters" style="padding-left: 20px">Chapters
											:</label> <select data-dojo-type="dijit/form/ComboBox" id="chapters"
										name="chapters" style="width: 10em">
											<option>Chapter 1</option>
											<option selected>Chapter 2</option>
											<option>Chapter 3</option>
											<option>Chapter 4</option>
									</select></td>

								</tr>
								<tr>
									<td><label for="sections">Sections :</label></td>
									<td><input type="text" id="sections" name="sections"
										required="false" data-dojo-type="dijit/form/ValidationTextBox" /><a
										id="addSection" href="#" style="padding-left: 10px">Add
											section</a></td>
								</tr>
								<tr>
									<td><label for="description">Description :</label></td>
									<td><textarea data-dojo-type="dijit.form.Textarea"
											id="description" name="description"
											style="height: 40em; width: 30em">Exam description. </textarea></td>
								</tr>
								<tr>
									<td><label for="duration">Duration :</label></td>
									<td><input data-dojo-type="dijit.form.TimeTextBox"
										data-dojo-props="value:'T16:30:00'" id="duration"
										name="duration" required="true"></td>
								</tr>
								<tr>
									<td><label for="negativeMarking">Negative marking
											:</label></td>
									<td><input type="checkbox"
										data-dojo-type="dijit.form.CheckBox" id="negativeMarking"></td>
								</tr>
							</table>

							<button data-dojo-type="dijit/form/Button" type="submit"
								name="create" value="create">Create</button>
							<button data-dojo-type="dijit/form/Button" type="reset">Reset</button>
						</div>
					</div>
				</div>
				<div id="Tab3" style="height: auto;"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="title:'Draft exams'">
					<div id="tabHeader">
						<h2>View draft papers</h2>
					</div>
					<div id="tabBody">
						<label>Below is the list of draft exams. Please do click
							edit or delete link to continue with existing drafts and detete
							the exam respectively.<br> <br>
						</label>
						<div id="draftGrid" style="height: 500px; width: 900px"></div>
					</div>

				</div>

				<div id="Tab4" style="height: auto;"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="title:'Submitted exams'">
					<div id="tabHeader">
						<h2>View submitted papers</h2>
					</div>
					<div id="tabBody">
						<label>Below is the list of submitted exames. Exam
							statuses after submission are<br> <br>1. After you
							submit the exam - Review pending,<br> 2. If reviewer returns
							the exam with review comments - Reviewed and returned,<br>
							3. If reviewer accepts the exam and yet to be published - To be
							published,<br> 4. If exam got published - Published<br>
							<br>
						</label>
						<div id="submittedGrid" style="height: 500px; width: 900px"></div>
					</div>
				</div>
				<div id="Tab5" style="height: auto;"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="title:'Results'">
					<div id="tabHeader">
						<h2>View exam results</h2>
					</div>
					<div id="tabBody">
						<label>To view complete analysis of students performance
							on partcular exam select row from the below grid and click :</label>
						<button data-dojo-type="dijit/form/Button" type="submit"
							name="viewDetails" value="viewDetails">
							View details
							<script type="dojo/method" data-dojo-event="onClick"
								data-dojo-args="evt">
        						// Show the Dialog:
       							 dijit.byId("resultDialog").show();
    						</script>
						</button>
						<label><br> <br></label>
						<div id="resultGrid" style="height: 500px; width: 900px;"></div>
					</div>
				</div>
			</div>
		</div>
		<div id="footer">
			<a href="#" class="anchor">About Us</a>
		</div>
	</div>
	<div id="resultDialog" data-dojo-type="dijit.Dialog"
		title="Result details">
		<div id="resultDialogBox" style="height: 400px; width: 900px;">

			<label><b>Exam Name :</b> Mock Exam I</label> <label
				style="padding-left: 400px"><b>Total Marks :</b> 200 <br>
				<br> </label>

			<div id="resultDialogGrid" style="height: 350px; width: 900px;"></div>
		</div>
	</div>
	</div>
</body>
</html>