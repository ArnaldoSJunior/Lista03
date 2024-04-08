/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. */
public class Exercicio07 {
    public static void executar(){
       
        CarroNovo carro = new CarroNovo();

        System.out.println("Informe custo de fábrica do carro: ");
        carro.custoFabrica = Prompt.lerDecimal();
        carro.vender();

        System.out.println("O custo do carro é de: R$" + carro.precoFinal);
      


    }
}
