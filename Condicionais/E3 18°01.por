programa
{
	
/*Desenvolva um sistema em que:
 * Leia 4 (quatro) números;
 * Calcule o quadrado de cada um;
 * Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/
	
	funcao inicio()
	{

     real n1, n2, n3, n4, r1, r2, r3, r4
     
     escreva("entre com o n1 ")
     leia(n1)
     r1=n1*n1 
     
     escreva("entre com o n2 ")
     leia(n2)
     r2=n2*n2
     
     escreva("entre com o n3 ")
     leia(n3)
     r3=n3*n3
     
     escreva("entre com o n4 ")
     leia(n4)
     r4=n4*n4

     se (r3>=1000){
     escreva ("\n", r3,"Imprimir e finalizar")
     }

     senao {
     escreva ("\n O quadrado 1 é ", r1 )
     escreva ("\n O quadrado 2 é ", r2 )
     escreva ("\n O quadrado 3 é ", r3 )
     escreva ("\n O quadrado 4 é ", r4 )
     }
     









		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 678; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */