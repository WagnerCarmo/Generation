/* Crie uma classe produto eletrônico e apresente os atributos e métodos 
   referentes esta classe, em seguida crie um objeto produto eletrônico, 
   defina as instancias deste objeto e apresente as informações deste objeto 
   no console. */

package Exercício3;

public class ClasseProdutoEletronico {
	
	int codigo;
	String tipo;
	String marca;
	String paisOrigem;
	int anofabricacao;
	int garantiaMeses;
	
	void anofabri  () {
		
		System.out.println("Ano de fabricação: " + anofabricacao);
	}
	
	void garantia () {
		
		System.out.println("Garantia: " + garantiaMeses + " Meses");	
	}
}