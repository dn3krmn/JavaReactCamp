package polimorphismDemo;

public class EmailLoger extends BaseLogger {

	public void Log(String message) {
		System.out.println("Logged to email: " + message);
	}
}
