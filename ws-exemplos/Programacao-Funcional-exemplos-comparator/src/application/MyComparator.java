package application;

import java.util.Comparator;

import entities.Product;

//2 implementando a interface Comparator<t> que é uma interface funcional
// oq é uma interface funcional, tem apenas um método abstrato, pode ter defaul e statico, mas o método implementado deve ser o abstrado

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
