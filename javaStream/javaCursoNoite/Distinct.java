package javaCursoNoite;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        numeros.stream().distinct().forEach(System.out::print);
    }
}


	
