package atividade2;
import java.util.Scanner;
public class exercicio6 {
	 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("Digite os numeros");
    
	int x,y,z;
	x= input.nextInt();
	y=  input.nextInt();
	z=  input.nextInt();
	if (x> y-z && x< y+z) {
    System.out.println("x pode ser lado de triangulo");
	}
	else {
	System.out.println("X nao pode ser lado de triangulo");  
	}

	if(y> x-z && y< x +z) {
   System.out.println("y pode ser lado de triangulo");	
	}
		
	else {
		System.out.println("y nao pode ser lado de triangulo");	
	}
	if (z> x-y && z< x+y) {
	 System.out.println("z pode ser lado de triangulo");	
	 }
	 else {
		 System.out.println("z nao pode ser lado de triangulo");	
		} 
	 }
	}
	


