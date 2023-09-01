package application;

import java.util.List;

import entities.Cachorro;
import entities.Gato;
import service.Imprime;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());

		Imprime.imprimirSons(cachorros);
		Imprime.imprimirSons(gatos);

	}

}
