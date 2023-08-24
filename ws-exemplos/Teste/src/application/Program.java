package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		 Set<Pessoa> setPessoas = new TreeSet<>();

	        Pessoa pessoa1 = new Pessoa("Paulo", 30);
	        Pessoa pessoa2 = new Pessoa("João", 25);

	        setPessoas.add(pessoa1);
	        setPessoas.add(pessoa2);

	        System.out.println("Elementos no TreeSet:");
	        for (Pessoa pessoa : setPessoas) {
	            System.out.println(pessoa);
	        }
	}

}
