/* Desenvolva um sistema que efetue a soma de todos os números 
   ímpares que são múltiplos de três e que se encontram no 
   conjunto dos números de 1 até 500. */

programa {
	
	funcao inicio () {

     inteiro contador, qtde = 0, soma = 0
 
          para (contador = 1; contador <=500; contador+=2) {

	          se (contador % 3 == 0) {
		         soma = soma + contador qtde++
	          }
	     }

		escreva("A soma de todos os valores solicitados é de ", soma, "\n")  	
     }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */