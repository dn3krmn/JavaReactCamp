package interfaces;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi : " + message);
		
	}

	/* implemente etmek demek Loggerı SmsLoggera uyarla demek. Yani gerekli
	 * olan kodları yaz demek.
	 * interitance de gerekli olan kodları yazmak zorunda değildik. İstersek
	 * üzerine yazabiliyorduk yani override edebiliyorduk.
	 * */
}
