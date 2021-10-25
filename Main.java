package StrategyDP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Disciplina d = new Disciplina();
        System.out.println("Digite uma opção de cálculo\n1-Média Aritmética\n2-Média Geométrica");
        int calculationChoice=scan.nextInt();
        scan.nextLine();

        switch(calculationChoice){
            case 1:
                MediaAritmetica calcMediaA = new MediaAritmetica();
                d.defineAluno();
                calcMediaA.calculaMedia(d);
                calcMediaA.mudaSituacao(d);
                d.imprime();
                break;
            case 2:
                MediaGeometrica calcMediaG = new MediaGeometrica();
                d.defineAluno();
                calcMediaG.calculaMedia(d);
                calcMediaG.mudaSituacao(d);
                d.imprime();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}
