package application;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exemplos Equals

		String str1 = "Elefante";
		String str2 = "Leão";
		System.out.println(str1.equals(str2));

		Integer a = 45;
		Integer b = 34;
		System.out.println(a.equals(b));

		// Exemplos HashCode
		String str3 = "Jose";
		String str4 = "Jaco";
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		// Equals e HashCode personalizados
		Aluno a1 = new Aluno("Pedro", 10);
		Aluno a2 = new Aluno("Marcos", 10);
		System.out.println(a1.equals(a2));

		// Operador ==
		String str5 = "Lucas";
		String str6 = "Lucas";
		System.out.println(str5 == str6);
		Aluno a3 = new Aluno("Pedro", 10);
		Aluno a4 = new Aluno("Pedro", 10);
		System.out.println(a3 == a4);
	}

}
