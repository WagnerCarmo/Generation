/* Crie uma classe cliente e apresente os atributos e métodos referentes 
   esta classe, em seguida crie um objeto cliente, defina as instancias 
   deste objeto e apresente as informações deste objeto no console. */

package Exercício1;

import java.text.DecimalFormat;

public class ClasseCliente {
	
	DecimalFormat formato = new DecimalFormat("0.00");
	
	int cliente;
	String nome;
    double totalGasto;
	int notaSatisfacao;
	int idade;
	
	void gastar() {
		 System.out.println("\nGastou um total de R$ " + formato.format(totalGasto));
	}
	
	void notaSatisfacao() {
		 System.out.println("\nDeu a nota " + notaSatisfacao + " para o atendimento. ");	
	}	
}