package exercicios1e2;

public class Animal {
	
	private String nome;
	private int idade;
	
	public void emiteSom() {
		System.out.println("Emite som");
	}

	public void corre() {
		System.out.println("Corre");
	}
	
	public void sobeArvore() {
		System.out.println("Sobe em Árvore");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}