/* Crie uma classe conta bancaria e apresente os atributos e 
   métodos referentes esta classe, em seguida crie um objeto 
   conta bancaria, defina as instancias deste objeto e apresente 
   as informações deste objeto no console */

package Exercício6;

import java.text.DecimalFormat;

public class ClasseContaBancaria {
	
	DecimalFormat formatoValor = new DecimalFormat("0,000.00");
	DecimalFormat formatoComum = new DecimalFormat("000");	
	
	String nomeCliente;
	String tipoCta;
	int agencia;
	String dataAbertura;
	String cartaoCredito;
	int limiteChequeEspecial;
	
	void cliente() {
		System.out.println("Nome do cliente: " + nomeCliente);
	}
	
	void tipoCta(){
		System.out.println("Tipo de Conta: " + tipoCta);		
	}
	
	void agencia(){
		System.out.println("Agência: " + formatoComum.format(agencia));		
	}
	
	void abertura(){
		System.out.println("Abertura: " + dataAbertura);		
	}
	
	void cartaoCredito(){	
		System.out.println("Cartão de Crédito: " + cartaoCredito);
	}
		
	void limiteChequeEspecial(){
		System.out.println("Limite do Cheque Especial: R$ " + formatoValor.format(limiteChequeEspecial));		
	}
}