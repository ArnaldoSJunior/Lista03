package br.edu.up.modelos;
public class Alunos {
    private String nome;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double media;

    public Double getMedia() {
        return media;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public void calcular(){
     this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

}
