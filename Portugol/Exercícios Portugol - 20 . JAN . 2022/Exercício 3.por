/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 
   a) Uma matriz M1 cujos elementos serão as somas dos elementos de 
      mesma posição das matrizes N1 e N2;
 
   b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
      de mesma posição das matrizes N1 e N2.*/


programa {

     inclua biblioteca Util
	
	    funcao inicio() {

         inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
         inteiro b, t, s
         
            para(b = 0; b <4; b++) {
         	     
         	      para(t = 0; t <6; t++) {  
         	
         	      N1[b][t] = Util.sorteia(-100, 100)
         	      N2[b][t] = Util.sorteia(-100, 100)
         	      M1[b][t] = N1[b][t] + N2[b][t]
         	      M2[b][t] = N1[b][t] - N2[b][t]

         	      }
            }

            para(s = 0; s <2; s++) {
         	  
         	  escreva("\nValores da Matriz M", s+1, "\n")
         	      
         	      para (b = 0; b < 4; b++) {
         	   	
         	   	      para (t = 0; t < 6; t++) {
                  
                        se(s==0) {
                  	   
                  	    escreva("[", M1[b][t], "] ")
                  	
                        }
                      
                     senao {
                  	
                  	 escreva("[", M2[b][t],"] " )
                                                                             
                     escreva("[", M1[b][t],"] ")
                                    
                     }                         	   		 
         	   	 }
         	   	  
         	   	 escreva("\n")
         	   
            }
                     
         }      
          
     }
     
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1683; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */