package cibertec;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class ConfigurarDescuentos extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JLabel lblNewLabel;
	private JTextField txtDes1;
	private JLabel lblNewLabel_1;
	private JTextField txtDes2;
	private JTextField txtDes4;
	private JTextField txtDes3;
	private JLabel lblNewLabel_2;
	private JLabel lblA;
	private JButton btnConfirmar;

	/**
	 * Launch the application.
	 */
	public void abrirVentana() {
		try {
			ConfigurarDescuentos dialog = new ConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarDescuentos() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Configurar Descuentos");
		setBounds(100, 100, 534, 215);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(367, 102, 120, 38);
		contentPanel.add(btnCerrar);
		
		lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(37, 41, 129, 14);
		contentPanel.add(lblNewLabel);
		
		txtDes1 = new JTextField();
		txtDes1.setBounds(177, 39, 86, 20);
		contentPanel.add(txtDes1);
		txtDes1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("6 a 10 unidades");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(37, 68, 129, 14);
		contentPanel.add(lblNewLabel_1);
		
		txtDes2 = new JTextField();
		txtDes2.setColumns(10);
		txtDes2.setBounds(177, 66, 86, 20);
		contentPanel.add(txtDes2);
		
		txtDes4 = new JTextField();
		txtDes4.setColumns(10);
		txtDes4.setBounds(177, 120, 86, 20);
		contentPanel.add(txtDes4);
		
		txtDes3 = new JTextField();
		txtDes3.setColumns(10);
		txtDes3.setBounds(177, 93, 86, 20);
		contentPanel.add(txtDes3);
		
		lblNewLabel_2 = new JLabel("Más de 15 unidades");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(37, 122, 129, 14);
		contentPanel.add(lblNewLabel_2);
		
		lblA = new JLabel("11 a 15 unidades");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblA.setBounds(37, 95, 129, 14);
		contentPanel.add(lblA);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(this);
		btnConfirmar.setBounds(367, 46, 120, 38);
		contentPanel.add(btnConfirmar);
		
		
		txtDes1.setText("" + Main.porcentaje1);
		txtDes2.setText("" + Main.porcentaje2);
		txtDes3.setText("" + Main.porcentaje3);
		txtDes4.setText("" + Main.porcentaje4);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirmar) {
			actionPerformedBtnConfirmar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnConfirmar(ActionEvent e) {

		
	}
}
