import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();
		
		String palavraInvertida = new StringBuilder(palavraFormatada).reverse().toString();
		
		  if (palavraFormatada.equals(palavraInvertida)) {
	            System.out.println("A palavra é um palíndromo.");
	        } else {
	            System.out.println("A palavra não é um palíndromo.");
	        }
		
		scanner.close();
		
	}
	

}
