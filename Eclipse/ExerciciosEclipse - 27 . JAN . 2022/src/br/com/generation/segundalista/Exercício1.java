/* Informe todos os números de 1000 a 1999 que quando divididos 
   por 11 obtemos resto = 5. (Utilizar o Método "FOR") */

package br.com.generation.segundalista;

public class Exercício1 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Os números divididos por 11 em que o valor do resto é 5, são:\n");

		int cont = 0;
		
		for (int i = 1000; i <= 1999; i++) {

			if (i % 11 == 5) {
				Thread.sleep(80); System.out.print(i + " • ");
				cont++;
			}

			if (cont == 9) {
				System.out.println("\n");
				cont = 0;
			}
		}
	}
}