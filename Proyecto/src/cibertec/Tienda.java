package cibertec;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.JMenuItem;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Datos mínimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static int quemadores0 = 4;
	// Datos mínimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	// Datos mínimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	// Datos mínimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	// Datos mínimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
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
		setTitle("SharpGas - Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 598);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_1 = new JMenuItem("Listar Cocinas");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Ver Cocina");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Modificar Cocina");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mnNewMenu_2 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_4 = new JMenuItem("Vender");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
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
		
		btnNewButton = new JButton("Listar Cocinas");
		btnNewButton.setBounds(new Rectangle(0, 0, 100, 0));
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Ver Cocina");
		panel_1.add(btnNewButton_1);
		
		btnNewButton_4 = new JButton("Modificar Cocina");
		panel_1.add(btnNewButton_4);
		
		btnNewButton_3 = new JButton("Vender");
		panel_1.add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("Generar Reporte");
		panel_1.add(btnNewButton_2);
		
		btnNewButton_5 = new JButton("Configuracion");
		panel_1.add(btnNewButton_5);
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}
