/* Um dado é lançado 10 vezes e o valor correspondente é anotado. 
   Faça um programa que gere um vetor com os lançamentos, escreva 
   esse vetor. A seguir determine e imprima a média aritmética dos 
   lançamentos, contabilize e apresente também quantas foram as 
   ocorrências da maior pontuação. */

programa {
	
     inclua biblioteca  Util
		
	funcao inicio () {
	
	inteiro lcto[10], cont, nv = 0 , maior = 0
     real soma = 0.0   
	
           para (cont=0; cont<10; cont++) {
	           lcto[cont] = Util.sorteia(1,6)    
	      
	           se (lcto[cont]>maior) {
	              maior = lcto[cont]
	              nv = 1
	           }

	           senao se(lcto[cont] == maior) {
	           nv++
	           
	           }
	           
	      soma+=lcto[cont]
	           
	      }
	           
	      para (cont=0; cont < 10; cont++) {	
	           escreva("[", lcto[cont], "],")
	     
	      }
	     
           escreva("\nMédia de: ", soma/10, "\nNº de Aparições: ",nv,"\n")
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 999; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */