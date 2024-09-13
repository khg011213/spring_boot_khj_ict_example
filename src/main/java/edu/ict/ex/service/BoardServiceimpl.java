package edu.ict.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ict.ex.mapper.BoardMapper;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceimpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList(){
		log.info("getList()...");
		
		return boardMapper.getList();
	}

	@Override
	public BoardVO get(int bno) {
		log.info("get()...");
		
		return boardMapper.read(bno);
	}

	@Override
	public int remove(int bno) {
		
		log.info("remove()..");
		
		return boardMapper.delete(bno);
	}

	@Override
	public int insert(String bname, String btitle, String bcontent) {
		
		return boardMapper.insert(bname,btitle,bcontent);
	}

	@Override
	public int modify(int bid,String bname, String btitle, String bcontent) {
	
		return boardMapper.modify(bid, bname,btitle,bcontent);
	}

	
	//순서 있는 기능이 오는 부분 = 비지니스 로직 = 기능이 있는 로직  = 반드시 서비스 단에 위치
	@Override
	public void boardReply(BoardVO boardVO) {
		log.info("boardReply()..");
		boardMapper.updateShape(boardVO);
		boardMapper.insertReply(boardVO);
		
	}
	
	
		
}
