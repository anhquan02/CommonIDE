<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/CommonIDE/upload" method="post" enctype="multipart/form-data">
		<input name="fullname" placeholder="Fullname"><br>
		<input name="photo" type="file"><br>
		<button>Upload</button><br>		
	</form>
	
</body>
</html>