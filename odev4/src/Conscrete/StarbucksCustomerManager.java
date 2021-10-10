package Conscrete;

public class StarbucksCustomerManager : BaseCustomerManager {
	
	private IcustomeerCheckSrvice customercheckservice;
	public StaarbucksCustomerManaher(IcustomercheckService customercheckservice) {
		customercheckservice = customercheckservice;
	}
	public override void save(Customer customer) {
		if(customercheckservice.Checkifrealperson(customer)) {
			base.save(customer);
		}else {
		throw new exception("not a valid person");
		}

	}
	

}
