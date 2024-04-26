package cibertec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class DialogGenerarReporte extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTextArea txtSalida;

	private String tituloBorde = "Ventas por modelo";

	/**
	 * Launch the application.
	 */
	public void abrirVentana() {
		try {
			DialogGenerarReporte dialog = new DialogGenerarReporte();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogGenerarReporte() {
		setTitle("Generar Reporte");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 692, 461);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 676, 87);
		contentPanel.add(panel);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBounds(54, 32, 568, 22);
		panel_1.setBackground(new Color(0, 128, 192));
		panel.add(panel_1);
		panel_1.setLayout(null);

		lblNewLabel = new JLabel("Tipo de Reporte");
		lblNewLabel.setBounds(0, 2, 150, 14);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relación a la venta óptima", "Promedios, menores y mayores", "Precios en relación al precio promedio"}));
		comboBox.setBounds(137, 0, 431, 22);
		panel_1.add(comboBox);

		scrollPane = new JScrollPane();
		scrollPane.setBorder(
				new TitledBorder(null, tituloBorde, TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(10, 98, 656, 313);
		contentPanel.add(scrollPane);

		txtSalida = new JTextArea();
		txtSalida.setEditable(false);
		scrollPane.setViewportView(txtSalida);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			actionPerformedComboBox(e);
		}
	}

	protected void actionPerformedComboBox(ActionEvent e) {
		String tipo = comboBox.getSelectedItem().toString();
		scrollPane.setBorder(new TitledBorder(null, tipo, TitledBorder.LEADING, TitledBorder.TOP, null, null));
	}
}
