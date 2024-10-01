public class Carro extends Veiculo {
	private int numeroDePortas;
	
	public Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super (marca, modelo, ano);
		this.numeroDePortas = numeroDePortas;
	}
@Override // sobreescreve o metodo, acrescentando informação que esta na subclasse "Carro"
public void exibirDetalhes() {
	super.exibirDetalhes();
	System.out.println("Número de portas: " + numeroDePortas);
	}
	
	
}