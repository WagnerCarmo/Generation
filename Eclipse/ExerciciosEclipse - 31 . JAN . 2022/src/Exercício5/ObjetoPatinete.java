/* Crie uma classe patinete e apresente os atributos e métodos 
   referentes esta classe, em seguida crie um objeto patinete, 
   defina as instancias deste objeto e apresente as informações 
   deste objeto no console */

package Exercício5;

public class ObjetoPatinete {

	public static void main(String[] args) {
		
		ClassePatinete pati1 = new ClassePatinete ();
		
		pati1.marca = "Velox";
		pati1.paisFabricado = "RP China";
		pati1.quantidadeLote = 30;
		pati1.custoFabricacaoLote = 45000;
		pati1.precoLote = 60000;
		pati1.precoUnidade = 2500;
		
		System.out.println("Marca: " + pati1.marca);
		System.out.println("País de Origem: " + pati1.paisFabricado);
		System.out.println("Quantidade no Lete: " + pati1.quantidadeLote + " Unidades");
		
		pati1.custoFabriLote();
		pati1.precoLote();
		pati1.precoUnidade();
		
	}

}
