

import java.util.Scanner;

public class ContarLetrasEspacos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = scanner.nextLine();
		
		int contadorLetras = 0;
		int contadorEspacos = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			contadorLetras++;
			
		}

		System.out.println("Numero de letras: " + contadorLetras);
		System.out.println("Numero de espaços em branco " + contadorEspacos);
		
	}

}
