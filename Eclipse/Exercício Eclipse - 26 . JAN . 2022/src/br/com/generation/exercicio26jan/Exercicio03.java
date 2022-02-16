package br.com.generation.exercicio26jan;

import java.util.Scanner;

//3. Faça um sistema que leia o tempo de duração de um evento 
//em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.

public class Exercicio03 {

	public static void main(String[] args) {
		
    Scanner leia = new Scanner(System.in);
		
		int seg, min, hora;
		

	  		   
		System.out.println("Tempo em segundos: ");
		seg = leia.nextInt();
		
		   hora = seg / 3600;
		   min = (seg % 3600) / 60;
		   seg = (seg % 3600) % 60; 
				   
		System.out.println("O tempo do evento é de: " + hora + " horas " + min  + " minutos " + seg + " segundos. ");
		
		
		leia.close();
		
	}

}