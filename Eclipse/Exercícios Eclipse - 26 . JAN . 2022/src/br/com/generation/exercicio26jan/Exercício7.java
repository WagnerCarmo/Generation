package br.com.generation.exercicio26jan;

import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
    int a, b, c, d, e, f, x, y;
    
    System.out.println("Insira o valor de A: ");
    a = leia.nextInt();
    
    System.out.println("Insira o valor de B: ");
    b = leia.nextInt();
	
    System.out.println("Insira o valor de C: ");
    c = leia.nextInt();
	 
    System.out.println("Insira o valor de D: ");
    d = leia.nextInt(); 
    
    System.out.println("Insira o valor de E: ");
    e = leia.nextInt();
    
    System.out.println("Insira o valor de F: ");
    f = leia.nextInt();
    
    x = ((c*e)-(b*f))/((a*e)-(b*d));
    
    y = ((a*f)-(c*d))/((a*e)-(b*d));
    
    System.out.println("O valor de X é " + x + "," + " e o valor de Y é " + y + ".");
    
    leia.close();

	}
}