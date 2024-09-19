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
		</tr>
		<c:forEach var="emp" items="${empList}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.job}</td>
				<td>${emp.mgr}</td>
				<td>${emp.hiredate}</td>
				<td><fmt:formatNumber value="${emp.sal}" type="number"/></td>
				<td>${emp.comm}</td>
				<td>${emp.deptno}</td>
			</tr>
		</c:forEach>
	</table>
	
	 <c:if test="${pageMaker.prev}">
      <a href="list2${pageMaker.makeQuery(pageMaker.startPage - 1) }">  << < </a>
   </c:if>
   
   <c:forEach var="idx" begin="${pageMaker.startPage}" end="${pageMaker.endPage}" >
      <a href="list2${pageMaker.makeQuery(idx)}">${idx}</a>
   </c:forEach>
   
   
   <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
      <a href="list2${pageMaker.makeQuery(pageMaker.endPage + 1) }"> >> </a>
   </c:if>
	<a href="/emp/form_view">신규사원등록</a>
</body>
</html>