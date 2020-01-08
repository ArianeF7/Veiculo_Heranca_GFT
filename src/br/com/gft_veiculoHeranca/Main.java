package br.com.gft_veiculoHeranca;

public class Main {
	public static void main(String[] args) {
		
		carro c = new carro("gol", 10f, 2, 0, "GM", 4, "2020");
		aviao a = new aviao("helicoptero", 300000f, 0, 2, "domestico", "passeio");
		
		//TESTANDO O CARRO
		System.out.println("A modelo do carro é: " + c.getModelo());
		System.out.println("Quantidade combustivel no carro é: " + c.getQtdeCombustivel() + " litros");
		System.out.println("A velocidade do carro é: " + c.getQtdePassageiros());
		System.out.println("Quantidade de passageiros do carro é: " + c.getVelocidade());
		System.out.println("A marca do carro é: " + c.getMarca());
		System.out.println("A quantidade de portas do carro é: " + c.getPortas());
		System.out.println("O ano do carro é: " + c.getAno());
		System.out.println();
		
		
		//TESTANDO O AVIÃO
		
		System.out.println("A modelo do avião é: " + a.getModelo());
		System.out.println("Quantidade combustivel no avião é: " + a.getQtdeCombustivel() + " litros");
		System.out.println("Quantidade de passageiros do avião é: " + a.getQtdePassageiros());
		System.out.println("A velocidade do avião é: " + a.getVelocidade());
		System.out.println("O tipo do avião é: " + a.getTipo());
		System.out.println("O uso do avião é: " + a.getUso());
		
		
		
	}

}
