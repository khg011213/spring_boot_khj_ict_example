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
	<h1>절대 경로 상대경로 테스트</h1>
	
	<!-- jsp에서 스프링에서의 절대경로는 앞에 /가 붙으면 절대 경로 안붙으면 상대 경로 
	절대경로와 상대경로는 스프링에서 붙여주는게 다르다. 
	  ${pageContext.request.contextPath} 는 해당 프로젝트의 이름을 말한다-->
	
	<img src="eshopper/images/404/404.png"><br>
	
	<img src="${pageContext.request.contextPath}/eshopper/images/404/404.png">
	
</body>
</html>