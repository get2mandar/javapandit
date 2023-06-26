package app.javapandit.java7.switchstrings;

public class SwitchStatementsWithString {

	public static void main(String[] args) {
		System.out.println("Tuesday is WeekDay: " + isWeekDay(Day.TUE));
		System.out.println("Sunday is WeekDay: " + isWeekDay(Day.SUN));
	}

	public static Boolean isWeekDay(Day day) {
		Boolean result = false;
		switch (day) {
		case MON:
			result = true;
			break;
		case TUE:
			result = true;
			break;
		case WED:
			result = true;
			break;
		case THUR:
			result = true;
			break;
		case FRI:
			result = true;
			break;
		case SAT:
			result = false;
			break;
		case SUN:
			result = false;
			break;
		default:
			throw new IllegalArgumentException("Invalid day: " + day.name());
		}
		return result;
	}
}

enum Day {
	MON, TUE, WED, THUR, FRI, SAT, SUN
}
