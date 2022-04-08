/* Crie uma classe conta bancaria e apresente os atributos e 
   métodos referentes esta classe, em seguida crie um objeto 
   conta bancaria, defina as instancias deste objeto e apresente 
   as informações deste objeto no console */

package Exercício6;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		
		ClasseContaBancaria cta1 = new ClasseContaBancaria();
		
		cta1.nomeCliente = "Luzicleideane da Silva";
		cta1.tipoCta = "Corrente";
		cta1.agencia = 007;
		cta1.dataAbertura = "12/02/2007";
		cta1.cartaoCredito = "Possui";
		cta1.limiteChequeEspecial = 5000;
		
		cta1.cliente();
		cta1.tipoCta();
		cta1.agencia();
		cta1.abertura();
		cta1.cartaoCredito();
		cta1.limiteChequeEspecial();
		


	}

}
