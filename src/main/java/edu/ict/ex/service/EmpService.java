package edu.ict.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ict.ex.mapper.EmpMapper;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.DeptEmpVO;
import edu.ict.ex.vo.EmpVO;

//DeptRepository 다른이름
//@bean = @Component
//@Bean + Dao의 의미
@Service
public class EmpService {
	
	
	@Autowired
	private EmpMapper empMapper;
	
	public List<EmpVO> getList(){
		
		return empMapper.getList();
	}

	public int insert(EmpVO empVO) {
		return empMapper.insert(empVO);
	}

	public int getTotal() {
		return empMapper.getTotal();
	}

	public List<EmpVO> getListWithPaging(Criteria criteria) {
		return empMapper.getListWithPageing(criteria);
	}
	
	public List<EmpVO> getEmpDeptList(){
		return empMapper.getEmpDeptList();
	}
	
	public List<DeptEmpVO> getDeptEmpList(){
		return empMapper.getDeptEmpList();
	}
	
}
