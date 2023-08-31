package lista1_ifelse;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	float A, B, C;
	
	System.out.println("\nDigite o número A: ");
	A = scanner.nextFloat();
	
	System.out.println("\nDigite o número B: ");
	B = scanner.nextFloat();
	
	System.out.println("\nDigite o número C: ");
	C = scanner.nextFloat();
	
	
	if(A+B > C) {
		System.out.println("\nA Soma de A + B é Maior do que C");
	}else if(A+B < C) {
		System.out.println("\nA Soma de A + B é Menor do que C");
	}else{
		System.out.println("\nA Soma de A + B é Igual a C");
	};	
	}
}
