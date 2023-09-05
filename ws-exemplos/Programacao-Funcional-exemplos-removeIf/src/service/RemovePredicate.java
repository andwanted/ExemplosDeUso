package service;

import java.util.function.Predicate;

import entities.Product;

public class RemovePredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		// TODO Auto-generated method stub
		return p.getPrice() <= 100.00;
	}

}
