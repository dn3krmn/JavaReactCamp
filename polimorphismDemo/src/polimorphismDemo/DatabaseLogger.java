package polimorphismDemo;

public class DatabaseLogger extends BaseLogger {

	//override etmek baseloggerda olan metodu burda yeniden oluşturmak
	
	public void Log(String message) {
		System.out.println("Logged to database: " + message);
	}

}
