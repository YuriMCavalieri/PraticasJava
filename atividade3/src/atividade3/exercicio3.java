package atividade3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int canal;
        int totalAudiencia = 0;
        int[] audienciaPorCanal = new int[5];

        System.out.println("Realize uma pesquisa de audiência de canais de TV (Digite o número do canal e a audiência, ou 0 para encerrar):");

        while (true) {
            System.out.print("Número do canal (2, 4, 5, 7, 12): ");
            canal = input.nextInt();

            if (canal == 0) {
                break;
            }

            if (canal >= 2 && canal <= 12 && canal % 2 == 0) {
                System.out.print("Número de pessoas assistindo ao canal: ");
                int audiencia = input.nextInt();

                audienciaPorCanal[canal / 2 - 1] += audiencia;

                totalAudiencia += audiencia;
            } else {
                System.out.println("Canal inválido. Digite um número de canal válido (2, 4, 5, 7, 12).");
            }
        }

        System.out.println("Resultados da pesquisa de audiência:");

        for (int i = 0; i < audienciaPorCanal.length; i++) {
            double percentualAudiencia = (double) audienciaPorCanal[i] / totalAudiencia * 100;
            System.out.println("Canal " + (i * 2 + 2) + ": " + percentualAudiencia + "% da audiência total.");
        }
    }
}

