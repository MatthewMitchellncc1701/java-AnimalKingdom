package kingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals racoon = new Mammals("Racoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		List<Classify> allAnimals = new ArrayList<>();

		allAnimals.add(panda);
		allAnimals.add(zebra);
		allAnimals.add(koala);
		allAnimals.add(sloth);
		allAnimals.add(armadillo);
		allAnimals.add(racoon);
		allAnimals.add(bigfoot);

		allAnimals.add(pigeon);
		allAnimals.add(peacock);
		allAnimals.add(toucan);
		allAnimals.add(parrot);
		allAnimals.add(swan);

		allAnimals.add(salmon);
		allAnimals.add(catfish);
		allAnimals.add(perch);

		System.out.println("*** MVP ***");

		System.out.println("\n*** List all the animals in descending order by year named ***");
		allAnimals.sort((v1, v2) -> v2.getYear() - v1.getYear());
		System.out.println(allAnimals);

		System.out.println("\n*** List all the animals alphabetically ***");
		allAnimals.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		System.out.println(allAnimals);

		System.out.println("\n*** List all the animals orded by how they move ***");
		allAnimals.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
		System.out.println(allAnimals);

		System.out.println("\n*** List only those animals the breath with lungs ***");
		List<Classify> filteredList = filterAnimals(allAnimals, v -> v.breath().equals("lungs"));
		printArray(filteredList);

		System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
		filteredList = filterAnimals(allAnimals, v -> (v.getYear() == 1758) && v.breath().equals("lungs"));
		printArray(filteredList);

		System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
		filteredList = filterAnimals(allAnimals, v -> (v.reproduce().equals("eggs")) && v.breath().equals("lungs"));
		printArray(filteredList);

		System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
		filteredList = filterAnimals(allAnimals, v -> v.breath().equals("lungs"));
		printArray(filteredList);

		System.out.println("\n*** Strech Goal ***");
		System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
		filteredList = filterAnimals(allAnimals, v -> v instanceof Mammals);
		printArray(filteredList);
	}

	private static List<Classify> filterAnimals(List<Classify> allAnimals, CheckAnimal tester) {
		List<Classify> tempList = new ArrayList<>();

		for (Classify v : allAnimals) {
			if (tester.test(v)) {
				tempList.add(v);
			}
		}

		return tempList;
	}

	private static void printArray(List<Classify> animals) {
		for (Classify v: animals) {
			System.out.println(v.getName() + " " + v.reproduce() + " " + v.move() + " " + v.breath() + " " + v.getYear());
		}
	}

}