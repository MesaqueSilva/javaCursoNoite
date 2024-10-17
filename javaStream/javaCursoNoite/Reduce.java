package javaCursoNoite;

import java.util.Arrays;
import java.util.List;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 6, 8, 9);

		// Filtrando numeros pares, impares e primos:
		//Numeros pares abaixo:
		int soma = numeros.stream().reduce(0 , Integer::sum);
		
	System.out.println("A soma dos números é: "+ soma);
	

	}
}