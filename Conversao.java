public class Conversao {
    public double cotação;
    public double qtdDol;
    public double valorFinal;

    public void conversãoDolar(double qtdDol){
        valorFinal = qtdDol * cotação;
    }
}
