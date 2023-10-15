package atividade3;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int matricula;
        double nota1, nota2, nota3;
        
        System.out.println("Informe a matrícula e as três notas do aluno (matrícula negativa para encerrar):");
        
        while (true) {
            System.out.print("Matrícula: ");
            matricula = input.nextInt();
            
            if (matricula < 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            
            System.out.print("Nota 1: ");
            nota1 = input.nextDouble();
            System.out.print("Nota 2: ");
            nota2 = input.nextDouble();
            System.out.print("Nota 3: ");
            nota3 = input.nextDouble();
            
            double media = (nota1 + nota2 + nota3) / 3;
            
            if (media >= 70) {
                System.out.println("Aluno aprovado. Média: " + media);
            } else if (media >= 60) {
                System.out.println("Aluno em recuperação. Média: " + media);
            } else {
                System.out.println("Aluno reprovado. Média: " + media);
            }
        }
    }
}

