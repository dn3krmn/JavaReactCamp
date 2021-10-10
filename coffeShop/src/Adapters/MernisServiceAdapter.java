package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckServices;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckServices{
	
	@Override
	public boolean checkIfRealPerson(Customer customer) 
			throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBirth());
		
		if(result) {
			System.out.println("Başarılı");
		} else {
			System.out.println("Başarısız");
		}
		return result;
	}

}
