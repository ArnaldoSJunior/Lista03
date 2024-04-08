public class Conversao {
    public double cotação;
    public double qtdDol;
    public double valorFinal;

    public void converter(double qtdDol){
        valorFinal = qtdDol * cotação;
    }
}
