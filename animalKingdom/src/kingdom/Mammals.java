package kingdom;

public class Mammals extends Classify {

	public Mammals(String name, int year) {
		super(name, year, "walk", "lungs", "live births");
	}

	// // @Override
	// public String move() {
	// 	return "walk";
	// }

	// // @Override
	// public String breath() {
	// 	return "lungs";
	// }

	// // @Override
	// public String reproduce() {
	// 	return "live births";
	// }
}