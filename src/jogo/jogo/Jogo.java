package jogo.jogo;
import ambiente.Ambiente;
import ambiente.EventoAmb;
import jogo.jogo.personagem.Personagem;

public class Jogo {
	
		/* Variaveis */
		private static Ambiente ambiente = new Ambiente();
		private static Personagem personagem = new Personagem(ambiente);
		
		/* MAIN */
		public static void main(String[] args){
			executarJogo();
		}

		/* Loop do Jogo */
		/**
		 * Este metodo contem o mecanismo geral de jogo
		 */
		private static void executarJogo() {
			do{
				personagem.executar();
				ambiente.evoluir();
			}while(ambiente.obterEvento() != EventoAmb.TERMINAR);
		}

	
}
