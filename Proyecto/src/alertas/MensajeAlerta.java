package alertas;

import javax.swing.JOptionPane;

public class MensajeAlerta {
	public static void alerta(String mensaje,String titulo, int tipo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, 0);
	}
}
