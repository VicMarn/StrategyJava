package StrategyDP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Disciplina d;
        System.out.println("Digite uma opção de cálculo\n1-Média Aritmética\n2-Média Geométrica");
        int calculationChoice=scan.nextInt();
        scan.nextLine();

        switch(calculationChoice){
            case 1:
                MediaAritmetica calculoA = new MediaAritmetica();
                d = new Disciplina(calculoA, calculoA);
                d.defineAluno();
                d.calculo.calculaMedia(d);
                d.ajuste.mudaSituacao(d);
                d.imprime();
                break;
            case 2:
                MediaGeometrica calculoG = new MediaGeometrica();
                d = new Disciplina(calculoG, calculoG);
                d.defineAluno();
                d.calculo.calculaMedia(d);
                d.ajuste.mudaSituacao(d);
                d.imprime();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}
