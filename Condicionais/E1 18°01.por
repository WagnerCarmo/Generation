programa
{

	
	funcao inicio()
	{

	real peso, excesso, valor_multa, multa_excesso
	valor_multa = 4
	
      
	escreva ("Quantos KG de tomate você trouxe?\n")
	leia(peso)

	se (peso <=50){
          excesso = 0
          multa_excesso = 0
		escreva ("O peso não foi excedido, não terá que pagar multa\n ")
		escreva ("O peso excedente é ", excesso, "O valor da multa será ", multa_excesso)
		}

	senao { 
		
		excesso = peso - 50
	     multa_excesso = excesso * 4
	     escreva ("O peso foi excedido em ", excesso, "Kg terá que pagar multa de ", multa_excesso, "R$ ")

	 
	
}}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */