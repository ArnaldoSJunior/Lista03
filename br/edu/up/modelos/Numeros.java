package br.edu.up.modelos;
public class Numeros {

    public Double[] num = new Double[80];
    public double[] intervalo = new double[80];
    public int i, p;


    public void verificar(){
        p =0;
        for(i =0; i <80; i++)
        {
            if (num[i] <= 10 || num[i] >= 150) {
                
            }else{
                intervalo[p] = num[i];
                p++;
            }
        
        }
}
  }