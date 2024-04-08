package br.edu.up.modelos;
public class Loja {

    private Double valorCompra;
    private Double parcela;

    
    public Double getParcela() {
        return parcela;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }


    public void parcelar(){
     parcela = this.valorCompra/5;
     }

}
