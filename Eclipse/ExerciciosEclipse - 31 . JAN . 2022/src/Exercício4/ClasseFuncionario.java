/* Crie uma classe funcionário e apresente os atributos e métodos 
   referentes esta classe, em seguida crie um objeto funcionário, 
   defina as instancias deste objeto e apresente as informações 
   deste objeto no console. */

package Exercício4;

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
		System.out.println("Salário por Hora: R$ " + formato.format(salarioHora));	
	}
	
	void HorasTrabalhadasMes () {
		System.out.println("Trabalhou neste Mês: " + horasTrabalhadasMes + " Horas");		
	}
	
	void totalReceber () {
		System.out.println("Salário do Mês: R$ " + formato.format(salarioHora*horasTrabalhadasMes));
		
	}

}
