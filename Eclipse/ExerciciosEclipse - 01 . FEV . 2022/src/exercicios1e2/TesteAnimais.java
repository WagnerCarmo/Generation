package exercicios1e2;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Cachorro cao = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica preg = new Preguica();
		
		System.out.println("- Cachorro -\n");
		cao.setNome("Bangueludo");
		cao.setIdade(5);
		System.out.println("Nome: " + cao.getNome());
		System.out.println("Idade: " + cao.getIdade() + " Anos");
		cao.emiteSom();
		cao.corre();
		
		System.out.println("\n- Cavalo -\n");
		cav.setNome("Gigante");
		cav.setIdade(7);
		System.out.println("Nome: " + cav.getNome());
		System.out.println("Idade: " + cav.getIdade() + " Anos");
		cao.emiteSom();
		cao.corre();
		
		System.out.println("\n- Preguiça -\n");
		preg.setNome("Ligeira");
	    preg.setIdade(24);
	    System.out.println("Nome:" + preg.getNome());
	    System.out.println("Idade:" + preg.getIdade()); 
	    preg.emiteSom();
	    preg.sobeArvore(); 
	
	    leia.close();
	}
}