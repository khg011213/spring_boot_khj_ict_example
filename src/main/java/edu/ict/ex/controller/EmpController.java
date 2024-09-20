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

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService; 
	
	@Autowired
	private DeptService deptService;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		System.out.println("list()..");
		model.addAttribute("empList", empService.getList() );
		
		return "emp/list";
	}
	
	@GetMapping("/list3")
	public String list3(Model model) {
		
		System.out.println("list3()..");
		model.addAttribute("empList", empService.getEmpDeptList() );
		
		return "emp/list3";
	}
	
	@GetMapping("/list4")
	public String list4(Model model) {
		
		System.out.println("list4()..");
		model.addAttribute("empDeptList", empService.getDeptEmpList() );
		
		return "emp/list4";
	}
	
	@GetMapping("/list5")
	public String list5(Model model) {
		
		System.out.println("list5()..");
		model.addAttribute("empList", empService.getEmpOneDeptList() );
		
		return "emp/list5";
	}
	
	@GetMapping("/form_view")
	public String BoardWrite_view(Model model) {
		model.addAttribute("emplist", empService.getList());
		model.addAttribute("deptList" , deptService.getList());
		return "emp/form_view";
	}
	
	
	@PostMapping("/form")
	public String getEmpForm(EmpVO empVO ) {
		System.out.println("insert()...");
		System.out.println(empVO);
			empService.insert(empVO);
			return "redirect:/emp/list";
	}
	
	@GetMapping("/list2")
	public String getPaging(Criteria criteria ,Model model) {

		System.out.println("list()2..");
		model.addAttribute("empList", empService.getListWithPaging(criteria));
		int total = empService.getTotal();
		model.addAttribute("pageMaker" , new PageVO(criteria,total));
		
		System.out.println(new PageVO(criteria,total));

		
		return "emp/list2";
	}
	
	@GetMapping("/salgrade")
	public String salgrade(Model model) {
		
		System.out.println("salgrade()..");
		model.addAttribute("EmpSalList", empService.getEmpSalList() );
		
		return "emp/salgrade";
	}
	
	@GetMapping("/salgrade2")
	public String salgrade2(Model model) {
		
		System.out.println("salgrade2()..");
		model.addAttribute("EmpSalList", empService.getSalGradeList() );
		
		return "emp/salgrade2";
	}
	
	@GetMapping("/info")
	public String getinfo(Model model) {
		
		System.out.println("salgrade()..");
		model.addAttribute("getInfo", empService.getInfo() );
		
		return "emp/info";
	}
	
	@GetMapping("/info2")
	public String getinfoTable(Model model) {
		
		System.out.println("salgrade()..");
		model.addAttribute("getInfo", empService.getInfoTable() );
		
		return "emp/info2";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		
		int empno = id;
		
		empService.delete(empno);
		return "redirect:/emp/list4";
	}
}
