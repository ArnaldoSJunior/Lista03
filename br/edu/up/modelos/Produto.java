package br.edu.up.modelos;

public class Produto {
   
    private Double custo;
    private Double percentual;
    private Double venda;

    
    
    public Double getVenda() {
        return venda;
    }
    public void setCusto(Double custo) {
        this.custo = custo;
    }
    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }


    public Double vender(){
        this.percentual = this.percentual/100;
        this.venda = this.custo + (this.custo * this.percentual);
        return venda;

    }


}
