package javaCursoNoite;

import java.util.Arrays;
import java.util.List;

public class Match {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 6, -7, 8, 9);

		boolean maior50 = numeros.stream().anyMatch(n -> n > 50);
		
		if (maior50) {
			System.out.println("Número maior que 50");
		}else {
			System.out.println("Os números não são maiores que 50");
		}

		boolean positivo = numeros.stream().allMatch(n -> n > 0);
		
		if (positivo) {
			System.out.println("Os números são positivos");
		}else {
			System.out.println("Existe algum número negativo");
		}
		
		

		boolean nenhumNegativo = numeros.stream().noneMatch(n -> n < 0);
		if (nenhumNegativo) {
			System.out.println("Nenhum número é negativo");
		}else {
			System.out.println("Todos ou algum ou alguns números são negativos");
		}

	}
}