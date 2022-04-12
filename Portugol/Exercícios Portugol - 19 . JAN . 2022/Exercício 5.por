/* Faça um programa que mostre uma contagem 
   na tela de 233 a 456, só que contando 
   de 3 em 3 quando estiver entre 300 e 400 
   e de 5 em 5 quando não estiver. */

programa {

    funcao inicio () {

       inteiro contador = 456

       enquanto (contador >=300) {

           escreva (contador, ", ")
           contador = contador -3

           enquanto (contador >=233) {

              escreva (contador, ", ")
              contador = contador -5
           }

           escreva("Fim!\n")
       }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */