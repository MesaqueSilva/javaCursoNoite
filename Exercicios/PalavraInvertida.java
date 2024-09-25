import java.util.Scanner;

public class PalavraInvertida {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite uma palavra: ");
			String palavra = scanner.nextLine();
			
			String PalavraInvertida = new StringBuilder(palavra).reverse().toString();
			
			System.out.println("Palavra invertida: " + PalavraInvertida);
			
			scanner.close();
			
	}
	
}
