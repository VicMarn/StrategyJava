package StrategyDP;

import java.util.Scanner;

public class Disciplina {
    private float p1;
    private float p2;
    private float media;
    private String situacao;
    private String nome;
    ICalcMedia calculo;
    IMudaSituacao ajuste;
    Scanner scan = new Scanner(System.in);

    public void defineAluno(){
        System.out.println("\n-------------------------------------\n");
        System.out.println("Digite o nome do aluno:");
        this.nome=scan.nextLine();
        System.out.println("\nDigite a nota da P1:");
        this.p1=scan.nextFloat();
        System.out.println("\nDigite a nota da P2:");
        this.p2=scan.nextFloat();
    }
    public void imprime(){
        System.out.println("O aluno " + this.nome + " teve média " + this.media +
                " e foi " + this.situacao);
    }
    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMedia(float media){
        this.media=media;
    }

    public float getMedia() {
        return media;
    }

    public void setCalculo(ICalcMedia calculo) {
        this.calculo = calculo;
    }

    public void setAjuste(IMudaSituacao ajuste) {
        this.ajuste = ajuste;
    }

    public Disciplina()
    {

    }

    public Disciplina(ICalcMedia calculo ,IMudaSituacao ajuste)
    {
        this.ajuste = ajuste;
        this.calculo = calculo;
    }
}
