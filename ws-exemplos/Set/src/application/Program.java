package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> stringSet = new HashSet<>();

		stringSet.add("Ma��");
		stringSet.add("Banana");
		stringSet.add("Ma��"); // Tentativa de adicionar um elemento duplicado

		System.out.println(stringSet);
		System.out.println(stringSet.add("Uva"));
		System.out.println(stringSet.add("Uva"));
		System.out.println(stringSet);
		System.out.println();

		/*
		 * saida [Ma��, Banana] true false [Uva, Ma��, Banana] true false [Uva, Ma��,
		 * Banana]
		 */

		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Jos�");
		treeSet.add("Andr�");
		treeSet.add("Daniel");

		System.out.println(treeSet); // imprime de forma ordenada [Andr�, Daniel, Jos�]
		// algumas opera��es
		treeSet.add("Lucas");
		treeSet.remove("Daniel");
		System.out.println(treeSet); // [Andr�, Jos�, Lucas]
		System.out.println(treeSet.first()); // Andr�
		System.out.println(treeSet.last()); // Lucas
		System.out.println();

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(1);
		linkedHashSet.add(3);
		linkedHashSet.add(6);
		linkedHashSet.add(4);
		linkedHashSet.add(5);

		System.out.println(linkedHashSet); // imprime conforme foi adicionado [1, 3, 6, 4, 5]
		linkedHashSet.add(2);
		System.out.println(linkedHashSet); // [1, 3, 6, 4, 5, 2]
		System.out.println(linkedHashSet.contains(1)); // true
		System.out.println(linkedHashSet.contains(7)); // false
		linkedHashSet.removeIf(x -> x >= 3);
		System.out.println(linkedHashSet); //[1, 2]

	}

}
