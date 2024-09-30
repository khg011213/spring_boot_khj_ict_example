package edu.ict.ex.controller;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.ict.ex.service.TransactionService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/tx")
public class TransactionTestController {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/{num}")
	public String test(@PathVariable int num ) throws SQLException {
		
		System.out.println("테스트 번호 : " + num);
		
		if(num == 1) {
			transactionService.txTest1();
		}
		if(num == 2) {
			transactionService.txTest2();
		}
		
		if(num == 3) {
			transactionService.txTest3();
		}
		
		return "redirect:/boards/rest";
	}
	
	
}
