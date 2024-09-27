package edu.ict.ex.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import edu.ict.ex.vo.UserVO;


//마이바티스용 인터페이스라는걸 알려주는 어노테이션
@Mapper
public interface UserMapper {
	
	UserVO getUser(String username);
	
	
	 @Insert("insert into users(username,password) VALUES (#{username},#{password})")
	   int insertUser(UserVO userVO);
	   
	   @Insert("insert into authorities(username,authority) values(#{username},'ROLE_USER')")
	   int insertAuthorities(UserVO userVO);

}
