package edu.ict.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ict.ex.mapper.BoardMapper;
import edu.ict.ex.page.Criteria;
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
		BoardVO board = new BoardVO();
		
		board.setBid(bno);
		
		boardMapper.updateHit(board);  //get이 가져온 값을 넣은 board를 받아서 updateHit함수를 실행함
		
		return boardMapper.read(bno);
	}

	@Override
	public int remove(int bid) {
		
		log.info("remove()..");
		
		return boardMapper.delete(bid);
	}

	@Override
	public int insert(BoardVO boardVO) {
		
		return boardMapper.insert(boardVO);
	}

	@Override
	public int modify(BoardVO boardVO) {
	
		return boardMapper.modify(boardVO);
	}

	
	//순서 있는 기능이 오는 부분 = 비지니스 로직 = 기능이 있는 로직  = 반드시 서비스 단에 위치
	@Override
	public void boardReply(BoardVO boardVO) {
		log.info("boardReply()..");
		boardMapper.updateShape(boardVO);
		boardMapper.insertReply(boardVO);
		
	}

	@Override
	public int updateHit(BoardVO boardVO) {
		
		log.info("updateHit()");
		return boardMapper.updateHit(boardVO);
	}

	@Override
	public int getTotal() {
		log.info("getTotal()...");
		
		return boardMapper.getTotalCount();
	}

	@Override
	public List<BoardVO> getListWithPaging(Criteria cri) {
		log.info("getListWIthPaging()");
		return boardMapper.getListWithPaging(cri);
	}
	
	
		
}
