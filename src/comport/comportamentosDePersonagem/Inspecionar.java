package comport.comportamentosDePersonagem;

import ambiente.AccaoAmb;
import ambiente.EventoAmb;
import comport.ComportHierarq;
import comport.Comportamento;
import comport.Reaccao;

public class Inspecionar extends ComportHierarq{

	public Inspecionar() {
		super(new Comportamento[]{
			new Reaccao(EventoAmb.RUIDO, AccaoAmb.PROCURAR),
			new Reaccao(EventoAmb.INIMIGO, AccaoAmb.APROXIMAR)		
		});
	}
}
