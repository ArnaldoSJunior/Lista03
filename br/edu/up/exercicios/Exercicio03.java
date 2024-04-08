/*Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. */
package br.edu.up.exercicios;

import br.edu.up.modelos.Prompt;
import br.edu.up.modelos.Vendedor;

public class Exercicio03 {
    public static void executar(){

        Vendedor vendedor = new Vendedor();

        System.out.println("Informe os dados do vendedor: ");
        
        vendedor.setNome(Prompt.lerLinha("Nome: "));
        vendedor.setSalariofixo(Prompt.lerDecimal("Salario fixo"));
        vendedor.setTotalVendas(Prompt.lerDecimal("Total de vendas"));
        vendedor.calcular();

        System.out.println("Salário do mês:");
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Salário fixo: R$" + vendedor.getSalariofixo());
        System.out.println("Salário final: R$" + vendedor.getSalarioFinal() );

    }
}
