package br.com.fiap.jogo;

public class Guerreiro extends Jogador{
	
	private int x;
	private int y;
	
	public void mover(int x, int y) {
		if(x >= 0 && y >= 0) {
	    this.x += x;
	    this.y += y;
	    System.out.println("Guerreiro está se movendo para a posição X: "+ x+" Y: "+y );
		}
	}
}
