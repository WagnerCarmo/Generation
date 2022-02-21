/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de 
 horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
 caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento 
 imprimir o salário total e o salário excedente.*/

programa
{

	funcao inicio()
	{

     real c, n, salario, salario_nr, excesso_ht, valor_ex

     salario = 10
     
     escreva("Código do Funcionário ")
     leia(c)
     
     escreva("Digte as Horas Trabalhadas ")
     leia(n)
	
				
		se (n<=50) {
		salario_nr= n * salario
		excesso_ht= 0
		escreva("As horas não foram excedidas em  ", excesso_ht, "\nSeu salário é de R$ ", salario_nr)
	     }
	     
		   senao {
		   excesso_ht=n - 50
		   valor_ex= excesso_ht * 20
		   salario_nr=n * salario
		   
		   escreva("Foram ", excesso_ht," horas excedidas\n") 
		   
		   escreva("Seu salário normal é de R$ ", salario_nr, " e o valor excedido é de R$ ", valor_ex)
	        }
     
     }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 887; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */