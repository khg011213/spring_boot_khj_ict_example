package edu.ict.ex.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

import edu.ict.ex.vo.BoardVO;
import edu.ict.ex.vo.EmpVO;

//DeptRepository 다른이름
//@bean = @Component
//@Bean + Dao의 의미
//@Repository
//public class BoardDao {
//	
//	public List<BoardVO> boardList(){
//	      
//	      List<BoardVO> vos = new ArrayList<>();
//	      
//	      Connection connetion = null;
//	      Statement statement = null;
//	      ResultSet rs = null;
//	      
//	      String driver = "oracle.jdbc.driver.OracleDriver";
//	      String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	      String uid = "scott";
//	      String upw = "tiger";
//	      
//	      String sql = "select * from SPRING_BOARD";
//	      
//	      try{
//	    	  
//	    	  Class.forName(driver);
//	         
//	          connetion = DriverManager.getConnection(url, uid, upw);
//
//	          statement = connetion.createStatement();
//	          rs = statement.executeQuery(sql);
//
//	         
//	         while(rs.next()){
//	        			 		
//	        	int id = rs.getInt("id");
//	        	String content = rs.getString("content");
//	        	String title = rs.getString("title");
//	        	String nickname = rs.getString("nickname");
//	        	
//	        	System.out.println(content);
//	        	
//	        	// VO를 안쓰는 방식
//	        	
////	        	HashMap<String, List<?>> map = new HashMap<>();
////	        	List<String> test = new ArrayList<>();
////	        	
////	        	map.put("키값", test);
//	        	
//	        	// VO를 쓰는 방식
//	            
//	        	BoardVO dto = new BoardVO( id , content , title,nickname);
//	        	
//	            vos.add(dto);
//	         }         
//	         
//	      }catch(Exception e){
//	         e.printStackTrace();
//	      }
//	      finally{
//	         
//	         try{
//	            if(rs != null) 
//	               rs.close();
//	            
//	            if(statement != null) 
//	               statement.close();
//	            
//	            if(connetion != null) 
//	               connetion.close();
//	         } catch(Exception e){}
//	         
//	      }
//	      
//	      return vos;
//	      
//	   }
//	
//	
//	
//}
