/* Fa�a um programa que receba a idade de uma pessoa 
   e mostre na sa�da em qual categoria ela se encontra:

   � 10-14 infantil,
   � 15-17 juvenil,
   � 18-25 adulto. */

package br.com.generation.primeiralista;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
    
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String categoria = "";
		
		System.out.println("Ol�!");
		
		System.out.print("\nPor favor, digite a sua idade: ");
        idade = leia.nextInt();
        
        if(idade >= 10 && idade <= 14) {
        	categoria = "infantil";	
        }
		
        else if (idade >= 15 && idade <= 17) {
        	categoria = "juvenil"; 
        }
        
        else if(idade >= 18 && idade <= 25) {
        	categoria = "adulto";
        }
        
        else {
        	categoria = "\"N�o Especificada\"";  	    	 	
        }  	 

        System.out.println("\nVoc� est� na categoria: " + categoria + ".");
            
        leia.close();       
	}	
}