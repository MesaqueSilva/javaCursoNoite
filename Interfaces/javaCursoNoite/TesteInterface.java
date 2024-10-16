package javaCursoNoite;

public class TesteInterface {

	public static void main(String[] args) {
		Veiculo1 meuCarro = new Carro1();
		Veiculo1 minhaBike = new Bicicleta();
		
		//usando o carro:
		meuCarro.acelerar();
		meuCarro.frear();
		meuCarro.combustivel();
		
		//usando a bicicleta
		minhaBike.acelerar();
		minhaBike.frear();
		minhaBike.pneu();
	}

}