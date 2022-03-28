/* Faça um sistema que leia a idade de uma pessoa expressa 
   em dias e mostre-a expressa em anos, meses e dias. */

package br.com.generation.exercicio26jan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	    DecimalFormat formaCasa = new DecimalFormat("0"); // --> Formata o número de casas 
	    Math.floor(0); // --> Formata o arredondamento para baixo
	    
		double dias, meses, anos;
		
		System.out.println("Digite a sua idade em dias: ");
		dias = leia.nextInt();

		anos = dias / 365.25;
		
		meses = (dias % 365.25) / (365.25/12);
		
		dias = (dias % 365.25) % (365.25/12);
		
		System.out.println("\nA sua idade completa é de " + formaCasa.format (Math.floor(anos)) 
		+ " Anos, " + formaCasa.format (Math.floor(meses)) + " meses e " + formaCasa.format (Math.floor(dias)) + " dias."); 
	
		leia.close();
	}
}