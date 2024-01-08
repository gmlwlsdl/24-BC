<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>include_action.jsp에서 footer.jsp 호출</h2>
	include_action.jsp에서 출력한 메세지
	<hr>
	<jsp:include page="footer.jsp">
		<jsp:param name="email" value="admin@myserver.com" />
		<jsp:param name="tel" value="123-4567" />
	</jsp:include>
	<hr>
	include_action.jsp에서 출력한 메세지
	<hr>
	forward_action.jsp에서 출력한 메세지
	<hr>
	<jsp:forward page="forward.jsp">
		<jsp:param name="email" value="admin@myserver.com" />
		<jsp:param name="tel" value="123-4567" />
	</jsp:forward>
	<hr>
	include_action.jsp에서 출력한 메세지
</body>
</html>