package br.edu.up.exercicios;

import br.edu.up.modelos.Conversao;
import br.edu.up.modelos.Prompt;

public class Exercicio04 {
    public static void executar(){

        Conversao dolar = new Conversao();
        
        dolar.setCotacao(Prompt.lerDecimal("Digite a cotação atual do dólar para real: "));
        dolar.setQtdDol(Prompt.lerDecimal("digite quantos dolares você possui:"));
        dolar.converter();

         System.out.println("O resultado da conversão é de R$" + dolar.getValorFinal());
    }
}
