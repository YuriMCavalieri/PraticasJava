package atividade2;
   import java.util.Scanner;
public class exercicio2 {
	 public static void main(String[]args) {
	 Scanner input= new Scanner (System.in);
	System.out.print("Digite os lados do triangulo");
	int n1,n2,n3;
	n1= input.nextInt();
	n2= input.nextInt();
	n3= input.nextInt();
	
	if (n1==n2 && n1==n3 ) {
		System.out.println("O triangulo e equilatero");
	}
	else if(n1==n2 || n2== n3 || n1==n3 ) {
		System.out.println("O triangulo e isosceles");
	}
	else {
		System.out.println("O triangulo e escaleno");
	}
	}


}
