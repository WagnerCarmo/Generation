/* Crie uma classe avi�o e apresente os atributos e m�todos referentes 
   esta classe, em seguida crie um objeto avi�o, defina as instancias 
   deste objeto e apresente as informa��es deste objeto no console */

package Exerc�cio2;

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