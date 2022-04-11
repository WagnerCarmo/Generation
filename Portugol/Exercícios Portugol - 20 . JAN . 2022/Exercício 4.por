/* Crie um programa que receba valores do usuário para 
   preencher uma matriz 3X3, e em seguida, exiba a soma 
   dos valores dela e a soma dos valores da primeira 
   diagonal, ou seja, diagonal principal. */

programa {
	
inclua biblioteca Util
	
	funcao inicio () {
     
	 	inteiro Matriz[3][3]
     	inteiro linha, coluna
	     inteiro somaMatriz = 0, somaDiagonal = 0
     
          escreva("O") Util.aguarde(200) escreva("l") Util.aguarde(200) escreva("á") Util.aguarde(200)
          escreva(".") Util.aguarde(500)escreva(".") Util.aguarde(500)escreva(".\n\n") Util.aguarde(500)
          	           
	     para (linha = 0; linha <3; linha++) {
         	     
         	    para (coluna = 0; coluna <3; coluna++) {
              
	             escreva("Preencha a posição [",linha,"]","[",coluna,"]: ")
		        leia(Matriz[linha][coluna])
              
		        somaMatriz = somaMatriz + Matriz[linha][coluna]
               
		        se (linha == coluna) {
               
		            somaDiagonal = somaDiagonal + Matriz[linha][coluna]			      	
		        }
	         }
	     }
	     
	     escreva("\nA soma de toda matriz é: ", somaMatriz,"\n")
     
          escreva("\nA soma da principal diagonal é: ", somaDiagonal,"\n")

          escreva("\nAguarde.") Util.aguarde(700)escreva(".") Util.aguarde(700)escreva(".\n") Util.aguarde(900)
     }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */