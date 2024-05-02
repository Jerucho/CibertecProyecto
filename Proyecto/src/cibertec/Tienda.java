package cibertec;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import configuracion.ConfigurarCuotaDiaria;
import configuracion.ConfigurarDescuentos;
import configuracion.ConfigurarObsequios;
import configuracion.DialogConfigurar;
import mantenimiento.DialogListarCocinas;
import mantenimiento.DialogModificarCocina;
import mantenimiento.DialogVerCocina;
import ventas.DialogGenerarReporte;
import ventas.DialogVenderCocina;

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
	private JMenuItem menuVentasGenerarReporte;
	private JMenuItem menuConfigDescuentos;
	private JMenuItem menuConfigObsequios;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem menuConfigCuotaDiaria;
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
					frame.setLocationRelativeTo(null);
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tienda.class.getResource("/imagenes/nuevoTamano.png")));
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
		
		menuVentasGenerarReporte = new JMenuItem("Generar Reportes");
		menuVentasGenerarReporte.addActionListener(this);
		mnNewMenu_2.add(menuVentasGenerarReporte);
		
		mnNewMenu_3 = new JMenu("Configuracion");
		menuBar.add(mnNewMenu_3);
		
		menuConfigDescuentos = new JMenuItem("Configurar Descuentos");
		menuConfigDescuentos.addActionListener(this);
		mnNewMenu_3.add(menuConfigDescuentos);
		
		menuConfigObsequios = new JMenuItem("Configurar Obsequio");
		menuConfigObsequios.addActionListener(this);
		mnNewMenu_3.add(menuConfigObsequios);
		
		mntmNewMenuItem_8 = new JMenuItem("Configurar Cantidad Optima");
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		menuConfigCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		menuConfigCuotaDiaria.addActionListener(this);
		mnNewMenu_3.add(menuConfigCuotaDiaria);
		
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
		panel_1.setBounds(121, 163, 557, 323);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 3, 10, 10));
		
		btnListarCocinas = new JButton("Listar Cocinas");
		btnListarCocinas.setFocusable(false);
		btnListarCocinas.setForeground(new Color(0, 0, 0));
		btnListarCocinas.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnListarCocinas.setHideActionText(true);
		btnListarCocinas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnListarCocinas.setIconTextGap(20);
		btnListarCocinas.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/icons8-cocina-50.png")));
		btnListarCocinas.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		btnListarCocinas.setBorder(new CompoundBorder());
		btnListarCocinas.addActionListener(this);
		btnListarCocinas.setBounds(new Rectangle(0, 0, 100, 0));
		panel_1.add(btnListarCocinas);
		
		btnVerCocina = new JButton("Ver Cocina");
		btnVerCocina.setForeground(new Color(0, 0, 0));
		btnVerCocina.setIconTextGap(20);
		btnVerCocina.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/icons8-escudo-de-pregunta-50.png")));
		btnVerCocina.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVerCocina.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnVerCocina.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		btnVerCocina.setBorder(new CompoundBorder());
		btnVerCocina.addActionListener(this);
		panel_1.add(btnVerCocina);
		
		btnModificarCocina = new JButton("Modificar Cocina");
		btnModificarCocina.setForeground(new Color(0, 0, 0));
		btnModificarCocina.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/icons8-editar-50.png")));
		btnModificarCocina.setIconTextGap(20);
		btnModificarCocina.setHorizontalTextPosition(SwingConstants.CENTER);
		btnModificarCocina.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnModificarCocina.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		btnModificarCocina.setBorder(new CompoundBorder());
		btnModificarCocina.addActionListener(this);
		panel_1.add(btnModificarCocina);
		
		btnVender = new JButton("Vender");
		btnVender.setForeground(new Color(0, 0, 0));
		btnVender.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/icons8-vender-50.png")));
		btnVender.setIconTextGap(20);
		btnVender.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVender.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnVender.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		btnVender.setBorder(new CompoundBorder());
		btnVender.addActionListener(this);
		panel_1.add(btnVender);
		
		btnGenerarReporte = new JButton("Generar Reportes");
		btnGenerarReporte.setForeground(new Color(0, 0, 0));
		btnGenerarReporte
				.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/icons8-informe-gr\u00E1fico-50.png")));
		btnGenerarReporte.setIconTextGap(20);
		btnGenerarReporte.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGenerarReporte.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnGenerarReporte.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		btnGenerarReporte.setBorder(new CompoundBorder());
		btnGenerarReporte.addActionListener(this);
		panel_1.add(btnGenerarReporte);
		
		btnConfig = new JButton("Configuracion");
		btnConfig.addActionListener(this);
		btnConfig.setForeground(new Color(0, 0, 0));
		btnConfig.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/icons8-servicios-50.png")));
		btnConfig.setIconTextGap(20);
		btnConfig.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConfig.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnConfig.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		btnConfig.setBorder(new CompoundBorder());
		panel_1.add(btnConfig);
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfig) {
			actionPerformedBtnConfig(e);
		}
		if (e.getSource() == menuConfigCuotaDiaria) {
			actionPerformedMenuConfigCuotaDiaria(e);
		}
		if (e.getSource() == menuConfigObsequios) {
			actionPerformedMenuConfigObsequios(e);
		}
		if (e.getSource() == menuConfigDescuentos) {
			actionPerformedMenuConfigDescuentos(e);
		}
		if (e.getSource() == menuVentasGenerarReporte) {
			actionPerformedMenuVentasGenerarReporte(e);
		}
		if (e.getSource() == btnGenerarReporte) {
			actionPerformedBtnGenerarReporte(e);
		}
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
//	Ventanas Declaracion

//		Mantenimiento
	DialogModificarCocina ventanaModificarCocina = new DialogModificarCocina();
	DialogVerCocina ventanaVerCocina = new DialogVerCocina();
	DialogVenderCocina ventanaVender = new DialogVenderCocina();
	DialogListarCocinas ventanaListar = new DialogListarCocinas();
	
	
//		Ventas
	DialogGenerarReporte ventanaGenerarReporte = new DialogGenerarReporte();
	
//		Configurar
	ConfigurarDescuentos ventanaConfigurarDescuentos = new ConfigurarDescuentos();
	ConfigurarObsequios ventanaConfigurarObsequios = new ConfigurarObsequios();
	ConfigurarCuotaDiaria ventanaConfiguraraCuotaDiaria = new ConfigurarCuotaDiaria(); 
	DialogConfigurar ventanaConfigurar = new DialogConfigurar();
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

//		Venta
	protected void actionPerformedBtnVender(ActionEvent e) {
		ventanaVender.abrirVentana();
	}

	protected void actionPerformedBtnGenerarReporte(ActionEvent e) {
		ventanaGenerarReporte.abrirVentana();
	}

//		Configuracion
	protected void actionPerformedBtnConfig(ActionEvent e) {
		ventanaConfigurar.abrirVentana();
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

	protected void actionPerformedMenuVentasGenerarReporte(ActionEvent e) {
		ventanaGenerarReporte.abrirVentana();
	}
//		Configuracion
	
	protected void actionPerformedMenuConfigDescuentos(ActionEvent e) {
		ventanaConfigurarDescuentos.abrirVentana();
	}
	protected void actionPerformedMenuConfigObsequios(ActionEvent e) {
		ventanaConfigurarObsequios.abrirVentana();
	}
	protected void actionPerformedMenuConfigCuotaDiaria(ActionEvent e) {
		ventanaConfiguraraCuotaDiaria.abrirVentana();
	}
	
}
