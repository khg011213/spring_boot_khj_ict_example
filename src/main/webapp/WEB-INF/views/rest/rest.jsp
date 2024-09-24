<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script src="${pageContext.request.contextPath}/eshopper/js/board.js"></script>

<script type="text/javascript">
$(document).ready(function() {
    let board = boardService();
});
       //board.get(1021);
      
      let boardObj = {
    	 
         bname : "아하",
         btitle : "음매에~~~",
         bcontent : "내용",
         //bid:2084
      }
      
      //board.add(boardObj);
      //board.del(1500);
      //board.del(2085);
      
      board.updateboard(boardObj);
      //board.insertReply(boardObj);
   }); 

</script>


   

</head>
<body>
   <h1>Restful 게시판 연습</h1>
   
	<table width="500" cellpadding="0" cellspacing="0" border="1" id="list-table">
      <tr>
         <td>글번호</td>
         <td>작성자</td>
         <td>제목</td>
         <td>날짜</td>
         <td>조회수</td>                  
      </tr>
      <tr>
      	<td colspan="5"><a href="write_view">글쓰기</a></td>
      
      </tr>
   </table>
   
   
</body>
</html>