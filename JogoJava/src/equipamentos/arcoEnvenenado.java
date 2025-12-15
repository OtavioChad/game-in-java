package equipamentos;

import java.util.Random;
public class arcoEnvenenado extends arma{
	
    public arcoEnvenenado() {
    	super("Arco-Envenenado", 12,0);
    }
    
   @Override
   public int getDanoCritico() {
	    Random rand = new Random();
	    int chance = rand.nextInt(100); // 0 a 99

	    if (chance < 100) { // 30% de chance de dano crítico
	        int danoVariavel = 3 + rand.nextInt(6); // valores de 3 a 8 (inclusive)
	        System.out.println(nome + ": Dano crítico causado! +" + danoVariavel + " de dano extra.");
	        return danoVariavel;
	    }

	    return 0;
	}
   }
        
