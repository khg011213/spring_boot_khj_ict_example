package edu.ict.ex.vo;

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
public class DeptVO {
	private int deptno;
	private String dname;
	private String loc;

}

//디폴트 생성자들에는 이상한 조인 넣지 말기