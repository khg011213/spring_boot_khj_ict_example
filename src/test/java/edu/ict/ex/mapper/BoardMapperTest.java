package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardMapperTest {

	@Autowired
	private BoardMapper boardMapper;
	
	@Disabled
	@Test
	void test() {
		System.out.println(boardMapper.getList());
		for (BoardVO vo : boardMapper.getList()) {
			System.out.println(vo);
		}
	
	}
	@Disabled
	@Test
	void testRead() {
		System.out.println(boardMapper.read(20));

		}
	@Disabled
	@Test
	void testDelete() {
		
		int count = boardMapper.delete(19);
		
		System.out.println("삭제된 갯수" + count);
		
		if(boardMapper.read(19) == null) {
			System.out.println("삭제완료");
		}

	}
	
	@Test
	void testWrite() {
		


	}
	
	
	
	
	
}