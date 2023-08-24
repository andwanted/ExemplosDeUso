package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Pessoa> setPessoas = new HashSet<>();
		setPessoas.add(new Pessoa("Paulo", 11));
		setPessoas.add(new Pessoa("João", 15));

		Pessoa pessoas = new Pessoa("Paulo", 11);

		System.out.println(setPessoas);
		System.out.println(setPessoas.contains(pessoas)); // mesmo contendo valor
		// igual a nome e idade, retorna false // porque esta comparando a posição

		Set<Pessoa> setPessoas2 = new TreeSet<>();

		Pessoa p1 = new Pessoa("Lucas", 15);
		Pessoa p2 = new Pessoa("Jose", 11);

		setPessoas2.add(p1);
		setPessoas2.add(p2);

		for (Pessoa pessoa : setPessoas2) {
			System.out.println(pessoa);
		}

		System.out.println(setPessoas2);
		Pessoa pessoas2 = new Pessoa("Paulo", 11);
		System.out.println(setPessoas2.contains(pessoas2)); // mesmo contendo valor
		// igual a nome e idade, retorna false
		// porque esta comparando a posição

	}

}
