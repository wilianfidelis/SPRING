package aplicacao;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
			
		Pessoa p1 = new Pessoa(1, "Wilian fidelis", "wilian@gamil.com");
		Pessoa p2 = new Pessoa(1, "Ana fidelis", "ana@gamil.com");
		Pessoa p3 = new Pessoa(1, "Theo fidelis", "theo@gamil.com");
	
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
