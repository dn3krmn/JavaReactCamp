package Concrete;

import java.rmi.RemoteException;

import Abstract.ICustomerService;
import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
	
	@Override
	public void save(Customer customer) 
			throws NumberFormatException, RemoteException {
		System.out.println("Save to db : " + customer.getFirstName());
	}
}
