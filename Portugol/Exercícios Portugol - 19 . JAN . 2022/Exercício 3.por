/* Elabore um programa que efetue a leitura sucessiva de valores numéricos 
   e apresente no final o total do somatório, a média e o total de valores 
   lidos. O programa deve fazer as leituras dos valores enquanto o usuário
   estiver fornecendo valores positivos. Ou seja, o programa deve parar 
   quando o usuário fornecer um valor negativo. */

programa {
		
	funcao inicio () {

	   real total, num
        inteiro vezesLido
   
	   num = 0.0
	   total = 0.0
	   vezesLido = 0

	   enquanto (num >= 0) {
		
	   	 escreva("Digite um número: ")
	   	 leia(num)
	     
	      se (num >= 0) {
	      	total += num
	      	vezesLido++ 
	      }  
	  }
	   	
       	escreva("\nA soma de todos os valores é: ",total)
         
       	escreva("\nA média de todos os valores é: ",total/vezesLido)
          
       	escreva("\nQuantidade de valores lidos: ", vezesLido,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 450; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */