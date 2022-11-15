package swd20.hh.fi.filmpic.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired UserRepository userrepo;
	
	public User getByUsername(String username) {
		return userrepo.findByUsername(username);
	}
}
