package comport;

import jogo.Accao;
import jogo.Estimulo;

public class ComportHierarq implements Comportamento{
	
	/*Variaveis */
	private Comportamento[] comportamentos;
	
	/* Contrutor */
	public ComportHierarq(Comportamento[] comportamentos){
		this.comportamentos = comportamentos;
	}
	
	/* Desenvolvimento */
	@Override
	public Accao activar(Estimulo estimulo) {
		for(Comportamento comp : comportamentos){
			Accao accao = comp.activar(estimulo);
			if(accao != null)
				return accao;
		}
		return null;
	}

}
