package javaCursoNoite;

public class Carro1 implements Veiculo1{
	//construtor sem parametros(necessario para a linha 'new Carro()')
	public Carro1() {
		
		
		//se houver lógica de inicialização, insira-a aqui!
	}
	
	@Override//sobre escrever
	public void acelerar() {
		System.out.println("O carro esta acelerando...");
	}
	
	@Override
	public void frear() {
		System.out.println("O carro esta freando...");
	}
	@Override
	public void combustivel() {
		System.out.println("Acabando combustivel");
	}

	@Override
	public void pneu() {
		
		
	}
}