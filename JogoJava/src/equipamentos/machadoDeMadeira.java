package equipamentos;

import java.util.Random;
public class machadoDeMadeira extends arma{
	
    public machadoDeMadeira() {
    	super("Machado-De-Madeira", 7,0);
    }
    
   @Override
   public int getDanoCritico() {
	    Random rand = new Random();
	    int chance = rand.nextInt(100); // 0 a 99

	    if (chance < 30) { // 30% de chance de dano crítico
	        int danoVariavel = 2 + rand.nextInt(2); // valores de 2 a 4 (inclusive)
	        System.out.println(nome + ": Dano crítico causado! +" + danoVariavel + " de dano extra.");
	        return danoVariavel;
	    }

	    return 0;
	}
   }
        