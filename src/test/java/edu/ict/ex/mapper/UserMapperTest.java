package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	void testUserMapper() {
		assertNotNull(userMapper); //null인지 아닌지 테스트용 
	}
	
	@Test
	void testGetUser() {
		UserVO user = userMapper.getUser("user"); //null인지 아닌지 테스트용 
		assertNotNull(user);
		
		System.out.println(user);
	}

}
