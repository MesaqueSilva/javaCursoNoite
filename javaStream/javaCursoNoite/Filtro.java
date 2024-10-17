package javaCursoNoite;

import java.util.Arrays;
import java.util.List;

public class Filtro {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Filtrando numeros pares, impares e primos:
		//Numeros pares abaixo:
		numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	
		//Numeros impares abaixo:
		
		//Numeros primos abaixo:
	}
}