package javaCursoNoite;

import java.util.Arrays;
import java.util.List;

public class Map {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 6, 8, 9);

		// Filtrando numeros pares, impares e primos:
		//Numeros pares abaixo:
		numeros.stream().map(n -> n * 2).forEach(System.out::println);
	

	}
}