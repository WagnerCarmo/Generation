 /* Crie um programa que receba valores do usuário para preencher uma 
    matriz 3X3 e em seguida, exiba a soma dos valores dela e a soma 
    dos valores da primeira diagonal, ou seja, a diagonal principal. */

package br.com.generation.matrizVetor;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
			
		int [][] matriz = new int [3][3];
		
		Scanner leia = new Scanner(System.in);
			
		int somaMatriz = 0, somaDiagonal = 0;

		System.out.println("Prencha abaixo as posições da matriz.\n");
			
		for (int l = 0; l < 3; l++) {
				
		   for (int c = 0; c < 3; c++) {
		  	   			
		  	  System.out.print("Posição ["+ l +"]["+ c +"]: ");			
	          matriz [l][c] = leia.nextInt();
		  			
	          somaMatriz = somaMatriz + matriz [l][c];
		  	    		  	     
		  	  if (l == c) {
		  	 		   
		  	     somaDiagonal = somaDiagonal + matriz [l][c]; 
		  	  }
		   } 
	    }
				
	    System.out.println("\nSoma dos valores na matriz: " + somaMatriz);
			
		System.out.println("Soma da diagonal principal: " + somaDiagonal);
				
		leia.close();
	}
}