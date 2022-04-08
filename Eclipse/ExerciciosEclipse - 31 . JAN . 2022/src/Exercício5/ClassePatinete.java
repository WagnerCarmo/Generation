/* Crie uma classe patinete e apresente os atributos e m�todos 
   referentes esta classe, em seguida crie um objeto patinete, 
   defina as instancias deste objeto e apresente as informa��es 
   deste objeto no console */

package Exerc�cio5;

import java.text.DecimalFormat;

public class ClassePatinete {

	DecimalFormat formato = new DecimalFormat("0,000.00");
	
	String marca;
	String paisFabricado;
	int quantidadeLote;
	double custoFabricacaoLote;
	double precoUnidade;
	double precoLote;
	
	void custoFabriLote () {
		System.out.println("Cada lote tem um custo de " + formato.format(custoFabricacaoLote) + " para ser fabricado");
	}
	
	void precoLote () {
		System.out.println("Pre�o do Unit�rio: " + formato.format(precoUnidade));
	}
	
	void precoUnidade () {
		System.out.println("Pre�o do Lote: " + formato.format(precoLote));		
	}	
}