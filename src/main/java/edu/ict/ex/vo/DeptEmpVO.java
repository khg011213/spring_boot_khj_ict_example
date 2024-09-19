package edu.ict.ex.vo;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


// Dept 와 Emp 는 1 대 다 관계이다
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeptEmpVO {
	private int deptno;
	private String dname;
	private String loc;
	
	private List<EmpVO> empList;
	
	

}
