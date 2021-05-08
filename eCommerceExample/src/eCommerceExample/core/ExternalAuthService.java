package eCommerceExample.core;

import eCommerceExample.entities.concretes.LoginDto;

public interface ExternalAuthService {
	
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);
	 
	
}
