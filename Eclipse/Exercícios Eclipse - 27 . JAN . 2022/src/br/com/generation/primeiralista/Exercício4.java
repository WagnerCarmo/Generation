 /* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba 
    se este n�mero � par ou �mpar. Se for par, exiba tamb�m a raiz quadrada 
    do mesmo. Se for �mpar exiba o n�mero elevado ao quadrado. */

package br.com.generation.primeiralista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		DecimalFormat formaCasa = new DecimalFormat("0.00");
		
		int num, elevadoQuadradado; 
		
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
	
		if (num % 2 == 0) {
			
			double raizQuadrada = Math.sqrt(num);
		
			System.out.println("\nEste n�mero � par e a sua raiz quadrada � " + formaCasa.format (raizQuadrada));
		}
		
		else {
			
			elevadoQuadradado = num*num; 
		    System.out.println("\nEste n�mero � �mpar e o seu valor elevado ao quadrado � " + elevadoQuadradado);
		}
		
		leia.close();
	}	
}