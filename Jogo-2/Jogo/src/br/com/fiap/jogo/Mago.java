package br.com.fiap.jogo;

public class Mago extends Jogador{
	
	private int mp;
	private int x;
	private int y;
	
	public void Mp(int mp) {
		if(mp >= 0) {
		this.mp = mp;
		System.out.println("Poder: "+mp);
		}
	}
	
	public void mover(int x, int y) {
		if(x >= 0 && y >= 0) {
	    this.x += x;
	    this.y += y;
	    System.out.println("Mago está se movendo para a posição X: "+ x+" Y: "+y );
		}
	}

}
