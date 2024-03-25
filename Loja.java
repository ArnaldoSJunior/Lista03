public class Loja {

    public Double valorCompra;
    public Double parcela;

    public void prestacao(Double valorCompra){
     
        parcela = valorCompra/5;
        System.out.println("Valor da parcela: R$"+ parcela);

    }

}
