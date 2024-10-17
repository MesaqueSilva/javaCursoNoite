package javaCursoNoite;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupandoPorTamanho {
	public static void main(String[] args) {
		
	List<String> palavras = Arrays.asList("Comida","Casal","Carro","Casa","Apartamento","Café");
	Map<Integer, List<String>> agrupadoTamanhoPalavras = palavras.stream().collect(Collectors.groupingBy(String::length));
	
	System.out.println(agrupadoTamanhoPalavras);
	
	
		
	}

}
