package atividade3;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        int numeroFilhos;
        double somaSalarios = 0;
        int somaFilhos = 0;
        int totalHabitantes = 0;

        System.out.println("Realize uma pesquisa de salário e número de filhos (Digite um salário negativo para encerrar):");

        while (true) {
            System.out.print("Salário: R$ ");
            salario = input.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Número de filhos: ");
            numeroFilhos = input.nextInt();

            somaSalarios += salario;
            somaFilhos += numeroFilhos;
            totalHabitantes++;
        }

        if (totalHabitantes > 0) {
            double mediaSalario = somaSalarios / totalHabitantes;
            double mediaFilhos = (double) somaFilhos / totalHabitantes;

            System.out.println("Resultados da pesquisa:");
            System.out.println("a. Média salarial da população: R$ " + mediaSalario);
            System.out.println("b. Média do número de filhos: " + mediaFilhos);
        } else {
            System.out.println("Nenhum habitante foi registrado.");
        }
    }
}

