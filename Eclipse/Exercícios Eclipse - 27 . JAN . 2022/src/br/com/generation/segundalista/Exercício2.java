package br.com.generation.segundalista;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)


public class Exerc�cio2 {

	 public static void main(String[] args) {

		    int num;
		    int par;
		    int impar;
		    int cont1 = 0;
		    int cont2 = 0;

		    for(int x = 2; x<=10;x++) {
		        if(x % 2==0) {
		        cont1++;
		        System.out.println( x + " � Par");

		        }else{
		        cont2++;
		        System.out.println(x+ " � Impar");

		        
		        
		        }
		    }
		    
		  
	 }		      
}