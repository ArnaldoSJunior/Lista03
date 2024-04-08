package br.edu.up.exercicios;

import br.edu.up.modelos.Conversao;
import br.edu.up.modelos.Prompt;

public class Exercicio04 {
    public static void executar(){
        Conversao dol = new Conversao();
        System.out.println("---Conversão de dólar para real---");
        dol.cotação = Prompt.lerDecimal("Digite a cotação atual do dólar para real: ");
        dol.qtdDol = Prompt.lerDecimal("digite quantos dolares você possui:");
        dol.converter(dol.qtdDol);
        System.out.printf("O resultado da conversão é de R$ %.2f", dol.valorFinal);
    }
}
