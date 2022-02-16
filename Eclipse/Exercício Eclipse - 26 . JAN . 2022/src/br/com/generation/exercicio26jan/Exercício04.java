package br.com.generation.exercicio26jan;

import java.util.Scanner;

//Escreva  um sistema que leia três números inteiros e positivos 
//(A, B, C) e calcule a seguinte expressão: 
//, onde   

public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int a, b, c,d, e, f, r, s;
		
		System.out.println("Digite o número de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número de b: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número de c: ");
		c = leia.nextInt();
		
		e = a + b;
		r = e * e;
		
		f = (b + c);
		s = (f * f);
	
		d = (r + s)/2;
		
		System.out.println("o número de r é: " + r);
		
		System.out.println("o número de s é: " + s);
		
		System.out.println("O número de d é: " + d);
		
		leia.close();

	}

}
