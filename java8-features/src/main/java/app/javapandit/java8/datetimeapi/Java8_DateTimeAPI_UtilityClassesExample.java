package app.javapandit.java8.datetimeapi;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAdjusters;
import java.time.zone.ZoneRules;

public class Java8_DateTimeAPI_UtilityClassesExample {

	public static void main(String[] args) {

		// Utility Classes and Enums
		System.out.println("Utility Classes and Enums\n");

		// day-of-week to Represent, from 1 (Monday) to 7 (Sunday)
		System.out.println("DayOfWeek.of(2): " + DayOfWeek.of(2)); // TUESDAY

		DayOfWeek day = DayOfWeek.FRIDAY;
		System.out.println("day = DayOfWeek.FRIDAY; day.getValue(): " + day.getValue()); // 5

		LocalDate localDateDOW = LocalDate.now();
		System.out.println("localDateDOW = LocalDate.now(); " + "localDateDOW.with(DayOfWeek.MONDAY): "
				+ localDateDOW.with(DayOfWeek.MONDAY)); // Format 2023-10-25 i.e. when was monday in current week ?

		System.out.println("---------\n");

		System.out.println("::Date Adjusters Examples::");
		LocalDate date = LocalDate.of(2023, Month.OCTOBER, 25); // Today: 2023-10-25
		System.out.println("date = LocalDate.of(2023, Month.OCTOBER, 25): " + date);

		LocalDate endOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("endOfMonth = date.with(TemporalAdjusters.lastDayOfMonth()); endOfMonth.toString(): "
				+ endOfMonth.toString()); // Format - End Of October Month in year 2023 - 2023-10-31

		LocalDate nextTue = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("nextTue = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY); nextTue.toString(): "
				+ nextTue.toString()); // Format - Coming Tue in October Month in year 2023 - 2023-10-31

		System.out.println("---------\n");

		System.out.println("::Fluent API Examples::");

		// Builder Pattern
		OffsetDateTime offsetDateTime = Year.of(2023).atMonth(Month.OCTOBER).atDay(25).atTime(0, 0)
				.atOffset(ZoneOffset.of("+03:00"));
		System.out.println("offsetDateTime = Year.of(2023).atMonth(Month.OCTOBER).atDay(25).atTime(0, 0)"
				+ ".atOffset(ZoneOffset.of(\"+03:00\"));\noffsetDateTime - Builder Pattern: " + offsetDateTime);

		// Factory Method
		offsetDateTime = OffsetDateTime.of(2023, 10, 25, 0, 0, 0, 0, ZoneOffset.of("+03:00"));
		System.out.println("\noffsetDateTime = OffsetDateTime.of(2023, 10, 25, 0, 0, 0, 0, ZoneOffset.of(\"+03:00\"));"
				+ "\noffsetDateTime - Factory Method: " + offsetDateTime);

		System.out.println("---------\n");

		System.out.println("::System Clock Examples::");

		Clock clock = Clock.systemDefaultZone();
		System.out.println("clock = Clock.systemDefaultZone(): " + clock); // SystemClock[Asia/Calcutta]
		System.out.println("clock.instant().toString(): " + clock.instant().toString());
		// Format 2023-10-25T14:25:36.260Z
		System.out.println("clock.getZone(): " + clock.getZone()); // Asia/Calcutta

		Clock anotherClock = Clock.system(ZoneId.of("Europe/London"));
		System.out.println("\nanotherClock = Clock.system(ZoneId.of(\"Europe/London\")): " + anotherClock); // SystemClock[Europe/London]
		System.out.println("anotherClock.instant().toString(): " + anotherClock.instant().toString());
		// Format 2023-10-25T14:25:36.260Z
		System.out.println("anotherClock.getZone(): " + anotherClock.getZone()); // Europe/London

		Clock forwardedClock = Clock.tick(anotherClock, Duration.ofSeconds(600));
		System.out.println("\nforwardedClock = Clock.tick(anotherClock, Duration.ofSeconds(600)); "
				+ "forwardedClock.instant().toString(): " + forwardedClock.instant().toString());
		// Format 2023-10-25T09:30:00Z

		System.out.println("---------\n");

		System.out.println("::Timezone Examples::");

		System.out.println("ZoneRules.of(ZoneOffset.of(\"+02:00\")).isDaylightSavings(Instant.now()): "
				+ ZoneRules.of(ZoneOffset.of("+02:00")).isDaylightSavings(Instant.now()));

		System.out.println("ZoneRules.of(ZoneOffset.of(\"+02:00\")).isFixedOffset(): "
				+ ZoneRules.of(ZoneOffset.of("+02:00")).isFixedOffset());

		System.out.println("---------\n");

		System.out.println("::DateTimeFormatter Examples::");

		DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
		formatterBuilder.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).appendLiteral("-").appendZoneOrOffsetId();

		DateTimeFormatter formatter = formatterBuilder.toFormatter();
		System.out.println(formatter.format(ZonedDateTime.now()));

		System.out.println("---------\n");
	}
}