package interfaces;

public class Main {

	public static void main(String[] args) {
		
		/*Logger[] adlı bir array tanımladık ve burada da hangi loggerların
		 * olacağını belirttik. 
		 * Bunun string bir arrayden farkı yok. String array de metinler olur.
		 * Burda da Logger[] array olduğu için loggerlar olur. LOgger referans
		 * tutan bir interface olduğu için smslooger ve filelogger ı bu logger 
		 * dizisine ekleyebiliriz.
		 * */
		
		Logger[] loggers = {new SmsLogger(), new FileLogger(), new DatabaseLogger()};
		
		CustomerManager manager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1, "Engin", "Demiroğ");
		
		manager.add(engin);
	}

}
