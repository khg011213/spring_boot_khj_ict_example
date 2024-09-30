package edu.ict.ex.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

	
//	@GetMapping("/login")
//	public String login(Model model) {
//		log.info("login()...");
//		return "/eshopper/login";
//	}
	
	@GetMapping("/login")
	public String login(Model model) {
		log.info("login()...");
		return "/login/login";
	}
	
	@GetMapping("/loginInfo")
	public String loginInfo(Authentication authentication , Principal principal, Model model) {
		log.info("loginInfo()...");
		
		if(principal != null) {
			System.out.println(principal);
			System.out.println(principal.getName());
			System.out.println(principal);
		}
		
		if(authentication != null) {
			System.out.println(authentication);
			System.out.println(authentication.getName());
			System.out.println(authentication.getAuthorities());
		}
		
		// 정보를 수정 후 변경된 회원정보를 업데이트 하기 위해서 사용하는 방법
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		System.out.println(auth.getName());
		System.out.println(auth.getAuthorities());
		
		return "redirect:/";
	}
	
}
