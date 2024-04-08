public class Sexo {

  public String[] nome = new String[56];
  public String[] sexo = new String[56];
  public int contM = 0;
  public int contF = 0;


public void verificar(){
for(int i=0; i<56; i++){

  if (!sexo[i].equals("M") && !sexo[i].equals("F")) {
    System.out.println("Sexo inválido digite M ou F");
} else if (sexo[i].equals("M")) {
    contM++;
} else if (sexo[i].equals("F")) {
    contF++;
}

}
}
}
