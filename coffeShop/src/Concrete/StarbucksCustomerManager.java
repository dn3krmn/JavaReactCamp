package Concrete;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckServices;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckServices checkServices;

	public StarbucksCustomerManager(ICustomerCheckServices checkServices) {
		this.checkServices = checkServices;
	}
	
	public void save(Customer customer) 
			throws NumberFormatException, RemoteException {
		
		if(checkServices.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person");
		}
		
	}

}
