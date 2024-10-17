package javaCursoNoite;

import java.util.Arrays;
import java.util.List;

public class LimitSkip {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 6, 8, 9);

        numeros.stream().limit(5).forEach(System.out::println);  
       

        System.out.println("---");

      
        numeros.stream().skip(0).forEach(System.out::println);  
	

	}
}