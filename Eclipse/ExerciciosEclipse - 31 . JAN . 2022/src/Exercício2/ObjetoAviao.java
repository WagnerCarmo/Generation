/* Crie uma classe avi�o e apresente os atributos e m�todos referentes 
   esta classe, em seguida crie um objeto avi�o, defina as instancias 
   deste objeto e apresente as informa��es deste objeto no console */

package Exerc�cio2;

public class ObjetoAviao {

	public static void main(String[] args) {

		ClasseAviao Avi1 = new ClasseAviao();

		Avi1.ciaAerea = "Fly Emirates";
		Avi1.modelo = "Boeing 737";
		Avi1.consumoCombustivelHoraVoo = 50.9;
		Avi1.anofabricacao = 2009;
		Avi1.tripulacao = 13;

		System.out.println("Cia A�rea: " + Avi1.ciaAerea);
		System.out.println("\nModelo: " + Avi1.modelo);
		System.out.println("\nTripula��o: " + Avi1.tripulacao + " tripulantes");

		Avi1.anofabricacao();
		Avi1.consumoCombustivelHoraVoo();
	}
}