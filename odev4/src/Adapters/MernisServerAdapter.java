package Adapters;

import Entity.Customer;

public class MernisServerAdapter: ICustomercheckservise {
	public bool checkifrealperson(Customer customer) {
		KPSPublicSoapCLient vlient = new KPSPublicSoapCLient();
		client.TCKimlikNoDogrula(conver.to64(customer.nationalityId), customer.firstname.toUpper(), customer.lastname.ToUpper(), customer.dateofbirsth.year);
	}

}
