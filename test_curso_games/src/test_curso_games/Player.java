package test_curso_games;

public class Player {

	public int vida = 10;
	public String nome = "Luis";
	
	
	public void perderVida() {
		vida-=1;
	}
	
	public void ganharVida() {
		vida+=1;
	}
	
}
