package br.edu.up.modelos;
public class Lucratividade {

  public Double[] precoCusto = new Double[40];
  public Double[] precoVenda = new Double[40];
 
 


public void verificar(int i){

if(precoVenda[i] > precoCusto[i]){
    System.out.println("Houve lucro!");
}else if(precoCusto[i] > precoVenda[i]){
    System.out.println("Houve prejuízo!");
}else{
    System.out.println("Houve empate!");
}
}

public double calcularMediaPrecoCusto() {
    double soma = 0;
    for (double preco : precoCusto) {
        soma += preco;
    }
    return soma / precoCusto.length;
}

public double calcularMediaPrecoVenda() {
    double soma = 0;
    for (double preco : precoVenda) {
        soma += preco;
    }
    return soma / precoVenda.length;
}

}
