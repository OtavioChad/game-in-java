package equipamentos;

import java.util.Random;

public class arma {
    protected String nome;
    protected int danoDaArma;
    protected int danoCritico;

    public arma(String nome, int danoDaArma, int danoCritico) {
        this.nome = nome;
        this.danoDaArma = danoDaArma;
    }

    public String getNome() {
        return nome;
    }
    public int getDanoDaArma() {
        return danoDaArma;
    }
    
    public int getDanoCritico() {
    	Random rand = new Random();
        int chance = rand.nextInt(100); // 0 a 99
        if (chance < 30) {
        	System.out.println("=======================================================================" ); 
            return danoCritico;
        }
        else {
        	return 0; 
        }

    }
}