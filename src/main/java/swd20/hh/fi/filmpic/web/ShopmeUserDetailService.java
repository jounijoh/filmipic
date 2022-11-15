/**package swd20.hh.fi.filmpic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import swd20.hh.fi.filmpic.domain.User;
import swd20.hh.fi.filmpic.domain.UserRepository;

public class ShopmeUserDetailService implements UserDetailsService {
	@Autowired
	private UserRepository userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userrepo.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Could not find user with that username");
		}
		return new ShopmeUserDetails(user);
	}

}
**/