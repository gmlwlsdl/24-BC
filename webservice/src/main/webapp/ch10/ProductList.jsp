<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<jsp:useBean id="product" class="myapp.Product" scope="session" />

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		text-align:center;
	}
</style>
</head>
<body>
	<h2>EL 예제 - 상품 목록</h2>
	<hr>
	<form name=form1 method=post action=ProductSel.jsp>
		<select name="sel">
			<%-- <% 
				for (String item:product.getList())
					out.println("<option>" + item + "</option>");
			%> --%>
			<c:forEach items="${product.list}" var="item" >
				<option>${item}</option>
			</c:forEach>
		</select>
		<input type=submit value="선택" />
	</form>
</body>
</html>