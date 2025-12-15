package equipamentos;

import java.util.Random;
public class cajadoDoMedo extends arma{
	
    public cajadoDoMedo() {
    	super("Cajado-do-Medo", 12,0);
    }
    
   @Override
   public int getDanoCritico() {
	    Random rand = new Random();
	    int chance = rand.nextInt(100); // 0 a 99

	    if (chance < 30) { // 30% de chance de dano crítico
	        int danoVariavel = 3 + rand.nextInt(6); // valores de 3 a 8 (inclusive)
	        System.out.println(nome + ": Dano crítico causado! +" + danoVariavel + " de dano extra.");
	        return danoVariavel;
	    }

	    return 0;
	}
   }
        
