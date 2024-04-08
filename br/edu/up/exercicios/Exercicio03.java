/*Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. */
package br.edu.up.exercicios;

import br.edu.up.modelos.Prompt;
import br.edu.up.modelos.Vendedor;

public class Exercicio03 {
    public static void executar(){

        Vendedor vendedor = new Vendedor();

        System.out.println("Informe os dados do vendedor: ");
        System.out.println("Nome");
        vendedor.nome = Prompt.lerLinha();
        System.out.println("Salario fixo");
        vendedor.salariofixo = Prompt.lerDecimal();
        System.out.println("Total de vendas");
        vendedor.totalVendas = Prompt.lerDecimal();
        Double comissao = vendedor.totalVendas*0.15;

        System.out.println("Salário do mês:");
        System.out.println("Vendedor: " + vendedor.nome);
        System.out.println("Salário fixo: R$" + vendedor.salariofixo);
        System.out.println("Salário final: R$" + (comissao+vendedor.salariofixo));

    }
}
