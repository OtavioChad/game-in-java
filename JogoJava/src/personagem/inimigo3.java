package personagem;

public class inimigo3 extends personagem{
	public inimigo3 (String nome, int vida, int dano) {
		super("Atirador de canudo", 45, 30);
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