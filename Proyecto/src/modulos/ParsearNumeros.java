package modulos;

public class ParsearNumeros {
	public static int parsearEntero(String texto) throws NumberFormatException {
		try {
			ComprobarNumero.comprobarCantidadNumero(Integer.parseInt(texto));
			return Integer.parseInt(texto);
		}catch (NumberFormatException e) {
			return 0;
		}
	}

}
