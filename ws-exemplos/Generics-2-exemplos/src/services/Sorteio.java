package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio<T> {

	private List<T> lista = new ArrayList<>();

	public void addValue(T value) {
		lista.add(value);
	}

	public void apresentaVencedor() {
		Random r = new Random();
		int posVencedor = r.nextInt(lista.size());
		System.out.println("O sorteado foi: " + lista.get(posVencedor));
	}

}
