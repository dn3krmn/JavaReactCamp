package ecommerce;

import ecommerce.business.abstracts.UserService;
import ecommerce.business.concretes.UserCheckManager;
import ecommerce.business.concretes.UserManager;
import ecommerce.business.concretes.VerificarionMailManager;
import ecommerce.core.GoogleRegisterManagerAdapter;
import ecommerce.core.GoogleRegisterService;
import ecommerce.dataAccess.concretes.HibernateUserDao;
import ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Döne", "Karaman", "dk@gmail.com", "dkdkdk");
		User user2 = new User(2, "Büþra", "Karaman", "bk@gmail.com", "bkbk");
		User user3 = new User(3, "Mehmet", "Kardaþ", "mösyç@gmail.co", 
				"memomemo");
		
		UserService userService = new UserManager(new HibernateUserDao(), 
				new UserCheckManager(), new VerificarionMailManager());
		
		userService.signUp(user1);
		System.out.println("################################");
		userService.signUp(user2);
		System.out.println("################################");
		userService.signUp(user3);
		System.out.println("################################");
		userService.signIn(user1);
		System.out.println("################################");
		userService.signIn(user2);
		System.out.println("################################");
		userService.signIn(user3);
		
		
		System.out.println("################################");
		
		
		GoogleRegisterService googleRegisterService = 
				new GoogleRegisterManagerAdapter();	
		
		googleRegisterService.signUpWithGoogle(user1);
		System.out.println("################################");
		googleRegisterService.signInWithGoogle(user1);
		

	}

}
