package cibertec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class DialogListarCocinas extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JButton btnCerrar;
	private JTextArea txtS;
	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public void abrirVentana() {
		try {
			DialogListarCocinas dialog = new DialogListarCocinas();
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
	public DialogListarCocinas() {
		setTitle("Listar Cocinas");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 690, 425);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 654, 280);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 309, 674, 77);
		contentPanel.add(panel);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 192));
		panel_1.setBounds(207, 15, 260, 47);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBorder(null);
		btnCerrar.setBounds(141, 6, 118, 34);
		panel_1.add(btnCerrar);

		btnNewButton = new JButton("Actualizar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(88, 176, 0));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(0, 6, 118, 34);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnCerrar.addActionListener(this);
		
		
		listarCocinas();
	}

	public void listarCocinas() {
		txtS.setText("LISTADO DE COCINAS  \n\n");
		txtS.append("Modelo             : " + Main.modelo0 + "\n");
		txtS.append("Precio             : S/ " + Main.precio0 + "\n");
		txtS.append("Profundidad  	   : " + Main.fondo0 + " cm" + "\n");
		txtS.append("Ancho              : " + Main.ancho0 + " cm" + "\n");
		txtS.append("Alto               : " + Main.alto0 + " cm" + "\n");
		txtS.append("Quemadores	   : " + Main.quemadores0 + "\n\n");

		txtS.append("Modelo             : " + Main.modelo1 + "\n");
		txtS.append("Precio             : S/ " + Main.precio1 + "\n");
		txtS.append("Profundidad  	   : " + Main.fondo1 + " cm" + "\n");
		txtS.append("Ancho              : " + Main.ancho1 + " cm" + "\n");
		txtS.append("Alto               : " + Main.alto1 + " cm" + "\n");
		txtS.append("Quemadores	   : " + Main.quemadores1 + "\n\n");

		txtS.append("Modelo             : " + Main.modelo2 + "\n");
		txtS.append("Precio             : S/" + Main.precio2 + "\n");
		txtS.append("Profundidad  	   : " + Main.fondo2 + " cm" + "\n");
		txtS.append("Ancho              : " + Main.ancho2 + " cm" + "\n");
		txtS.append("Alto               : " + Main.alto2 + " cm" + "\n");
		txtS.append("Quemadores	   : " + Main.quemadores2 + "\n\n");

		txtS.append("Modelo             : " + Main.modelo3 + "\n");
		txtS.append("Precio             : S/" + Main.precio3 + "\n");
		txtS.append("Profundidad  	   : " + Main.fondo3 + " cm" + "\n");
		txtS.append("Ancho              : " + Main.ancho3 + " cm" + "\n");
		txtS.append("Alto               : " + Main.alto3 + " cm" + "\n");
		txtS.append("Quemadores	   : " + Main.quemadores3 + "\n\n");

		txtS.append("Modelo             : " + Main.modelo4 + "\n");
		txtS.append("Precio             : S/" + Main.precio4 + "\n");
		txtS.append("Profundidad  	   : " + Main.fondo4 + " cm" + "\n");
		txtS.append("Ancho              : " + Main.ancho4 + " cm" + "\n");
		txtS.append("Alto               : " + Main.alto4 + " cm" + "\n");
		txtS.append("Quemadores	   : " + Main.quemadores4);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrrar(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		listarCocinas();
	}
	protected void actionPerformedBtnCerrrar(ActionEvent e) {
		dispose();
	}
}
