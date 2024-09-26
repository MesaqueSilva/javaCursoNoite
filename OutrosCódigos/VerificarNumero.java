import java.util.Scanner;

public class VerificarNumero {
	public static void main(String[] args) {
		//Instanciando a classe Scanner(usando ela):
		Scanner scanner = new Scanner(System.in);
		//Pedir numero para o usuario:
		System.out.println("Digite um número: ");
		int numeroDigitado = scanner.nextInt();
		
		if( numeroDigitado > 0 ) {
			System.out.println("O número é positivo!");
		} else if ( numeroDigitado < 0  ) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("Numero é igual a ZERO");
		}
		
		
		
	}
}