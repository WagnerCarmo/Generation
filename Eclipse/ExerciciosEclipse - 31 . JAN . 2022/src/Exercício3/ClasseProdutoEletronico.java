/* Crie uma classe produto eletr�nico e apresente os atributos e m�todos 
   referentes esta classe, em seguida crie um objeto produto eletr�nico, 
   defina as instancias deste objeto e apresente as informa��es deste objeto 
   no console. */

package Exerc�cio3;

public class ClasseProdutoEletronico {
	
	int codigo;
	String tipo;
	String marca;
	String paisOrigem;
	int anofabricacao;
	int garantiaMeses;
	
	void anofabri  () {
		
		System.out.println("Ano de fabrica��o: " + anofabricacao);
	}
	
	void garantia () {
		
		System.out.println("Garantia: " + garantiaMeses + " Meses");	
	}
}