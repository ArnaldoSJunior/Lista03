package br.edu.up.modelos;
public class Alistamento {
    

  public Double[] p;
  public Double[] i;
  public String[] nome;
  public String[] sexo;
  public Double[] idade;
  public String[] saude;
  public String[] apto;
  public String[] naoapto;

 
  public void verificar() {
      for (int j = 0; j < p.length; j++) {
          if (idade[j] >= 18 && idade[j] <= 30 && saude[j].equalsIgnoreCase("boa")) {
              apto[j] = "Apto para o alistamento";
          } else {
              naoapto[j] = "Não apto para o alistamento";
          }
      }
}
  }
