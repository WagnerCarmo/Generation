/*Desenvolva um sistema em que:
 
 - Leia 4 (quatro) números;
 - Calcule o quadrado de cada um;
 -Se o valor resultante do quadrado do terceiro for maior ou igual a 1000, imprima-o e finalize;
 - Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

programa{
	
	funcao inicio(){

        real n1, n2, n3, n4, r1, r2, r3, r4
     
        escreva("Entre com o n1: ")
        leia(n1)
     
        r1=n1*n1 
     
        escreva("Entre com o n2: ")
        leia(n2)
        
        r2=n2*n2
     
        escreva("Entre com o n3: ")
        leia(n3)
     
        r3=n3*n3
     
        escreva("Entre com o n4: ")
        leia(n4)
      
        r4=n4*n4

           se (r3>=1000){
           escreva ("\nO resultado de n3 ao quadrado é ", r3,"\nImprimir e finalizar\n")
           }

              senao {
              escreva ("\nO resultado de n1 ao quadrado é ", r1)
              
              escreva ("\nO resultado de n2 ao quadrado é ", r2)
              
              escreva ("\nO resultado de n3 ao quadrado é ", r3)
              
              escreva ("\nO resultado de n4 ao quadrado é ", r4,"\n")
              }
              
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 770; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */