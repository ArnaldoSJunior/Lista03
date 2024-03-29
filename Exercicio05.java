/*A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.Faça um programa que receba um valor de uma compra e mostre o valor das prestações. */
public class Exercicio05 {
    
    public static void executar(){


        Loja loja = new  Loja();

        System.out.println("Informe o valor da compra: ");
        loja.valorCompra = Prompt.lerDecimal();
        loja.parcelar(loja.valorCompra);
        
        System.out.println("Valor da parcela: R$" + loja.parcela );
    }
}
