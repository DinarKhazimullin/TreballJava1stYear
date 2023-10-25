/*
	A java class that has some utilities to use from the class Zoo. This time we implemented a procedure to display all categories
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
}
