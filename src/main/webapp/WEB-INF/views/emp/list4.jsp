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
			<td>사원 번호</td>
			<td>이름</td>
			<td>직업</td>
			<td>관리자</td>
			<td>고용일자</td>
			<td>급여</td>
			<td>보너스</td>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>지역</td>
		</tr>
		<!-- 우선 empDeptList 에서 깂을 받아오고 그 받아온 값 안에있는 empDept.empList 를 다시 for each문으로 돌린다 -->
		<c:forEach var="empDept" items="${empDeptList}">
			<c:forEach var = "emp" items="${empDept.empList}">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.mgr}</td>
					<td>${emp.hiredate}</td>
					<td><fmt:formatNumber value="${emp.sal}" type="number"/></td>
					<td>${emp.comm}</td>
					<td>${empDept.deptno}</td>
					<td>${empDept.dname}</td>
					<td>${empDept.loc}</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>
	<a href="/emp/form_view">신규사원등록</a>
</body>
</html>