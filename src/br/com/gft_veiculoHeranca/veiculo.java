package br.com.gft_veiculoHeranca;

public class veiculo {

	// ATRIBUTOS
	private String modelo;
	private float qtdeCombustivel;
	private int velocidade, qtdePassageiros;

	// METODOS
	// METODO CONSTRUTOR

	public veiculo(String _modelo, float _qtdeCombustivel, int _velocidade, int _qtdePassageiros) {
		this.modelo = _modelo;
		this.qtdePassageiros = _qtdePassageiros;
		this.qtdeCombustivel = _qtdeCombustivel;
		this.velocidade = _velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getQtdeCombustivel() {
		return qtdeCombustivel;
	}

	public void setQtdeCombustivel(float qtdeCombustivel) {
		this.qtdeCombustivel = qtdeCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}

}
