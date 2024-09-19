<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>emp 리스트</h1>
	
	<table border="1">
		<tr>
			<td>이름</td>
			<td>급여</td>
			<td>등급</td>
		</tr>
		<!-- 우선 empDeptList 에서 깂을 받아오고 그 받아온 값 안에있는 empDept.empList 를 다시 for each문으로 돌린다 -->
		<c:forEach var="sal" items="${EmpSalList}">
			<c:forEach var = "emp" items="${sal.empList}">
				<tr>
					<td>${emp.ename}</td>
					<td><fmt:formatNumber value="${emp.sal}" type="number"/></td>
					<td>${sal.grade}</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>
</body>
</html>