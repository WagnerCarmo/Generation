
//Crie um programa que receba valores do usu�rio para preencher 
//uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a 
//soma dos valores da primeira diagonal, ou seja, diagonal principal.

package br.com.generation.matrizVetor;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
			
			int[][] matriz = new int[3][3];
	
			
			Scanner leia = new Scanner(System.in);
			int somaMatriz = 0, somaDiagonal = 0;

			for (int l = 0; l < 3; l++) {
				for (int c = 0; c < 3; c++) {
					System.out.println("Posi��o [" + l + "][" + c + "]:");
					matriz[l][c] = leia.nextInt();
					somaMatriz = somaMatriz + matriz[l][c];
					
				  } System.out.println();
			    
			      } System.out.println("A soma dos valores na matriz �: " + somaMatriz);
			for (int l=0; l<3; l++) {
			    for (int c=0; c<3; c++) {
					 if (l==c) {
						 somaDiagonal = somaDiagonal + matriz[l][c];
					 }
						
			}
		}
				System.out.println("A soma da diagonal principal desta Matriz � de: " + somaDiagonal);
				
				leia.close();
				
	}

}
