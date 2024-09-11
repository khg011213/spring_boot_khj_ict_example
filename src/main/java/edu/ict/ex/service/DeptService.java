package edu.ict.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.repository.DeptDao;
import edu.ict.ex.vo.DeptVO;

//DeptRepository 다른이름
//@bean = @Component
//@Bean + Dao의 의미
@Service
public class DeptService {
	
	
	@Autowired
	private DeptDao dao;
	
	public List<DeptVO> getList(){
		
		return dao.deptSelect();
	}
	
}
