package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		ArrayList<Loja> Lojas = new ArrayList<>();
		System.out.println("Digite a quantidade de produtos para cadastro: ");
		
		int prod1 = leia.nextInt();
		
		for (int i=0; i<prod1; i++){
		
			System.out.println("Produto: ");
			
			String produto = leia.next();
	
			System.out.println("Custo: ");
			int custo = leia.nextInt();
		    
			Lojas.add(new Loja(produto,custo)); 	
		}
		
		for (Loja i: Lojas) {
			
			System.out.println(i);
	    }
		
		leia.close();
	}
}