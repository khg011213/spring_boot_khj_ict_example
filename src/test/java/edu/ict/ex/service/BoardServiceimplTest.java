package edu.ict.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardServiceimplTest {

	@Autowired
	public BoardService boardService;
	
	@Test
	void boardServicetest() {
		System.out.println(boardService.getList());
		
		
	}

}
