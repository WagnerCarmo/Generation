/* Construa um sistema para ler uma variável numérica N 
   e imprimi-la somente se a mesma for maior que 100, 
   caso contrário imprimi-la com o valor zero. */

programa {
	
	funcao inicio () {
		real vN

		escreva("Digite o número da variável N: ")
		leia(vN)

		se (vN > 100) {
			escreva("\nO valor de N é ", vN,"\n")
		}

		senao {
			escreva("\nO valor de N é 0\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */