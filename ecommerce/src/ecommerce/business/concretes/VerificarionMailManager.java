package ecommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;

import ecommerce.business.abstracts.VerificationService;
import ecommerce.entities.concretes.User;

public class VerificarionMailManager implements VerificationService{

	List<String> verificatedEmails = new ArrayList<String>();	
	
	@Override
	public void sendVerificationMail(User user) {
		System.out.println(user.getEmail() 
				+ " email hesab�na do�rulama e-postas� g�nderilmi�tir.");
		
	}

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email + " email hesab� do�ruland�.");
		
	}



}
