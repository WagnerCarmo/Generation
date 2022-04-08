/* Crie uma classe funcion�rio e apresente os atributos e m�todos 
   referentes esta classe, em seguida crie um objeto funcion�rio, 
   defina as instancias deste objeto e apresente as informa��es 
   deste objeto no console. */

package Exerc�cio4;

import java.text.DecimalFormat;

public class ClasseFuncionario {
	
	DecimalFormat formato = new DecimalFormat("0.00");
	
	int matricula;
	String nome;
	String cargo;
	String escritorio;
	double salarioHora;
	int horasTrabalhadasMes;
	double totalReceber;
	
	
	
	void salarioHora () {
		System.out.println("Sal�rio por Hora: R$ " + formato.format(salarioHora));	
	}
	
	void HorasTrabalhadasMes () {
		System.out.println("Trabalhou neste M�s: " + horasTrabalhadasMes + " Horas");		
	}
	
	void totalReceber () {
		System.out.println("Sal�rio do M�s: R$ " + formato.format(salarioHora*horasTrabalhadasMes));
		
	}

}
