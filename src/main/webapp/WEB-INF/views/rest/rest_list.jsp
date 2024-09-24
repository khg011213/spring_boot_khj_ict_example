<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script src="${pageContext.request.contextPath}/eshopper/js/board.js"></script>

<script type="text/javascript">
$(document).ready(function() {
	$.ajax({
		type: "GET",
		url: "/boards/list",
		success: function(result) {
			console.log(result);
			
			let htmls="";
			
			$("#list-table").html('');
			
			  $("<tr>" , {
		            html : "<td>" + "번호" + "</td>"+  // 컬럼명들
		                  "<td>" + "이름" + "</td>"+
		                  "<td>" + "제목" + "</td>"+
		                  "<td>" + "날짜" + "</td>"+            
		                  "<td>" + "히트" + "</td>"
		         }).appendTo("#list-table") // 이것을 테이블에 붙임
	 		
		         if(result.length <1){
		        	 htmls.push("등록된 댓글이 없습니다.");
		         }else{
		        	 $(result).each(function(){
		        		 htmls +='<tr>';
		        		 htmls += '<td>' + this.bid + '</td>';
		        		 htmls += '<td>'
		        		 for(let i = 0; i<this.bindent; i++){
		        			 htmls += '-'
		        		 }
		        		 htmls += '<a href = "/rest_content_view.html?bid=' + this.bid + '">' + this.btitle + '</a></td>';
		        		 htmls += '<td>' + this.bdate + '</td>';
		        		 htmls += '<td>' + this.bhit + '</td>';
		        		 htmls += '<td>'+ '<input id=' + this.bid + " type='button' class='btn_delete' value='삭제'>" + '</td>';
		        		 htmls +='</tr>';
		        	 }); //each end
		        	 
		               htmls+='<tr>';
		               htmls+='<td colspan="5"> <a href="/write_view">글작성</a> </td>';                         
		               htmls+='</tr>'; 
		         }
			  $('#list-table').append(htmls);
		         
		},
		error: function(e) {
			console.log(e);
		}

	});
	
	

	
	
});


</script>
<!-- arrt은 호출한놈에 들어있는 놈 -->
<script type="text/javascript">
$(document).ready(function(){
	$(document).on("click","#list-table .btn_delete", function(){
		console.log($(this).attr("id"));
		
		$(this).parent().parent().remove(); // html을 삭제 시켜줘서 버튼을 누르면 html은 사라짐 하지만 db는 그대로
		
		let board = boardService();
		
		board.del($(this).attr("id")); //ajax를 이용해서 db데이터를 삭제시킴
	});

 
});

</script>


</head>
<body>
	<h1>Restful 게시판 연습</h1>

	<table id="list-table" width="500" cellpadding="0" cellspacing="0"
		border="1">

	</table>


</body>
</html>