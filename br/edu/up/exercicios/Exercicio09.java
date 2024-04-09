/* Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive)e 150 (inclusive) */
package br.edu.up.exercicios;

import br.edu.up.modelos.Numeros;
import br.edu.up.modelos.Prompt;

public class Exercicio09 {
    public static void executar() {
       
        Numeros numeros = new Numeros();

        for (int i = 0; i < 80; i++) {
            Double numero = Prompt.lerDecimal("Digite o " + (i + 1) + "° número: ");
             numeros.setNum(numero);
        }

        numeros.verificar();

        System.out.println("Os números que estão no intervalo entre 10 e 150 são:");
        for (Double num : numeros.getIntervalo()) {
            if (num != null) {
                System.out.print(num + " ");
            }
        }
    }
}
