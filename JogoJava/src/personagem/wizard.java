package personagem;

public class wizard extends personagem{
	private boolean invocarAliado;
	public wizard(String nome, int vida, int danoBase) {
		super(nome, vida, danoBase);
        this.nome = nome;
        this.vida = vida;
        this.danoBase = danoBase;
        this.invocarAliado = false;
		}
	
	public void invocouAliado() {
		if (!invocarAliado) {
			danoBase *= 1.5; /// aumenta o dano quando invoca um aliado!
			System.out.println(nome + " Invocou um aliado! Dano aumentado para " + danoBase);
		}
	}
	
}