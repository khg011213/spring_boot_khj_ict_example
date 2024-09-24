package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;


//마이바티스용 인터페이스라는걸 알려주는 어노테이션
@Mapper
public interface BoardMapper {
	
	public List<BoardVO> getList();

	BoardVO read(int bno);
	
	public int updateHit(BoardVO boardVO);
	
	int delete(BoardVO boardVO);

	int insert(BoardVO boardVO);
	
	//int insert(@Param("board") BoardVO boardVO, @Param("emp") EmpVO empvo) 이렇게도 가능 

	int modify(BoardVO boardVO);

	//댓글
	public void updateShape(BoardVO boardVO);
	public void insertReply(BoardVO boardVO);
	
	//페이징 관련
	int getTotalCount();
	List<BoardVO> getListWithPaging(Criteria cri);
	

}
