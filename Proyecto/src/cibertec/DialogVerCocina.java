package cibertec;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class DialogVerCocina extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPrecio;
	private JLabel lblAnchocm;
	private JLabel lblAltocm;
	private JLabel lblFondocm;
	private JLabel lblQuemadores;
	private JComboBox cboModificarCocina;
	private JPanel panel;
	private JTextField txtModificarPrecio;
	private JTextField txtModificarAncho;
	private JTextField txtModificarAlto;
	private JTextField txtModificarFondo;
	private JTextField txtModificarQuemadores;
	private JButton btnCerrarVentana;

	public int indexModeloSeleccionado;
	private JPanel panel_1;
	private JLabel lblModeloCocina;
	private JLabel lblModelo;

	/**
	 * Launch the application.
	 */
	public void abrirVentana() {
		try {
			DialogVerCocina dialog = new DialogVerCocina();
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
	public DialogVerCocina() {
		setResizable(false);
		setTitle("Ver Cocina");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 572, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBounds(28, 33, 147, 291);
		contentPane.add(panel);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		cboModificarCocina = new JComboBox();
		cboModificarCocina.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		cboModificarCocina.addActionListener(this);
		cboModificarCocina.setModel(new DefaultComboBoxModel(new String[] {Main.modelo0, Main.modelo1, Main.modelo2, Main.modelo3, Main.modelo4}));
		panel.add(cboModificarCocina);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setForeground(new Color(255, 255, 255));
		panel.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarPrecio = new JTextField();
		txtModificarPrecio.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarPrecio.setEditable(false);
		panel.add(txtModificarPrecio);
		txtModificarPrecio.setColumns(10);
		
		lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setForeground(new Color(255, 255, 255));
		panel.add(lblAnchocm);
		lblAnchocm.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarAncho = new JTextField();
		txtModificarAncho.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarAncho.setEditable(false);
		panel.add(txtModificarAncho);
		txtModificarAncho.setColumns(10);
		
		lblAltocm = new JLabel("Alto (cm)");
		lblAltocm.setForeground(new Color(255, 255, 255));
		panel.add(lblAltocm);
		lblAltocm.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarAlto = new JTextField();
		txtModificarAlto.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarAlto.setEditable(false);
		panel.add(txtModificarAlto);
		txtModificarAlto.setColumns(10);
		
		lblFondocm = new JLabel("Fondo (cm)");
		lblFondocm.setForeground(new Color(255, 255, 255));
		panel.add(lblFondocm);
		lblFondocm.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarFondo = new JTextField();
		txtModificarFondo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarFondo.setEditable(false);
		panel.add(txtModificarFondo);
		txtModificarFondo.setColumns(10);
		
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setForeground(new Color(255, 255, 255));
		panel.add(lblQuemadores);
		lblQuemadores.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarQuemadores = new JTextField();
		txtModificarQuemadores.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarQuemadores.setEditable(false);
		panel.add(txtModificarQuemadores);
		txtModificarQuemadores.setColumns(10);
		
		btnCerrarVentana = new JButton("Cerrar");
		btnCerrarVentana.setBorder(null);
		btnCerrarVentana.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCerrarVentana.setForeground(new Color(255, 255, 255));
		btnCerrarVentana.setBackground(new Color(234, 85, 85));
		btnCerrarVentana.addActionListener(this);
		btnCerrarVentana.setBounds(394, 287, 152, 37);
		contentPane.add(btnCerrarVentana);
		
		
		
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 192));
		panel_1.setBounds(0, 0, 210, 346);
		contentPane.add(panel_1);
		
		lblModeloCocina = new JLabel("");
		lblModeloCocina.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModeloCocina.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblModeloCocina.setBounds(233, 56, 264, 54);
		contentPane.add(lblModeloCocina);
		
		txtModificarPrecio.setText(String.valueOf(Main.precio0));
		txtModificarAncho.setText(String.valueOf(Main.ancho0));
		txtModificarAlto.setText(String.valueOf(Main.alto0));
		txtModificarFondo.setText(String.valueOf(Main.fondo0));
		txtModificarQuemadores.setText(String.valueOf(Main.quemadores0));
		lblModeloCocina.setText(Main.modelo0);
		
		lblModelo = new JLabel("Ver Cocina - Modelo:");
		lblModelo.setForeground(new Color(0, 128, 192));
		lblModelo.setHorizontalAlignment(SwingConstants.LEFT);
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblModelo.setBounds(254, 33, 222, 37);
		contentPane.add(lblModelo);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModificarCocina) {
			actionPerformedCboModificarCocina(e);
		}
		if (e.getSource() == btnCerrarVentana) {
			actionPerformedBtnCerrarVentana(e);
		}
	}
	
	
	public void mostrarAtributosComboBox() {
		indexModeloSeleccionado = cboModificarCocina.getSelectedIndex();
		switch (indexModeloSeleccionado) {
			case 0:
				lblModeloCocina.setText(Main.modelo0);
				txtModificarPrecio.setText(String.valueOf(Main.precio0));
				txtModificarAncho.setText(String.valueOf(Main.ancho0));
				txtModificarAlto.setText(String.valueOf(Main.alto0));
				txtModificarFondo.setText(String.valueOf(Main.fondo0));
				txtModificarQuemadores.setText(String.valueOf(Main.quemadores0));
				break;
			case 1:
				lblModeloCocina.setText(Main.modelo1);
				txtModificarPrecio.setText(String.valueOf(Main.precio1));
				txtModificarAncho.setText(String.valueOf(Main.ancho1));
				txtModificarAlto.setText(String.valueOf(Main.alto1));
				txtModificarFondo.setText(String.valueOf(Main.fondo1));
				txtModificarQuemadores.setText(String.valueOf(Main.quemadores1));
				break;
			case 2:
				lblModeloCocina.setText(Main.modelo2);
				txtModificarPrecio.setText(String.valueOf(Main.precio2));
				txtModificarAncho.setText(String.valueOf(Main.ancho2));
				txtModificarAlto.setText(String.valueOf(Main.alto2));
				txtModificarFondo.setText(String.valueOf(Main.fondo2));
				txtModificarQuemadores.setText(String.valueOf(Main.quemadores2));
				break;
			case 3:
				lblModeloCocina.setText(Main.modelo3);
				txtModificarPrecio.setText(String.valueOf(Main.precio3));
				txtModificarAncho.setText(String.valueOf(Main.ancho3));
				txtModificarAlto.setText(String.valueOf(Main.alto3));
				txtModificarFondo.setText(String.valueOf(Main.fondo3));
				txtModificarQuemadores.setText(String.valueOf(Main.quemadores3));
				break;
			case 4:
				lblModeloCocina.setText(Main.modelo4);
				txtModificarPrecio.setText(String.valueOf(Main.precio4));
				txtModificarAncho.setText(String.valueOf(Main.ancho4));
				txtModificarAlto.setText(String.valueOf(Main.alto4));
				txtModificarFondo.setText(String.valueOf(Main.fondo4));
				txtModificarQuemadores.setText(String.valueOf(Main.quemadores4));
			default:
				break;
		}
	}
	protected void actionPerformedCboModificarCocina(ActionEvent e) {
		mostrarAtributosComboBox();
	}
	protected void actionPerformedBtnCerrarVentana(ActionEvent e) {
		dispose();
	}
}
