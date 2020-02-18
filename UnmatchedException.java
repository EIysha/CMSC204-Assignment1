@SuppressWarnings("serial")
public class UnmatchedException extends Exception {
	public UnmatchedException() {
		
	}
	
	/**
	 * Constructor that will check if password and re-typed password are identical
	 */
	public UnmatchedException(String message) {
		super(message);
	}
}
