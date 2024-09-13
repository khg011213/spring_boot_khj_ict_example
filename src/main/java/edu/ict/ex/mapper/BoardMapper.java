package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.ict.ex.vo.BoardVO;
import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.EmpVO;


//마이바티스용 인터페이스라는걸 알려주는 어노테이션
@Mapper
public interface BoardMapper {
	
	public List<BoardVO> getList();

	BoardVO read(int bno);
	
	int delete(int bno);

	public int insert(String bname, String btitle, String bcontent);

	public int modify(int bid, String bname, String btitle, String bcontent);

	public int reply(int bid, String bname, String btitle, String bcontent, int bgroup, int bstep, int bindent);

	public int reply_view(int bid);
	
}
