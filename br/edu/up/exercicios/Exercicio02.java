/*Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. */
public class Exercicio02 {
    public static void executar(){

        Carro carro = new Carro();
        carro.distanciaTotal = Prompt.lerDecimal("Digite a distãncia total da viagem: ");
        carro.totalCombustivel = Prompt.lerDecimal("Digite o total de combustível gasto na viagem: ");
        System.out.printf("O consumo médio foi de: %.2fL", carro.distanciaTotal/carro.totalCombustivel);

    }
    
}
