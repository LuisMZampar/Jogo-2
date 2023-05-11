package br.com.fiap.jogo;

public class BolaDeFogo {
	
	private int poder;
	private int x;
	private int y;
	
	public void poder(int poder) {
		if(poder >= 0) {
		this.poder = poder;
		System.out.println("Poder: "+poder);
		}
	}

	public void mover(int x, int y) {
		if(x >= 0 && y >= 0) {
	    this.x += x;
	    this.y += y;
	    System.out.println("A bola de Fogo vai atingir a posição X: "+ x+" Y: "+y );
		}
	}

}
