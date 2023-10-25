/*
	A java class that has some utilities to use from the class Zoo.
*/
import java.util.List;
public class ZooUtils {
	public static void mostraCategories(List<Categoria> categories) {
		if (!categories.isEmpty()) {
			System.out.println("Nombre de categories: " + categories.size());
			for (Categoria categoria : categories) {
				System.out.println("\t" + categoria);
			}
		} else {
			System.out.println("Cap categoria");
		}
	}
	public static void mostraAnimals(List<Animal> animals) {
		if (!animals.isEmpty()) {
			System.out.println("Nombre d'animals: " + animals.size());
			for (Animal animal: animals) {
				System.out.println("\t" + animal);
			}
		} else {
			System.out.println("Cap animal");
		}
	}
}
