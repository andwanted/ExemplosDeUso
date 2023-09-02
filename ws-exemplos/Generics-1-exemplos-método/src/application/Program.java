package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Uso do método genérico
		Integer[] inteiros = { 1, 2, 3 };
		String[] strings = { "Olá", "Mundo" };

		imprimirArray(inteiros);
		imprimirArray(strings);

	}

	public static <T> void imprimirArray(T[] array) {
		for (T elemento : array) {
			System.out.println(elemento);
		}
	}

}
