package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.ict.ex.service.BoardService;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService; 
	
	@GetMapping("/list")
	public String getBoardlist(Model model) {
		
		log.info("list()..");
		model.addAttribute("boardList", boardService.getList());
		
		return "board/list";
	}
	
	@GetMapping("/content_view")
	public String getBoardContent(BoardVO boardVO ,Model model) {
		
		model.addAttribute("content_view", boardService.get(boardVO.getBid()));
		
		System.out.println("list()..");
		
		return "board/content_view";
	}
	
	@GetMapping("/delete")
	public String getBoarddelete(BoardVO boardVO) {
		
		int bid = boardVO.getBid();
		boardService.remove(bid);
		
		System.out.println("delete()..");
		
		return "redirect:/board/list";
		
	}
	
	@GetMapping("/write_view")
	public String BoardWrite_view() {
		return "board/write_view";
	}
	
	
	@PostMapping("/write")
	public String BoardWrite(BoardVO boardVO) {
		
		String bname = boardVO.getBname();
		String btitle = boardVO.getBtitle();
		String bcontent = boardVO.getBcontent();
		
		boardService.insert(bname, btitle, bcontent);
		
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/modify")
	public String Boardmodify(BoardVO boardVO) {
		
		int bid = boardVO.getBid();
		String bname = boardVO.getBname();
		String btitle = boardVO.getBtitle();
		String bcontent = boardVO.getBcontent();
		
		boardService.modify(bid, bname, btitle, bcontent);
		
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/reply_view")
	public String Boardreply_view(BoardVO boardVO) {
		
		boardService.reply_view(boardVO.getBid());
		
		return "/board/reply_view";
	}
	
	@PostMapping("/reply")
	public String Boardreply(BoardVO boardVO) {
//		int bid = boardVO.getBid();
//		String bname = boardVO.getBname(); 
//		String btitle = boardVO.getBtitle();
//		String bcontent = boardVO.getBcontent();
//		int bgroup = boardVO.getBgroup();
//		int bstep = boardVO.getBstep();
//		int bindent = boardVO.getBindent();
//		
//		
//		boardService.reply(bid, bname, btitle, bcontent, bgroup, bstep, bindent);
		
		return "redirect:/board/list";
	}
	
	
//	replyShape(String group, String step)
//	
//	String sql = "update mvc_board set bstep = bstep+1 where bgroup = ? and bstep > ?";
//	
//	reply(String bid,String bname, String btitle,String bcontent, String bgroup,String bstep, String bindent) {
//	
//		replyShape(bgroup, bstep);
//	
//		String sql = "insert into mvc_board (bId, bName, bTitle, bContent, bGroup, bStep, bIndent) values (mvc_board_seq.nextval, ?, ?, ?, ?, ?, ?)";
//	
//	
	
}
