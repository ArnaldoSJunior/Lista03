/*Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9) */
package br.edu.up.exercicios;

import br.edu.up.modelos.Alunos;
import br.edu.up.modelos.Prompt;

public class Exercicio08 {
    public static void executar(){
     
    Alunos aluno = new Alunos();
    
    System.out.println("-------------Informe dados do alunos------------------");
   
    aluno.setNome(Prompt.lerLinha("Nome:"));
    aluno.setNota1(Prompt.lerDecimal("Nota 1:"));
    aluno.setNota2(Prompt.lerDecimal("Nota 2:"));
    aluno.setNota3(Prompt.lerDecimal("Nota 3:"));
    aluno.calcular();

    if(aluno.getMedia() >= 7){
        System.out.println(aluno.getNome() + "  Aprovado!");
    }else if(aluno.getMedia() > 5 && aluno.getMedia() < 7){
        System.out.println(aluno.getNome() +"  Recuperação!");
    }else{
        System.out.println(aluno.getNome() +"  Reprovado!");
    }



    }
}
