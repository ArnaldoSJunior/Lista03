/*A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.Faça um programa que receba um valor de uma compra e mostre o valor das prestações. */
package br.edu.up.exercicios;

import br.edu.up.modelos.Loja;
import br.edu.up.modelos.Prompt;

public class Exercicio05 {
    
    public static void executar(){


        Loja loja = new  Loja();

        loja.setValorCompra(Prompt.lerDecimal("Informe o valor da compra: ")); 
        loja.parcelar();
        
        System.out.println("Valor da parcela: R$" + loja.getParcela());
    }
}
