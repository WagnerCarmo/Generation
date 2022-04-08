/* Fa�a um sistema que leia as 3 notas de um aluno e calcule 
   a m�dia final deste aluno. Considerar que a m�dia � ponderada 
   e que o peso das notas �: 2, 3 e 5, respectivamente. */

package br.com.generation.programacaoSequencial;

import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double PrNota, SgNota, TcNota, medAluno;

		System.out.println("Digite a primeira nota: ");
		PrNota = leia.nextDouble();

		System.out.println("Digite a segunda nota: ");
		SgNota = leia.nextDouble();

		System.out.println("Digite a terceira nota: ");
		TcNota = leia.nextDouble();

		medAluno = ((PrNota / 10) * 2) + ((SgNota / 10) * 3) + ((TcNota / 10) * 5);

		if (medAluno > 10 || medAluno < 0) {
			System.out.println("M�DIA INV�LIDA");
		}

		else {

			System.out.println("A m�dia do aluno �: " + medAluno);

			leia.close();
		}
	}
}