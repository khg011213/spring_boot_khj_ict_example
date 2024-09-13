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

	int insert(String bname, String btitle, String bcontent);
	
	//int insert(@Param("board") BoardVO boardVO, @Param("emp") EmpVO empvo) 이렇게도 가능 

	int modify(int bid, String bname, String btitle, String bcontent);

	//댓글
	public void updateShape(BoardVO boardVO);
	public void insertReply(BoardVO boardVO);

}
