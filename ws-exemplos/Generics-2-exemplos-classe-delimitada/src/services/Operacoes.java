package services;

public class Operacoes<T extends Number> {
	private T valor1;
	private T valor2;

	public Operacoes(T valor1, T valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public double somar() {
		return valor1.doubleValue() + valor2.doubleValue();
	}

	public double subtrair() {
		return valor1.doubleValue() - valor2.doubleValue();
	}

	public double multiplicar() {
		return valor1.doubleValue() * valor2.doubleValue();
	}

	public double dividir() {
		return valor1.doubleValue() / valor2.doubleValue();
	}
}