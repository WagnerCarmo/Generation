//Fa�a um programa em que permita a entrada 
//de um n�mero qualquer e exiba se este n�mero 
//� par ou �mpar. Se for par exiba tamb�m a raiz 
//quadrada do mesmo; se for �mpar exiba o n�mero 
//elevado ao quadrado.

package br.com.generation.segundalista;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	int num;
	double raiz, potencia;
	
	System.out.println("Digite o n�mero inteiro: ");
	num = leia.nextInt();
	
	if (num % 2 == 0) {
		System.out.println("Par.......");
	    raiz = Math.sqrt(num);
	    System.out.printf("Raiz Quadrada: %2f" , raiz);
	}
	else {
		System.out.println("�mpar:......");
		potencia = Math.pow(num, 2);
		System.out.println("Pot�ncia :" + potencia);
		
		leia.close();
		
	}
	}
}   	
	    
	
	


