package edu.ict.ex.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.DeptEmpVO;
import edu.ict.ex.vo.EmpVO;
import edu.ict.ex.vo.SalgradeVO;


//마이바티스용 인터페이스라는걸 알려주는 어노테이션
@Mapper
public interface EmpMapper {
	

	public List<EmpVO> getList();

	int insert(EmpVO empVO);
	
	//조인 처리 방법1
	public List<EmpVO>getEmpDeptList();
	//조인 처리 방법2
	public List<DeptEmpVO>getDeptEmpList();
	
	public int getTotal();

	public List<EmpVO> getListWithPageing(Criteria criteria);

	public List<SalgradeVO> getEmpSalList();

	public List<SalgradeVO> getInfo();

	public int delete(int empno);
	
}
