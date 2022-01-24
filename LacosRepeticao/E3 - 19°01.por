programa
{
	
/*
Elaborar um programa que efetue a leitura sucessiva de 
valores numéricos e apresente no final o total do somatório, 
a média e o total de valores lidos. O programa deve fazer as 
leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
*/
	
	funcao inicio()
	{

	real num, total
     inteiro vezesLido
   
	num = 0
	total = 0
	vezesLido = 0

	enquanto(num>=0){
		
		escreva("\nDigite um Número:")
	     leia(num)
	     
	     se (num>=0){
	     total+=num
	     vezesLido++
            
	     }  

	     }
	   	
          escreva("\nValores Totais: ",total)
          escreva("\nMédia Total: ",total/vezesLido)
          escreva("\nValores Lidos: ", vezesLido)


          

	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 624; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */