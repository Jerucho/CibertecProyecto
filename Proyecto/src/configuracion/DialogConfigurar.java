package configuracion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class DialogConfigurar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnConfigDescuentos;
	private JButton btnConfigCuotaDiaria;
	private JButton btnConfigObsequios;
	/**
	 * Launch the application.
	 */
	public void abrirVentana() {
		try {
			DialogConfigurar dialog = new DialogConfigurar();
			dialog.setLocationRelativeTo(null);
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
		setBounds(100, 100, 405, 362);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(46, 48, 296, 227);
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(0, 1, 0, 0));
			{
				btnConfigDescuentos = new JButton("Configurar Descuentos");
				btnConfigDescuentos.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnConfigDescuentos.setHorizontalTextPosition(SwingConstants.RIGHT);
				btnConfigDescuentos.setHorizontalAlignment(SwingConstants.LEADING);
				btnConfigDescuentos.setIconTextGap(10);
				btnConfigDescuentos.setIcon(new ImageIcon(DialogConfigurar.class.getResource("/imagenes/icono-descuento.png")));
				btnConfigDescuentos.addActionListener(this);
				panel.add(btnConfigDescuentos);
			}
			{
				btnConfigObsequios = new JButton("Configurar Obsequios");
				btnConfigObsequios.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnConfigObsequios.setHorizontalTextPosition(SwingConstants.RIGHT);
				btnConfigObsequios.setHorizontalAlignment(SwingConstants.LEADING);
				btnConfigObsequios.setIconTextGap(10);
				btnConfigObsequios.setIcon(new ImageIcon(DialogConfigurar.class.getResource("/imagenes/icono-regalo.png")));
				btnConfigObsequios.addActionListener(this);
				panel.add(btnConfigObsequios);
			}
			{
				JButton btnConfigCantOptima = new JButton("Configurar Cantidad Optima");
				btnConfigCantOptima.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnConfigCantOptima.setHorizontalTextPosition(SwingConstants.RIGHT);
				btnConfigCantOptima.setHorizontalAlignment(SwingConstants.LEADING);
				btnConfigCantOptima.setIconTextGap(10);
				btnConfigCantOptima.setIcon(new ImageIcon(DialogConfigurar.class.getResource("/imagenes/icono-cantidadoptima.png")));
				panel.add(btnConfigCantOptima);
			}
			{
				btnConfigCuotaDiaria = new JButton("Configurar Cuota Diaria");
				btnConfigCuotaDiaria.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnConfigCuotaDiaria.setHorizontalTextPosition(SwingConstants.RIGHT);
				btnConfigCuotaDiaria.setHorizontalAlignment(SwingConstants.LEADING);
				btnConfigCuotaDiaria.setIconTextGap(10);
				btnConfigCuotaDiaria.setIcon(new ImageIcon(DialogConfigurar.class.getResource("/imagenes/icono-cuotadiaria.png")));
				btnConfigCuotaDiaria.addActionListener(this);
				panel.add(btnConfigCuotaDiaria);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfigObsequios) {
			actionPerformedBtnConfigObsequios(e);
		}
		if (e.getSource() == btnConfigCuotaDiaria) {
			actionPerformedBtnConfigCuotaDiaria(e);
		}
		if (e.getSource() == btnConfigDescuentos) {
			actionPerformedBtnConfigDescuentos(e);
		}
	}
	
//	Dialogos de las acciones
	ConfigurarDescuentos ventanaConfigurarDescuentos = new ConfigurarDescuentos();
	ConfigurarCuotaDiaria ventanaConfigurarCuotaDiaria = new ConfigurarCuotaDiaria();
	ConfigurarObsequios ventanaConfigurarObsequios = new ConfigurarObsequios();

	
	protected void actionPerformedBtnConfigDescuentos(ActionEvent e) {
		ventanaConfigurarDescuentos.abrirVentana();
		dispose();
	}
	protected void actionPerformedBtnConfigCuotaDiaria(ActionEvent e) {
		ventanaConfigurarCuotaDiaria.abrirVentana();
		dispose();
	
	}
	protected void actionPerformedBtnConfigObsequios(ActionEvent e) {
		ventanaConfigurarObsequios.abrirVentana();
		dispose();
	}
}
