

import java.util.Scanner;

public class CalcularDesconto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o preço original do produto: r$ ");
		double precoOriginal = scanner.nextDouble();
		
		System.out.println("Digite o Porcentual de desconto: ");
		double percentualDesconto = scanner.nextDouble();
		
		double valorDesconto = (percentualDesconto / 100) * precoOriginal;
		
		double precoFinal = precoOriginal - valorDesconto;
		
		System.out.printf("O preço final após o desconto é: R$ %.2f%n", precoFinal);
		
		scanner.close();
		

	}

}
