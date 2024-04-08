package br.edu.up.modelos;
public class CarroNovo {

    private Double custoFabrica;
    private Double precoFinal;
    private Double precoImpostos;

    

    public void setCustoFabrica(Double custoFabrica) {
      this.custoFabrica = custoFabrica;
    }
    public Double getPrecoFinal() {
      return precoFinal;
    }



    public void vender(){
      this.precoImpostos = custoFabrica * 1.45;
      this.precoFinal = precoImpostos * 1.28; 

    }



}
