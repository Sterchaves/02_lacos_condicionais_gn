package lista2_switch;
import java.util.Scanner;

public class Atividade6 {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("\n");
	
	String  name;
	double salario; 
	int cargo;
	
	System.out.println("Nome do Colaborador: ");
	name =  scanner.nextLine();
	
	System.out.println("Cargo: ");
	cargo = scanner.nextInt();
	
	System.out.println("Salário: ");
	salario = scanner.nextDouble();
	
	switch(cargo) {
	case 1:
		double newSalario = salario*1.1;
		System.out.println("\nNome do colaborador: "+ name +"\nCargo: Gerente \nSalário: " + newSalario);
		break;
		
	case 2:
		newSalario = salario*1.07;
		System.out.println("\nNome do colaborador: "+ name +"\nCargo: Vendedor \nSalário: " + newSalario);
		break;
		
	case 3:
		newSalario = salario*1.09;
		System.out.println("\nNome do colaborador: "+ name +"\nCargo: Supervisor \nSalário: " + newSalario);
		break;
		
	case 4:
		newSalario = salario*1.06;
		System.out.println("\nNome do colaborador: "+ name +"\nCargo: Motorista \nSalário: " + newSalario);
		break;
		
	case 5:
		newSalario = salario*1.05;
		System.out.println("\nNome do colaborador: "+ name +"\nCargo: Estoquista \nSalário: " + newSalario);
		break;
		
	case 6:
		newSalario = salario*1.08;
		System.out.println("\nNome do colaborador: "+ name +"\nCargo: Técnico de TI \nSalário: " + newSalario);
		break;
		
	};	
		
	}
}
