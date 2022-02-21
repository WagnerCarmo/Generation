package br.com.generation.exercicio1;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cachorro cao = new Cachorro();
		Cavalo cav = new Cavalo(); 
		Preguiça preg = new Preguiça();
		
		cao.setNome("Demo (Cachorro)");
		cao.setIdade(7);
		System.out.println("Nome:" + cao.getNome());
		System.out.println("Idade:" + cao.getIdade());
		cao.emiteSom();
		cao.corre();
	     
		System.out.println();
		
	    cav.setNome("Gigante (Cavalo)");
	    cav.setIdade(9);
	    System.out.println("Nome:" + cav.getNome());
	    System.out.println("Idade:" + cav.getIdade()); 
	    cao.emiteSom();
	    cao.corre();       	

	    System.out.println();
	    
	    preg.setNome("Ligeira (Preguiça)");
	    preg.setIdade(24);
	    System.out.println("Nome:" + preg.getNome());
	    System.out.println("Idade:" + preg.getIdade()); 
	    preg.emiteSom();
	    preg.sobeArvore();       	
   
	}
}