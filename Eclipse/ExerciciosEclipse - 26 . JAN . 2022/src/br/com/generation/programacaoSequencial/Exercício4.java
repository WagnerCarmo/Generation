/* Escreva  um sistema que leia tr�s n�meros inteiros 
   e positivos (A, B, C) e calcule a seguinte express�o: 

   D = ( R + S ) / 2
   
   R = (A + B)�
   
   S = (B + C)� */
   
package br.com.generation.programacaoSequencial;

import java.util.Scanner;

public class Exerc�cio4 {

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
	
	System.out.println("\nO resultado de D �: " + d + ".");
	System.out.println("\nO resultado de R �: " + r + ".");
	System.out.println("\nO resultado de S �: " + s + ".");
	
	leia.close();
	
	}
	
}
