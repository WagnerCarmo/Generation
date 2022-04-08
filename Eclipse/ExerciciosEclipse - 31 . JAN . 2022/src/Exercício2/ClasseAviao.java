/* Crie uma classe avião e apresente os atributos e métodos referentes 
   esta classe, em seguida crie um objeto avião, defina as instancias 
   deste objeto e apresente as informações deste objeto no console */

package Exercício2;

public class ClasseAviao {
	
	String ciaAerea;
	String modelo;
    double consumoCombustivelHoraVoo = 0;
	int anofabricacao;
	int tripulacao;
		
	void anofabricacao () {
		System.out.println("\nFabricado em " + anofabricacao);	
	}
	
	void consumoCombustivelHoraVoo () {
		System.out.println("\nConsumo: " + consumoCombustivelHoraVoo + " Litros por Hora");
	}
}