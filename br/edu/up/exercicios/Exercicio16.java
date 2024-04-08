package br.edu.up.exercicios;

import br.edu.up.modelos.Funcionarios;
import br.edu.up.modelos.Prompt;

public class Exercicio16 {
    public static void executar() {
        
        System.out.println("Digite o salário mínimo: ");
        Funcionarios salario = new Funcionarios();
        salario.salarioMinimo = Prompt.lerDecimal();
        for (int i = 0; i < 584; i++) {
            System.out.printf("Digite o salário do %d° funcionário: ", (i + 1));
            salario.salarioInicial[i] = Prompt.lerDecimal();
            salario.ajustar(i);

        }
        System.out.println("\n--- Salário Ajustado ---\n");
        for (int i = 0; i < 584; i++) {
            System.out.printf("Funcionario[%d]: Salario inicial: R$ %.2f  Salario final: R$ %.2f\n", (i + 1),
                    salario.salarioInicial[i], salario.salarioFinal[i]);

        }
    }
}
