package comport;

import java.util.HashMap;
import java.util.Map;

import jogo.Accao;
import jogo.Estimulo;
import maqest.Estado;
import maqest.MaquinaEstados;

public abstract class ComportMaqEst implements Comportamento{
	
	/* Variaveis */
	private MaquinaEstados<Estimulo> maqEst;
	private Map<Estado<Estimulo>, Comportamento> comportamento;
	
	/* Construtor */
	public ComportMaqEst(){
		comportamento = new HashMap<Estado<Estimulo>, Comportamento>();
		maqEst = iniciar();
	}
	
	/* Metodos absatratos */
	protected abstract MaquinaEstados<Estimulo> iniciar();
	
	/* Desenvolvimento */
	/**
	 * 
	 * @param estado
	 * @param comport
	 * @return
	 */
	public ComportMaqEst comport(Estado<Estimulo> estado, Comportamento comport){
		comportamento.put(estado, comport);
		return this;
	}
	
	@Override
	public Accao activar(Estimulo estimulo) {
		Comportamento comp = comportamento.get(getEstado());
		Accao accao = (comp != null) ? comp.activar(estimulo) : null; 
		maqEst.processar(estimulo);
		return accao;
	}
	
	/* Getters e Setters */
	public Estado<Estimulo> getEstado(){
		return maqEst.getEstado();
	}

}
