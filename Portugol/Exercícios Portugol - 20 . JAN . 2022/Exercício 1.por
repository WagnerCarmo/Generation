/* Faça um programa que crie um vetor por leitura com 5 valores 
   de pontuação de uma atividade e o escreva em seguida. Encontre 
   após a maior pontuação e a apresente.*/

programa {

	funcao inicio() {

       inteiro cont, pont[5], mPts = 0

            para (cont = 0; cont<5; cont++) {

            escreva("Pontos: ")
            leia (pont[cont])

                se (pont[cont]> mPts) { //ganha a maior pontuação
                   mPts =pont[cont] //guarda a maior pontuação            
                
                }
          
            }
	        
	        //escreva (pont[0], "\n", pont[3]) (para saber o valor que foi atribuido)
	        
	       limpa()
	        
	       para (cont = 0; cont<5; cont++) {
	            escreva("\nPontos: ", pont[cont],"\n")
	      		
	       } 
		           
		  escreva("\nA maior pontuação: ", mPts,"Pts\n")
		  
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 876; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */