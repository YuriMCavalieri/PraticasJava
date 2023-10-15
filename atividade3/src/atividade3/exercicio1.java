package atividade3;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        int faltas;
        int totalAlunos = 0;
        int aprovados = 0;
        int reprovados = 0;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;
        int somaNotas = 0;

        System.out.println("Informe a nota final e o total de faltas dos alunos (Digite uma nota negativa para encerrar):");

        while (true) {
            System.out.print("Nota final: ");
            nota = input.nextInt();

            if (nota < 0) {
                break;
            }

            System.out.print("Total de faltas: ");
            faltas = input.nextInt();

            totalAlunos++;
            somaNotas += nota;

            if (nota >= 90) {
                aprovados++;
            } else if (nota < 70 || faltas >= 20) {
                reprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        if (totalAlunos > 0) {
            double media = (double) somaNotas / totalAlunos;

            System.out.println("a. Alunos com nota maior ou igual a 90: " + aprovados);
            System.out.println("b. Alunos reprovados por nota ou faltas: " + reprovados);
            System.out.println("c. Maior nota: " + maiorNota);
            System.out.println("   Menor nota: " + menorNota);
            System.out.println("d. Média de notas da turma: " + media);
        } else {
            System.out.println("Nenhum aluno foi registrado.");
        }
    }
}

