package services;

import java.util.List;

public class Impressora {
	public static void imprimirColecao(List<?> colecao) {
		for (Object elemento : colecao) {
			System.out.println(elemento);
		}
	}
}