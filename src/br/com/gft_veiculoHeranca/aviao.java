package br.com.gft_veiculoHeranca;

public class aviao extends veiculo{
	
	private String tipo, uso;

	public aviao(String _modelo, float _qtdeCombustivel, int _velocidade, int _qtdePassageiros, String _tipo, String _uso) {
		super(_modelo, _qtdeCombustivel, _velocidade, _qtdePassageiros);
		
		
		this.tipo = _tipo;
		this.uso = _uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

}
