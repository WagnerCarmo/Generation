/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (M�todo "For") */

package br.com.generation.segundalista;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
        
		Scanner leia = new Scanner(System.in);
	
		int num, contPar = 0, contImpar = 0; 
	
		System.out.println("Ol�");
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("\nDigite o " + i + "� n�mero: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				
				contPar = contPar + 1;			
			}
			
			else {
				  
				contImpar = contImpar + 1;
			}     		
		}

		System.out.println("\nS�o " + contPar + " n�meros pares e " + contImpar + " n�meros �mpares.");
		
		leia.close();
	}
}