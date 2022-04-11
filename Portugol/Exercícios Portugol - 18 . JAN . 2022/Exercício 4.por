/* Faça um sistema que leia um número inteiro e 
   mostre uma mensagem indicando se este número 
   é par ou ímpar, e se é positivo ou negativo.*/

programa { 
	
	funcao inicio () {
	inteiro num
		
	escreva ("Digite o número desejado: ")
	leia(num)
  
          se (num % 2 == 0) {
            	
              escreva("\nO número é par e ")
          }
                  
          senao {
               	
              escreva ("\nO número é ímpar e ")
          }   
              
          se (num >= 0) {
              	
              escreva ("positivo\n")
          }   
              
          senao {
               	
              escreva ("negativo\n")  
          }
     }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 507; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */