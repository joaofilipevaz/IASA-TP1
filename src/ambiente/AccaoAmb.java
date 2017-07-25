package ambiente;

import jogo.Accao;

public enum AccaoAmb implements Accao{
	PATRULHAR,
	APROXIMAR,
	AVISAR,
	DEFENDER,
	ATACAR,
	PROCURAR,
	INICIAR;
	
	@Override
	public void executar() {
		System.out.printf("O evento anterior gerou a Accao %s \n", this);
	}

}
