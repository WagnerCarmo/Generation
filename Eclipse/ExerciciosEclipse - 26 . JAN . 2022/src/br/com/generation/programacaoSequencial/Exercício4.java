/* Escreva  um sistema que leia três números inteiros 
   e positivos (A, B, C) e calcule a seguinte expressão: 

   D = ( R + S ) / 2
   
   R = (A + B)²
   
   S = (B + C)² */
   
package br.com.generation.programacaoSequencial;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
    int a, b, c, r, s, d;
		
	System.out.println("Digite o valor de A: ");
	a = leia.nextInt(); 
	
	System.out.println("Digite o valor de B: ");
	b = leia.nextInt();
	
	System.out.println("Digite o valor de C: ");
	c = leia.nextInt();
	
	r = (a + b)*(a + b); 
	
	s = (b + c)*(b + c);
	
	d = (r + s) / 2;
	
	System.out.println("\nO resultado de D é: " + d + ".");
	System.out.println("\nO resultado de R é: " + r + ".");
	System.out.println("\nO resultado de S é: " + s + ".");
	
	leia.close();
	
	}
	
}
