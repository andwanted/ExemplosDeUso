package application;

import java.util.List;
import services.Impressora;

public class Program {

	public static void main(String[] args) {

		List<Integer> listaInteiros = List.of(1, 2, 3);
		List<String> listaStrings = List.of("A", "B", "C");
		Impressora.imprimirColecao(listaInteiros); // Saída: 1 2 3
		Impressora.imprimirColecao(listaStrings); // Saída: A B C
		
	}
}
