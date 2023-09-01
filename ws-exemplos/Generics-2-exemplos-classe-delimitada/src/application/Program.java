package application;

import services.Operacoes;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacoes<Integer> operacoesInt = new Operacoes<>(10, 5);
		System.out.println("Soma: " + operacoesInt.somar());
		System.out.println("Subtração: " + operacoesInt.subtrair());

		Operacoes<Double> operacoesDouble = new Operacoes<>(7.5, 2.0);
		System.out.println("Multiplicação: " + operacoesDouble.multiplicar());
		System.out.println("Divisão: " + operacoesDouble.dividir());

	}

}
