package edu.ict.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpVOTest {

	@Test
	void testEmpVO() {
		EmpVO empVO = new EmpVO();
		
		empVO.setComm(1000);
		System.out.println(empVO.getComm());
	}

}
