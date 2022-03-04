 /* Faça um programa em que permita a entrada de um número qualquer e exiba 
    se este número é par ou ímpar. Se for par, exiba também a raiz quadrada 
    do mesmo. Se for ímpar exiba o número elevado ao quadrado. */

package br.com.generation.primeiralista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		DecimalFormat formaCasa = new DecimalFormat("0.00");
		
		int num, elevadoQuadradado; 
		
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
	
		if (num % 2 == 0) {
			
			double raizQuadrada = Math.sqrt(num);
		
			System.out.println("\nEste número é par e a sua raiz quadrada é " + formaCasa.format (raizQuadrada));
		}
		
		else {
			elevadoQuadradado = num*num; 
		    System.out.println("\nEste número é ímpar e o seu valor elevado ao quadrado é " + elevadoQuadradado);
		}
		
		leia.close();
	
	}
	
}