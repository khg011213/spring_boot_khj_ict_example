package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;
import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmpMapperTest {
	
	@Autowired
	EmpMapper empMapper;

	@Test
	@Disabled
	void testgetList() {
		for (EmpVO vo : empMapper.getList()) {
			System.out.println(vo);
		}
	}
	
	@Test
	@Disabled
	void testInsert() {
		  EmpVO emp = new EmpVO();
	      emp.setEmpno(2001);
	      emp.setEname("홍길동");
	      emp.setJob("CLERK");
	      emp.setMgr(7369);
	      emp.setHiredate2("2024-09-24");
	      emp.setComm(800);
	      emp.setSal(2000);
	      emp.setDeptno(10);
	      
	      empMapper.insert(emp);
	      
	      
	      for(EmpVO vo : empMapper.getList()) {
	         System.out.println(vo);
	      }      
	   }

	@Test
	void testGetListWithPaging() {
		Criteria criteria = new Criteria();
		criteria.setAmount(10);
		criteria.setPageNum(2);
		List<EmpVO>list = empMapper.getListWithPageing(criteria);

		System.out.println(list);
	}

}
