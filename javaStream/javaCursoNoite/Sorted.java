package javaCursoNoite;

import java.util.Arrays;
import java.util.List;

public class Sorted {
	public static void main(String[] args) {
		List<String> numeros = Arrays.asList("Mesaque", "José", "Silva", "Emily");

		// Filtrando numeros pares, impares e primos:
		//Numeros pares abaixo:
		numeros.stream().sorted().forEach(System.out::println);
	

	}
}