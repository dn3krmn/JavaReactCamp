package ecommerce.core;

import ecommerce.entities.concretes.User;

public interface GoogleRegisterService {

	void signInWithGoogle(User user);

	void signUpWithGoogle(User user);

}
