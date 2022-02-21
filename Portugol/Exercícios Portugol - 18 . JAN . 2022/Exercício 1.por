/* João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
   Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de 
   São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você 
   faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, 
   gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
   Caso contrário mostrar tais variáveis com o conteúdo ZERO. */

programa{

	funcao inicio(){

	real peso, excesso, valor_multa, multa_excesso
	valor_multa = 4
	
	escreva ("Quantos KG de tomate você trouxe?\n")
	leia(peso)

	     se (peso <=50){  
             excesso = 0
             multa_excesso = 0
		
	        escreva ("O peso não foi excedido. Não terá que pagar multa\n")		
	    
	        escreva ("O peso excedente é ", excesso, " Kg. O valor da multa será de R$ " , multa_excesso)
	     }

	        senao { 
		
		   excesso = peso - 50
	        multa_excesso = excesso * 4
	     
	        escreva ("O peso foi excedido em ", excesso, " Kg. Terá que pagar multa de R$ ", multa_excesso)
	        }
	 
     }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1137; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */