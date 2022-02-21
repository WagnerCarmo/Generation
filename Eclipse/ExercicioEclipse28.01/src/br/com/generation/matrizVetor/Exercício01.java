//Faça um programa que crie um vetor por 
//leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. 
//Encontre após a maior pontuação e a apresente.

package br.com.generation.matrizVetor;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] pts = new double[5];
		double pMaior = 0;
		
		System.out.println("Digite os números: ");
		for(int l = 0; l <= 4; l++) {
		
		System.out.println((l+1)+ "°5 Número");
		pts[l] = entrada.nextDouble();
		
		   if(pts[l]>pMaior) {
			pMaior=pts[l];
		       
		   }
		
		System.out.println("O número maior é: " + pMaior);
		
		entrada.close();
       
		}
		
	}
	
}
	


