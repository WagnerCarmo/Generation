/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
   coletando dados sobre o salário e número de filhos. 
   
   A prefeitura deseja saber:
      
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00 . */

programa {
	   
	 funcao inicio() {
	 
	 inteiro filhos = 0
      inteiro  mediaFilhos = 0.00
      real salario = 0.00
      real mediaSalarios = 0.00
      real totalSalarios = 0.00
      real totalFilhos = 0.00
      real maiorSalario = 0.00
      real porc = 0
        
        const inteiro habitantes =  20 // 20 habitantes para simulação

            para(inteiro x=1; x <= habitantes; x++) {

                escreva("Digite o salario: ")
                leia (salario)
                
                escreva("Número de filhos: ")
                leia (filhos)
                
                totalSalarios = totalSalarios + salario
                totalFilhos = totalFilhos + filhos

                se (salario > maiorSalario) {
                    maiorSalario = salario

                   se (salario<=100) {
                   	   porc = porc +1           
                   }
                }            
            }
               
            mediaSalarios = totalSalarios / habitantes
            
            mediaFilhos = totalFilhos / habitantes

            escreva("\nMédia Salarial da cidade: R$ ",mediaSalarios)
            
            escreva("\nMédia filhos da cidade: ",mediaFilhos)
           
            escreva("\nMaior salário da cidade: R$ ",maiorSalario)
            
            escreva("\nPorcentagem de pessoas com salário até R$ 100,00: ", (porc*100)/20,"\n")                
	 }	   
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */