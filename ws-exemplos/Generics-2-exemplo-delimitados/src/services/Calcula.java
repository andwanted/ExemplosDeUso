package services;

import java.util.List;

import entities.Produto;

public class Calcula {

	public static <T extends Produto>int calcularTotal(List<T> list) {

		Integer total = 0;

		for (T produto : list) {
			total += produto.getQuantidade();
		}

		return total;

	}

}
