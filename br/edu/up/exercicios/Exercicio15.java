/* A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina –21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes*/
package br.edu.up.exercicios;

import br.edu.up.modelos.Prompt;
import br.edu.up.modelos.Veiculos;

public class Exercicio15 {
    public static void executar(){

    Veiculos veiculo = new Veiculos();

    do {
        System.out.println("Informe o valor do veiculo: (Digite 0 para sair)");
        veiculo.valorCarro=Prompt.lerDecimal();
        if(veiculo.valorCarro != 0){ 
        System.out.println("Qual o tipo de combustivel:");
        veiculo.combustivel = Prompt.lerLinha();
        veiculo.descontar();
        
       
        System.out.println("Desconto aplicado: " +  veiculo.desconto);
        System.out.println("Total pago:" + (veiculo.valorCarro -  veiculo.desconto));
       
    
        }
        
    
       }
    while(veiculo.valorCarro != 0);

  
    }
 } 