/* Crie uma classe paciente e apresente os atributos e métodos referentes 
   esta classe, em seguida crie um objeto paciente, defina as instancias 
   deste objeto e apresente as informações deste objeto no console. */

package Exercício7;

public class ClassePaciente {

	String nome;
	int idade;
	String endereco;
	String entrada;
	String estado;
	String local;
	int leito;
	
	
	void nome(){
		System.out.println("Nome: " + nome);
		
	}
	
	void idade(){
		System.out.println("Idade: " + idade + " anos");
		
	}
	
	void endereco(){
		System.out.println("Endereço: " + endereco);
	}
	
	void entrada(){
		System.out.println("Data de Entrada: " + entrada);
	}
	
	void estado(){
		System.out.println("Estado: " + estado);
	}
	
	void local(){
		System.out.println("Local: " + local);
	}
	
	void leito(){
		System.out.println("Leito: " + leito);
	}
}