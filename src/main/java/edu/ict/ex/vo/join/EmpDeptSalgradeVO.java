package edu.ict.ex.vo.join;


import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.EmpVO;
import edu.ict.ex.vo.SalVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpDeptSalgradeVO {
	private EmpVO emp;
	private SalVO salgrade;
	private DeptVO dept;
	
	private int num;
	
	public int getNum() {
		return (int)((Math.random() * 6) + 1);
	}

}
