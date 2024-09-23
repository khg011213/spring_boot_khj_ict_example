<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script type="text/javascript">
	/* ajax는 비동기 통신 간단하게는 제이슨 받아오는 거 */

	$(document).ready(function(){
		function list(){
			$.ajax({
				
				type:"GET",
				url:"${pageContext.request.contextPath}/boards/list",
				success : function(result){
					console.log(result);
				},
				error:function(e){
					console.log(e);
				}
				
			});
		}
		
		list();
	});
	


</script>
</head>
<body>
	<h1>restful 게시판 연습</h1>
	
		
	
	
	
	
</body>
</html>