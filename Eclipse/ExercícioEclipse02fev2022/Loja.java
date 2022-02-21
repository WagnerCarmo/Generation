/*Crie uma um programa para trabalhar com estoque de uma loja, 
 o programa deverá trabalhar com Collection do tipo List do Java 
 para manipular os dados desse estoque, o programa deverá atender 
 as seguintes funcionalidades:
 Armazenar dados da List
 Remover dados da list;
 Atualizar dados da list.
 Apresentar todos os dados da list.*/

package br.com.generation.exercicio3;

public class Loja {
		
		private String produto;
		private int custo;
		
		public Loja(String produto, int custo) {
			super();
			this.produto = produto;
			this.custo = custo;
		}
		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			this.produto = produto;
		}
		public int getCusto() {
			return custo;
		}
		public void setCusto(int custo) {
			this.custo = custo;
		}
		@Override
		public String toString() {
			return "Loja [produto = " + produto + ", custo = " + custo + "]";
		}


	}


