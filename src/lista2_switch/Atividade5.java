package lista2_switch;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
	int code, units;
	
	System.out.println("\nCódigo do Produto: ");
	code = (int) scanner.nextFloat();
	
	System.out.println("\nQuantidade: ");
	units = (int) scanner.nextFloat();
	
	switch(code) {
	case 1: 	
		float preco, results;
		preco = 10;
		results = preco*units;
		System.out.println("\nProduto: Cachorro Quente \nValor total R$" + results);
		break;
		
	case 2: 	
		preco = 15;
		results = preco*units;
		System.out.println("\nProduto: X-Salada \nValor total R$" + results);
		break;
		
	case 3: 	
		preco = 18;
		results = preco*units;
		System.out.println("\nProduto: X-Bacon \nValor total R$" + results);
		break;
		
	case 4: 	
		preco = 12;
		results = preco*units;
		System.out.println("\nProduto: Bauru \nValor total R$" + results);
		break;
		
	case 5: 	
		preco = 8;
		results = preco*units;
		System.out.println("\nProduto: Refrigerante \nValor total R$" + results);
		break;
		
	case 6: 	
		preco = 13;
		results = preco*units;
		System.out.println("\nProduto: Suco de Laranja \nValor total R$" + results);
		break;
	};
	}
}
