/*A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 -12% e acima de 2000 -7%. O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral. */
package br.edu.up.exercicios;

import br.edu.up.modelos.Carros;
import br.edu.up.modelos.Prompt;

public class Exercicio12 {
    public static void executar(){
    
        Carros carro = new Carros();
        

    do{ System.out.println("Informe ano do veículo: ");
        carro.ano = Prompt.lerDecimal();
        System.out.println("Informe o valor do veículo: ");
        carro.valor = Prompt.lerDecimal();
        carro.calcular();
        System.out.println("Valor final do carro com desconto: R$" + carro.valorFinal );
     
        System.out.println("continuar calculando? (S) sim ou (N) não: ");
        carro.continuar = Prompt.lerLinha();
    }
       while(carro.continuar.equals("s")  || carro.continuar.equals("S"));
       
       System.out.println("Total de carros de ano até 2000: " + carro.cont);
       System.out.println("Total de carros : " + (carro.cont + carro.contador));

     

    }
    
}
