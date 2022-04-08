/* Faça um programa que receba três inteiros e diga qual deles é o maior. */

package br.com.generation.primeiralista;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2, n3, nMaior;

		System.out.print("Digite o 1° número: ");
		n1 = leia.nextInt();

		System.out.print("\nDigite o 2° número: ");
		n2 = leia.nextInt();

		System.out.print("\nDigite o 3° número: ");
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

		System.out.println("\n" + nMaior + " é o maior número.");
		leia.close();
	}
}