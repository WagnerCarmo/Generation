/* Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente. */

package br.com.generation.primeiralista;

import java.util.Scanner;

public class Exerc�cio2RespostaAltenativa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		long[] num = new long[3];

		System.out.print("Digite o 1� n�mero: ");
		num[0] = entrada.nextLong();

		System.out.print("Digite o 2� n�mero: ");
		num[1] = entrada.nextLong();

		System.out.print("Digite o 3� n�mero: ");
		num[2] = entrada.nextLong();
		
		entrada.close();

		boolean flag;

		do {
			flag = false;

			for (int i = 0; i < 2; i++) {

				if (num[i] > num[i + 1]) {

					long aux = num[i];
					num[i] = num[i + 1];
					num[i + 1] = aux;

					flag = true;
				}

			}

		} while (flag);

		System.out.println("\nA ordem crescente dos n�meros �: ");
	
			System.out.print("\n" + num[0] + ", " + num[1] + " e " + num[2] + ".");


	}

}