//Fa�a um programa que crie um vetor por 
//leitura com 5 valores de pontua��o de uma
//atividade e o escreva em seguida. 
//Encontre ap�s a maior pontua��o e a apresente.

package br.com.generation.matrizVetor;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] pts = new double[5];
		double pMaior = 0;
		
		System.out.println("Digite os n�meros: ");
		for(int l = 0; l <= 4; l++) {
		
		System.out.println((l+1)+ "�5 N�mero");
		pts[l] = entrada.nextDouble();
		
		   if(pts[l]>pMaior) {
			pMaior=pts[l];
		       
		   }
		
		System.out.println("O n�mero maior �: " + pMaior);
		
		entrada.close();
       
		}
		
	}
	
}
	


