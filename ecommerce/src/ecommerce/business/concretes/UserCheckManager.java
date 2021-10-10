package ecommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import ecommerce.business.abstracts.UserCheckService;
import ecommerce.entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	
	
	List<String> emails = new ArrayList<String>();

	@Override
	public boolean checkFirstName(User user) {
		
		if(user.getFirstName().length() < 2) {
			System.out.println("Ad k�sm� 2 karakterden daha az olamaz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length() < 2) {
			System.out.println("Soyad� k�sm� 2 karakterden daha az olamaz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r.");
			return false;
		}
		else {
			if(user.getPassword().isEmpty()) {
				System.out.println("Parola alan� bo� b�rak�lamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+"
				+ ".(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		if (pattern.matcher(user.getEmail()).find() == false) {
			System.out.println(" Girilen email adresi formata uygun de�il. "
					+ "�rnek: ornek@ornek.com ");
			return false;
		}

		return true;
	}

	@Override
	public boolean uniqueEmail(User user) {
		boolean result=true;
		if (emails.contains(user.getEmail())) {
			System.out.println("Bu mail adresi ile sisteme daha �nce kay�t "
					+ "olunmu�, farkl� bir mail adresi deneyiniz.");
			result=false;
		}		
		return result;
	}

	@Override
	public boolean isValid(User user) {
		if(checkFirstName(user) && checkLastName(user) && checkEmail(user) && 
				checkPassword(user) && uniqueEmail(user) == true) {
			return true;
		}
		return false;
	}

}
