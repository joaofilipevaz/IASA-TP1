package comport.comportamentosDePersonagem;

import ambiente.AccaoAmb;
import ambiente.EventoAmb;
import comport.ComportHierarq;
import comport.Comportamento;
import comport.Reaccao;

public class Defender extends ComportHierarq{

	public Defender() {
		super(new Comportamento[]{
			new Reaccao(EventoAmb.INIMIGO, AccaoAmb.DEFENDER)		
		});
	}
}