package cibertec;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioSesion extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblIniciarSesion;
	private JLabel lblNewLabel_2;
	private JTextField txtUsuario;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JButton btnIniciarSesion;
	private JPasswordField txtContrasena;

	/**
	 * Launch the application.
	 */
	public void abrirVentana() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 447);
		contentPane = new JPanel();
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 278, 408);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 182, 278, 37);
		panel.add(lblNewLabel);
		
		lblIniciarSesion = new JLabel("Iniciar Sesion");
		lblIniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblIniciarSesion.setForeground(Color.WHITE);
		lblIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIniciarSesion.setBounds(0, 216, 278, 31);
		panel.add(lblIniciarSesion);
		
		lblNewLabel_2 = new JLabel("SharpGas");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblNewLabel_2.setForeground(new Color(0, 128, 192));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(338, 70, 167, 37);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtUsuario.setBorder(null);
		txtUsuario.setBounds(338, 144, 217, 37);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		separator = new JSeparator();
		separator.setBounds(338, 185, 217, 2);
		contentPane.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(338, 268, 217, 2);
		contentPane.add(separator_1);
		
		lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(338, 129, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("Contrase\u00F1a");
		lblNewLabel_3.setBounds(338, 214, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtContrasena.setBounds(338, 227, 217, 37);
		txtContrasena.setBorder(null);
		contentPane.add(txtContrasena);
		
		btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(this);
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBorder(null);
		btnIniciarSesion.setBackground(new Color(0, 128, 192));
		btnIniciarSesion.setBounds(338, 310, 124, 37);
		contentPane.add(btnIniciarSesion);
	}
	
//	Recibe las credenciales del usuario (String) Usuario y Contrasena
	public void validarCredenciales(String credencialUsuario, String credencialContrasena) {
		
//		El usuario y contrasena que permite entrar al programa
		String usuario = "admin";
		String contrasena = "1234";
		
//		Si ambas credenciales son correctas: 
		if (usuario.equals(credencialUsuario) && contrasena.equals(credencialContrasena)) {
			
//			Abrir la ventana de tienda
			Tienda tienda = new Tienda();
			tienda.abrirTienda();
			
//			Cerrar la ventana de inicio de sesion
			dispose();
			
		}else {
//			Sino, mostrar un mensaje de error
			JOptionPane.showMessageDialog(this, "Credenciales Incorrectas");
			txtUsuario.setText("");
			txtContrasena.setText("");
			txtUsuario.requestFocus();
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIniciarSesion) {
			actionPerformedBtnIniciarSesion(e);
		}
	}
	
//	Al apretar el boton de iniciar sesion
	protected void actionPerformedBtnIniciarSesion(ActionEvent e) {
//		Definimos las variables de usuario y contrasena
		String usuario, contrasena;
		
//		Hacemos la lectura de los datos de ambas variables
		usuario = txtUsuario.getText();
		contrasena = String.valueOf(txtContrasena.getPassword());
		
//		Llamamos a la funcion que nos dice si es valido o no
		validarCredenciales(usuario, contrasena);
		
	}
}