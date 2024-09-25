package edu.ict.ex.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.page.PageVO;
import edu.ict.ex.service.BoardService;
import edu.ict.ex.service.DeptService;
import edu.ict.ex.service.EmpService;
import edu.ict.ex.vo.BoardVO;
import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

// RestController 란 기존의 controller의 속성과 매우다름 restful을 사용하기 위한 컨트롤러

//https://luckyguystory.tistory.com/96
//ResponseEntity<String> 객체
//@RestController : Controller가 REST 방식을 처리하기 위한 것임을 명시
//@ResponseBody : 일반적인 JSP와 같은 뷰로 전달되는 게 아니라 데이터 자체를 전달하기 위한 용도
//@PathVariable : URL 경로에 있는 값을 파라미터로 추출할 때 사용
//@CrossOrigin : Ajax의 크로스 도메인 문제를 해결해주는 어노테이션
//@RequestBody : JSON 데이터를 원하는 타입으로 바인딩 처리

@Slf4j
@RestController
@RequestMapping("/emps")
public class RestEmpController {
	@Autowired
	private EmpService empService;

	// 자바객체를 json으로 바꿔서 리턴 및 서비스 하고있음
	@GetMapping("/list")
	public List<EmpVO> list() {
		log.info("list()...");

		return empService.getList();
	}

	// 특정 게시판 번호를 받으면 해당 게시판 정보 서비스


	@DeleteMapping("/{empno}")
	public ResponseEntity<String> delete(@PathVariable int empno) {

		log.info("delete..");
		log.info("board" + empno);

		ResponseEntity<String> entity = null;

		try {
			int rn = empService.delete(empno);
			empService.delete(empno);
			entity = new ResponseEntity<String>(String.valueOf(rn), HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

		return entity;
	}

	

	
}
