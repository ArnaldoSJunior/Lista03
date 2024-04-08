package br.edu.up.modelos;

public class Carros {
    
    public Double ano;
    public Double valor;
    public Double descMaior = 12.0;
    public Double descMenor = 7.0;
    public Double desconto;
    public Double valorFinal;
    public int cont = 0;
    public int contador = 0;
    public String continuar;
   

    public void calcular(){
      
        
       
        if(ano < 2000){
            desconto = (descMenor/100)*valor;
            valorFinal =valor - desconto;
            cont++;
        }else{
            desconto = (descMaior/100)*valor;
            valorFinal = valor - desconto;
            contador++;
        }
        



    }
}
