
public class NumPrimo {

	public static boolean ehPrimo(int numero) {
		if (numero < 2)
			return false;
		if (numero == 2)
			return true;
		if (numero % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(numero); i += 2) {
			if (numero % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		NumPrimo util = new NumPrimo();

		int numero = 337;

		System.out.println("O numero 334 é true ou false? " + util.ehPrimo(numero));

	}

}
