//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
//A seguir determine e imprima a média aritmética dos lançamentos, 
//contabilize e apresente também quantas foram as ocorrências da maior pontuação.

package br.com.generation.matrizVetor;

import java.util.Random;

public class Exercício02 {

	public static void main(String[] args) {
		Random sorteio = new Random();

		int[] dado = new int[10];
		int lc = 0, md = 0, rpt = 0;

		System.out.println("\nOs números sorteados foram: ");

		for (int i = 0; i < 10; i++) {
			dado[i] = sorteio.nextInt(5) + 1;
			md = md + dado[i];
			if (dado[i] > lc) {
				lc = dado[i];
			}
			System.out.println();
			System.out.println(i + 1 + "º número sorteado foi: " + dado[i]);
		}
		for (int i = 0; i < 10; i++) {
			if (dado[i] == lc) {
				rpt++;
			}
		}
		
			System.out.println("\nA média foi de: " + md / 10);
			
			System.out.println("\nO maior número foi: " + lc + " (ele apareceu " +  rpt + " vezes)");
			
		
	}

}
