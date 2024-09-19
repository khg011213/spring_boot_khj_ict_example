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

		<form action="${pageContext.request.contextPath}/emp/form" method="post">
			사원 번호 <input type="text" name="empno" /><br> 
			이름<input type="text" name="ename" /><br> 
			직업<input type="text" name="job" /><br>
			관리자       
				<select name="mgr">
         			<c:forEach var="emp" items="${emplist}">
            			<option value="${emp.empno}">(${emp.empno})${emp.ename}</option>
         			</c:forEach>
      			</select><br>

			고용일자<input type="date" name="hiredate" /><br> 
			급여<input type="text" name="sal" /><br> 보너스<input type="text" name="comm" /><br>
			부서번호 
				<select name="deptno">
         			<c:forEach var="dept" items="${deptList}">
            			<option value="${dept.deptno}">(${dept.deptno})${dept.dname}</option>
         			</c:forEach>
      			</select><br>
			<input type="submit" value="제출"><br>
		</form>
</body>
</html>