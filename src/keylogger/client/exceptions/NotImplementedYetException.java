package keylogger.client.exceptions;

/**
 * "Feel the beat now,
 * If you've got nothing left say."
 * Good Charlotte.
 * 
 * @author Leonardo
 */
public class NotImplementedYetException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public NotImplementedYetException() {
		super("Feature not implemented yet.");
	}
	
	public NotImplementedYetException(String s) {
		super(s);
	}
	
}
