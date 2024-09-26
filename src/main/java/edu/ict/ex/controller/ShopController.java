package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.page.PageVO;
import edu.ict.ex.service.DeptService;
import edu.ict.ex.service.EmpService;
import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/eshopper")
public class ShopController {

	@Autowired
	private EmpService empService; 
	
	
	@GetMapping("/index")
	public String list7(Model model) {
		model.addAttribute("empList", empService.getEmpDeptSalgrade());
		
		return "eshopper/index";
	}
	
	@GetMapping("/login2")
	public String ehoplogin(Model model) {
		log.info("login()...");
		return "eshopper/login";
	}
}
