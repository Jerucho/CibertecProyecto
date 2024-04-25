package cibertec;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JButton btnListarCocinas;
	private JButton btnVerCocina;
	private JButton btnGenerarReporte;
	private JButton btnVender;
	private JButton btnModificarCocina;
	private JButton btnConfig;
	private JMenuItem menuArchivoSalir;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem menuMantVerCocina;
	private JMenuItem menuMantModificarCocina;
	private JMenuItem menuVentasVender;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;

	/**
	 * Launch the application.
	 */
	
	
	public void abrirTienda() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setResizable(false);
		setTitle("SharpGas - Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 598);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		menuArchivoSalir = new JMenuItem("Salir");
		menuArchivoSalir.addActionListener(this);
		mnNewMenu.add(menuArchivoSalir);
		
		mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_1 = new JMenuItem("Listar Cocinas");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		menuMantVerCocina = new JMenuItem("Ver Cocina");
		menuMantVerCocina.addActionListener(this);
		mnNewMenu_1.add(menuMantVerCocina);
		
		menuMantModificarCocina = new JMenuItem("Modificar Cocina");
		menuMantModificarCocina.addActionListener(this);
		mnNewMenu_1.add(menuMantModificarCocina);
		
		mnNewMenu_2 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_2);
		
		menuVentasVender = new JMenuItem("Vender");
		menuVentasVender.addActionListener(this);
		mnNewMenu_2.add(menuVentasVender);
		
		mntmNewMenuItem_5 = new JMenuItem("Generar Reportes");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		mnNewMenu_3 = new JMenu("Configuracion");
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_6 = new JMenuItem("Configurar Descuentos");
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("Configurar Obsequio");
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Configurar Cantidad Optima");
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_9 = new JMenuItem("Configurar Cuota Diaria");
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		mnNewMenu_4 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_4);
		
		mntmNewMenuItem_10 = new JMenuItem("Acerca de Tienda");
		mnNewMenu_4.add(mntmNewMenuItem_10);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 799, 117);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Bienvenido a SharpGas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(24, 35, 462, 46);
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(82, 163, 635, 323);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 3, 10, 10));
		
		btnListarCocinas = new JButton("Listar Cocinas");
		btnListarCocinas.addActionListener(this);
		btnListarCocinas.setBounds(new Rectangle(0, 0, 100, 0));
		panel_1.add(btnListarCocinas);
		
		btnVerCocina = new JButton("Ver Cocina");
		btnVerCocina.addActionListener(this);
		panel_1.add(btnVerCocina);
		
		btnModificarCocina = new JButton("Modificar Cocina");
		btnModificarCocina.addActionListener(this);
		panel_1.add(btnModificarCocina);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		panel_1.add(btnVender);
		
		btnGenerarReporte = new JButton("Generar Reporte");
		panel_1.add(btnGenerarReporte);
		
		btnConfig = new JButton("Configuracion");
		panel_1.add(btnConfig);
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuVentasVender) {
			actionPerformedMenuVentasVender(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == menuArchivoSalir) {
			actionPerformedMenuArchivoSalir(e);
		}
		if (e.getSource() == menuMantModificarCocina) {
			actionPerformedMenuMantModificarCocina(e);
		}
		if (e.getSource() == menuMantVerCocina) {
			actionPerformedMenuMantVerCocina(e);
		}
		if (e.getSource() == btnVerCocina) {
			actionPerformedBtnVerCocina(e);
		}
		if (e.getSource() == btnModificarCocina) {
			actionPerformedBtnModificarCocina(e);
		}
		if (e.getSource() == btnListarCocinas) {
			actionPerformedBtnListarCocinas(e);
		}
		
	}
	
//	-------------------------------------
//	Ventanas

//		Mantenimiento
	DialogModificarCocina ventanaModificarCocina = new DialogModificarCocina();
	DialogVerCocina ventanaVerCocina = new DialogVerCocina();
	DialogVenderCocina ventanaVender = new DialogVenderCocina();
	DialogListarCocinas ventanaListar = new DialogListarCocinas();
	
//	-----------------------------
//	Botones del programa
//		Mantenimiento
	protected void actionPerformedBtnListarCocinas(ActionEvent e) {
		ventanaListar.abrirVentana();
	}
	protected void actionPerformedBtnModificarCocina(ActionEvent e) {
		ventanaModificarCocina.abrirVentana();
	}
	protected void actionPerformedBtnVerCocina(ActionEvent e) {
		ventanaVerCocina.abrirVentana();
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
		ventanaVender.abrirVentana();
	}
		
	
//	------------------------------------
	
//	Menu Superior

//		Archivo
	protected void actionPerformedMenuArchivoSalir(ActionEvent e) {
		System.exit(0);
	}
	
//		Mantenimiento
	protected void actionPerformedMenuMantVerCocina(ActionEvent e) {
		ventanaVerCocina.abrirVentana();
	}
	protected void actionPerformedMenuMantModificarCocina(ActionEvent e) {
		ventanaModificarCocina.abrirVentana();
	}
	protected void actionPerformedMenuVentasVender(ActionEvent e) {
		ventanaVender.abrirVentana();
	}
}
