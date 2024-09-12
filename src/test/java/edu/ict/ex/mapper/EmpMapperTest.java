package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmpMapperTest {
	
	@Autowired
	EmpMapper empMapper;

	@Test
	void testgetList() {
		for (EmpVO vo : empMapper.getList()) {
			System.out.println(vo);
		}
	}

}
