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
			<td>사원번호</td>
			<td>이름</td>
			<td>급여</td>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>지역</td>
			<td>등급</td>
		</tr>
		<!-- 우선 empDeptList 에서 깂을 받아오고 그 받아온 값 안에있는 empDept.empList 를 다시 for each문으로 돌린다 -->
		<c:forEach var="vo" items="${empList}">
			<tr>
				<td>${vo.emp.empno}</td>
				<td>${vo.emp.ename}</td>
				<td><fmt:formatNumber value="${vo.emp.sal}" type="number"/></td>
				<td>${vo.dept.deptno}</td>
				<td>${vo.dept.dname}</td>
				<td>${vo.dept.loc}</td>
				<td>${vo.salgrade.grade}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>