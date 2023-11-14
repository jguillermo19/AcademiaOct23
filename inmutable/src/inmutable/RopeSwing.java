package inmutable;

public class RopeSwing {
	private static final String leftRope;
	private static final String rightRope;
	private final String bench; // NO COMPILE
	private static final String name = "name";

	RopeSwing() {
		bench = "bench";
	}

	static {
		leftRope = "left";
		rightRope = "right";
	}
	static {
		//name = "name"; // NO COMPILE
		//rightRope = "right"; // NO COMPILE
	}

	public static void main(String[] args) {
		//bench = "bench"; // NO COMPILE
	}
}
