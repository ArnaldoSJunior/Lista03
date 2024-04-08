package br.edu.up.modelos;

public class Produto {
   
    public Double custo;
    public Double percentual;
    public Double venda;

    public Double vender(){
        percentual = percentual/100;
        venda = custo + (custo * percentual);
        return venda;

    }


}
