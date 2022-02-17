/*Construa um programa tendo como dados de entrada 
 dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
 escreva a distância entre eles. A fórmula que efetua tal cálculo é:
 
 d = √(x2 - x1)² + (y2 - y1)²
 
 */

package Treino;

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