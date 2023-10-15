package atividade2;
import java.util.Scanner;
public class exercicio4 {
	  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Digite seu peso");
	  double peso= input.nextDouble();
	  
	  System.out.print("Digite sua altura");
	  double altura= input.nextDouble();
	  double IMC= peso / (altura*altura);
	  
	  String situacao = null;
	  if(IMC<20) {
		  situacao= "Voce esta abaixo do peso";
	  }
	  else if(IMC>20 && IMC<=25) {
		  situacao= "Voce esta normal";
	  }
	  else if(IMC>25  && IMC<=30) {
		  situacao= "Voce esta sobrepeso";
	  }
	  else if(IMC>30  && IMC<=40) {
	      situacao= "Voce esta obeso";
	  }
	  else if(IMC>40) {
	      situacao= "Obesidade morbida";
	  }  
	      System.out.println("IMC:" + IMC);
	      System.out.println("situacao: " + situacao);

}

}