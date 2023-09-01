package application;

import services.Sorteio;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorteio<String> sorteio = new Sorteio<String>();
		sorteio.addValue("Felipe");
		sorteio.addValue("Roberto");
		sorteio.addValue("Lucas");

		sorteio.apresentaVencedor();
	}

}
