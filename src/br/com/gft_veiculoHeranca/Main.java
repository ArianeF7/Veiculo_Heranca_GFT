package br.com.gft_veiculoHeranca;

public class Main {
	public static void main(String[] args) {
		
		carro c = new carro("gol", 10f, 2, 0, "GM", 4, "2020");
		aviao a = new aviao("helicoptero", 300000f, 0, 2, "domestico", "passeio");
		
		//TESTANDO O CARRO
		System.out.println("A modelo do carro �: " + c.getModelo());
		System.out.println("Quantidade combustivel no carro �: " + c.getQtdeCombustivel() + " litros");
		System.out.println("A velocidade do carro �: " + c.getQtdePassageiros());
		System.out.println("Quantidade de passageiros do carro �: " + c.getVelocidade());
		System.out.println("A marca do carro �: " + c.getMarca());
		System.out.println("A quantidade de portas do carro �: " + c.getPortas());
		System.out.println("O ano do carro �: " + c.getAno());
		System.out.println();
		
		
		//TESTANDO O AVI�O
		
		System.out.println("A modelo do avi�o �: " + a.getModelo());
		System.out.println("Quantidade combustivel no avi�o �: " + a.getQtdeCombustivel() + " litros");
		System.out.println("Quantidade de passageiros do avi�o �: " + a.getQtdePassageiros());
		System.out.println("A velocidade do avi�o �: " + a.getVelocidade());
		System.out.println("O tipo do avi�o �: " + a.getTipo());
		System.out.println("O uso do avi�o �: " + a.getUso());
		
		
		
	}

}
