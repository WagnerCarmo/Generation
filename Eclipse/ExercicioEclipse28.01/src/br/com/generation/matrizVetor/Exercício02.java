//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
//Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
//contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

package br.com.generation.matrizVetor;

import java.util.Random;

public class Exerc�cio02 {

	public static void main(String[] args) {
		Random sorteio = new Random();

		int[] dado = new int[10];
		int lc = 0, md = 0, rpt = 0;

		System.out.println("\nOs n�meros sorteados foram: ");

		for (int i = 0; i < 10; i++) {
			dado[i] = sorteio.nextInt(5) + 1;
			md = md + dado[i];
			if (dado[i] > lc) {
				lc = dado[i];
			}
			System.out.println();
			System.out.println(i + 1 + "� n�mero sorteado foi: " + dado[i]);
		}
		for (int i = 0; i < 10; i++) {
			if (dado[i] == lc) {
				rpt++;
			}
		}
		
			System.out.println("\nA m�dia foi de: " + md / 10);
			
			System.out.println("\nO maior n�mero foi: " + lc + " (ele apareceu " +  rpt + " vezes)");
			
		
	}

}
