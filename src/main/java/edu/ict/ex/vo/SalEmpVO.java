package edu.ict.ex.vo;

import java.sql.Date;
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
public class SalEmpVO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	private SalVO salGrade;
	private DeptVO dept;

}
