<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>dept 리스트</h1>
	
	<table border="1">
		<tr>
			<td>부서번호</td>
			<td>이름</td>
			<td>지역</td>
		</tr>
		<c:forEach var="dept" items="${deptList}">
			<tr>
				<td>${dept.deptno}</td>
				<td>${dept.dname}</td>
				<td>${dept.loc}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>