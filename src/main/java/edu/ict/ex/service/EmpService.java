package edu.ict.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ict.ex.mapper.EmpMapper;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.DeptEmpVO;
import edu.ict.ex.vo.EmpDeptVO;
import edu.ict.ex.vo.EmpVO;
import edu.ict.ex.vo.SalEmpVO;
import edu.ict.ex.vo.SalgradeVO;

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

	public List<SalgradeVO> getEmpSalList() {
		return empMapper.getEmpSalList();
	}

	public List<SalgradeVO> getInfo() {
		// TODO Auto-generated method stub
		return empMapper.getInfo();
	}

	public int delete(int empno) {
		return empMapper.delete(empno);
		
	}
	
	public List<EmpDeptVO>getEmpOneDeptList(){
		return empMapper.getEmpOneDeptList();
	}

	public List<SalEmpVO> getSalGradeList() {
		return empMapper.getSalGradeList();
	}
	
	public List<SalEmpVO> getInfoTable() {
		return empMapper.getInfoTable();
	}
	
}
