@SuppressWarnings("serial")
public class LengthException extends Exception {
	public LengthException() {
		
	}
	
	/**
	 * Constructor that will take in a message, which will be displayed if 
	 * LengthException is thrown
	 */
	public LengthException(String message) {
		super(message);
	}
}
