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
		<table border="1">
			<tr>
				<td>사원 번호 <input type="text" name="empno"/></td>
				<td>이름<input type="text" name="ename"/></td>
				<td>직업<input type="text" name="job"/></td>
				<td>관리자
					<select name="mgr">
						<option value = "7902">7902</option>
						<option value = "7698">7698</option>
						<option value = "7839">7839</option>
						<option value = "7566">7566</option>
						<option value = "7782">7782</option>
					</select>		
				</td>
				<td>고용일자<input type="date" name="date"/></td>
				<td>급여<input type="text" name="sal"/></td>
				<td>보너스<input type="text" name="comm"/></td>
				<td>부서번호
					<select name="deptno">
						<option value = "10">10</option>
						<option value = "20">20</option>
						<option value = "30">30</option>
						<option value = "40">40</option>
					</select>	
				</td>
				<td> <input type="submit" value="제출"> </td>
			</tr>	
		</table>
	</form>
</body>
</html>