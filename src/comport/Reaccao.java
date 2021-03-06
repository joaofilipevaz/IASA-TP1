package comport;

import jogo.Accao;
import jogo.Estimulo;

public class Reaccao implements Comportamento{
	
	/* Variaveis */
	private Estimulo estimulo;
	private Accao accao;
	
	/* Construtor */
	public Reaccao(Estimulo estimulo, Accao accao){
		this.estimulo = estimulo;
		this.accao = accao;
	}
	
	/* Desenvolvimento */
	/**
	 * uma reaccao tem uma accao correspodente a um estimulo
	 * se o estimulo for o da reaccao ent�o retorna o seu estimulo.
	 */
	@Override
	public Accao activar(Estimulo estimulo) {
		return (this.estimulo == estimulo)? accao : null;
	}
}
