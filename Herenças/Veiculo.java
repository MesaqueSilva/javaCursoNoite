public class Veiculo {
	// Criação de atributos para a classe
	protected String marca, arma;
	protected String modelo;
	protected int ano;
	//criação de metodo
	public Veiculo(String marca, String modelo, int ano) {
		//chamando os atributos para o metodo
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;

	}
	public void exibirDetalhes() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
	

}