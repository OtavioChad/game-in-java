package equipamentos;

import java.util.Random;
public class cajadoDaMorte extends arma{
	
    public cajadoDaMorte() {
    	super("Cajado-da-Morte", 11,0);
    }
    
   @Override
   public int getDanoCritico() {
	    Random rand = new Random();
	    int chance = rand.nextInt(100); // 0 a 99

	    if (chance < 30) { // 30% de chance de dano crítico
	        int danoVariavel = 5 + rand.nextInt(10); // valores de 5 a 14 (inclusive)
	        System.out.println(nome + ": Dano crítico causado! +" + danoVariavel + " de dano extra.");
	        return danoVariavel;
	    }

	    return 0;
	}
        
}