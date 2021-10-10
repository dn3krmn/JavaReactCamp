package odev4;

public class Main {

	public static void main(String[] args) {
		

		BaseCustomerManager manager = new NeroCustomerManager();
		manager.save(new Customer{DateOfBirth = new Datetime(1998,11,27), firstname = "döne", lastname="karaman", nationilityId ="1234567890"});
		console.readline();
	}
	
	
	

}


