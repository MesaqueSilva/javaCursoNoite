
public class TesteVeiculos {
	public static void main(String[] args) {
		Moto moto = new Moto("Honda", "XRE", 2020, false);
		
		System.out.println("Detalhes da moto: ");
		moto.exibirDetalhes();
		

		Carro carro = new Carro("Toyota", "Corola", 2004, 4);
		
		System.out.println("Detalhes do carro: ");
		carro.exibirDetalhes();
		
		
	}
		

}


