package app.javapandit.java5.enumeration;

public class Java_EnumerationExample {

	public static void main(String[] args) {

		Direction west = Direction.WEST;
		System.out.println("Direction.WEST = " + west);
		System.out.println();

		DirectionWithAngle northWithAngle = DirectionWithAngle.NORTH;
		System.out.println("DirectionWithAngle.NORTH = " + northWithAngle);
		System.out.println("DirectionWithAngle.NORTH.getAngle() = " + northWithAngle.getAngle());
		System.out.println();

		// ordinal Example
		System.out.println("Direction.EAST.ordinal() = " + Direction.EAST.ordinal());
		System.out.println("Direction.SOUTH.ordinal() = " + Direction.SOUTH.ordinal());
		System.out.println();

		// values() Example
		Direction[] directions = Direction.values();
		System.out.print("Direction.values() = ");
		for (Direction d : directions) {
			System.out.print(" | " + d);
		}
		System.out.println(" |");
		System.out.println();

		// valueOf() Example
		Direction east = Direction.valueOf("EAST");
		System.out.println("Direction.valueOf(\"EAST\") = " + east);
		System.out.println();

		// Compare Two Enumerations
		System.out.println("east == Direction.EAST : " + (east == Direction.EAST));
		System.out.println("west.equals(Direction.WEST) : " + west.equals(Direction.WEST));
	}

}

enum Direction {
	EAST, WEST, NORTH, SOUTH;
}

enum DirectionWithAngle {
	EAST(0), WEST(180), NORTH(90), SOUTH(270);

	// Constructor
	private DirectionWithAngle(final int inputAngle) {
		this.angle = inputAngle;
	}

	// Internal State
	private int angle;

	public int getAngle() {
		return this.angle;
	}
}