import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite-o " + (i + 1) + "º número: ");
			numeros[i] = scanner.nextInt();

		}

		Arrays.sort(numeros);

		System.out.println("numeros em ordem crescente: " + Arrays.toString(numeros));

		scanner.close();
	}

}
