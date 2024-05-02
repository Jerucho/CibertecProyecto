package mantenimiento;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import cibertec.Main;

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
			dialog.setLocationRelativeTo(null);
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
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DialogListarCocinas.class.getResource("/imagenes/nuevoTamano.png")));
		setTitle("Listar Cocinas");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 690, 425);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(
				new TitledBorder(null, "Listado de Cocinas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(10, 11, 654, 280);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 309, 674, 77);
		contentPanel.add(panel);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(207, 15, 260, 47);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBackground(new Color(255, 128, 128));
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

	
	public void imprimir(String modelo, double precio,double fondo, double ancho, double alto, int quemadores) {
		txtS.append("Modelo             : " + modelo + "\n");
		txtS.append("Precio             : S/ " + precio + "\n");
		txtS.append("Profundidad  	   : " + fondo + " cm" + "\n");
		txtS.append("Ancho              : " + ancho + " cm" + "\n");
		txtS.append("Alto               : " + alto + " cm" + "\n");
		txtS.append("Quemadores	   : " + quemadores + "\n\n");

	}
	
	public void listarCocinas() {
		txtS.setText("LISTADO DE COCINAS  \n\n");
		
		imprimir(Main.modelo0, Main.precio0, Main.fondo0, Main.ancho0, Main.alto0, Main.quemadores0);
		imprimir(Main.modelo1, Main.precio1, Main.fondo1, Main.ancho1, Main.alto1, Main.quemadores1);
		imprimir(Main.modelo2, Main.precio2, Main.fondo2, Main.ancho2, Main.alto2, Main.quemadores2);
		imprimir(Main.modelo3, Main.precio3, Main.fondo3, Main.ancho3, Main.alto3, Main.quemadores3);
		
//		Empezar desde el principio
		txtS.setCaretPosition(0);
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
