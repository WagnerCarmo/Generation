package br.com.generation.exercicio26jan;

import java.util.Scanner;

//Escreva  um sistema que leia tr�s n�meros inteiros e positivos 
//(A, B, C) e calcule a seguinte express�o: 
//, onde   

public class Exerc�cio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int a, b, c,d, e, f, r, s;
		
		System.out.println("Digite o n�mero de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o n�mero de b: ");
		b = leia.nextInt();
		
		System.out.println("Digite o n�mero de c: ");
		c = leia.nextInt();
		
		e = a + b;
		r = e * e;
		
		f = (b + c);
		s = (f * f);
	
		d = (r + s)/2;
		
		System.out.println("o n�mero de r �: " + r);
		
		System.out.println("o n�mero de s �: " + s);
		
		System.out.println("O n�mero de d �: " + d);
		
		leia.close();

	}

}
