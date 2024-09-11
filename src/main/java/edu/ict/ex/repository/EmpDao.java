package edu.ict.ex.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import edu.ict.ex.vo.EmpVO;

//DeptRepository 다른이름
//@bean = @Component
//@Bean + Dao의 의미
@Repository
public class EmpDao {
	
	public List<EmpVO> empSelect(){
	      
	      List<EmpVO> vos = new ArrayList<>();
	      
	      Connection connetion = null;
	      Statement statement = null;
	      ResultSet rs = null;
	      
	      String driver = "oracle.jdbc.driver.OracleDriver";
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";
	      String uid = "scott";
	      String upw = "tiger";
	      
	      String sql = "select * from emp";
	      
	      try{
	    	  
	    	  Class.forName(driver);
	         
	          connetion = DriverManager.getConnection(url, uid, upw);

	          statement = connetion.createStatement();
	          rs = statement.executeQuery(sql);

	         
	         while(rs.next()){
	        			 		 
	            EmpVO dto = new EmpVO.Builder()
	            		.setEmp(rs.getInt("empno"))
	            		.ename(rs.getString("ename"))
	            		.job(rs.getString("job"))
	            		.mgr(rs.getInt("mgr"))
	            		.date(rs.getDate("HIREDATE"))
	            		.sal(rs.getInt("sal"))
	            		.comm(rs.getInt("comm"))
	            		.deptno(rs.getInt("deptno"))
	            		.Build();
	            
	            System.out.println(dto.toString());
	            
	            
	            vos.add(dto);
	         }         
	         
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	      finally{
	         
	         try{
	            if(rs != null) 
	               rs.close();
	            
	            if(statement != null) 
	               statement.close();
	            
	            if(connetion != null) 
	               connetion.close();
	         } catch(Exception e){}
	         
	      }
	      
	      return vos;
	      
	   }
	
	
	
}
