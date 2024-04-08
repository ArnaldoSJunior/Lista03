/*Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. */
package br.edu.up.exercicios;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Prompt;

public class Exercicio02 {
    public static void executar(){

        Carro carro = new Carro();
        carro.setDistanciaTotal(Prompt.lerDecimal("Digite a distãncia total da viagem: "));
        carro.setTotalCombustivel(Prompt.lerDecimal("Digite o total de combustível gasto na viagem: "));
        carro.calcular();
        System.out.printf("O consumo médio foi de: %.2fL", carro.getConsumoMedio());

    }
    
}
