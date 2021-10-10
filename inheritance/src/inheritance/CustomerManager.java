package inheritance;

public class CustomerManager {

	
	//polimorfizm
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	/* birden fazla müşteri eklemek istersek
	 * birden çok denilince akla diziler gelir.
	 */
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
		/* gönderilen her müşteriyi tek tek dolaşacak ve her müşteri için
		 * yukarıdaki add metodunu çalıştıracak
		 * */
	}
	
}
