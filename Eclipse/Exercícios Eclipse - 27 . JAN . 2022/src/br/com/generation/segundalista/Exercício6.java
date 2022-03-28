/* Escrever um programa que receba v�rios n�meros inteiros no teclado. 
   E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair, 
   digitar 0 (zero). (M�todo "Do...While")*/

package br.com.generation.segundalista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc�cio6 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner (System.in);
		DecimalFormat formaCasa = new DecimalFormat("0.0");
		
		int num = 0;	
		double mediaMultTres = 0, nMultTres = 0, contMultTres = 0;
		
		Thread.sleep(70); System.out.print("O");
		Thread.sleep(70); System.out.print("l");
		Thread.sleep(70); System.out.print("�");
		Thread.sleep(70); System.out.print("!\n");
		
		Thread.sleep(700); System.out.print("\nI");Thread.sleep(70); System.out.print("n");Thread.sleep(70); System.out.print("i");
		Thread.sleep(70); System.out.print("c");Thread.sleep(70); System.out.print("i");Thread.sleep(70); System.out.print("a");
		Thread.sleep(70); System.out.print("n");Thread.sleep(70); System.out.print("d");Thread.sleep(70); System.out.print("o ");
		Thread.sleep(70); System.out.print("o ");Thread.sleep(70); System.out.print("S");Thread.sleep(70); System.out.print("i");
		Thread.sleep(70); System.out.print("s");Thread.sleep(70); System.out.print("t");Thread.sleep(70); System.out.print("e");
		Thread.sleep(70); System.out.print("m");Thread.sleep(70); System.out.print("a");Thread.sleep(70); System.out.print(".");
		Thread.sleep(70); System.out.print(".");Thread.sleep(70); System.out.print(".\n");
		
		do {
			Thread.sleep(1200); System.out.print("\nDigite um n�mero: ");
			num = leia.nextInt();
			
			if (num % 3 == 0) {
				nMultTres += num;
				
				contMultTres++; // contMultTres = contMultTres +1
			}		
		}
				
		while (num != 0);
		
		    contMultTres--;    
		
		    mediaMultTres = nMultTres / contMultTres;
		   
		    System.out.println("\nA m�dia dos n�meros m�ltiplos de 3 � " + formaCasa.format(mediaMultTres));
		
		    leia.close();
	}
}