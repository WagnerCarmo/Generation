/* Faça um programa que crie um vetor por leitura com 
   5 valores de pontuação de uma atividade e o escreva 
   em seguida. Encontre após a maior pontuação e a apresente. */

package br.com.generation.matrizVetor;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double [] pontuacao = new double [5];
		double maiorPontuacao = 0;	
		int l = 0;
		
		System.out.println("Olá!\n");
		
		for (l = 0; l <= 4; l++) {
		
		System.out.print("Digite a " + (l+1) + "ª Pontuação: ");
		pontuacao[l] = leia.nextDouble();
		
		if (pontuacao[l] < 0 || pontuacao[l] > 10) {
			
		   System.out.print("\nPONTUAÇÃO INVÁLIDA!!! Por favor reinicie sistema.\n");
				
		   break;			
		}
	
		if (pontuacao[l] > maiorPontuacao) {
			  
		       maiorPontuacao = pontuacao[l];	       
		    }    	
		}		
		
		if (l == 5) {
			
		   System.out.println("\nA maior pontuação é: " + maiorPontuacao);		   
		}
		
		leia.close();
	}
}