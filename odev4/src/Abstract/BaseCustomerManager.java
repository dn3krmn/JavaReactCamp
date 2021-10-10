package Abstract;

import Entity.Customer;

public class Babstract aseCustomerManager : ICustomerService{
	public virtual void save(Customer customer) { //virtual ben bunu ezebilirim demek
		Console.writelne("Save to db: " + customer.firstname);
	}

}
