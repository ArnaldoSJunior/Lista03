/* Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive)e 150 (inclusive) */
public class Exercicio09 {
    public static void executar(){

      Numeros numero = new Numeros();

      
      for(int i =0; i< 80; i++)
       {
        System.out.printf("Digite o %d° número: ", (i+1));
        numero.num[i]=Prompt.lerDecimal();
       }
       numero.verificar();

       System.out.println("Os números que estão no intervalo entre 10 e 150 são: ");
       for(int i =0; i < numero.intervalo.length; i++){
        System.out.print(numero.intervalo[i]+ " " );
    }

    }
}
