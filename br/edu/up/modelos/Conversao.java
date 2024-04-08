package br.edu.up.modelos;
public class Conversao {
    
    private double cotacao;
    private double qtdDol;
    private double valorFinal;



    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }
    public void setQtdDol(double qtdDol) {
        this.qtdDol = qtdDol;
    }
    public double getValorFinal() {
        return this.valorFinal;
    }

    public void converter(){
        this.valorFinal = this.qtdDol * this.cotacao;
    }
}

