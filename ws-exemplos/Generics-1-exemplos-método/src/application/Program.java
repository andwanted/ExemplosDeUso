package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Uso do m�todo gen�rico
		Integer[] inteiros = { 1, 2, 3 };
		String[] strings = { "Ol�", "Mundo" };

		//imprimirArray(inteiros);
		imprimirArray(strings);

	}

	public static void imprimirArray(String[] array) {
		for (String elemento : array) {
			System.out.println(elemento);
		}
	}

}
