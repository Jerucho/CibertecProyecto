package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class DialogConfigurar extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public void abrirVentana() {
		try {
			DialogConfigurar dialog = new DialogConfigurar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogConfigurar() {
		setTitle("Configurar");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(31, 17, 372, 227);
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(0, 1, 0, 0));
			{
				JButton btnConfigDescuentos = new JButton("Configurar Descuentos");
				panel.add(btnConfigDescuentos);
			}
			{
				JButton btnConfigObsequios = new JButton("Configurar Obsequios");
				panel.add(btnConfigObsequios);
			}
			{
				JButton btnConfigCantOptima = new JButton("Configurar Cantidad Optima");
				panel.add(btnConfigCantOptima);
			}
			{
				JButton btnConfigCuotaDiaria = new JButton("Configurar Cuota Diaria");
				panel.add(btnConfigCuotaDiaria);
			}
		}
	}

}
