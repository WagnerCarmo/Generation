package br.com.generation.exercicio26jan;

import java.util.Scanner;

//5. Fa�a um sistema que leia as 3 notas de um aluno 
//e calcule a m�dia final deste aluno. 
//Considerar que a m�dia � ponderada e que o 
//peso das notas �: 2,3 e 5, respectivamente. 

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2 ,n3, n4, n5, n6, ma;
		
		System.out.println("Insira a primeira nota: ");
		n1 = leia.nextDouble();
				
		System.out.println("Insira a segunda nota: ");
		n2 = leia.nextDouble();
				
	    System.out.println("Insira a terceira nota: ");
		n3 = leia.nextDouble();
		
		n4 = (n1*2)/10;
		n5 = (n2*3)/10;
		n6 = (n3*5)/10;
		
		ma = n4+n5+n6;
		
		
		
		if (ma >10 || ma < 0) {
	    System.out.println("M�DIA INV�LIDA"); 
	    
	  
		
		
		
		
		
		} else {
			System.out.println("A m�dia do aluno � de: " + ma);
			
			leia.close();
		}
		
	}

}
