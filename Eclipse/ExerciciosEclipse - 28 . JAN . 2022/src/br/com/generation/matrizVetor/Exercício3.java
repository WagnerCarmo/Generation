/*Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:

  a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
  
  b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2. */

package br.com.generation.matrizVetor;

import java.util.Random;


public class Exerc�cio3 {

	public static void main(String[] args) {
		int[][] m1 = new int[4][6];
		
		int[][] m2 = new int[4][6];
		
		int[][] n1 = new int[4][6];
		
		int[][] n2 = new int[4][6];
		
		    Random sorteio = new Random(); 
			
			for (int l = 0; l < 4; l++) {
				for (int c = 0; c < 6; c++) {
				
   				    n1[l][c] = sorteio.nextInt(100);    
   				    System.out.println("Matriz N1, Posi��o [" + l + "][" + c + "]:" + n1[l][c]);
   				    
   				    n2[l][c] = sorteio.nextInt(100);
   				    System.out.println("Matriz N2, Posi��o [" + l + "][" + c + "]:" + n2[l][c]);
   				    
   				    m1[l][c]=n1[l][c] + n2[l][c];
					
   				    m2[l][c]=n1[l][c] - n2[l][c];
   				    
   				    System.out.println("Matriz M1, Posi��o [" + l + "][" + c + "]:" + m1[l][c]);
   				    System.out.println("Matriz M2, Posi��o [" + l + "][" + c + "]:" + m2[l][c]+"\n");			 
				}
			}			    
		}
	}