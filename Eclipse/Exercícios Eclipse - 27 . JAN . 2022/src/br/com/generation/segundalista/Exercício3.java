/* Solicitar a idade de várias pessoas e imprimir: 
  
   - O total de pessoas com menos de 21 anos 
   - Total de pessoas com mais de 50 anos. 
   
   O programa termina quando a idade digitada for -99. (while) */

package br.com.generation.segundalista;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idadeDigitada = 0, quantidadeJovem = 0, quantidadeIdosa = 0;

		System.out.println("Olá!");

		while (idadeDigitada != -99) {

			System.out.print("\nDigite a idade da pessoa: ");
			idadeDigitada = leia.nextInt();

			if (idadeDigitada >= 0 && idadeDigitada < 21) {
				quantidadeJovem = quantidadeJovem + 1;
			}

			if (idadeDigitada > 50) {
				quantidadeIdosa = quantidadeIdosa + 1;
			}

		}

		if (quantidadeJovem == 0 && quantidadeIdosa > 0) {

			System.out.println("\nNo total, nenhuma pessoa possui menos de 21 anos e " + quantidadeIdosa + " pessoas com mais 50 anos.");
		}

		else if (quantidadeJovem > 0 && quantidadeIdosa == 0) {

			System.out.println("\nNo total, são " + quantidadeJovem + " pessoas com menos de 21 anos e nenhuma pessoa com mais 50 anos.");

		}

		else if (quantidadeJovem == 0 && quantidadeIdosa == 0) {

			System.out.println("\nNo total, nenhuma pessoa possui menos de 21 anos ou mais 50 anos.");

		}

		else {

			System.out.println("\nNo total, são " + quantidadeJovem + " pessoas com menos de 21 anos e " + quantidadeIdosa + " pessoas com mais 50 anos.");

		}

		leia.close();

	}

}