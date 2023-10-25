package app.javapandit.java8.datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZonedDateTime;

public class Java8_DateTimeAPI_CoreClassesExample {

	public static void main(String[] args) {

		// Core Classes to Represent Date and Time
		System.out.println("Core Classes to Represent Date and Time\n");

		System.out.println("::LocalDate Examples::");

		LocalDate localDate = LocalDate.now();
		System.out.println("localDate.getDayOfWeek().toString(): " + localDate.getDayOfWeek().toString()); // WEDNESDAY
		System.out.println("localDate.getDayOfMonth(): " + localDate.getDayOfMonth());
		System.out.println("localDate.getDayOfYear(): " + localDate.getDayOfYear());
		System.out.println("localDate.isLeapYear(): " + localDate.isLeapYear()); // false

		System.out.println("---------\n");

		System.out.println("::LocalTime Examples::");
		LocalTime localTime = LocalTime.of(12, 20);

		System.out.println("localTime.toString(): " + localTime.toString()); // 12:20
		System.out.println("localTime.getHour(): " + localTime.getHour()); // 12
		System.out.println("localTime.getMinute(): " + localTime.getMinute()); // 20
		System.out.println("localTime.getSecond(): " + localTime.getSecond()); // 0
		System.out.println("LocalTime.MIDNIGHT: " + LocalTime.MIDNIGHT); // 00:00
		System.out.println("LocalTime.NOON: " + LocalTime.NOON); // 12:00

		System.out.println("---------\n");

		System.out.println("::LocalDateTime Examples::");
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("localDateTime.toString(): " + localDateTime.toString()); // Format: 2023-10-25T14:25:36.260
		System.out.println("localDateTime.getDayOfMonth(): " + localDateTime.getDayOfMonth());
		System.out.println("localDateTime.getHour(): " + localDateTime.getHour());
		System.out.println("localDateTime.getNano(): " + localDateTime.getNano());

		System.out.println("---------\n");

		System.out.println("::OffsetDateTime and ZonedDateTime Examples::");

		OffsetDateTime offsetDate = OffsetDateTime.now();
		System.out.println(offsetDate); // Format 2023-10-25T14:25:36.260+05:30

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime); // Format 2023-10-25T14:25:36.260+05:30[Asia/Calcutta]

		System.out.println("---------\n");

		// Core Classes to Represent Timestamp and Duration
		System.out.println("Core Classes to Represent Timestamp and Duration\n");

		System.out.println("::Instant Examples::");

		Instant instant = Instant.now();

		// Format 2023-10-25T14:25:36.260Z
		System.out.println("instant.toString(): " + instant.toString());
		System.out.println("instant.plus(Duration.ofMillis(5000)).toString(): "
				+ instant.plus(Duration.ofMillis(5000)).toString());
		System.out.println("instant.minus(Duration.ofMillis(5000)).toString(): "
				+ instant.minus(Duration.ofMillis(5000)).toString());
		System.out.println("instant.minusSeconds(10).toString(): " + instant.minusSeconds(10).toString());

		System.out.println("---------\n");

		System.out.println("::Duration Examples::\tPT stands for 'Period of Time'");

		Duration duration = Duration.ofMillis(5000);
		System.out.println("Duration.ofMillis(5000): " + duration);
		duration = Duration.ofSeconds(60);
		System.out.println("Duration.ofSeconds(60): " + duration);
		duration = Duration.ofMinutes(10);
		System.out.println("Duration.ofMinutes(10): " + duration);
		duration = Duration.ofHours(2);
		System.out.println("Duration.ofHours(2): " + duration);
		duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
		System.out.println("Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10))): " + duration);

		System.out.println("---------\n");

		System.out.println("::Period Examples::\tP stands for 'Period'");

		Period period = Period.ofDays(6);
		System.out.println("Period.ofDays(6): " + period);
		period = Period.ofMonths(6);
		System.out.println("Period.ofMonths(6): " + period);
		period = Period.between(LocalDate.now(), LocalDate.now().plusDays(60));
		System.out.println("Period.between(LocalDate.now(), LocalDate.now().plusDays(60)): " + period);

		System.out.println("---------\n");
	}
}