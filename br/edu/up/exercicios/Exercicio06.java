/*Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário. */
package br.edu.up.exercicios;

import br.edu.up.modelos.Produto;
import br.edu.up.modelos.Prompt;

public class Exercicio06 {
    public static void executar(){

        Produto produto = new Produto();

        produto.setCusto(Prompt.lerDecimal("Informe preço de custo do produto: "));
        produto.setPercentual( Prompt.lerDecimal("Informe percentual de acréscimo: "));
        produto.vender();

        System.out.println("Valor de venda do produto é: R$" + produto.getVenda());

    }
    
}
