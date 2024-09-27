package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.ict.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	
	@Disabled
	@Test
	void testUserMapper() {
		assertNotNull(userMapper); //null인지 아닌지 테스트용 
	}
	
	
	@Disabled
	@Test
	void testGetUser() {
		UserVO user = userMapper.getUser("user"); //null인지 아닌지 테스트용 
		assertNotNull(user);
		
		System.out.println(user);
	}

	//단방향(MD5, SHA등 )은 암호화는 가능해도 복호화는 불가 해킹 어려워서 많이 씀
	//양방향(AES,RSA,DES등) 은 암호화 복호화가 가능한것
	
	@Autowired
	   private PasswordEncoder passwordEncoder;
	   
	
	   @Test
	   void testInsertUser() {
	      
	      UserVO user = new UserVO();
	      user.setUsername("admin3");
	      user.setPassword(passwordEncoder.encode("admin3"));
	      user.setEnabled("1");
	      
	      userMapper.insertUser(user);
	      userMapper.insertAuthorities(user);      
	         
	      assertNotNull(user);
	      
	      System.out.println(user);

	}
	   
	   
	   @Test
	   @Disabled
	   void testMatcher() {
	      
	      UserVO user = userMapper.getUser("admin2");
	      boolean isMatch = passwordEncoder.matches("admin2", user.getPassword());
	      
	      
	      System.out.println(user.getPassword());
	      assertEquals(isMatch, true);
	}
	  
	   @Test
	   void testUser2() {
		      
		      UserVO user = userMapper.getUser("user2");
		      boolean isMatch = passwordEncoder.matches("user2", user.getPassword());
		      
		      
		      System.out.println(user.getPassword());
		      assertEquals(isMatch, true);
		}

}
