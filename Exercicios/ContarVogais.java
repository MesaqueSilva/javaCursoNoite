import java.util.Scanner;

public class ContarVogais {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = scanner.nextLine();
		
		int contarVogais = 0;
		
		frase = frase.toLowerCase();
		
		for(char c : frase.toCharArray()) {
			
			
			
			if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				contarVogais++;
			}
		}
		
		System.out.println("A frase contém " + contarVogais + "vogais.");
		
		scanner.close();
		
		
	}

}
