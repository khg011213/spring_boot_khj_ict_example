package edu.ict.ex.vo;

import java.sql.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpVO {
	
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date date;
	private int sal;
	private int comm;
	private int deptno;
		

}
