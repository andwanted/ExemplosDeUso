package entities;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		return this.nome.compareTo(outraPessoa.nome);
	}

	@Override
	public String toString() {
		return nome + " (" + idade + " anos)";
	}

}
