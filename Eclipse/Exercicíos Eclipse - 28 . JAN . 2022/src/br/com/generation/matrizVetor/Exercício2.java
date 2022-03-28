/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um 
   programa que gere um vetor com os lan�amentos, escreva esse vetor. 
   A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize 
   e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o. */

package br.com.generation.matrizVetor;

import java.text.DecimalFormat;
import java.util.Random;

public class Exerc�cio2 {

	public static void main(String[] args) {

		Random sorteio = new Random();
		DecimalFormat formaCasa = new DecimalFormat("0.0");

		int[] dado = new int[10];
		int lancamento = 0, maiorNumero = 0, maiorNumRepet = 0;
		double somaDado = 0, media = 0;

		System.out.println("Os n�meros sorteados foram:\n ");

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
		
		System.out.println("\n\nA m�dia dos n�meros sorteados � de " + formaCasa.format(media) + ".");
		
		System.out.println("\nO maior n�mero sorteado foi " + maiorNumero + " (" + maiorNumRepet + " vezes sortedo).");
	}
}
