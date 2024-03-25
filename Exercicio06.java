/*Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelousuário. */
public class Exercicio06 {
    public static void executar(){

        Produto produto = new Produto();

        System.out.println("Informe preço de custo do produto: ");
        produto.custo = Prompt.lerDecimal();
        System.out.println("Informe percentual de acréscimo: ");
        produto.percentual = Prompt.lerDecimal();
        Double valor =  produto.valorVenda();

        System.out.println("");

    }
    
}
