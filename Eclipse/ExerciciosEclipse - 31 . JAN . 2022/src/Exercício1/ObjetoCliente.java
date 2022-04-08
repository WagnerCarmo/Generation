/* Crie uma classe cliente e apresente os atributos e métodos referentes 
   esta classe, em seguida crie um objeto cliente, defina as instancias 
   deste objeto e apresente as informações deste objeto no console. */

package Exercício1;

public class ObjetoCliente {

	public static void main(String[] args) {

		ClasseCliente clie1 = new ClasseCliente();

		clie1.cliente = 001;
		clie1.nome = "Bruxinho";
		clie1.idade = 29;
		clie1.notaSatisfacao = 7;
		clie1.totalGasto = 300;

		System.out.println("Cliente: " + clie1.cliente);
		System.out.println("\nNome: " + clie1.nome);
		System.out.println("\nIdade: " + clie1.idade + " anos");

		clie1.gastar();
		clie1.notaSatisfacao();
	}
}