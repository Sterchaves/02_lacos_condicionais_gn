package lista1_ifelse;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		float number;
		
		System.out.println("\nDigite um número: ");
		number = scanner.nextFloat();
		
		if(number%2==0) {
			if(number >= 0)
			System.out.println("\nO Número " + number + " é par e positivo!");
			
			if(number < 0)
				System.out.println("\nO Número " + number + " é par e negativo!");
		}else{
			if(number >= 0)
			System.out.println("\nO Número " + number + " é ímpar e positivo!");
			
			if(number < 0)
				System.out.println("\nO Número " + number + " é ímpar e negativo!");
		}	
}
}