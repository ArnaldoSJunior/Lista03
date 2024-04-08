package br.edu.up.modelos;
public class Pessoas {
    public int i, p;
    public int[] idade;
    public String[] verificador;
    
    public void verificar(){
        verificador = new String[idade.length];
        for( p = 0; p < i; p++){
         if(idade[p] >= 18){
            verificador[p] = "Maior de idade!";
         }else{
            verificador[p]="Menor de idade!";
         }

        }
    }
}
