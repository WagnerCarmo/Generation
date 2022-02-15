package br.com.generation.exercicio26jan;

import java.util.Scanner;

//2. Faça um sistema que leia a idade de uma pessoa 
//expressa em dias e mostre-a expressa em anos, meses e dias. 

public class Exercicio02 {

	public static void main(String[] args) {
		

Scanner leia = new Scanner(System.in);
		
		int dia, mes, ano;
		

	  
	 		   
		System.out.println("Qual é sua idade em dias: ");
		dia = leia.nextInt();
		
		   ano = dia / 365;
		   mes = (dia % 365) / 30;
		   dia = (dia % 365) % 30; 
				   
		System.out.println("A sua idade em dias é de: " + ano + " anos " + mes  + " meses " + dia + " dias. ");
		
		
		leia.close();
		
	}

}
