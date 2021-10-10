package ecommerce.business.abstracts;

import ecommerce.entities.concretes.User;

public interface VerificationService {
	void sendVerificationMail(User user);
	void verifyMail(String email);

}
