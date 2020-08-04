package kingdom;

abstract class Classify {
	private static int nextId = 0;
	protected int id;
	protected String name;
	protected int year;
	protected int food;

	protected String move;
	protected String breath;
	protected String reproduce;

	// void move();

	public Classify(String name, int year, String move, String breath, String reproduce) {
		id = nextId;
		nextId++;
		this.name = name;
		this.year = year;

		this.move = move;
		this.breath = breath;
		this.reproduce = reproduce;
		food = 1;
	}

	int getId() {
		return id;	
	}

	String getName() {
		return name;
	}

	int getYear() {
		return year;
	}

	String move() {
		return move;
	}

	String breath() {
		return breath;
	}

	String reproduce() {
		return reproduce;
	}

	int getFood() {
		return food;
	}

	void addFood() {
		food++;
	}

	void addFood(int food) {
		this.food =+ food;
	}

	void removeFood() {
		food--;
	}

	void removeFood(int food) {
		this.food =- food;
	}

	@Override
	public String toString() {
		return "Animals{id="+ id + ", name='" + name + "', yearNamed=" + year + "}\n";
	}
}