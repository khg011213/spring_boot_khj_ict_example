package edu.ict.ex.service;

import java.util.List;
import edu.ict.ex.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> getList();

	BoardVO get(int bno);
	
	int remove(int bno);

	int insert(String bname, String btitle, String bcontent);

	int modify(int bid ,String bname, String btitle, String bcontent);
	
	void boardReply(BoardVO boardVO);
	
	 int updateHit(BoardVO boardVO);
		
}