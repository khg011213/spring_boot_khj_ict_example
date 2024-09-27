package edu.ict.ex.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import edu.ict.ex.mapper.UserMapper;
import edu.ict.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserMapper userMapper;
	
	
	
	//user의 정보를 주고받기 위한 Fax = UserDetailsService
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.warn("Load User By UserVO user : " + username);
		
		
		//로그인 화면에서 값을 받아서 내 db의 username과 비교한다 그후 존재하는 username이면 UserDetailsVO에 들어가서 로그인 로직 구현
		UserVO user = userMapper.getUser(username);
		
		log.warn("queried by UserVO mapper : " + user);
		
		
		return user == null ? null : new UserDetailsVO(user);
	}
	
	
}
