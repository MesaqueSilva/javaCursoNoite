

public class ClassesMetodos {

	
	//metodo 1: calcula a soma de 2 valores:
	
	public double soma(double a, double b) {
		return a + b;
	}	
	
	public double mult(double a, double b) {
		return a * b;
		
	}
	
	
	
	//Metodo 2: verifica se um numero é par:
	
	public boolean ehPar(int numero) {
		return numero % 2 == 0;
	}
	
//	 String novoTexto = texto.replace("Java", "PHP");
//	 System.out.println("Texto após a substituição: " + novoTexto);
	
	//Metodo 3:
	
	String nome = "Mesaque Jose";
	
	public String palavrasInvertidas = nome.replace("Jose", "Silva"); 
	
	public String invertString(String texto ) {
		return new StringBuilder(texto).reverse().toString();
	}
	
	// Metodo 4:
	
	public int fatorial(int numero ) {
		if ( numero == 0 || numero == 1 ) {
			return 1;
		}
		return numero * fatorial(numero - 1);
		
	}
	
	//Metodo 5:
	public int maiorNumero(int[] numeros) {
		int maior = numeros[0];
		for ( int numero : numeros ) {
			if ( numero > maior ) {
				maior = numero;
			}
		}
		return maior;
	}
	
	
	
	// Este método executa outros método.
	public static void main(String[] args) {
		
		//Instanciando a classe criada:
		ClassesMetodos util = new ClassesMetodos();
		
		
		// Chamando os métodos
		System.out.println("soma de 5 e 3: "+ util.mult(5,5));
		System.out.println("O número 135 é par! " + util.ehPar(135));
		System.out.println("Palavras invertidas: "+ util.palavrasInvertidas);
		System.out.println("Palavras invertidas: "+ util.invertString("Java"));
		System.out.println("O Fatorial de 5 "+ util.fatorial(5));
		int[] numeros = {1, 8, 55, 66, 1025};
		System.out.println("O maior numero é "+ util.maiorNumero(numeros));

	}

}
