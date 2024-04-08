/*Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9) */
public class Exercicio08 {
    public static void executar(){
     
    Alunos aluno = new Alunos();
    
    System.out.println("-------------Informe dados do alunos------------------");
    System.out.println("Nome:");
    aluno.nome = Prompt.lerLinha();
    System.out.println("Nota 1:");
    aluno.nota1 = Prompt.lerDecimal();
    System.out.println("Nota 2:");
    aluno.nota2 = Prompt.lerDecimal();
    System.out.println("Nota 3:");
    aluno.nota3 = Prompt.lerDecimal();
    aluno.calcular();

    if(aluno.media >= 7){
        System.out.println("Aprovado!");
    }else if(aluno.media > 5 && aluno.media < 7){
        System.out.println("Recuperação!");
    }else{
        System.out.println("Reprovado!");
    }



    }
}
