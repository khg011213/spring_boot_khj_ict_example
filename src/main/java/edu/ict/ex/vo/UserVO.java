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
public class UserVO {
	private String username;
	private String password;
	private String enabled;
	
	private String email = "abcd@daum.net";
	
	private List<AuthVO> authList;
}
