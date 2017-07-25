package jogo.jogo.personagem;

import ambiente.Ambiente;
import comport.comportamentosDePersonagem.ComportPersonagem;
import jogo.Accao;
import jogo.Estimulo;

public class Personagem {

	/* Variaveis */
	private Ambiente ambiente;
	private ComportPersonagem comport;
	
	/* Construtor */
	public Personagem(Ambiente ambiente){
		this.ambiente = ambiente;
		this.comport = new ComportPersonagem();
	}
	
	/* Desenvolvimento */
	/**
	 * representa o comportamento de uma personagem.
	 */
	public void executar(){
		Estimulo estimulo = precepcionar();
		Accao accao = processar(estimulo);
		actuar(accao);
		mostrar();
	}

	/**
	 * 
	 */
	private void mostrar() {
		System.out.println("Fim de execução de movimento");
	}

	/**
	 * Apos processar oum evento ocorrido a personagem actua com uma determinado accao
	 * Esta accao foi processada e decidida dependedo do evento que ocurreu no seu ambiente.
	 * @param accao
	 */
	private void actuar(Accao accao) {
		if(accao != null)
			accao.executar();
	}

	/**
	 * A personagem processa o evento ocorrido no ambiente e gera uma accao
	 * @param estimulo
	 * @return
	 */
	private Accao processar(Estimulo estimulo) {
		// TODO Auto-generated method stub
		return comport.activar(estimulo);
	}

	/**
	 * A personagem capta um evento no seu ambiente
	 * @return
	 */
	private Estimulo precepcionar() {
		return ambiente.obterEvento();
	}
}
