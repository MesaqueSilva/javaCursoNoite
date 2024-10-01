import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Array {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String fruta;

		System.out.println("Digite os nomes das pessoas a serem sorteadas):");

		// Loop para adicionar frutas ao ArrayList até o usuário digitar "sair".
		while (true) {
			System.out.print("Digite o nome da fruta: ");
			fruta = sc.nextLine();

			if (fruta.equalsIgnoreCase("sair")) {
				break; // Sai do loop se o usuário digitar "sair".
			}
			frutas.add(fruta); // Adiciona a fruta ao ArrayList.
		}

		// Exibir todas as frutas.
		System.out.println("\nFrutas inseridas: ");
		for (String f : frutas) {
			System.out.println(f); // Imprime cada fruta.

		}

		sc.close(); // Fecha o Scanner.
	}

}