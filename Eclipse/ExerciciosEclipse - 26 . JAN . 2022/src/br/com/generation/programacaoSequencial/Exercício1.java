/* Fa�a um sistema que leia a idade de uma 
   pessoa expressa em anos, meses e dias e 
   mostre-a expressa apenas em dias */

package br.com.generation.programacaoSequencial;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    
    int idade, dia;
    double mes, ano;
       
    System.out.println("Digite a sua idade em... ");
    
    System.out.println("\nAnos: "); 
    ano = leia.nextInt(); 
    
    System.out.println("Meses: "); 
    mes = leia.nextInt();
     
    System.out.println("Dias: ");
    dia = leia.nextInt();
    
    idade = (int) ((ano*365.25) + (mes*(365.25/12)) + dia);
    
    System.out.println("\nVoc� tem " + idade + " dias de idade");
    
    leia.close();
    
	}	
}