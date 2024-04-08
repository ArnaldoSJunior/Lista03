/*Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética) */
package br.edu.up.exercicios;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Prompt;

public class Exercicio01 {
    public static void executar(){
   
    Aluno aluno = new Aluno();

    System.out.println("Informe os dados do Aluno: ");
    aluno.nome = Prompt.lerLinha("Digite o nome do aluno");
    aluno.nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
    aluno.nota2  = Prompt.lerDecimal("Digite a segunda nota: ");
    aluno.nota3 = Prompt.lerDecimal("Digite a terceira nota: ");

    double notaFinal = (aluno.nota1 + aluno.nota2 + aluno.nota3) / 3;

        System.out.println("Nome: "+ aluno.nome);
        System.out.println("Média: "+ notaFinal);
}
   
}
