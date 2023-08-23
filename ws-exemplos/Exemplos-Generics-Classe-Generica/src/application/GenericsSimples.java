package application;

import java.util.ArrayList;
import java.util.List;

public class GenericsSimples {

	public static void main(String[] args) {

		List<String> listString = new ArrayList<>(List.of("Maçã", "Pera", "Uva"));
		List<Integer> listInteger = new ArrayList<>(List.of(10, 23, 5));

		imprime(listString);
		// com o uso de wildcards tipo curinga, deixando o método mais generico porem
		imprime(listInteger);

	}

	public static void imprime(List<?> value) {

		for (Object v : value) {
			System.out.println(v);
		}

	}

}
