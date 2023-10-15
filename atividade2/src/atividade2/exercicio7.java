package atividade2;
import java.util.Scanner;
public class exercicio7 {
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
		System.out.println("Digite as variaveis para completar a equacao: ax*2 + bx + c");
	int a,b,c, del;
	a= input.nextInt();
	b= input.nextInt();
	c= input.nextInt();
	del= (b*b -4*a*c);
	if (a== 0 && b== 0 && c == 0) {
	System.out.println("Igualdade confirmada: 0=0");
	}
	if (a== 0 && b== 0 && c!=0) {
	
		System.out.println("Coeficientes informados incorretamente");
	}
	else if (a==0 && b!=0) {
		System.out.println("Esta é uma equacao de primerio grau" + -c/b);
	}
	else if (a!=0) {
		System.out.println("Esta é uma equacao de segundo grau");
	}
    if (del<0) {
		System.out.println("Esta equacao nao possui raizes reais");
	}
	 else if(del==0) {
		 System.out.println("Esta equacao possui duas raizes reias iguais a:" + (-b/(2*a)));	 
	 }
	 else if(del>0) {
		 System.out.println("Esta equacao possui duas raizes reais:");
		 System.out.println((+b/(2*a)) );
		 System.out.println((-b/(2*a)));
	 }
	}
}
