package edu.ict.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ict.ex.mapper.EmpMapper;
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
	
}
