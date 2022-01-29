//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:

//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.



package br.com.generation.matrizVetor;

import java.util.Random;
import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		int[][] m1 = new int[4][6];
		
		int[][] m2 = new int[4][6];
		
		int[][] n1 = new int[4][6];
		
		int[][] n2 = new int[4][6];
		
		    Random sorteio = new Random(); 
			Scanner leia = new Scanner(System.in);
			

			for (int l = 0; l < 4; l++) {
				for (int c = 0; c < 6; c++) {
					System.out.println("Matriz N1, Posição [" + l + "][" + c + "]:");
				
   				    n1[l][c] = sorteio.nextInt(100);
   				 
   				    System.out.println("Matriz N2, Posição [" + l + "][" + c + "]:");
   				    n2[l][c] = sorteio.nextInt(100);
					
   				    m1[l][c]=n1[l][c] + n2[l][c];
					
   				    m2[l][c]=n1[l][c] - n2[l][c];
   				    
   				    System.out.println("Matriz M1, Posição [" + l + "][" + c + "]:" + m1[l][c]);
   				    System.out.println("Matriz M2, Posição [" + l + "][" + c + "]:" + m2[l][c]);
   				    
				} 
			}
			
				
				 leia.close();
				 
				
		}

	}