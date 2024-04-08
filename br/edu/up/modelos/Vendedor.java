package br.edu.up.modelos;

public class Vendedor {
     private String nome;
     private Double salariofixo;
     private Double totalVendas;
     private Double porcentagem = 0.15;
     private Double comissao;
     private Double salarioFinal;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalariofixo(Double salariofixo) {
        this.salariofixo = salariofixo;
    }
    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }
    public String getNome() {
        return nome;
    }
    public Double getSalariofixo() {
        return salariofixo;
    }
    
   
    public Double getSalarioFinal() {
        return salarioFinal;
    }
    public void calcular(){
        this.comissao = totalVendas*porcentagem; 
        this.salarioFinal = comissao + salariofixo;
    }    
}
