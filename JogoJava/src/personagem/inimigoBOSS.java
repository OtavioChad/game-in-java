package personagem;

public class inimigoBOSS extends personagem{
	public inimigoBOSS(String nome, int vida, int dano) {
		super("Rei-Canudo", 200, 25);	
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
	