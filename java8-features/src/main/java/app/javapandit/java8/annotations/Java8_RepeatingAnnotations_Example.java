package app.javapandit.java8.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Repeating Annotation  
@Game(name = "Cricket", day = "Sunday")
@Game(name = "Hockey", day = "Friday")
@Game(name = "Football", day = "Saturday")
public class Java8_RepeatingAnnotations_Example {

	public static void main(String[] args) {

		// Getting Annotation by Type into an Array
		Game[] games = Java8_RepeatingAnnotations_Example.class.getAnnotationsByType(Game.class);
		for (Game game : games) { // Iterating Values
			System.out.println(game.name() + " on " + game.day());
		}
	}
}

// Declaring Repeatable Annotation Type  
@Repeatable(Games.class)
@interface Game {
	String name();

	String day();
}

// Declaring Container For Repeatable Annotation Type  
@Retention(RetentionPolicy.RUNTIME)
@interface Games {
	Game[] value();
}