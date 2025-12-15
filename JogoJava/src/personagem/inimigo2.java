package personagem;

public class inimigo2 extends personagem{
	public inimigo2(String nome, int vida, int dano) {
		super("Bruxo do plastico", 40, 25);
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

	