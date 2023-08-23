package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceDouble {

	private List<Double> list = new ArrayList<>();
	

	public void addValue(Double value) {
		list.add(value);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.print("]");
	}

}
