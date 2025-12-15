package personagem;

public class berserker extends personagem{
		private boolean modoFuria;
		public berserker(String nome, int vida, int danoBase) {
			super(nome, vida, danoBase);
	        this.nome = nome;
	        this.vida = vida;
	        this.danoBase = danoBase;
	        this.modoFuria = false;
			}
		public void entrarEmFuria() {
	        if (!modoFuria) {
	            modoFuria = true;
	            danoBase *= 2; // dobra o dano quando entra em fúria
	            System.out.println(nome + " entrou em FÚRIA! Dano dobrado para " + danoBase);
	        } else {
	            System.out.println(nome + " já está em fúria!");
	        }
	    }
	}
