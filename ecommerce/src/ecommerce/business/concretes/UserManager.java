package ecommerce.business.concretes;

import ecommerce.business.abstracts.UserCheckService;
import ecommerce.business.abstracts.UserService;
import ecommerce.business.abstracts.VerificationService;
import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private UserCheckService userCheckService;
	private VerificationService verificationService;
	
	public UserManager(UserDao userDao, UserCheckService userCheckService,
			VerificationService verificationService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
	}

	@Override
	public void signIn(User user) {
		
		//do?rulama linki
		verificationService.verifyMail(user.getEmail()); 
		
		if(userDao.getEmail(user.getEmail()) && 
				userDao.getPassword(user.getPassword()) == true) {
			System.out.println("----Ba?ar?yla Giri? Yapt?n?z-------");
		} else if(userDao.getEmail(user.getEmail()) == false) {
			System.out.println("YANLI? EMAIL G?RD?N?Z");
		} else if(userDao.getPassword(user.getPassword()) == false) {
			System.out.println("YANLI? PAROLA G?RD?N?Z");
		} else {
			System.out.println("Girilen Bilgiler Yanl??");
		}
		
		
	}

	@Override
	public void signUp(User user) {
		if(userCheckService.isValid(user)) {
			System.out.println(user.getFirstName() 
					+ " kullan?c?s? sisteme eklenmi?tir.");
			verificationService.sendVerificationMail(user);
			userDao.add(user);
		}
		
	}

}
