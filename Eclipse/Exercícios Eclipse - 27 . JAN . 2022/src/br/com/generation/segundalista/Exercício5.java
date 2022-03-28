/* Crie um programa que leia um número do teclado até 
   que encontre um número igual a zero. No final, mostre 
   a soma dos números digitados.(Método "Do...While") */

package br.com.generation.segundalista;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner (System.in);

		int num, soma = 0;
		
		Thread.sleep(150); System.out.print("O");
		Thread.sleep(150); System.out.print("l");
		Thread.sleep(150); System.out.print("á");
		Thread.sleep(150); System.out.print("!\n");
			
		do {
			Thread.sleep(500); System.out.print("\nPor favor, digite um número: ");
			num = leia.nextInt();
		    
			soma += num; // --> soma = soma + num		
		}
	    
		while (num != 0);
			
		System.out.println("\nA soma de todos os valores digitados é: " + soma);
		
	    leia.close();
	}
}