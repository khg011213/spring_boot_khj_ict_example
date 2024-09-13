package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.ict.ex.service.EmpService;
import edu.ict.ex.vo.BoardVO;
import edu.ict.ex.vo.EmpVO;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService; 
	
	@GetMapping("/list")
	public String getMethodName(Model model) {
		
		System.out.println("list()..");
		model.addAttribute("empList", empService.getList() );
		
		return "emp/list";
	}
	
	@GetMapping("/form_view")
	public String BoardWrite_view() {
		return "emp/form_view";
	}
	
	
	@PostMapping("/form")
	public String getEmpForm(EmpVO empVO ) {
		System.out.println("insert()...");
			empService.insert(empVO);
			return "redirect:/emp/list";
	}
	
}
