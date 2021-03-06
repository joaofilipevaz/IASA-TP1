package ambiente;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ambiente {

	/* Variaveis */
	private Map<String, EventoAmb> eventos;
	private Scanner scan = new Scanner(System.in);
	private EventoAmb evento;
	
	/* Construtor */
	public Ambiente(){
		eventos = new HashMap<String, EventoAmb>();
		eventos.put("S", EventoAmb.SILENCIO);
		eventos.put("R", EventoAmb.RUIDO);
		eventos.put("I", EventoAmb.INIMIGO); 
		eventos.put("F", EventoAmb.FUGA); 
		eventos.put("V", EventoAmb.VITORIA);
		eventos.put("D", EventoAmb.DERROTA); 
		eventos.put("T", EventoAmb.TERMINAR); 
	}

	/* Desenvolvimento */
	/**
	 * evoluir para o proximo de estado.
	 */
	public void evoluir(){
		evento = gerarEvento();
		mostrar();
	}
	
	/**
	 * 
	 */
	private void mostrar() {
		System.out.printf("O evento � %s \n", evento);
	}
	
	/**
	 * o ambiente gera um determinado evento.
	 * @return
	 */
	private EventoAmb gerarEvento() {
		System.out.print("Evento: ");
		String comando = scan.next();
		evento = eventos.get(comando);
		return evento;
	}
	
	/**
	 * retorna o evento
	 * @return
	 */
	public EventoAmb obterEvento(){
		return evento;
	}
	
	/**
	 * Executa a accao.
	 * @param accao
	 */
	public void executarAccao(AccaoAmb accao){
		System.out.printf("Ac��o: %s \n", accao);
	}
}
