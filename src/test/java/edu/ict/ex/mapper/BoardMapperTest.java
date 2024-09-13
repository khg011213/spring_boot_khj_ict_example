package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.page.Criteria;
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
	@Disabled
	@Test
	void testModify() {
		
		BoardVO board = new BoardVO();
		
		board.setBid(61);
		
		board.setBname("홍길동");
		board.setBtitle("홍길동");
		board.setBcontent("길동");
		
		boardMapper.modify(0, null, null, null);


	}
	
	@Test
	void testgetListWithPaging() {
		Criteria criteria = new Criteria();
		criteria.setAmount(10);
		criteria.setPageNum(2);
		List<BoardVO>list = boardMapper.getListWithPaging(criteria);

		System.out.println(list);

	}
	
	
	
	
	
}