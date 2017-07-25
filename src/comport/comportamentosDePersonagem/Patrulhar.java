package comport.comportamentosDePersonagem;

import ambiente.AccaoAmb;
import ambiente.EventoAmb;
import comport.ComportHierarq;
import comport.Comportamento;
import comport.Reaccao;

public class Patrulhar extends ComportHierarq{

	public Patrulhar() {
		super(new Comportamento[]{
			new Reaccao(EventoAmb.RUIDO, AccaoAmb.APROXIMAR),
			new Reaccao(EventoAmb.SILENCIO, AccaoAmb.PATRULHAR),	
			new Reaccao(EventoAmb.INIMIGO, AccaoAmb.APROXIMAR)	
		});
	}
}
