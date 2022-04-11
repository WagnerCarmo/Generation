/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 
   a) Uma matriz M1 cujos elementos serão as somas dos elementos de 
      mesma posição das matrizes N1 e N2;
 
   b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
      de mesma posição das matrizes N1 e N2.*/

  programa {

     inclua biblioteca Util
	
	funcao inicio () {
			
        inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
        inteiro linha, coluna
        
        escreva("Matriz N1:\n\n") 
        
        para (linha = 0; linha <4; linha++) {
         	     
         	 para (coluna = 0; coluna <6; coluna++) {  
         	   
         	      N1[linha][coluna] = Util.sorteia(0, 50)

                escreva("[",N1[linha][coluna],"]")	 
			 
			 Util.aguarde(50)
         	 }	     
         	 
         	 escreva("\n")	
        }

	   escreva("\nMatriz N2:\n\n") 
        
        para (linha = 0; linha <4; linha++) {
         	     
         	 para (coluna = 0; coluna <6; coluna++) {  
         	   
         	      N2[linha][coluna] = Util.sorteia(0, 50)

                escreva("[",N2[linha][coluna],"]")	 
	   	 	 
	    	 	 Util.aguarde(50)  
           }
           
           escreva("\n") 
        }
           
        escreva("\nMatriz M1:\n\n") 
        
        para (linha = 0; linha <4; linha++) {
         	     
         	 para (coluna = 0; coluna <6; coluna++) {  
         	   
         	      M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
                     
                escreva("[",M1[linha][coluna],"]")	 
	   	 	 
	    	 	 Util.aguarde(50)  
           }
           
           escreva("\n") 
        }         
                 
        escreva("\nMatriz M2:\n\n") 
        
        para (linha = 0; linha <4; linha++) {
         	     
         	 para (coluna = 0; coluna <6; coluna++) {  

                se (N1[linha][coluna] > N2[linha][coluna]) {

				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
                }

		      senao {		
                	
                	M2[linha][coluna] = N2[linha][coluna] - N1[linha][coluna]
                }
         	      
                escreva("[",M2[linha][coluna],"]")	 
	   	 	 
	    	 	 Util.aguarde(50)  
           }
           
           escreva("\n") 
        }                  
     }
  }
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1936; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */