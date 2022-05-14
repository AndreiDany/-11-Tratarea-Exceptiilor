
public class ExceptieJocFotbal extends Exception {
	
	private String message;
	
	public ExceptieJocFotbal(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
