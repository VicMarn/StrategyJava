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
                System.out.println("\n-------------------------------------\n");
                System.out.println("Digite o nome do aluno:");
                d.setNome(scan.nextLine());
                System.out.println("\nDigite a nota da P1:");
                d.setP1(scan.nextFloat());
                System.out.println("\nDigite a nota da P2:");
                d.setP2(scan.nextFloat());
                calcMediaA.calculaMedia(d);
                calcMediaA.mudaSituacao(d);
                System.out.println("O aluno " + d.getNome() + " teve média " + d.getMedia() +
                        " e foi " + d.getSituacao());
                break;
            case 2:
                MediaGeometrica calcMediaG = new MediaGeometrica();
                System.out.println("-------------------------------------\n");
                System.out.println("Digite o nome do aluno:");
                d.setNome(scan.nextLine());
                System.out.println("\nDigite a nota da P1:");
                d.setP1(scan.nextFloat());
                System.out.println("\nDigite a nota da P2:");
                d.setP2(scan.nextFloat());
                calcMediaG.calculaMedia(d);
                calcMediaG.mudaSituacao(d);
                System.out.println("O aluno " + d.getNome() + " teve média " + d.getMedia() +
                        " e foi " + d.getSituacao());
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}
