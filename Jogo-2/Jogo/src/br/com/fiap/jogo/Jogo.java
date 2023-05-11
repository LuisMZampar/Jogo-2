package br.com.fiap.jogo;

public class Jogo {

	public static void main(String[] args) {
		
		Guerreiro guerreiro1 = new Guerreiro();
		Mago mago1 = new Mago();
		BolaDeFogo bolaDeFogo = new BolaDeFogo();
		Dragao dragao1 = new Dragao();
		
		guerreiro1.mover(2, 5);
		mago1.mover(4, 7);
		bolaDeFogo.mover(2, 10);
		dragao1.mover(5, 21);
		
	}
	
}