/* Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente. */

package br.com.generation.primeiralista;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;

		System.out.print("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();

		System.out.print("\nDigite o segundo n�mero: ");
		n2 = leia.nextInt();

		System.out.print("\nDigite o terceiro n�mero: ");
		n3 = leia.nextInt();

		if (n1 <= n2 && n2 <= n3) {

			System.out.print("\nA odem crescente �: " + n1 + ", " + n2 + " e " + n3 + ".");
		}

		else if (n1 <= n3 && n3 <= n2) {

			System.out.print("\nA odem crescente �: " + n1 + ", " + n3 + " e " + n2 + ".");
		}

		else if (n2 <= n1 && n1 <= n3) {

			System.out.print("\nA ordem crescente dos n�meros �: " + n2 + ", " + n1 + " e " + n3 + ".");
		}

		else if (n2 <= n3 && n3 <= n1) {

			System.out.print("\nA odem crescente �: " + n2 + ", " + n3 + " e " + n1 + ".");
		}

		else if (n3 <= n2 && n2 <= n1) {

			System.out.print("\nA odem crescente �: " + n3 + ", " + n2 + " e " + n1 + ".");
		}

		else {

			System.out.print("\nA odem crescente �: " + n3 + ", " + n1 + " e " + n2 + ".");
		}

		leia.close();		
	}
}