package atividade2;
import java.util.Scanner;

		public class exercicio3{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();

	        System.out.println("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();

	        System.out.println("Digite a terceira nota: ");
	        double nota3 = scanner.nextDouble();

	       
	        double media = (nota1 + nota2 + nota3) / 3;

	     
	        String mensagem;
	        if (media >= 0 && media < 3) 
	            mensagem = "REPROVADO";
	         else if (media >= 3 && media < 7) 
	            mensagem = "EXAME";
	         else if (media >= 7 && media <= 10) 
	            mensagem = "APROVADO";
	         else 
	            mensagem = "A media somente sera calculada entre numeros de 0a10";
	        System.out.println("MEDIA: " + media);
	        System.out.println("MENSAGEM: " + mensagem);

	    
	    }
       
     }
	
