/*Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética) */
package br.edu.up.exercicios;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Prompt;

public class Exercicio01 {
    public static void executar(){
   
    Aluno aluno = new Aluno();

    System.out.println("Informe os dados do Aluno: ");
    aluno.setNome(Prompt.lerLinha("Digite o nome do aluno")); 
    aluno.setNota1(Prompt.lerDecimal("Digite a primeira nota: "));
    aluno.setNota2(Prompt.lerDecimal("Digite a segunda nota: "));
    aluno.setNota3(Prompt.lerDecimal("Digite a terceira nota: "));;
    aluno.calcular();
    

        System.out.println("Nome: "+ aluno.getNome());
        System.out.println("Média: "+ aluno.getMedia());
}
   
}
