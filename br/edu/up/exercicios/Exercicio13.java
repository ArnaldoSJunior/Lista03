/*Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais. */
public class Exercicio13 {
    public static void executar(){
        Alistamento alistamento = new Alistamento();

        System.out.println("Informe o número de pessoas para o alistamento:");
        int numPessoas = Prompt.lerInteiro();

        alistamento.p = new Double[numPessoas];
        alistamento.i = new Double[numPessoas];
        alistamento.nome = new String[numPessoas];
        alistamento.sexo = new String[numPessoas];
        alistamento.idade = new Double[numPessoas];
        alistamento.saude = new String[numPessoas];
        alistamento.apto = new String[numPessoas];
        alistamento.naoapto = new String[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Informe os dados para a pessoa " + (i+1) + ":");
            System.out.println("Nome:");
            alistamento.nome[i] = Prompt.lerLinha();
            System.out.println("Sexo:");
            alistamento.sexo[i] = Prompt.lerLinha();
            System.out.println("Idade:");
            alistamento.idade[i] = Prompt.lerDecimal();
            System.out.println("Saúde:");
            alistamento.saude[i] = Prompt.lerLinha();
        }

        
        alistamento.verificar();

        
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Resultado " + alistamento.nome[i] + ": " + (alistamento.apto[i] != null ? alistamento.apto[i] : alistamento.naoapto[i]));
        }
}


}
 
