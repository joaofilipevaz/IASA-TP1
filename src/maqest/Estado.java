package maqest;

import java.util.HashMap;
import java.util.Map;

public class Estado<EV> {
	
	/* Variveis */
	private Map<EV, Estado<EV>> transicoes;
	private String nome;
	
	/* Contrutor */
	public Estado(String nome){
		this.nome = nome;
		transicoes = new HashMap<EV, Estado<EV>>();
	}
	
	/* Desenvolvimento */
	/**
	 * Este metodo procura no mapaDeEstados por um estado correspondente a um evento e retorna-o.
	 * @param evento
	 * @return
	 */
	public Estado<EV> processar(EV evento){
		return transicoes.get(evento);
	}
	
	/**
	 * Aqui é possivel armazenar nos estados no mapaDeEstados.
	 * @param evento
	 * @param estado
	 * @return
	 */
	public Estado<EV> trans(EV evento, Estado<EV> estado){
		transicoes.put(evento, estado);
		return this;
	}
	
	/* Getters and Setters */
	public String getNome(){
		return nome;
	}
	
	/* toString */
	public String toString(){
		return "O estado corrente é: " + nome;
	}
}
