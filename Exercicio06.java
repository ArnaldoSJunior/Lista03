/*Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário. */
public class Exercicio06 {
    public static void executar(){

        Produto produto = new Produto();

        System.out.println("Informe preço de custo do produto: ");
        produto.custo = Prompt.lerDecimal();
        System.out.println("Informe percentual de acréscimo: ");
        produto.percentual = Prompt.lerDecimal();
        produto.vender();

        System.out.println("Valor de venda do produto é: R$" + produto.venda);

    }
    
}
