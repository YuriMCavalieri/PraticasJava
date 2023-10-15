package atividade2;
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um comando Git (git clone, git fetch, git pull): ");
        String gitCommand = input.nextLine();
        switch (gitCommand) {
            case "git clone":
                System.out.println("Comando: git clone");
                System.out.println("Explicação: O comando 'git clone' é usado para criar uma cópia exata de um repositório Git existente.");
                System.out.println("Exemplo: git clone https://github.com/seu-usuario/seu-repositorio.git");
                break;
            case "git fetch":
                System.out.println("Comando: git fetch");
                System.out.println("Explicação: O comando 'git fetch' é usado para buscar as atualizações de um repositório remoto, mas não mescla as alterações no seu repositório local.");
                System.out.println("Exemplo: git fetch origin");
                break;
            case "git pull":
                System.out.println("Comando: git pull");
                System.out.println("Explicação: O comando 'git pull' é usado para buscar as atualizações de um repositório remoto e mesclar essas alterações no seu repositório local.");
                System.out.println("Exemplo: git pull origin master");
                break;
            default:
                System.out.println("Comando Git não reconhecido. Certifique-se de digitar 'git clone', 'git fetch' ou 'git pull'.");
        }
    }
}

