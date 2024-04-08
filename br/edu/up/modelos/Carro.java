package br.edu.up.modelos;

public class Carro {
    private Double distanciaTotal;
    private Double totalCombustivel;
    private double consumoMedio;

    public void setDistanciaTotal(Double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }
 
    public void setTotalCombustivel(Double totalCombustivel) {
        this.totalCombustivel = totalCombustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void calcular(){
        this.consumoMedio = distanciaTotal/totalCombustivel;
    }

    
}
