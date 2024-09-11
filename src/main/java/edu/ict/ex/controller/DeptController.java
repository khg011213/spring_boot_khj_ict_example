package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.ict.ex.service.DeptService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/dept")
@RequiredArgsConstructor
public class DeptController {
	
	private final DeptService deptService; 
	
	@GetMapping("/list")
	public String getMethodName(Model model) {
		
		System.out.println("list()..");
		model.addAttribute("deptList", deptService.getList() );
		
		return "dept/list";
	}
	
}
