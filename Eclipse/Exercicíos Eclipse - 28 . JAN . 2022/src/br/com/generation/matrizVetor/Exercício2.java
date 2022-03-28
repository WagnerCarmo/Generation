/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um 
   programa que gere um vetor com os lançamentos, escreva esse vetor. 
   A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
   e apresente também quantas foram as ocorrências da maior pontuação. */

package br.com.generation.matrizVetor;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercício2 {

	public static void main(String[] args) {

		Random sorteio = new Random();
		DecimalFormat formaCasa = new DecimalFormat("0.0");

		int[] dado = new int[10];
		int lancamento = 0, maiorNumero = 0, maiorNumRepet = 0;
		double somaDado = 0, media = 0;

		System.out.println("Os números sorteados foram:\n ");

		for (lancamento = 0; lancamento < 10; lancamento++) {

			dado[lancamento] = sorteio.nextInt(6) + 1;

			System.out.print("[" + dado[lancamento] + "] ");

			somaDado = somaDado + dado[lancamento];
			media = somaDado / lancamento;
		
			if (dado[lancamento] > maiorNumero) {
				maiorNumero = dado[lancamento];

				maiorNumRepet = 1;
			}
				
			else if (dado[lancamento] == maiorNumero) {			
				    maiorNumRepet++;
			}
		}
		
		System.out.println("\n\nA média dos números sorteados é de " + formaCasa.format(media) + ".");
		
		System.out.println("\nO maior número sorteado foi " + maiorNumero + " (" + maiorNumRepet + " vezes sortedo).");
	}
}
