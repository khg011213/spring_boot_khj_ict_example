package edu.ict.ex.vo;

import java.sql.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class EmpVO {
	
	private final int empno;
	private final String ename;
	private final String job;
	private final int mgr;
	private final Date date;
	private final int sal;
	private final int comm;
	private final int deptno;
	
	@Override
	public String toString() {
		return "EmpVO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", date=" + date
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}

	public static class Builder {
		
		private int empno;
		private String ename;
		private String job;
		private int mgr;
		private Date date;
		private int sal;
		private int comm;
		private int deptno;
		
		public Builder setEmp(int empno) {
			this.empno = empno;
			return this;
		}
		
		public Builder ename(String ename) {
			this.ename = ename;
			return this;
		}
		
		public Builder job(String job) {
			this.job = job;
			return this;
		}
		
		public Builder mgr(int mgr) {
			this.mgr = mgr;
			return this;
		}
		
		public Builder date(Date date) {
			this.date = date;
			return this;
		}
		
		public Builder sal(int sal) {
			this.sal = sal;
			return this;
		}
		
		public Builder comm(int comm) {
			this.comm = comm;
			return this;
		}

		public Builder deptno(int deptno) {
			this.deptno = deptno;
			return this;
		}
		
		public EmpVO Build() {
			return new EmpVO(empno, ename, job, mgr, date, sal, comm, deptno);
		}
		
		
	}
	

}
