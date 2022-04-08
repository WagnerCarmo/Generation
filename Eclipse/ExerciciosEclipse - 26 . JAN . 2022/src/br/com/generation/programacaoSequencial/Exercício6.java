package br.com.generation.programacaoSequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
    
	Scanner leia = new Scanner (System.in);
	DecimalFormat formato = new DecimalFormat("0.00");
	Math.sqrt(0);
		
    double x1 = 4 , y1 = 4, x2 = 2, y2 = 2, d;
    
    d = ((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1));
    
    Math.sqrt(d);
    System.out.println("A distância entre eles é de " + formato.format (Math.sqrt(d)));
    
    leia.close();

	}
}