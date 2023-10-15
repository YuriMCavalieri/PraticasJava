package atividade2;
import java.util.Scanner;
public class exercicio11 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("digite o numero de diarias");
    int diaria, taxa, dias;
    diaria= 500;
    dias= input.nextInt();
    taxa= 0;
    if(dias<15) {
    taxa= (15*dias);
    System.out.println((diaria*dias)+ taxa);
    }
    else if(dias==15) {
    	taxa=(10*dias);
    System.out.println((diaria*dias)+ taxa);
    }
    else if(dias>15) {
    	taxa=(5*dias);
    System.out.println((diaria*dias)+ taxa);
    }

	}
}
