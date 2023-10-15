package atividade1;
import java.util.Scanner;
public class exercicio7 {
	public static void main(String args[]){
		  Scanner scanner = new Scanner(System.in);

		int salario = 3600;
		int salario_minimo = 1200;
		double x = salario / salario_minimo;
		System.out.println(" Antonio recebe quantas vezes mais que Lilia?" + x);
	}
}
