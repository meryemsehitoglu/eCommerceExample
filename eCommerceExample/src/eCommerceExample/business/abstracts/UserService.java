package eCommerceExample.business.abstracts;

import java.util.List;

import eCommerceExample.entities.concretes.User;

public interface UserService {

	void add(User user);
	void update(User user);
	void delete(int userId);
	User get(String email);
	List<User> getAll();
}
