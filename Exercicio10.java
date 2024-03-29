/*Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18anos como maior de idade */
public class Exercicio10 {
    public static void executar(){

    Pessoas pessoa = new Pessoas();

    System.out.println("Informe um número finito de pessoas: ");
    pessoa.i = Prompt.lerInteiro();
    System.out.println("Informe a idade das pessoas:");
    pessoa.idade = new int[pessoa.i];
    for(int i = 0; i < pessoa.i; i++){
        System.out.println("Pessoa"+(i+1)+":");
        pessoa.idade[i]=Prompt.lerInteiro();
    }
    pessoa.verificar();

    System.out.println("Verificação");
    for(int p =0; p < pessoa.i; p++){
        System.out.printf("A pessoa [%d] é %s\n", p+1, pessoa.verificador[p]);
    }


    }
}
