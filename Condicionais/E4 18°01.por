programa
{ 

/*Faça um sistema que leia um número inteiro e 
mostre uma mensagem indicando se este número é par ou ímpar, 
e se é positivo ou negativo.*/
	 
	
	funcao inicio()
	{
	inteiro num
	
	
	escreva ("Escreva o número desejado: ")
	leia(num)

          
            se (num % 2 == 0) 
               {escreva("\nNúmero Par")}
                  
               senao {escreva ("\nNúmero Ímpar")}

            se (num >=0) 
               {escreva ("\nPositivo ")}

               senao {escreva ("\nNegativo ")}
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */