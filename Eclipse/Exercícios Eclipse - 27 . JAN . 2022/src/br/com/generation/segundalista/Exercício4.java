//Faça um programa em que permita a entrada 
//de um número qualquer e exiba se este número 
//é par ou ímpar. Se for par exiba também a raiz 
//quadrada do mesmo; se for ímpar exiba o número 
//elevado ao quadrado.

package br.com.generation.segundalista;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	int num;
	double raiz, potencia;
	
	System.out.println("Digite o número inteiro: ");
	num = leia.nextInt();
	
	if (num % 2 == 0) {
		System.out.println("Par.......");
	    raiz = Math.sqrt(num);
	    System.out.printf("Raiz Quadrada: %2f" , raiz);
	}
	else {
		System.out.println("Ímpar:......");
		potencia = Math.pow(num, 2);
		System.out.println("Potência :" + potencia);
		
		leia.close();
		
	}
	}
}   	
	    
	
	


