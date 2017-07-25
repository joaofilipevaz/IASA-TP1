package ambiente;

import jogo.Estimulo;

public enum EventoAmb implements Estimulo{
	SILENCIO,
	RUIDO,
	INIMIGO,
	FUGA,
	VITORIA,
	DERROTA,
	TERMINAR;
}
