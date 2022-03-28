/* Informe todos os n�meros de 1000 a 1999 que quando divididos 
   por 11 obtemos resto = 5. (Utilizar o M�todo "FOR") */

package br.com.generation.segundalista;

public class Exerc�cio1 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Os n�meros divididos por 11 em que o valor do resto � 5, s�o:\n");

		int cont = 0;
		
		for (int i = 1000; i <= 1999; i++) {

			if (i % 11 == 5) {
				Thread.sleep(80); System.out.print(i + " � ");
				cont++;
			}

			if (cont == 9) {
				System.out.println("\n");
				cont = 0;
			}
		}
	}
}