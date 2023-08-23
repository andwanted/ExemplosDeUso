package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list = new ArrayList<>();
	

	public void addValue(T value) {
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
