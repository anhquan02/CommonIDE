<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Xin chào mọi người</h1>
	<h4>${Message}</h4>
	${pageScope.Message}
	<jsp:include page="upload.jsp">
		<jsp:param value="Quân" name="fullname"/>		
	</jsp:include>
	${pageScope.Message}
	
	
</body>
</html>