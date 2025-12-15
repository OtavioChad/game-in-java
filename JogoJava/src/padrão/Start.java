package padrão;

import java.util.Scanner;
import personagem.*;
import equipamentos.*;

public class Start {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean fase2 = false;
		boolean fase3 = false;
		/// DECLARE AS VARIAVEIS E PERSONAGENS AQUI

		int vidas = 3;
		personagem jogador = null;
		arma machadoDeDiamante = new machadoDeDiamante();
		arma machadoDeMadeira = new machadoDeMadeira();
		arma machadoEncantado = new machadoEncantado();
		arma cajadoDaMorte = new cajadoDaMorte();
		arma cajadoDoMedo = new cajadoDoMedo();
		arma cajadoSimples = new cajadoSimples();
		arma arcoEnvenenado = new arcoEnvenenado();
		arma arcoAtordoante = new arcoAtordoante();
		arma arcoFlamejante = new arcoFlamejante();
		inimigo1 inimigo = new inimigo1("Esqueleto que morreu para plastico ", 50, 30);
		inimigo2 inimigo2 = new inimigo2("Bruxo do plastico", 40, 45);
		inimigo3 inimigo3 = new inimigo3("Atirador de canudo", 60, 30);
		inimigo2 inimigo4 = new inimigo2("Devastador de plantas", 50, 35);
		inimigoBOSS BOSS = new inimigoBOSS("Atirador de canudo", 150, 60);

		/// definição das vidas

		while (vidas > 0) {

			/// FASE 1

			/// JOGO INICIA AQUI

			System.out.println("ESCOLHA A CLASSE:");
			System.out.println("[1] ARCHER | [2] BERSERKER | [3] WIZARD");
			int escolhaClasse = sc.nextInt();
			if (escolhaClasse == 1) {
				jogador = new archer("ARQUEIRO", 100, 10);
				System.out.println("\n=== ESCOLHA UMA ARMA ===");
				System.out.println("\n=== [1] ARCO-ENVENENADO | [2] ARCO-ATORDOANTE | [3] ARCO-FLAMEJANTE ===");
				System.out.println("\n=== DIGITE O NUMERO PARA ESCOLHER: ===");
				int escolhaArcher = sc.nextInt();
				if (escolhaArcher == 1) {
					jogador.equiparArma(arcoEnvenenado);
				}
				if (escolhaArcher == 2) {
					jogador.equiparArma(arcoAtordoante);
				}
				if (escolhaArcher == 3) {
					jogador.equiparArma(arcoFlamejante);
				}
				jogador.mostrarStatus();
				System.out.println("VIDAS:" + vidas);
				
				System.out.println("\n=== JOGADOR ESCOLHEU UMA ARMA PODEROSA PARA ENFRENTAR OS DESAFIOS! ===");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			if (escolhaClasse == 2) {
				jogador = new archer("GUERREIRO-FURIOSO", 100, 10);
				System.out.println("\n=== ESCOLHA UMA ARMA ===");
				System.out
						.println("\n=== [1] MACHADO-DE-MADEIRA | [2] MACHADO-DE-DIAMANTE | [3] MACHADO-ENCANTADO ===");
				System.out.println("\n=== DIGITE O NUMERO PARA ESCOLHER: ===");
				int escolhaBerserker = sc.nextInt();
				if (escolhaBerserker == 1) {
					jogador.equiparArma(machadoDeMadeira);
				}
				if (escolhaBerserker == 2) {
					jogador.equiparArma(machadoDeDiamante);
				}
				if (escolhaBerserker == 3) {
					jogador.equiparArma(machadoEncantado);
				}
				jogador.mostrarStatus();
				System.out.println("VIDAS:" + vidas);
				System.out.println("\n=== JOGADOR ESCOLHEU UMA ARMA PODEROSA PARA ENFRENTAR OS DESAFIOS! ===");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			if (escolhaClasse == 3) {
				jogador = new wizard("MAGO", 100, 10);
				System.out.println("\n=== ESCOLHA UMA ARMA ===");
				System.out.println("\n=== [1] CAJADO-SIMPLES | [2] CAJADO-DO-MEDO | [3] CAJADO-DA-MORTE ===");
				System.out.println("\n=== DIGITE O NUMERO PARA ESCOLHER: ===");
				int escolhaWizard = sc.nextInt();
				if (escolhaWizard == 1) {
					jogador.equiparArma(cajadoSimples);
				}
				if (escolhaWizard == 2) {
					jogador.equiparArma(cajadoDoMedo);
				}
				if (escolhaWizard == 3) {
					jogador.equiparArma(cajadoDaMorte);
				}
				jogador.mostrarStatus();
				System.out.println("VIDAS:" + vidas);

				System.out.println("\n=== JOGADOR ESCOLHEU UMA ARMA PODEROSA PARA ENFRENTAR OS DESAFIOS! ===");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			System.out.println(
					"\n=========================================================================================");
			System.out.println("\nUm heroi de origeM distinta une forças para impedir a ascensão de um antigo mal.\n"
					+ "Suas decisões e alianças definirão o futuro do reino e seus próprios destinos.");
			System.out.println(
					"\n=========================================================================================");
			System.out.println(
					"HISTORIA DE UM HEROI QUE ENFRENTA A CRISE AMBIENTAL EM UMA ILHA ONDE OS CANUDERS PREJUDICAM A FAUNA");
			System.out.println("O REI CANUDO E SEUS CAPANGAS TENTAM DESTRUIR A VIDA NA ILHA");
			System.out.println("NOSSO GUERREIRO [ " + jogador.getNome() + "] VAI A PROCURA DO MAL PARA ELIMINA-LO");
			System.out.println("QUE OS JOGOS COMECEM...");
			/// PAUSA
			try {
				Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/// ESCOLHA DA ARMA

			try {
				Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n=== ANDANDO PELA FLORESTA ELE ENCONTROU UM INIMIGO! ===");
			try {
				Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n=== COM ISSO, ELE DECIDIU ENTRAR EM UMA DISPUTA COM ELE! ===");
			try {
				Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			jogador.mostrarStatus();
			System.out.println("VIDAS:" + vidas);
			System.out.println("\n=== BATALHA INICIADA ===");
			try {
				Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Você: " + jogador.getClass().getSimpleName() + " VS Inimigo: "
					+ inimigo.getClass().getSimpleName());
			while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\nSeu turno:");
				jogador.atacar(inimigo);
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Vida do inimigo: " + inimigo.getVida());

				if (inimigo.getVida() <= 0) {
					System.out.println(
							"\n=========================================================================================");
					System.out.println("\nVocê derrotou o inimigo!");
					System.out.println("\n=== PARABENS, VOCE VENCEU SUA PRIMEIRA BATALHA!!! ===");
					System.out.println(
							"\n=========================================================================================");
					break;
				}

				System.out.println("\nTurno do inimigo:");
				inimigo.atacar(jogador);
				System.out.println("Sua vida: " + jogador.getVida());

				if (jogador.getVida() <= 0) {
					System.out.println(
							"\n=========================================================================================");
					System.out.println("\nVocê foi derrotado!");
					vidas -= 1;
					jogador.mostrarStatus();
					System.out.println("VIDAS:" + vidas);
					jogador.adicionarVida(150);
					System.out.println(
							"\n=========================================================================================");
					break;
				}
			}

			try {
				Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("\n====================================================");
			System.out.println("\n" + jogador.getNome() + " Encontrou uma tartaruga falante");
			/// PAUSA
			try {
				Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nTARTARUGA FALANTE: PELO JEITO VOCÊ ENCONTROU UMA MANEIRA DE DEFENDER NOSSO HABITAT.");
			/// PAUSA
			try {
				Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(
					"\nTARTARUGA FALANTE: DIZEM QUE HÁ MUITAS CRIATURAS ESPALHADAS PELA ILHA QUERENDO NOSSO MAL");
			/// PAUSA
			try {
				Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nTARTARUGA FALANTE: PRECISAMOS QUE ALGUÉM NOS SALVE, E TALVEZ SEJA VOCÊ!!!");
			/// PAUSA
			try {
				Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nTARTARUGA FALANTE: QUE TAL ESCOLHER??????????");
			/// PAUSA
			try {
				Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out
					.println("\n[1]MANDAR A TARTARUGA PROCURAR O QUE FAZER | [2]AJUDAR A TARTARUGA A ENFRENTAR O MAL");
			int escolha2 = sc.nextInt();

			if (escolha2 == 1) {
				System.out.println(
						"\nTARTARUGA FALANTE: VOCÊ ESQUECEU QUE EU SOU UMA TARTARUGA COM PODERES, E EU TE OBRIGADO A ME AJUDAR.");
				/// PAUSA
				try {
					Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\nTARTARUGA FALANTE: VOU DIFICULTAR UM POUCO PARA APRENDER!");
				/// PAUSA
				try {
					Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\nTARTARUGA FALANTE: VOCÊ PERDEU UMA VIDA HAHAHAHAHAHAHAHHAHA");
				vidas -= 1;
				jogador.mostrarStatus();
				System.out.println("VIDAS:" + vidas);
			}
			if (escolha2 == 2) {
				System.out.println("\nTARTARUGA FALANTE: VAMOS NESSA! TOME UM BÔNUS");
				System.out.println("\nVIDA AUMENTADA EM MAIS 20 PONTOS!");
				/// PAUSA
				try {
					Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				jogador.adicionarVida(20);
				jogador.mostrarStatus();
				System.out.println("VIDAS:" + vidas);
			}

			/// CARREGANDO TERCEIRO TURNO

			System.out.println(
					"\n=========================================================================================");
			System.out.println(
					"\nApós falar com uma tartaruga(DELIRIO DO" + jogador.getNome() + ") o mesmo continou sua jornada...");
			System.out.println(
					"\n=========================================================================================");
			/// PAUSA
			try {
				Thread.sleep(3000); // pausa por 3 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n===ANDANDO PELA ILHA, NOSSO GUERREIRO ACHA UMA COISA INCRIVEL===");
			System.out.println("\n=== ELE ENCONTRA UMA CAVERNA ===");
			System.out.println("\n===QUE TAL... ENTRAR?===");
			System.out.println("\n===[1]SIM] [2]NÃO]===");

			int escolha3 = sc.nextInt();
			if (escolha3 == 1) {
				System.out.println("\n===VOCÊ NÃO ACREDITA O QUE ENCONTROU...===");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\n...");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\n...");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\n...");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\nOUTROOOOO OPONENTEEEEEEEEEEEEE");
				System.out.println("\n=== COM ISSO, VOCE VAI TER QUE ENTRAR EM UMA DISPUTA COM ELE! ===");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
				jogador.mostrarStatus();
				System.out.println("VIDAS:" + vidas);
				System.out.println(
						"\n=========================================================================================");
				System.out.println("\n=== BATALHA INICIADA ===");
				System.out.println(
						"\n=========================================================================================");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Você: " + jogador.getClass().getSimpleName() + " VS Inimigo: "
						+ inimigo2.getClass().getSimpleName());
				while (jogador.getVida() > 0 && inimigo2.getVida() > 0) {
					try {
						Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("\nSeu turno:");
					jogador.atacar(inimigo2);
					try {
						Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Vida do inimigo: " + inimigo2.getVida());

					if (inimigo2.getVida() <= 0) {
						System.out.println("\nVocê derrotou o inimigo!");
						System.out.println("\n=== PARABENS, VOCÊ VENCEU !!! ===");
						break;
					}

					System.out.println("\nTurno do inimigo:");
					inimigo2.atacar(jogador);
					System.out.println("Sua vida: " + jogador.getVida());

					if (jogador.getVida() <= 0) {
						System.out.println("\nVocê foi derrotado!");
						vidas -= 1;
						jogador.mostrarStatus();
						System.out.println("VIDAS:" + vidas);
						jogador.adicionarVida(150);
						break;
					}
				}
			}
			if (escolha3 == 2) {
				System.out.println("Boa escolha, tinha um barulho estranho vindo de lá");
			}
				
			try {
				Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (vidas > 0) {
				System.out.println("\nPARABENS, VOCÊ PASSOU PELA FASE 1!!!");
				fase2 = true;
				break;
			}
			if (vidas < 1) {
				System.out.println("\nVocê foi derrotado!");
				System.out.println("\nREINICIE O JOGO");
				break;
			}
		}
		
		/// WHILE ACABA AQUI

		///////////////////////////////////////////////////////////////////////////////// FASE2

		while (vidas > 0) {
			if (fase2 == true) {
				System.out.println("\n=== FASE 2 INCIOU! ===");
				System.out.println(
						"\n=== DEUS DA ILHA: PARABENS MEU FILHO, VOCÊ NOS AJUDOU A PROTEGER A NOSSA QUERIDA ILHA ===");
				System.out.println("\n=== AINDA FALTAM INIMIGOS PARA ENFRENTAR! ===");
				System.out.println("\n=== VAMOS NESSA! ===");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("\n=== BATALHA INICIADA ===");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (1000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Você: " + jogador.getClass().getSimpleName() + " VS Inimigo: "
						+ inimigo3.getClass().getSimpleName());
				while (jogador.getVida() > 0 && inimigo3.getVida() > 0) {
					try {
						Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("\nSeu turno:");
					jogador.atacar(inimigo3);
					try {
						Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Vida do inimigo: " + inimigo3.getVida());

					if (inimigo3.getVida() <= 0) {
						System.out.println("\nVocê derrotou o inimigo!");
						break;
					}

					System.out.println("\nTurno do inimigo:");
					inimigo3.atacar(jogador);
					System.out.println("Sua vida: " + jogador.getVida());

					if (jogador.getVida() <= 0) {
						System.out.println("\nVocê foi derrotado!");
						vidas -= 1;
						jogador.mostrarStatus();
						System.out.println("VIDAS:" + vidas);
						jogador.adicionarVida(150);
						break;
					}
				}
				System.out
						.println("\nVocê chegou à Vila Verde. Aqui, a natureza ainda resiste, mas algo está errado...");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(
						"As árvores estão morrendo e o rio está ficando poluído. Alguém está jogando lixo na floresta!");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Por favor, ajude a proteger nosso lar. A natureza está pedindo socorro!");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("VOCÊ ENCONTROU UM MONTE DE LIXO NA ILHA!");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("O QUE FAZER?");
				System.out.println("[1] PEGAR E DESCARTAR CORRETAMENTE [2] DEIXAR LA MESMO E TOMAR UMA SKOL LONG NECK");
				int escolha4 = sc.nextInt();
				if (escolha4 == 1) {
					System.out.println("PARABENS, VOCE ENCONTROU UM GRANDE CORAÇÃO COMESTIVEL NO MEIO DO LIXO!!!");
					jogador.adicionarVida(80);
					jogador.mostrarStatus();
					System.out.println("VIDAS:" + vidas);
				}
				if (escolha4 == 2) {
					System.out.println("QUE AZAR, VOCE ESCOLHEU A OPÇÃO ERRADA!");
					try {
						Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Você: " + jogador.getClass().getSimpleName() + " VS Inimigo: "
							+ inimigo4.getClass().getSimpleName());
					while (jogador.getVida() > 0 && inimigo4.getVida() > 0) {
						try {
							Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("\nSeu turno:");
						jogador.atacar(inimigo4);
						try {
							Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Vida do inimigo: " + inimigo4.getVida());

						if (inimigo4.getVida() <= 0) {
							System.out.println("\nVocê derrotou o inimigo!");
							break;
						}

						System.out.println("\nTurno do inimigo:");
						inimigo4.atacar(jogador);
						System.out.println("Sua vida: " + jogador.getVida());

						if (jogador.getVida() <= 0) {
							System.out.println("\nVocê foi derrotado!");
							vidas -= 1;
							jogador.mostrarStatus();
							System.out.println("VIDAS:" + vidas);
							jogador.adicionarVida(150);
							break;
						}
					}
				}

				System.out.println("MAIS UMA CHANCE...");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("VOCÊ TEM UM BROTO QUE TE DA MOEDAS DE OURO");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("DESEJA PLANTAR PARA TER OURO INFINITO?");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("[1] SIM [2] NÃO");
				int escolha5 = sc.nextInt();
				if (escolha5 == 1) {
					System.out.println("VOCÊ NAO APRENDEU NADA!!!!!!!!!!!!!!!!!!!!!!!");
					try {
						Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("GANACIOSO PERDE 20 DE VIDA");
					jogador.perderVida(30);
				}
				if (escolha5 == 2) {
					System.out.println("ESCOLHEU CORRETAMENTE, PARABENS!!!!!!!!");
					System.out.println(jogador.getNome() + " GANHOU 10 DE DANO");
					jogador.adicionarDano(20);

				}
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Prepare-se, Guardião Verde. A floresta precisa de você.");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("SUA ULTIMA BATALHA ANTES DO BOSS");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("PREPARADO?");
				System.out.println("Após limpar a praia, você avança para o interior da Ilha Verdejante.");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(
						"Mas o perigo só aumenta... Os capangas do Rei Canudo estão espalhando plástico nos rios!");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(
						"Moradora Anciã: Eles querem sufocar a ilha com garrafas, sacolas e canudos! Só você pode impedir.");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Moradora Anciã: Se o rio morrer, a ilha morre junto. Vá, herói verde!");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Você: " + jogador.getClass().getSimpleName() + " VS Inimigo: "
						+ inimigo4.getClass().getSimpleName());
				while (jogador.getVida() > 0 && inimigo4.getVida() > 0) {
					try {
						Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("\nSeu turno:");
					jogador.atacar(inimigo4);
					try {
						Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Vida do inimigo: " + inimigo4.getVida());

					if (inimigo4.getVida() <= 0) {
						System.out.println("\nVocê derrotou o inimigo!");
						try {
							Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("\nVocê passou de fase!!!");
						try {
							Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(
								"\nPARA A SUA ULTIMA FASE, TODOS OS MORADORES DA ILHA TE DERAM CORAÇÕES A MAIS!!!");
						try {
							Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						jogador.adicionarVida(50);
						System.out.println("\n [50] CORAÇÕESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS!");
						fase3 = true;
						break;
					}
				
					System.out.println("\nTurno do inimigo:");
					inimigo4.atacar(jogador);
					System.out.println("Sua vida: " + jogador.getVida());

					if (jogador.getVida() <= 0) {
						System.out.println("\nVocê foi derrotado!");
						vidas -= 1;
						jogador.mostrarStatus();
						System.out.println("VIDAS:" + vidas);
						jogador.adicionarVida(150);
						break;
					}
					
				}
			fase2 = false;
				/// WHILE TERMINA AQUi
			}
		///////////// FASE 3
		while(vidas > 0) {
			if (fase3 == true) {
				System.out.println("FASEEEEEEEEEEEEEEEEEEEEEEEEEEE 3");
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("PEIXE ESTRANHO: GLUB GLUG GLUB ");
			try {
				Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println("PEIXE ESTRANHO: GLUB GLUB?");
			try {
				Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("PEIXE ESTRANHO: GLUB GLUB GLUB!!!");
			try {
				Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			jogador.adicionarDano(40);
			jogador.mostrarStatus();
			System.out.println("VIDAS:" + vidas);
			System.out.println("O ROTEIRO DO PEIXE ESTRANHO TE DEU 40 A MAIS DE DANO PARA ENFRENTAR O BOSS");
			try {
				Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("BOA SORTE!!!");
			System.out.println(
					"Você: " + jogador.getClass().getSimpleName() + " VS Inimigo: " + BOSS.getClass().getSimpleName());
			while (jogador.getVida() > 0 && BOSS.getVida() > 0) {
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\nSeu turno:");
				jogador.atacar(BOSS);
				try {
					Thread.sleep(2000); // pausa por 2 segundos (2000 milissegundos)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Vida do inimigo: " + BOSS.getVida());
				if (BOSS.getVida() <= 0) {
					System.out.println("\nVocê derrotou o BOSS!");
					System.out.println("VOCÊ SALVOU A ILHA DO BOSS: REI CANUDO");
					vidas = 0;
					break;
				}

				System.out.println("\nTurno do inimigo:");
				BOSS.atacar(jogador);
				System.out.println("Sua vida: " + jogador.getVida());

				if (jogador.getVida() <= 0) {
					System.out.println("\nVocê foi derrotado no ultimo segundo!");
					vidas = 0;
					break;
				}
				
			}

			
		

		}
	  }
			sc.close();
	}
	}
}

	