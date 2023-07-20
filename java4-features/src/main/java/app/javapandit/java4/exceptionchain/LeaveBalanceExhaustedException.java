package app.javapandit.java4.exceptionchain;

public class LeaveBalanceExhaustedException extends Exception {

	private static final long serialVersionUID = 5176056132119123201L;

	public LeaveBalanceExhaustedException(String message, Throwable cause) {
		super(message, cause);
	}

	public LeaveBalanceExhaustedException(String message) {
		super(message);
	}
}
