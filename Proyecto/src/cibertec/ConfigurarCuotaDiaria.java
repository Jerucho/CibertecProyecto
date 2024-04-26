package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarCuotaDiaria extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCuotaDiaria;
	private JButton btnConfirmar;

	/**
	 * Launch the application.
	 */
	public void abrirVentana() {
		try {
			ConfigurarCuotaDiaria dialog = new ConfigurarCuotaDiaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarCuotaDiaria() {
		setBounds(100, 100, 450, 133);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Cuota diaria esperada (S/.)");
			lblNewLabel.setBounds(40, 32, 143, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txtCuotaDiaria = new JTextField();
			txtCuotaDiaria.setBounds(193, 29, 86, 20);
			contentPanel.add(txtCuotaDiaria);
			txtCuotaDiaria.setColumns(10);
		}
		{
			btnConfirmar = new JButton("Confirmar'");
			btnConfirmar.addActionListener(this);
			btnConfirmar.setBounds(320, 11, 89, 23);
			contentPanel.add(btnConfirmar);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(320, 45, 89, 23);
			contentPanel.add(btnCerrar);
		}
		
		txtCuotaDiaria.setText("" + Main.cuotaDiaria);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirmar) {
			actionPerformedBtnConfirmar(e);
		}
	}
	protected void actionPerformedBtnConfirmar(ActionEvent e) {
		double cuotaDiariaMod;
		
		cuotaDiariaMod = Double.parseDouble(txtCuotaDiaria.getText());
		
		Main.cuotaDiaria=cuotaDiariaMod;
		
		dispose();
	}
}


