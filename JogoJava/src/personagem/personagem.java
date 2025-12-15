package personagem;
import equipamentos.*;
public class personagem {
	protected String nome;
    protected int vida;
    protected int danoBase;
    protected int mana;
    protected arma arma;
    protected int danoTotal;
    
    public personagem(String nome, int vida, int danoBase) {
        this.nome = nome;
        this.vida = vida;
        this.danoBase = danoBase;
       
    }
    
   public void  mostrarStatus(){
	   System.out.println("==================== NOME:" + nome + "====================");
	   System.out.println("==================== DANO:" + (danoBase + (arma != null ? arma.getDanoDaArma() : 0) ) +"====================");
	   System.out.println("==================== VIDA:" + vida + "====================");
    }
    
    public void adicionarVida(int vidaAdicionada) {
    	vida += vidaAdicionada;
    }
    
    public void adicionarDano(int danoAdicionado) {
    	danoBase += danoAdicionado;
    }
    public void equiparArma(arma arma) {
        this.arma = arma;
        System.out.println(nome + " equipou " + arma.getNome() + " [+"
            + arma.getDanoDaArma() + " de dano]");
    }
    
    
    public void atacar(personagem alvo) {
        int danoTotal = danoBase + (arma != null ? arma.getDanoDaArma() : 0) + (arma != null ? arma.getDanoCritico() : 0);
        System.out.println(nome + " atacou causando " + danoTotal + " de dano.");
        alvo.perderVida(danoTotal);
       
    }
    
    public void perderVida(int dano) {
        vida -= dano;
    }
    
    public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getDanoBase() {
		return danoBase;
	}
	public void setDanoBase(int danoBase) {
		this.danoBase = danoBase;
	}
	
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	
}


