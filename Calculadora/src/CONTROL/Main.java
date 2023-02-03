package CONTROL;

import VISTA.Principal;

public class Main {

	public static void main(String[] args) {
		Principal principal = new Principal();
		EventoClick manejador = new EventoClick(principal);
		principal.establecerEventos(manejador);

	}

}
