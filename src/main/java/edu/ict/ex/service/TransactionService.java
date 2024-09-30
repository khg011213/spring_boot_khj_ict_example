package edu.ict.ex.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.ict.ex.mapper.BoardMapper;
import edu.ict.ex.vo.BoardVO;


//DeptRepository 다른이름
//@bean = @Component
//@Bean + Dao의 의미
@Service
public class TransactionService {
	
	@Autowired
	private BoardMapper mapper;
	
	//반드시 2개 이상의 작업이 하나의 함수안에서 이루어질때는
	//@Transactional를 붙일것
	
	@Transactional 
	public void txTest1() {
		System.out.println("1번 테스트.............");
		BoardVO boardVO = new BoardVO();
		
		boardVO.setBcontent("트랜잭션 1");
		boardVO.setBname("트랜잭션 1");
		boardVO.setBtitle("트랜잭션 1");
		
		mapper.insert(boardVO);
		
		BoardVO boardVO2 = new BoardVO();
		
		boardVO2.setBcontent("트랜잭션 2");
		boardVO2.setBname("트랜잭션 2");
		boardVO2.setBtitle("트랜잭션 2");
		
		boardVO2 =null;
		
		mapper.insert(boardVO2);
		
	}
	
	@Transactional 
	public void txTest2() {
		
		System.out.println("테스트 2번");
		
		BoardVO boardVO = new BoardVO();
		
		boardVO.setBcontent("트랜잭션 4");
		boardVO.setBname("트랜잭션 4");
		boardVO.setBtitle("트랜잭션 4");
		
		mapper.insert(boardVO);
		
		throw new RuntimeException("RuntimeException");
	}
	
	@Transactional 
	public void txTest3() throws SQLException {
		
		System.out.println("테스트 3번");
		
		BoardVO boardVO = new BoardVO();
		
		boardVO.setBcontent("트랜잭션 5");
		boardVO.setBname("트랜잭션 5");
		boardVO.setBtitle("트랜잭션 5");
		
		mapper.insert(boardVO);
		
		throw new SQLException("아아아");
	}

	//개발자가 반드시 확인해야하는 놈을 check라고 한다
	
	public void checkExample() throws FileNotFoundException {
		File file = new File("aa.txt");
		try {
			Scanner scanner = new Scanner(file);
		} catch (Exception e) {
			
		}
		
		
		
	}
	

	
	
	
}
