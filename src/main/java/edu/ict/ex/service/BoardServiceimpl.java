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

	@Override
	public int reply(int bid, String bname, String btitle, String bcontent, int bgroup, int bstep, int bindent) {
		
		return boardMapper.reply(bid, bname, btitle, bcontent,  bgroup,  bstep,  bindent);
	}

	@Override
	public int reply_view(int bid) {
		
		return boardMapper.reply_view(bid);
	}
	
	
		
}
