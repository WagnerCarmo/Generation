/* Uma empresa desenvolveu uma pesquisa para saber as características 
   psicológicas dos indivíduos de uma região. Para tanto, a cada uma 
   das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-outros), 
   e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a 
   pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados 
   de 150 pessoas, calcule e mostre: 

   • O número de pessoas calmas; 
   • O número de mulheres nervosas; 
   • O número de homens agressivos; 
   • O número de outros calmos;
   • O número de pessoas nervosas com mais de 40 anos; 
   • O número de pessoas calmas com menos de 18 anos.

   (Método 'While') */

package br.com.generation.segundalista;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) throws InterruptedException {

		Scanner leia = new Scanner(System.in);

		int idade, sexo, persona, numPessoas = 0, pessoaCalma = 0, mulheNerv = 0, homemAgressivo = 0, outroCalmo = 0,
				nervosasMais40 = 0, calmasMenos18 = 0;

		Thread.sleep(90); System.out.print("O");
		Thread.sleep(90); System.out.print("l");
		Thread.sleep(90); System.out.print("á");
		Thread.sleep(90); System.out.print("!\n");

		Thread.sleep(1500); System.out.print("\nIniciando o Sistema...\n");

		while (numPessoas < 150) {

			Thread.sleep(1000); System.out.println("\nIdade em Anos: ");
			idade = leia.nextInt();

			System.out.println("\nSexo: [1] Feminino; [2] Masculino e [3] Outro.");
			sexo = leia.nextInt();

			System.out.println("\nPersonalidade: [1] Calma; [2] Nervosa e [3] Agressiva.");
			persona = leia.nextInt();

			if (persona == 1) {
				pessoaCalma++;
			}

			if (sexo == 1 && persona == 2) {
				mulheNerv++;
			}

			if (sexo == 2 && persona == 3) {
				homemAgressivo++;
			}

			if (sexo == 3 && persona == 1) {
				outroCalmo++;
			}

			if (persona == 2 && idade > 40) {
				nervosasMais40++;
			}

			if (persona == 1 && idade < 18) {
				calmasMenos18++;
			}
            
			Thread.sleep(800); System.out.print("\nAdicionando Dados");
			Thread.sleep(800); System.out.print(".");
			Thread.sleep(800); System.out.print(".");
			Thread.sleep(800); System.out.print(". ");
			
			numPessoas++;
			
			if (numPessoas < 150) {
				Thread.sleep(1200); System.out.print("Próximo Indivíduo:\n");
			}	
		}
		
		Thread.sleep(800); System.out.print("\n\nPor favor, aguarde");
		Thread.sleep(800); System.out.print(".");
		Thread.sleep(800); System.out.print(".");
		Thread.sleep(800); System.out.print(".\n");

		System.out.println("\nResultado:\n");

		System.out.println("Pessoas Calmas: " + pessoaCalma);
		System.out.println("Mulheres Nervosas: " + mulheNerv);
		System.out.println("Homens Agressivos: " + homemAgressivo);
		System.out.println("Outros Calmos: " + outroCalmo);
		System.out.println("Pessoas Nervosas com Mais de 40 anos: " + nervosasMais40);
		System.out.println("Pessoas Calmas com Menos de 18 anos: " + calmasMenos18);

		System.out.println("\nSistema Encerrado!");

		leia.close();
	}
}