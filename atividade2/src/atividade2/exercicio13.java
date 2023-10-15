package atividade2;
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tipo de apartamento 'simples' ou 'duplo': ");
        String apartamento = input.next();
        System.out.print("Quantas diárias: ");
        int diarias = input.nextInt();
        int pagar = 0;

        if (apartamento.equals("simples")) {
            if (diarias < 10) {
                pagar = 100;
            } else if (diarias >= 10 && diarias < 15) {
                pagar = 90;
            } else {
                pagar = 80;
            }
        } else if (apartamento.equals("duplo")) {
            if (diarias < 10) {
                pagar = 140;
            } else if (diarias >= 10 && diarias < 15) {
                pagar = 120;
            } else {
                pagar = 100;
            }
        }
        System.out.println("O valor a pagar é: " + pagar);
    }
}
