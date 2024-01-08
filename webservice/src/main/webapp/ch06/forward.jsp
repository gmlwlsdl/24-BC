<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	forward.jsp에서 출력한 메세지
	<br>
	Email : <%= request.getParameter("email") %>
	Tel : <%= request.getParameter("tel") %>
</body>
</html>