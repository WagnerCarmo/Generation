/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem 
   do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem 
   do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
   fábrica de um carro e escreva o custo ao consumidor. */ 

package br.com.generation.programacaoSequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
		
    Scanner leia = new Scanner(System.in);
	
    DecimalFormat formato = new DecimalFormat("0.00"); 
    
    double custoConsumidor, custoFabrica;
    
    System.out.println("Digite o custo de fábrica do veículo: ");
    custoFabrica= leia.nextDouble();

    custoConsumidor = (custoFabrica * 0.45) + (custoFabrica * 0.28) + custoFabrica;

    System.out.println("O custo do carro ao consumidor é de R$ "+ formato.format(custoConsumidor));
    
    leia.close();
		
	}	
}