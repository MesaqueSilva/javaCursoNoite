

public class Cap8_Lab1 {
	
	public int numeroMaior(int[] numeros) {
		int maior = numeros[0];
		for ( int numero : numeros ) {
			if ( numero > maior ) {
				maior = numero;
			}
		}
		return maior;
	}
	
	public static void main(String[] args) {
		
		Cap8_Lab1 util = new Cap8_Lab1();
		int[] numero = {1,2,3,4,5};
		System.out.println("O maior numero é "+ util.numeroMaior(numero));
		
		ClassesMetodos util1 = new ClassesMetodos();
		int[] numeros = {10,15,20,25};
		System.out.println("O maior numero é "+ util1.maiorNumero(numeros));
		

	}

}
