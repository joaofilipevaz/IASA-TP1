package comport.comportamentosDePersonagem;

import ambiente.AccaoAmb;
import ambiente.EventoAmb;
import comport.ComportHierarq;
import comport.Comportamento;
import comport.Reaccao;

public class Combater extends ComportHierarq{

	public Combater() {
		super(new Comportamento[]{
			new Reaccao(EventoAmb.DERROTA, AccaoAmb.INICIAR),
			new Reaccao(EventoAmb.INIMIGO, AccaoAmb.ATACAR)		
		});
	}
}
