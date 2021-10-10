import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) 
			throws NumberFormatException, RemoteException {
		
		BaseCustomerManager baseCustomerManager = new  
				StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1, "D�ne", "Kahraman", 1998, 
				"35947874018"));

		System.out.println("###########################");
		System.out.println("NERO");
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(2, "D�ne", "Karaman", 1998, 
				"35947874018"));
	}

}
