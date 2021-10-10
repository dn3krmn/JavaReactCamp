package ecommerce.core;

import ecommerce.entities.concretes.User;
import ecommerce.googleAccount.GoogleLoginManager;

public class GoogleRegisterManagerAdapter implements GoogleRegisterService{

	
	GoogleLoginManager loginManager = new GoogleLoginManager();
	//adapter ile google login servisini sisteme ekledik.
	
	@Override
	public void signInWithGoogle(User user) {
		loginManager.signIn(user.getEmail(), user.getPassword());
		
	}

	@Override
	public void signUpWithGoogle(User user) {
		loginManager.signUp(user.getEmail(), user.getPassword());   
		
	}

}
