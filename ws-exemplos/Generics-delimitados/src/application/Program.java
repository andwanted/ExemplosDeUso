package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> listaProduct = new ArrayList<>();
		listaProduct.add(new Product("Arroz", 10.10, 1));
		listaProduct.add(new Product("Feijão", 8.30, 2));
		listaProduct.add(new Product("Sabonete liquido", 3.0, 3));
		listaProduct.add(new Product("Ração para cachorro", 35.00, 4));
		
		
		
		System.out.println(CalculationService.max(listaProduct));
	}

}
