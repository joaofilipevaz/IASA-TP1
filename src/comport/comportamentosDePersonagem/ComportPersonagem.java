package comport.comportamentosDePersonagem;

import ambiente.EventoAmb;
import comport.ComportMaqEst;
import jogo.Estimulo;
import maqest.Estado;
import maqest.MaquinaEstados;

public class ComportPersonagem extends ComportMaqEst{
	
	@Override
	protected MaquinaEstados<Estimulo> iniciar() {

		//Definir Estados
		Estado<Estimulo> inspecionar = new Estado<Estimulo>("Inspecionar");
		Estado<Estimulo> patrulhar = new Estado<Estimulo>("Patrulhar");
		Estado<Estimulo> defender = new Estado<Estimulo>("Defender");
		Estado<Estimulo> combater = new Estado<Estimulo>("Combater");
		
		//Definir transicoes de estados
		patrulhar
			.trans(EventoAmb.RUIDO, inspecionar)
			.trans(EventoAmb.SILENCIO, patrulhar)
			.trans(EventoAmb.INIMIGO, defender);
			
		inspecionar
			.trans(EventoAmb.RUIDO, inspecionar)
			.trans(EventoAmb.INIMIGO, defender)
			.trans(EventoAmb.SILENCIO, patrulhar);
		
		defender
			.trans(EventoAmb.FUGA, inspecionar)
			.trans(EventoAmb.INIMIGO, combater);
		
		combater
			.trans(EventoAmb.DERROTA, patrulhar)
			.trans(EventoAmb.VITORIA, patrulhar)
			.trans(EventoAmb.FUGA, patrulhar)
			.trans(EventoAmb.INIMIGO, combater);
			
			
			
	 //Definir comportamenots
			comport(patrulhar, new Patrulhar());
			comport(inspecionar, new Inspecionar());
			comport(defender, new Defender());
			comport(combater, new Combater());
		
		return new MaquinaEstados<>(patrulhar);
	}
	
	

}
