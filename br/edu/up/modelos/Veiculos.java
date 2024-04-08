package br.edu.up.modelos;
public class Veiculos {
    public Double valorDesc;
    public Double valorPgCliente;
    public Double valorCarro;
    public String combustivel;
    public Double desconto;
    public Double descFinal;


    public void descontar() {
      if(combustivel.equals("álcool")){
        desconto = valorCarro * 0.25;
      }else if(combustivel.equals("diesel")){
        desconto = valorCarro * 0.14;
      }else if(combustivel.equals("gasolina")){
        desconto = valorCarro * 0.21;
      }else{
        System.out.println("Combustivel inválido!");
      } 

    }
  
}
