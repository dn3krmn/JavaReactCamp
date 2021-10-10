package polimorphismDemo;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger logger) {
		
		/* bu class newlendiğinde bu constructor çalışır.
		 * ben bu classı kullanmak istiyorsam bana çalıştığı loggerı söylesin
		 * baselogger.
		 * burda aslında base logger değil database logger var
		 * */
		
		this.baseLogger = logger;
	}
	
	public void Add() {
		System.out.println("Müşteri eklendi");
		this.baseLogger.Log("log mesajı");
	}

}
