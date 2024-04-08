/*Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de custo e do preço de venda. */
package br.edu.up.exercicios;

import br.edu.up.modelos.Lucratividade;
import br.edu.up.modelos.Prompt;

public class Exercicio14 {
    public static void executar(){


     Lucratividade lucro = new Lucratividade();
     System.out.println("---------Informe dados dos produtos--------");
     
    for(int i=0; i<40; i++)
       {
        System.out.println("Informe preço de custo produto"+(i+1)+":");
        lucro.precoCusto[i]=Prompt.lerDecimal();
        System.out.println("Informe preço de venda:");
        lucro.precoVenda[i]=Prompt.lerDecimal();
       }
    for(int i=0; i<3; i++)
       {
        System.out.println("Produto"+(i+1));
        lucro.verificar(i);
       } 
       double mediaPrecoCusto = lucro.calcularMediaPrecoCusto();
       double mediaPrecoVenda = lucro.calcularMediaPrecoVenda();

       System.out.println("Média de preço de custo: " + mediaPrecoCusto);
       System.out.println("Média de preço de venda: " + mediaPrecoVenda);
   



    }
}
