package application;


import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		PrintService<String> ps = new PrintService<String>();
		ps.addValue("Anderson");
		ps.addValue("Jose");
		ps.addValue("Pedro");
		
		ps.print();
		
	}

}
