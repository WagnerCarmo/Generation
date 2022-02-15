package br.com.generation.exercicio26jan;

import java.util.Scanner;

//1. Faça um sistema que leia a idade de uma pessoa 
//expressa em anos, meses e dias e mostre-a expressa apenas em dias


public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dia, mes, ano, idade;
		
	   dia = 1;
	   mes = (365/12);
	   ano = 365;
	   idade = dia*mes*ano;
	   
		System.out.println("Qual é sua idade em anos: ");
		ano = leia.nextInt();
		
		System.out.println("Meses: ");
		mes = leia.nextInt();
		
		System.out.println("Dias: ");
		dia = leia.nextInt();
		
		System.out.println("A sua idade em dias é de: " + idade + " dias");
		
		
		leia.close();
		
	}

}
