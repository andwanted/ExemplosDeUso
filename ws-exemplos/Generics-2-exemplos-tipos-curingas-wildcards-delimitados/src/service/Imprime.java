package service;

import java.util.List;

import entities.Animal;

public class Imprime {

	public static void imprimirSons(List<? extends Animal> animais) {
		for (Animal animal : animais) {
			animal.fazerSom();
		}
	}
}
