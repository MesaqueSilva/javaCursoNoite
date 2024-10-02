
public class TesteVeiculos {
	public static void main(String[] args) {

		Moto moto = new Moto("Honda", "XRE", 2020, false);
		Carro carro = new Carro("Toyota", "Corola", 2004, 4);
		Moto moto2 = new Moto("Honda", "NX500", 2024, true);
		Carro carro2 = new Carro("Volkswagen", "gol", 2004, 4);

		System.out.println("Detalhes do carro: ");
		carro.exibirDetalhes();

		System.out.println("\nDetalhes da moto: ");
		moto.exibirDetalhes();
		
		System.out.println("\nDetalhes do carro: ");
		carro2.exibirDetalhes();

		System.out.println("\nDetalhes da moto: ");
		moto2.exibirDetalhes();

	}

}
