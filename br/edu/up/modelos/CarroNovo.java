public class CarroNovo {

    public Double custoFabrica;
    public Double precoFinal;
    public Double precoImpostos;

    public void vender(){
      precoImpostos = custoFabrica * 1.45;
      precoFinal = precoImpostos * 1.28; 

    }



}
