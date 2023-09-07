package entities;

public class Funcionario {

	private String nome;
	private Integer ano;
	private String cpf;
	private String funcao;
	private Double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, Integer ano, String cpf, String funcao, Double salario) {
		this.nome = nome;
		this.ano = ano;
		this.cpf = cpf;
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + " Ano de ingresso:" + ano + " CPF:" + cpf + " Função:" + funcao + " Salario:R$"
				+ String.format("%.2f", salario);

	}

}
