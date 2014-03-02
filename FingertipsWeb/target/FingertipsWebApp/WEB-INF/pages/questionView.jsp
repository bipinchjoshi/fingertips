<!doctype html>
<html>
<head>
<script src="/FingertipsWebApp/js/question.js"></script>
<script src="./js/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		
		if($('input#questionNumberCount').val()==1){
			$("#back").hide();
		}
		
		$("#back").click(function() {
			$("#form1").attr('action', '/FingertipsWebApp/question/back');
		});
		
		$("#next").click(function() {
			
			if (!$("input[name='correctOption']:checked").val()) {
				alert('Please select the correct Option!');
			return false;
			}
				
			
			$("#form1").attr('action', '/FingertipsWebApp/qu/next');
		});
	});

	function changeAction() {
		
	}
</script>
<meta charset="utf-8">
<title>Question</title>
</head>

<body>
	<div id="main">
	  <form id="form1" name="form1" method="post" action="questionNext">
			<p>&nbsp;</p>
		<p>
				<input type="hidden" value="${questionNumberCount}"
					id="questionNumberCount" name="questionNumberCount"> <label
					for="Question">Question:</label>${questionNumberCount}

		  </p>

			<table width="522" height="411" border="0">
				<tr>
					<td width="48">&nbsp;</td>
					<td width="338"><textarea name="question" cols="50" rows="4"
							id="question">${question} </textarea></td>
					<td width="122" >
						<p>
						

						<p>
							<br>
						</p>
						<p>&nbsp;</p>
						<p>

						</p>
						</p>
					</td>
				</tr>
				<tr>
					<td height="45">&nbsp;</td>
					<td><p>Options</p></td>
				</tr>
				<tr>
					<td height="38">&nbsp;</td>
					<td>A <textarea name="optionA" id="optionA">${optionA}</textarea></td>
                    <td><input type="radio" name="correctOption" value="1" id="RadioGroup_1"> </td>
				</tr>
				<tr>
					<td height="38">&nbsp;</td>
					<td>B <textarea name="optionB" id="optionB">${optionB}</textarea></td>
					<td><input type="radio" name="correctOption" value="2" id="RadioGroup_1"> </td>
                </tr>
				<tr>
					<td height="38">&nbsp;</td>
					<td>C <textarea name="optionC" id="optionC">${optionC}</textarea></td>
					<td><input type="radio" name="correctOption" value="3" id="RadioGroup_1"> </td>
                </tr>
				<tr>
					<td height="38">&nbsp;</td>
					<td>D <textarea name="optionD" id="optionD">${optionD}</textarea></td>
					<td><input type="radio" name="correctOption" value="4" id="RadioGroup_1"> </td>
                </tr>
				<tr>
					<td height="38">&nbsp;</td>
					<td>&nbsp;</td>
                    <td>&nbsp;</td>
				</tr>
				<tr>
					<td height="89">&nbsp;</td>
					<td>&nbsp;</td>
                    <td><input type="submit" name="back" id="back" value="Back"> 
                    	<input type="submit" name="next" id="next" value="Next">
                    </td>
				</tr>
			</table>
			<p>&nbsp;</p>
			<p>&nbsp;</p>
			<p>&nbsp;</p>
			<p>&nbsp;</p>
			<p>&nbsp;</p>
			<p>&nbsp;</p>


	  </form>



	</div>
</body>
</html>
