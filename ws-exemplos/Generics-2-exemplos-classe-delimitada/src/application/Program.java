package application;

import services.Operacoes;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacoes<Integer> operacoesInt = new Operacoes<>(10, 5);
		System.out.println("Soma: " + operacoesInt.somar());
		System.out.println("Subtra��o: " + operacoesInt.subtrair());

		Operacoes<Double> operacoesDouble = new Operacoes<>(7.5, 2.0);
		System.out.println("Multiplica��o: " + operacoesDouble.multiplicar());
		System.out.println("Divis�o: " + operacoesDouble.dividir());

	}

}
