package personagem;

public class inimigo1 extends personagem{
	public inimigo1(String nome, int vida, int dano) {
		super("Esqueleto que morreu para plastico ", 50, 10);
       
	}
	public int getVida() {
        return vida;
    }

  
	public void atacar(personagem alvo) {
        int danoTotal = 15;
        System.out.println(nome + " atacou causando " + danoTotal + " de dano.");
        alvo.perderVida(danoTotal);
    }
	

}
	