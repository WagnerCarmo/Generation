/* Fa�a um sistema que leia o tempo de dura��o de um evento 
   em uma f�brica expressa em segundos e mostre-o expresso 
   em horas, minutos e segundos. */

package br.com.generation.programacaoSequencial;

import java.util.Scanner;

public class Exerc�cio3 {
  
	public static void main(String[] args) {
    	  
		Scanner leia = new Scanner(System.in);
	
	int seg, min, hora;
	
	System.out.println("Digite a dura��o do evento em segundos: ");
	seg = leia.nextInt();
	
	hora = seg / 3600;
	min = (seg % 3600) / 60;
	seg = (seg % 3600) % 60;
	
	System.out.println("\nO tempo do evento � de " + hora + " Horas, "  + min + " Minutos e "  + seg + " Segundos."  );
	
    leia.close();
  
	}	
}