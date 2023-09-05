package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.RemovePredicate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product("Bicicleta", 500.00, 000000, 55533));
		list.add(new Product("Removedor", 10.00, 20 - 05 - 2023, 55533));
		list.add(new Product("Feijao - 5kg", 20.00, 10 - 07 - 2023, 55520));
		list.add(new Product("Notebook", 2000.00, 000000, 55510));
		list.add(new Product("Camiseta Polo", 80.00, 000000, 55510));

		list.removeIf(new RemovePredicate());
		
		for (Product l : list) {
			System.out.println(l);
		}

	}

}
