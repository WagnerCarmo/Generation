/* Faça um programa que entre com três números e coloque em ordem crescente. */

package br.com.generation.primeiralista;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;

		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextInt();

		System.out.print("\nDigite o segundo número: ");
		n2 = leia.nextInt();

		System.out.print("\nDigite o terceiro número: ");
		n3 = leia.nextInt();

		if (n1 <= n2 && n2 <= n3) {

			System.out.print("\nA odem crescente é: " + n1 + ", " + n2 + " e " + n3 + ".");
		}

		else if (n1 <= n3 && n3 <= n2) {

			System.out.print("\nA odem crescente é: " + n1 + ", " + n3 + " e " + n2 + ".");
		}

		else if (n2 <= n1 && n1 <= n3) {

			System.out.print("\nA ordem crescente dos números é: " + n2 + ", " + n1 + " e " + n3 + ".");
		}

		else if (n2 <= n3 && n3 <= n1) {

			System.out.print("\nA odem crescente é: " + n2 + ", " + n3 + " e " + n1 + ".");
		}

		else if (n3 <= n2 && n2 <= n1) {

			System.out.print("\nA odem crescente é: " + n3 + ", " + n2 + " e " + n1 + ".");
		}

		else {

			System.out.print("\nA odem crescente é: " + n3 + ", " + n1 + " e " + n2 + ".");
		}

		leia.close();		
	}
}