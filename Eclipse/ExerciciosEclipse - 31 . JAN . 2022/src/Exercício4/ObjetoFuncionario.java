/* Crie uma classe funcionário e apresente os atributos e métodos 
   referentes esta classe, em seguida crie um objeto funcionário, 
   defina as instancias deste objeto e apresente as informações 
   deste objeto no console. */

package Exercício4;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		
		ClasseFuncionario func1 = new ClasseFuncionario ();
		
		func1.matricula = 1022;
		func1.nome = "José da Silva";
		func1.cargo = "Desenvolvedor Jr.";
		func1.escritorio = "São Paulo";
		func1.horasTrabalhadasMes = 220;
		func1.salarioHora = 15;
		func1.totalReceber = 0;
		
		System.out.println("Matricula do Funcionário: " + func1.matricula);
		System.out.println("Nome: " + func1.nome);
		System.out.println("Cargo: " + func1.cargo);
		System.out.println("Escritório: " + func1.escritorio);
		
		func1.salarioHora();
		func1.HorasTrabalhadasMes();
		func1.totalReceber();		
	}
}