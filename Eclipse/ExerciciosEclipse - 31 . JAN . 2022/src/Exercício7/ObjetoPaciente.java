/* Crie uma classe paciente e apresente os atributos e m�todos referentes 
   esta classe, em seguida crie um objeto paciente, defina as instancias 
   deste objeto e apresente as informa��es deste objeto no console. */

package Exerc�cio7;

public class ObjetoPaciente {

	public static void main(String[] args) {
		
		ClassePaciente paci1 = new ClassePaciente();
		
		paci1.nome = "Jo�o de Souza";
		paci1.idade = 70;
		paci1.endereco = "Av. Paulista, 2000";
		paci1.entrada = "10/09/2021";
		paci1.estado = "Est�vel";
		paci1.local = "UTI";
		paci1.leito = 7;
		
		paci1.nome();
		paci1.idade();
		paci1.endereco();
		paci1.entrada();
		paci1.estado();
		paci1.local();
		paci1.leito();
	}
}