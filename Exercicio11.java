/*Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres */
public class Exercicio11 {
    public static void executar(){

    Sexo pessoa = new Sexo();
    
    for (int i = 0; i < 56; i++){
      System.out.println("Informe nome"+(i+1)+":");
      pessoa.nome[i] = Prompt.lerLinha().toUpperCase();
      System.out.println("Informe sexo (M) ou (F): ");
      pessoa.sexo[i]=Prompt.lerLinha().toUpperCase();
    } 

      pessoa.verificar();
      System.out.println("--- Impressão dos dados das pessoas ---");
        for(int i=0; i<56; i++){
            System.out.printf("Nome [%d]: %s\n",(i+1), pessoa.nome[i]);
            System.out.printf("Sexo [%d]: %s\n\n", (i+1), pessoa.sexo[i]);
        }
      System.out.printf("Ao todo, tem %d homens e %d mulheres na lista.\n", pessoa.contM, pessoa.contF);





    }
}
