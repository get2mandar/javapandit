package app.javapandit.java4.exceptionchain;

public class LeaveNotGrantedException extends Exception {

	private static final long serialVersionUID = 4762039249290895192L;

	public LeaveNotGrantedException(String message, Throwable cause) {
		super(message, cause);
	}

	public LeaveNotGrantedException(String message) {
		super(message);
	}
}
