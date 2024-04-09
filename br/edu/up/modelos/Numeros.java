package br.edu.up.modelos;

public class Numeros {
    private Double[] num = new Double[80];
    private Double[] intervalo = new Double[80];
    private int p;

    public void setNum(Double num) {
        this.num[p] = num;
        p++;
    }

    public void verificar() {
        p = 0;
        for (int i = 0; i < 80; i++) {
            if (num[i] != null && (num[i] >= 10 && num[i] <= 150)) {
                intervalo[p] = num[i];
                p++;
            }
        }
    }

    public Double[] getIntervalo() {
        return intervalo;
    }
}
