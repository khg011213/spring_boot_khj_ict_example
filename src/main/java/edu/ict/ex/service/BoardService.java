package edu.ict.ex.service;

import java.util.List;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> getList();

	BoardVO get(int bno);
	
	int remove(int bid);

	int insert(BoardVO boardVO);

	int modify(BoardVO boardVO);
	
	void boardReply(BoardVO boardVO);
	
	 int updateHit(BoardVO boardVO);
	 
	 
	 //페이징 처리 함수
	 int getTotal();
	 List<BoardVO>getListWithPaging(Criteria cri);
	 
}
