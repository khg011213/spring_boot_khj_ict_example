package edu.ict.ex.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import edu.ict.ex.vo.AuthVO;
import edu.ict.ex.vo.CartVO;
import edu.ict.ex.vo.UserVO;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

//넣어줘야하는 포맷형식 커스텀 할려면 첫번쨰로 UserDetails 이거 필요
@Slf4j
@Setter
public class UserDetailsVO implements UserDetails{

	private String username;
	private String password;
	private String email;
	private List<GrantedAuthority> authorities;
	
	private CartVO cart;
	
	public UserDetailsVO(UserVO user) {
		this.username = user.getUsername();
		  this.setPassword(user.getPassword());
		this.setAuthorities(user);
		
	}
	
	
	public UserDetailsVO(UserVO user, CartVO cart) {
		this.username = user.getUsername();
		this.setPassword(user.getPassword());
		this.setAuthorities(user);
		this.email = user.getEmail();
		this.cart = cart;
	}
	
	public CartVO getCart() {
		return cart;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setAuthorities(UserVO userVO) {
		List<GrantedAuthority>authorities = new ArrayList<GrantedAuthority>();
		
		 for(AuthVO authVO : userVO.getAuthList()) {
	         authorities.add(new SimpleGrantedAuthority(authVO.getAuthority()));
	      }

		this.authorities = authorities;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}
	
	
	

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	//계정이 만료 되지 않았는가
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	//계정이 잠기지 않았는가
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	
	//패스워드가 만료되지 않았는가
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	//계정이 활성화 되었는가
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
