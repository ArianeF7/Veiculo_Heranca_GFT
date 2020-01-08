package br.com.gft_veiculoHeranca;

public class carro extends veiculo {
	
	
	public carro(String _modelo, float _qtdeCombustivel , int _velocidade, int _qtdePassageiros, String _marca, int _portas, String _ano) {
		super(_modelo, _qtdeCombustivel , _velocidade, _qtdePassageiros);
		// TODO Auto-generated constructor stub
		
		this.marca = _marca;
		this.portas = _portas;
		this.ano = _ano;
		
	}
	
	private String marca;
	private int portas;
	private String ano;


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}


}
