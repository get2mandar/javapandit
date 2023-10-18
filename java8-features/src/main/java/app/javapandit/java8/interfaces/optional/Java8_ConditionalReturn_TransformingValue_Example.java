package app.javapandit.java8.interfaces.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8_ConditionalReturn_TransformingValue_Example {

	/// Start Follwing Code from Here Point #3 onwards
	// https://www.baeldung.com/java-optional

	public static void main(String[] args) {

		// Conditional Return With filter()
		System.out.println("Conditional Return With filter()\n");

		Integer year = 2023;
		Optional<Integer> yearOptional = Optional.of(year);

		boolean is2023 = yearOptional.filter(y -> y == 2023).isPresent();
		boolean is2022 = yearOptional.filter(y -> y == 2022).isPresent();

		System.out.println("Integer year = 2023: yearOptional = Optional.of(year)");
		System.out.println("is2023 = yearOptional.filter(y -> y == 2023).isPresent(): " + is2023);
		System.out.println("is2022 = yearOptional.filter(y -> y == 2022).isPresent(): " + is2022);

		System.out.println("---------\n");

		System.out.println("Optional.ofNullable(modem).map(Modem::getPrice)\n" + ".filter(p -> p >= 10)\n"
				+ ".filter(p -> p <= 15)\n" + ".isPresent()\n");

		System.out.println("priceIsInRange(new Modem(10.0)): " + priceIsInRange(new Modem(10.0)));
		System.out.println("priceIsInRange(new Modem(9.9)): " + priceIsInRange(new Modem(9.9)));
		System.out.println("priceIsInRange(new Modem(15.6)): " + priceIsInRange(new Modem(15.6)));
		System.out.println("priceIsInRange(new Modem(null)): " + priceIsInRange(new Modem(null)));
		System.out.println("priceIsInRange(null): " + priceIsInRange(null));

		System.out.println("---------\n");

		// Transforming Value With map()
		System.out.println("Transforming Value With map()");

		List<String> names = Arrays.asList("Amanda", "Simon", "", "Aida", "Reeve", "");
		Optional<List<String>> listOptional = Optional.of(names);

		int size = listOptional.map(List::size).orElse(0);
		System.out.println("size = listOptional.map(List::size).orElse(0): " + size);

		System.out.println("---------\n");

		// Transforming Value With flatMap()
		System.out.println("Transforming Value With flatMap()");

		Optional<Engineer> engineer = Optional.of(new Engineer(Optional.of("Engineer-One")));
		System.out.println("engineer.map(value -> value.getEname()): " + engineer.map(value -> value.getEname()));
		System.out
				.println("engineer.flatMap(value -> value.getEname()): " + engineer.flatMap(value -> value.getEname()));

		System.out.println("---------\n");
	}

	public static boolean priceIsInRange(Modem modem) {
		return Optional.ofNullable(modem).map(Modem::getPrice).filter(p -> p >= 10).filter(p -> p <= 15).isPresent();
	}
}

class Modem {
	private Double price;

	public Modem(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}

class Engineer {

	private Optional<String> ename;

	public Engineer(Optional<String> ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Engineer{" + "ename=" + ename + '}';
	}

	public Optional<String> getEname() {
		return ename;
	}

	public void setEname(Optional<String> ename) {
		this.ename = ename;
	}
}