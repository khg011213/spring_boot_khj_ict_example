package edu.ict.ex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.ict.ex.security.CustomUserDetailsService;

@Configuration // @Component + 설정
@EnableWebSecurity // 필터 등록 = 시큐리티 설정 파일이다 라고 알려주는 역활
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Override
	public void configure(WebSecurity web) throws Exception {

		// web.ignoring().regexMatchers(PathRequest.toStaticResources().atCommonLocations());
		web.ignoring().antMatchers("/css/**", "/js/**", "/images/**", "/lib/**", "/img/**", "/lib/**");
	}

	// 테스트용 유저 등록 = 인메모리 방식
//	@Override
//	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//		.withUser("user").password("{noop}user").roles("USER")
//		.and()
//		.withUser("admin").password("{noop}admin").roles("ADMIN")
//		.and()
//		.withUser("manager").password("{noop}manager").roles("ADMIN");
//	}
//
//	//user의 권한으 가지고 있으면 board에 admin의 권한이 있으면 boards에
//	// 접근가능
//	// 권한 설정
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 우선 CSRF설정을 해제한다.
		 //초기 개발시만 해주는게 좋다.
		http.csrf(csrf -> csrf.disable());

		http.authorizeHttpRequests()
		.antMatchers("/board/**").hasAnyRole("USER")
		.antMatchers("/boards/**").hasAnyRole("ADMIN")
		.antMatchers("/**").permitAll(); //permitAll을 사용하면 위에 둘을 제외한 것을 
		
		//로그인폼 커스터마이징
		//http.formLogin(); // 스프링 시큐리티에 있는 기본 로그인 폼을 사용하겠다.
		http.formLogin()
		.loginPage("/login")  //로그인 할 페이지 url임
		.usernameParameter("id")
		.passwordParameter("pw")
		.defaultSuccessUrl("/"); //완료후 갈 주소
		
	}
	
	  @Override
	   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	       
//	      auth.inMemoryAuthentication()
//	           .withUser("user").password("{noop}user").roles("USER").
//	           and()
//	           .withUser("admin").password("{noop}admin").roles("ADMIN");
	      
	      auth.userDetailsService(customUserDetailsService)
	            .passwordEncoder(passwordEncoder());
	   
	   }

	
	  @Bean
	    public PasswordEncoder passwordEncoder() {        
	      return new BCryptPasswordEncoder();
	    }
	

}
