package personagem;
import java.util.Random;
public class archer extends personagem{
	private boolean disparoPreciso;
	public archer(String nome, int vida, int danoBase) {
		super(nome, vida, danoBase);
        this.nome = nome;
        this.vida = vida;
        this.danoBase = danoBase;
        this.disparoPreciso = false;
      
	}
	
	public void ataquePreciso() {
		if (!disparoPreciso) {
			disparoPreciso = true;
			}
		else {
			System.out.println("Você não tem habilidade");
			
		}
			Random rand = new Random();
	        int chance = rand.nextInt(99); // 0 a 30
	        if (chance < 30) {
	            danoBase *= 2;
	            System.out.println(nome + " usou Disparo Preciso! Acerto crítico! Dano: " + danoBase);
	        } else {
	            System.out.println(nome + " usou Disparo Preciso, mas foi um tiro normal. Dano: " + danoBase);
	        }
	      
	    }
}


