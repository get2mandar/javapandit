package app.javapandit.java4.exceptionchain;

public class Java_ExceptionChainExample {

	public static void main(String[] args) {

		Java_ExceptionChainExample example = new Java_ExceptionChainExample();

		// Example Without Exception Chain
		try {
			example.getLeave_MethodWithoutExceptionChain();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Example With Exception Chain
		try {
			System.out.println("\n - - - - - - - - - - - - - - \n");
			example.getLeave_MethodWithExceptionChain();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	void getLeave_MethodWithoutExceptionChain() throws LeaveNotGrantedException {
		try {
			isLeaveBalanceAvailable();
		} catch (LeaveBalanceExhaustedException lbe) {
			lbe.printStackTrace();
			throw new LeaveNotGrantedException("Leave Not Granted.");
		}
	}

	void getLeave_MethodWithExceptionChain() throws LeaveNotGrantedException {
		try {
			isLeaveBalanceAvailable();
		} catch (LeaveBalanceExhaustedException lbe) {
			throw new LeaveNotGrantedException("Leave Not Granted.", lbe);
		}
	}

	void isLeaveBalanceAvailable() throws LeaveBalanceExhaustedException {
		throw new LeaveBalanceExhaustedException("Leave Balance Exhausted.");
	}

}
