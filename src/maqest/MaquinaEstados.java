package maqest;

public class MaquinaEstados<EV> {
		
	/* Variaveis */
	private Estado<EV> estado;
	
	
	/* Construtor */
	public MaquinaEstados(Estado<EV> estado){
		this.estado = estado;
	}
	
	/* Desenvolvimento */
	/**
	 * Aqui é actualizado o estado dependendo do evento recebido.
	 * @param evento
	 */
	public void processar(EV evento){
		Estado<EV> novoEstado= estado.processar(evento);
		estado = (novoEstado == null)? estado : novoEstado;
		System.out.println(estado.toString());
	}
	
	/* Getters e Setters */
	public Estado<EV> getEstado(){
		return estado;
	}
}
