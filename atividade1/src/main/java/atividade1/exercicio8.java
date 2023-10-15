package atividade1;
import java.util.Scanner;
public class exercicio8 {
	public static void main(String args[]){
		  Scanner scanner = new Scanner(System.in);

		int peso_thais_carla = 300;
		double thais_engordou = (peso_thais_carla *0.15) + peso_thais_carla; 
		double thais_emagreceu = peso_thais_carla - ( peso_thais_carla * 0.20);
		System.out.println("thais engordou e seu novo peso é :" + thais_engordou + "kilos");
		System.out.println("thais emagreceu e seu novo peso é :"+ thais_emagreceu + "kilos");
	}
}
