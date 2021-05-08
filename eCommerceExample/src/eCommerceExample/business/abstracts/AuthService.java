package eCommerceExample.business.abstracts;

import eCommerceExample.entities.concretes.LoginDto;
import eCommerceExample.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user , String token);
	boolean userExists(String email);
	void login(LoginDto dto);
	
}

