package atividade2;
import java.util.Scanner;
public class exercicioo10 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	System.out.println("Digite dois numeros");
	int n1,n2;
	n1= input.nextInt();
	n2=input.nextInt();
	
	System.out.println(n1+n2);
	System.out.println(n1*n2);
	if(n1>n2) {
		System.out.println(n1-n2);	
	}
	else if(n2>n1)	{
		System.out.println(n2-n1);
	}
	else if(n1==n2) {
		System.out.println("0");
	}
		
	System.out.println(n1%n2);
	if(n2==0);
	System.out.println("Não é possivel realizar divisao por 0");
}
}
