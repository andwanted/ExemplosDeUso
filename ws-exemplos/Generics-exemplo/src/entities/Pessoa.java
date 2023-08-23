package entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String name;
	private int idade;
	
	List<Pessoa> Pessoas = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoa(String name, int idade) {
		this.name = name;
		this.idade = idade;
	}
	
	public void addPessoa(String nome,Integer idade) {
		
	}

}
