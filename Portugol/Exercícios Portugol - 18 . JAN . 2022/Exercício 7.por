/* Receber valores de base e altura de um triângulo e verificar 
   se são valores válidos (positivos maiores que zero). 
   Em caso afirmativo, calcular a área do triângulo. */

programa {
	
	funcao inicio () {

		real base, altura, area

		escreva("Digite o tamanho da base do triângulo: ")
		leia(base)

		escreva("Digite a altura do triângulo: ")
		leia(altura)
		
		se (base <= 0 ou altura <= 0) {
          	escreva ("\nErro!!! A base e a altura devem ser maiores do que '0'.\n")
          }

          senao {

			area = base * altura / 2	
          	
          	escreva ("\nA área do triângulo é de ", area,"\n") 	
          }   
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */