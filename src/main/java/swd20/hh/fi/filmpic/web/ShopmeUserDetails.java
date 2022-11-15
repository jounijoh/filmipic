/**package swd20.hh.fi.filmpic.web;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import swd20.hh.fi.filmpic.domain.User;

public class ShopmeUserDetails implements UserDetails {
	private User user;
	
	public ShopmeUserDetails(User user) {
        this.user = user;
    }
	public String getFirstname() {
        return this.user.getFirstname();
    }
	public String getEmail() {
		return this.user.getEmail();
	}
	public String getLastname() {
		return this.user.getLastname();
	}
	public String getRole() {
		return this.user.getRole();
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPassword() {
		
		return user.getPasswordHash();
	}
	@Override
	public String getUsername() {
		return user.getUsername();
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return user.isEnabled();
	}

}
**/