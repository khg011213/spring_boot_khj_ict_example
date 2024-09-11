package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.ict.ex.service.EmpService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/emp")
@RequiredArgsConstructor
public class EmpController {

	private final EmpService empService; 
	
	@GetMapping("/list")
	public String getMethodName(Model model) {
		
		System.out.println("list()..");
		model.addAttribute("empList", empService.getList() );
		
		return "emp/list";
	}
	
}
