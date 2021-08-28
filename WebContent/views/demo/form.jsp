<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo</title>
</head>
<body>
	<form action="/CommonIDE/demo.php" method="post">
	<input name="fullname" placeholder="Fullname"><br>
	<select name="cboCountry">
		<option>US</option>
		<option>VN</option>
		<option>USA</option>
	</select>
	<br>
	<input type="radio" name = "rdoGender" value="Male">Male
	<input type="radio" name = "rdoGender" value="Female">Female<br>
	<input type="checkbox" name = "chkSingle"  value="Single">Single<br>
	<input type="checkbox" name = "englishSkill" value="Reading">Reading<br>
	<input type="checkbox" name = "englishSkill" value="Writting">Writting<br>
	<input type="checkbox" name = "englishSkill" value="Listening">Listening<br>
	<input type="checkbox" name = "englishSkill" value="Speaking">Speaking<br>
	<button name="btnSubmit">Submit</button><br>
	</form>
</body>
</html>