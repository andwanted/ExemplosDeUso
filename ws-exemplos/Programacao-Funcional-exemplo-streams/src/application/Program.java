package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		List<Funcionario> funcionarioLista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho do arquivo: ");
		String caminho = sc.nextLine();
		System.out.print("Digite o valor menor: ");
		Double menor = sc.nextDouble();
		System.out.print("Digite o valor maior: ");
		Double maior = sc.nextDouble();
		System.out.print("Digite a letra inicial: ");
		char inicial = sc.next().charAt(0);
		System.out.print("Digite a letra inicial para excluir: ");
		char exclui = sc.next().charAt(0);

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			String linha = br.readLine();
			while (linha != null) {

				String[] parte = linha.split(",");
				String nome = parte[0];
				Integer ano = Integer.parseInt(parte[1]);
				String cpf = parte[2];
				String funcao = parte[3];
				Double salario = Double.parseDouble(parte[4]);

				funcionarioLista.add(new Funcionario(nome, ano, cpf, funcao, salario));
				linha = br.readLine();
			}
			
			funcionarioLista.forEach(System.out::println);
			
			System.out.println("Pressione Enter para ordernar os dados");
			sc.nextLine();
			sc.nextLine();
			
			Comparator<Funcionario> comp1 = (s1,s2) -> s1.getNome().compareTo(s2.getNome().toUpperCase());
			List<Funcionario> listaOrdenada = funcionarioLista.stream()
					.sorted(comp1).collect(Collectors.toList());
			
			listaOrdenada.forEach(System.out::println);
			
			System.out.println("Pressione Enter para apresentar o total da soma dos salarios");
			sc.nextLine();
			
			
			Double totalSalario = funcionarioLista.stream()
					.map(p -> p.getSalario())
					.reduce(0.00,(x,y) -> x+y);	
					
			System.out.println("Valor do salario total: " + String.format("%.2f", totalSalario));
			
			System.out.println("Pressione Enter para apresentar a media dos salarios");
			sc.nextLine();
					
			
			Double media = funcionarioLista.stream()
					.map(p -> p.getSalario())
					.reduce(0.00,(x,y) -> x+y / funcionarioLista.size());
			
			System.out.println("A media dos salaros é: " + media);
			
			System.out.println("Pressione Enter para apresentar a lista ordenada por salario menor que: " + menor);
			sc.nextLine();
			
			Comparator<Funcionario> comp2 = (s1,s2) -> s1.getSalario().compareTo(s2.getSalario());	
			List<Funcionario> listaMenor = funcionarioLista.stream()
					.filter(p -> p.getSalario() < menor)
					.sorted(comp2.reversed())
					.collect(Collectors.toList());
				
			listaMenor.forEach(System.out::println);
			
			
			System.out.println("Pressione Enter para apresentar a lista ordenada por salario maior que: " + maior);
			sc.nextLine();
			
			List<Funcionario> listaMaior = funcionarioLista.stream()
					.filter(p -> p.getSalario() >= maior)
					.sorted(comp2.reversed())
					.collect(Collectors.toList());
				
			listaMaior.forEach(System.out::println);
			
			System.out.println("Pressione Enter para apresentar nomes que iniciam com: " + inicial);
			sc.nextLine();
			sc.nextLine();
			
			List<Funcionario> listaInicial = funcionarioLista.stream()
					.filter(p -> p.getNome().charAt(0) == inicial)
					.sorted(comp1).
					collect(Collectors.toList());
			
			listaInicial.forEach(System.out::println);
			
			System.out.println("Pressione Enter para apresentar nomes que não iniciam com: " + exclui);
			sc.nextLine();
			sc.nextLine();
			
			List<Funcionario> listaExclui = funcionarioLista.stream()
					.filter(p -> p.getNome().charAt(0) != exclui)
					.sorted(comp1).
					collect(Collectors.toList());
			
			listaExclui.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
