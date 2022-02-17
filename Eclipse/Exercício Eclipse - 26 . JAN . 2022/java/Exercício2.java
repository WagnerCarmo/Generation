/*Faça um sistema que leia a idade de uma pessoa 
expressa em dias e mostre-a expressa em anos, meses e dias.*/

package Treino;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	    DecimalFormat formatado = new DecimalFormat("0");
	    Math.floor(0);
	    
		double dias, meses, anos;
		
		System.out.println("Digite a sua idade em dias: ");
		dias = leia.nextInt();

		anos = dias / 365.25;
		
		meses = (dias % 365.25) / (365.25/12);
		
		dias = (dias % 365.25) % (365.25/12);
		
		System.out.println("\nA sua idade completa é de " + formatado.format (Math.floor(anos)) 
		+ " Anos, " + formatado.format (Math.floor(meses)) + " meses e " + formatado.format (Math.floor(dias)) + " dias."); 
	
		leia.close();
	}
}
