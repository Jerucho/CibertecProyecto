package configuracion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cibertec.Main;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JButton btnConfirmar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public void abrirVentana() {
		try {
			ConfigurarObsequios dialog = new ConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequios() {
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 509, 186);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUnidad = new JLabel("1 unidad");
			lblUnidad.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblUnidad.setBounds(34, 39, 129, 14);
			contentPanel.add(lblUnidad);
		}
		{
			txtObs1 = new JTextField();
			txtObs1.setColumns(10);
			txtObs1.setBounds(174, 37, 86, 20);
			contentPanel.add(txtObs1);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("2 a 5 unidades");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(34, 66, 129, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtObs2 = new JTextField();
			txtObs2.setColumns(10);
			txtObs2.setBounds(174, 64, 86, 20);
			contentPanel.add(txtObs2);
		}
		{
			JLabel lblA = new JLabel("6 a más unidades");
			lblA.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblA.setBounds(34, 93, 129, 14);
			contentPanel.add(lblA);
		}
		{
			txtObs3 = new JTextField();
			txtObs3.setColumns(10);
			txtObs3.setBounds(174, 91, 86, 20);
			contentPanel.add(txtObs3);
		}
		{
			btnConfirmar = new JButton("Confirmar");
			btnConfirmar.addActionListener(this);
			btnConfirmar.setBounds(334, 26, 117, 42);
			contentPanel.add(btnConfirmar);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(334, 79, 117, 42);
			contentPanel.add(btnCerrar);
		}
		
		txtObs1.setText("" + Main.obsequio1);
		txtObs2.setText("" + Main.obsequio2);
		txtObs3.setText("" + Main.obsequio3);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnConfirmar) {
			actionPerformedBtnConfirmar(e);
		}
	}
	protected void actionPerformedBtnConfirmar(ActionEvent e) {
		
		String obsequioModificado1,obsequioModificado2,obsequioModificado3;
	    obsequioModificado1 = txtObs1.getText();
	    obsequioModificado2 = txtObs2.getText();
	    obsequioModificado3 = txtObs3.getText();
	    
	    Main.obsequio1 = obsequioModificado1;
	    Main.obsequio2 = obsequioModificado2;
	    Main.obsequio3 = obsequioModificado3;

	    dispose();
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
