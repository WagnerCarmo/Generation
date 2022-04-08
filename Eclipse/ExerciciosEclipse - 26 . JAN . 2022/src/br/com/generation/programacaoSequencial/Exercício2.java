/* Fa�a um sistema que leia a idade de uma pessoa expressa 
   em dias e mostre-a expressa em anos, meses e dias. */

package br.com.generation.programacaoSequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	    DecimalFormat formaCasa = new DecimalFormat("0"); // --> Formata o n�mero de casas 
	    Math.floor(0); // --> Formata o arredondamento para baixo
	    
		double dias, meses, anos;
		
		System.out.println("Digite a sua idade em dias: ");
		dias = leia.nextInt();

		anos = dias / 365.25;
		
		meses = (dias % 365.25) / (365.25/12);
		
		dias = (dias % 365.25) % (365.25/12);
		
		System.out.println("\nA sua idade completa � de " + formaCasa.format (Math.floor(anos)) 
		+ " Anos, " + formaCasa.format (Math.floor(meses)) + " meses e " + formaCasa.format (Math.floor(dias)) + " dias."); 
	
		leia.close();
	}
}