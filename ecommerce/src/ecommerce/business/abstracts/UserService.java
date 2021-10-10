package ecommerce.business.abstracts;

import ecommerce.entities.concretes.User;

public interface UserService {
	void signIn(User user);
	void signUp(User user);

}
