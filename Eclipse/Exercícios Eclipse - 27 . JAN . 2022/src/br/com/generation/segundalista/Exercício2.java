/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (Método "For") */

package br.com.generation.segundalista;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
        
		Scanner leia = new Scanner(System.in);
	
		int num, contPar = 0, contImpar = 0; 
	
		System.out.println("Olá");
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("\nDigite o " + i + "° número: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				
				contPar = contPar + 1;			
			}
			
			else {
				  
				contImpar = contImpar + 1;
			}     		
		}

		System.out.println("\nSão " + contPar + " números pares e " + contImpar + " números ímpares.");
		
		leia.close();
	}
}
