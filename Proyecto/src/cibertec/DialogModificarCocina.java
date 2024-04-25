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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class DialogModificarCocina extends JDialog implements ActionListener {

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
	private JButton btnEnviarModificacion;
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
			DialogModificarCocina dialog = new DialogModificarCocina();
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
	public DialogModificarCocina() {
		setResizable(false);
		setTitle("Modificar Cocina");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 572, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEnviarModificacion = new JButton("Enviar");
		btnEnviarModificacion.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviarModificacion.setForeground(new Color(255, 255, 255));
		btnEnviarModificacion.setBackground(new Color(88, 176, 0));
		btnEnviarModificacion.setBorder(null);
		btnEnviarModificacion.addActionListener(this);
		
		btnCerrarVentana = new JButton("Cerrar");
		btnCerrarVentana.setBorder(null);
		btnCerrarVentana.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCerrarVentana.setForeground(new Color(255, 255, 255));
		btnCerrarVentana.setBackground(new Color(234, 85, 85));
		btnCerrarVentana.addActionListener(this);
		btnCerrarVentana.setBounds(342, 82, 152, 37);
		contentPane.add(btnCerrarVentana);
		btnEnviarModificacion.setBounds(342, 33, 152, 37);
		contentPane.add(btnEnviarModificacion);
		
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
		cboModificarCocina.setBackground(new Color(255, 255, 255));
		cboModificarCocina.addActionListener(this);
		cboModificarCocina.setModel(new DefaultComboBoxModel(new String[] {Main.modelo0, Main.modelo1, Main.modelo2, Main.modelo3, Main.modelo4}));
		panel.add(cboModificarCocina);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setForeground(new Color(255, 255, 255));
		panel.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarPrecio = new JTextField();
		txtModificarPrecio.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarPrecio.setBackground(new Color(255, 255, 255));
		txtModificarPrecio.setToolTipText("Precio en soles");
		panel.add(txtModificarPrecio);
		txtModificarPrecio.setColumns(10);
		
		lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setForeground(new Color(255, 255, 255));
		panel.add(lblAnchocm);
		lblAnchocm.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarAncho = new JTextField();
		txtModificarAncho.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarAncho.setBackground(new Color(255, 255, 255));
		txtModificarAncho.setToolTipText("Ancho en centimetros");
		panel.add(txtModificarAncho);
		txtModificarAncho.setColumns(10);
		
		lblAltocm = new JLabel("Alto (cm)");
		lblAltocm.setForeground(new Color(255, 255, 255));
		panel.add(lblAltocm);
		lblAltocm.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarAlto = new JTextField();
		txtModificarAlto.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarAlto.setBackground(new Color(255, 255, 255));
		txtModificarAlto.setToolTipText("Alto en centimetros");
		panel.add(txtModificarAlto);
		txtModificarAlto.setColumns(10);
		
		lblFondocm = new JLabel("Fondo (cm)");
		lblFondocm.setForeground(new Color(255, 255, 255));
		panel.add(lblFondocm);
		lblFondocm.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarFondo = new JTextField();
		txtModificarFondo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarFondo.setBackground(new Color(255, 255, 255));
		txtModificarFondo.setToolTipText("Fondo en centimetros");
		panel.add(txtModificarFondo);
		txtModificarFondo.setColumns(10);
		
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setForeground(new Color(255, 255, 255));
		panel.add(lblQuemadores);
		lblQuemadores.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtModificarQuemadores = new JTextField();
		txtModificarQuemadores.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtModificarQuemadores.setBackground(new Color(255, 255, 255));
		txtModificarQuemadores.setToolTipText("Cantidad de quemadores");
		panel.add(txtModificarQuemadores);
		txtModificarQuemadores.setColumns(10);
		
		
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 192));
		panel_1.setBounds(0, 0, 210, 346);
		contentPane.add(panel_1);
		
		lblModeloCocina = new JLabel("");
		lblModeloCocina.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModeloCocina.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblModeloCocina.setBounds(271, 243, 264, 81);
		contentPane.add(lblModeloCocina);
		
		txtModificarPrecio.setText(String.valueOf(Main.precio0));
		txtModificarAncho.setText(String.valueOf(Main.ancho0));
		txtModificarAlto.setText(String.valueOf(Main.alto0));
		txtModificarFondo.setText(String.valueOf(Main.fondo0));
		txtModificarQuemadores.setText(String.valueOf(Main.quemadores0));
		lblModeloCocina.setText(Main.modelo0);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(new Color(0, 128, 192));
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblModelo.setBounds(418, 223, 117, 37);
		contentPane.add(lblModelo);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModificarCocina) {
			actionPerformedCboModificarCocina(e);
		}
		if (e.getSource() == btnEnviarModificacion) {
			actionPerformedBtnEnviarModificacion(e);
		}
		if (e.getSource() == btnCerrarVentana) {
			actionPerformedBtnCerrarVentana(e);
		}
	}
	
//	Metodo cuando se aprieta el boton de modificar
	public void enviarModificarCocina() {
//		Obtener el indice del Combo Box
		indexModeloSeleccionado = cboModificarCocina.getSelectedIndex();
		double precioModificado, anchoModificado, altoModificado, fondoModificado;
		int quemadoresModificado;
		
//		Entrada de datos
		precioModificado = Double.parseDouble(txtModificarPrecio.getText());
		anchoModificado = Double.parseDouble(txtModificarAncho.getText());
		altoModificado = Double.parseDouble(txtModificarAlto.getText());
		fondoModificado = Double.parseDouble(txtModificarFondo.getText());
		quemadoresModificado = Integer.parseInt(txtModificarQuemadores.getText());
		
		boolean validacion = validarEntrada();

		if (validacion) {
//		Modificar las variables globales con los nuevos datos.
		switch (indexModeloSeleccionado) {
			case 0:
				Main.precio0 = precioModificado;
				Main.alto0 = altoModificado;
				Main.ancho0 = anchoModificado;
				Main.fondo0 = fondoModificado;
				Main.quemadores0 = quemadoresModificado;
				break;
			case 1:
				Main.precio1 = precioModificado;
				Main.alto1 = altoModificado;
				Main.ancho1 = anchoModificado;
				Main.fondo1 = fondoModificado;
				Main.quemadores1 = quemadoresModificado;
				break;
			case 2:
				Main.precio2 = precioModificado;
				Main.alto2 = altoModificado;
				Main.ancho2 = anchoModificado;
				Main.fondo2 = fondoModificado;
				Main.quemadores2 = quemadoresModificado;
				break;
			case 3:
				Main.precio3 = precioModificado;
				Main.alto3 = altoModificado;
				Main.ancho3 = anchoModificado;
				Main.fondo3 = fondoModificado;
				Main.quemadores3 = quemadoresModificado;
				break;
			case 4:
				Main.precio4 = precioModificado;
				Main.alto4 = altoModificado;
				Main.ancho4 = anchoModificado;
				Main.fondo4 = fondoModificado;
				Main.quemadores4 = quemadoresModificado;
			default:
				break;
		}
		
//		Enviar un mensaje de confirmacion
		JOptionPane.showMessageDialog(this, "Cocina modificada correctamente");
	}
}
	
	
//	Metodo que se encarga de que los valores sean numeros positivos y no letras
	public boolean validarEntrada() {

		double precioModificado, anchoModificado, altoModificado, fondoModificado;
		int quemadoresModificado;
	    try {
	        precioModificado = Double.parseDouble(txtModificarPrecio.getText());
	        anchoModificado = Double.parseDouble(txtModificarAncho.getText());
	        altoModificado = Double.parseDouble(txtModificarAlto.getText());
	        fondoModificado = Double.parseDouble(txtModificarFondo.getText());
	        quemadoresModificado = Integer.parseInt(txtModificarQuemadores.getText());

	        // Validar que los valores sean positivos
	        if (precioModificado <= 0 || anchoModificado <= 0 || altoModificado <= 0 || fondoModificado <= 0 || quemadoresModificado <= 0) {
	            // Mostrar un mensaje de error o realizar alguna acción
	            // Por ejemplo:
	        	JOptionPane.showMessageDialog(this, "Los valores deben ser positivos");
	            return false;
	        }

	        // Si todas las validaciones pasan, retornar true
	        return true;
	    } catch (NumberFormatException e) {
	        // Capturar excepción si el formato de entrada no es válido (por ejemplo, si se ingresan letras en lugar de números)
	        // Mostrar un mensaje de error o realizar alguna acción
	        // Por ejemplo:
	    	JOptionPane.showMessageDialog(this, "Tipo de dato incorrecto, ingrese números reales");
	        return false;
	    }
	}

	
//	Metodo para cargar las propiedades de las cocinas en el formulario.
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
	
	
//	-------------------------------
//	Acciones de los botones
	
//		Modificar Datos
	protected void actionPerformedBtnEnviarModificacion(ActionEvent e) {
		if (validarEntrada()) {
			enviarModificarCocina();
		}
		
	}
	
//		Cargar datos en ComboBox
	protected void actionPerformedCboModificarCocina(ActionEvent e) {
		mostrarAtributosComboBox();
	}
	
//		Cerrar Ventana
	protected void actionPerformedBtnCerrarVentana(ActionEvent e) {
		dispose();
	}
	

}
