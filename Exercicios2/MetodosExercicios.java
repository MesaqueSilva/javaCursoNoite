
public class MetodosExercicios {
	
	public double mult(double a, double b) {
		return a * b;
	
}
	
	public double soma(double a, double b) {
		return a + b;
	
}
	
	public double sub(double a, double b) {
		return a - b;
	
}
	
	public double div(double a, double b) {
		return a / b;
	
}
	
	
	
	// Este método executa outros método.
	public static void main(String[] args) {
		
		//Instanciando a classe criada:
		MetodosExercicios util = new MetodosExercicios();
		
		System.out.println("A multiplicação de 5 e 3: "+ util.mult(5,3));
		System.out.println("A soma de 1 e 1022: "+ util.soma(1,1022));
		System.out.println("A subtração de 8 - 3: "+ util.sub(8,3));
		System.out.println("A divisão de 5 e 5: "+ util.div(5,5));
		
		
	}

}
