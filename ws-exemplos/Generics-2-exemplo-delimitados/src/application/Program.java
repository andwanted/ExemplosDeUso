package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import services.Calcula;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Mouse",10,50.0));
		produtos.add(new Produto("Tablet",5,200.0));
		produtos.add(new Produto("Case HD",3,430.0));
		
		System.out.println("O total dos produtos é: " + Calcula.calcularTotal(produtos));
		
	}

}
