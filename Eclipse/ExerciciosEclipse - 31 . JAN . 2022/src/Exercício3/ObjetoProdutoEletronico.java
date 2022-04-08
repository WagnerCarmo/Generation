/* Crie uma classe produto eletrônico e apresente os atributos e métodos 
   referentes esta classe, em seguida crie um objeto produto eletrônico, 
   defina as instancias deste objeto e apresente as informações deste objeto 
   no console. */

package Exercício3;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {
		
		ClasseProdutoEletronico eletro1 = new ClasseProdutoEletronico();
		
		eletro1.codigo = 169;
		eletro1.tipo = "Smartphone";
		eletro1.marca = "Samsung";
		eletro1.paisOrigem = "Coreia do Sul";
		eletro1.anofabricacao = 2020;
		eletro1.garantiaMeses = 18;
		
		System.out.println("Código: " + eletro1.codigo);
		System.out.println("Produto: " + eletro1.tipo);
		System.out.println("Marca: " + eletro1.marca);
		System.out.println("País de Origem: " + eletro1.paisOrigem );
	
		eletro1.anofabri();
		eletro1.garantia();
	}
}
