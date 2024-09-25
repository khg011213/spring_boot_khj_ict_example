package edu.ict.ex.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.EmpVO;
import edu.ict.ex.vo.join.EmpDeptSalgradeVO;
import edu.ict.ex.vo.join.EmpSalgradeVO;


//마이바티스용 인터페이스라는걸 알려주는 어노테이션
@Mapper
public interface EmpMapper {
	

	public List<EmpVO> getList();

	int insert(EmpVO empVO);
	
	public int getTotal();

	public List<EmpVO> getListWithPageing(Criteria criteria);

	public int delete(int empno);

	
	//연습문제 join처리1
	public List<EmpSalgradeVO> getEmpSalgrade();
	
	//연습문제 join처리2
	public List<EmpDeptSalgradeVO> getEmpDeptSalgrade();

	
}
