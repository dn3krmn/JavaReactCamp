package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService {
	
	void save(Customer customer) throws NumberFormatException, RemoteException;
	
	/* interface implemantasyonu yapan her sınıf bunu kullanmak zorunda
	 * */
}
