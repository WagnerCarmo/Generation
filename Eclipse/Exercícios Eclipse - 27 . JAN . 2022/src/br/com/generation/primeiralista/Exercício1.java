/* Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. */

package br.com.generation.primeiralista;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2, n3, nMaior;

		System.out.print("Digite o 1� n�mero: ");
		n1 = leia.nextInt();

		System.out.print("\nDigite o 2� n�mero: ");
		n2 = leia.nextInt();

		System.out.print("\nDigite o 3� n�mero: ");
		n3 = leia.nextInt();

		if (n1 > n2 && n1 > n3) {
			nMaior = n1;
		}

		else if (n2 > n3) {	
			nMaior = n2;
		}

		else {
			nMaior = n3;
		}

		System.out.println("\n" + nMaior + " � o maior n�mero.");
		leia.close();
	}
}