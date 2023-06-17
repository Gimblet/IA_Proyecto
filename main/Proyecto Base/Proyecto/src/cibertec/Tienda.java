package cibertec;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Tienda extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarLadrillo;
	private JMenuItem mntmModificarLadrillo;
	private JMenuItem mntmListarLadrillos;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReporte;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmAcercaDeTienda;
	private JMenuItem mntmConfigDescuentos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarLadrillo = new JMenuItem("Consultar Ladrillo");
		mntmConsultarLadrillo.addActionListener(this);
		mnMantenimiento.add(mntmConsultarLadrillo);
		
		mntmModificarLadrillo = new JMenuItem("Modificar Ladrillo");
		mntmModificarLadrillo.addActionListener(this);
		mnMantenimiento.add(mntmModificarLadrillo);
		
		mntmListarLadrillos = new JMenuItem("Listar Ladrillos");
		mntmListarLadrillos.addActionListener(this);
		mnMantenimiento.add(mntmListarLadrillos);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReporte = new JMenuItem("Generar Reporte");
		mntmGenerarReporte.addActionListener(this);
		mnVentas.add(mntmGenerarReporte);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		
		mntmConfigDescuentos = new JMenuItem("Configurar Descuentos");
		mntmConfigDescuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmConfigDescuentosActionPerformed(e);
			}
		});
		mnConfiguracion.add(mntmConfigDescuentos);
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcercaDeTienda) {
			mntmAcercaDeTiendaActionPerformed(e);
		}
		if (e.getSource() == mntmConfigurarObsequios) {
			mntmConfigurarObsequiosActionPerformed(e);
		}
		if (e.getSource() == mntmGenerarReporte) {
			mntmGenerarReporteActionPerformed(e);
		}
		if (e.getSource() == mntmVender) {
			mntmVenderActionPerformed(e);
		}
		if (e.getSource() == mntmListarLadrillos) {
			mntmListarLadrillosActionPerformed(e);
		}
		if (e.getSource() == mntmModificarLadrillo) {
			mntmModificarLadrilloActionPerformed(e);
		}
		if (e.getSource() == mntmConsultarLadrillo) {
			mntmConsultarLadrilloActionPerformed(e);
		}
		if (e.getSource() == mntmSalir) {
			mntmSalirActionPerformed(e);
		}
		
	}
	
	/**
	 * Declara las variables globales
	 */
	
//	Datos minimos del primer producto
	public static String modelo0 = "Ladrillo King Kong 18 Huecos";
	public static double precio0 = 610.0;
	public static double ancho0 = 12.5;
	public static double largo0 = 23.0;
	public static double espesor0 = 9.0;
	public static int cantidadoptima0 = 6;
	
//	Datos minimos del segundo producto
	
	public static String modelo1 = "Ladrillo King Kong Macizo";
	public static double precio1 = 920.0;
	public static double ancho1 = 12.0;
	public static double largo1 = 21.0;
	public static double espesor1 = 9.0;
	public static int cantidadoptima1 = 6;
	
//	Datos minimos del tercer producto
	
	public static String modelo2 = "Ladrillo Pandereta Acanalada";
	public static double precio2 = 510.0;
	public static double ancho2 = 10.5;
	public static double largo2 = 23.0;
	public static double espesor2 = 9.0;
	public static int cantidadoptima2 = 6;

//	Datos minimos del cuarto producto	
	
	public static String modelo3 = "Ladrillo Patelero";
	public static double precio3 = 2200.0;
	public static double ancho3 = 24.0;
	public static double largo3 = 24.0;
	public static double espesor3 = 3.0;
	public static int cantidadoptima3 = 6;
	
//	Datos minimos del quinto producto	
	
	public static String modelo4 = "Ladrillo Techo Hueco";
	public static double precio4 = 2350.0;
	public static double ancho4 = 30.0;
	public static double largo4 = 30.0;
	public static double espesor4 = 15.0;
	public static int cantidadoptima4 = 6;
	
//	Porcentajes de descuento
	
	public static double porcentaje1 = 5.0;
	public static double porcentaje2 = 7.5;
	public static double porcentaje3 = 10.0;
	public static double porcentaje4 = 12.5;
	public static double porcentaje5 = 15.0;
	
//	Cantidad a obsequiar
	
	public static String tipoObsequio = "Badilejo";
	public static int obsequioCantidad1 = 1;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 5;
	public static int obsequioCantidad4 = 7;
	public static int obsequioCantidad5 = 9;
	
	/**
	 * Se encarga del funcionamiento del programa y los subprogramas
	 */
	
	protected void mntmSalirActionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void mntmConsultarLadrilloActionPerformed(ActionEvent e) {
		//Declaracion de Variable Que Permitira Controlar la Caja Consultar Ladrillo
		DialogoConsultar ConsLadri;
		//Creacion del Control a la variable de referencia
		ConsLadri = new DialogoConsultar();
		//Centrar La Ventana Consultar Ladrillo
		ConsLadri.setLocationRelativeTo(this);
		//Hacer Aparecer la Caja Consultar Ladrillo
		ConsLadri.setVisible(true);
	}
	protected void mntmModificarLadrilloActionPerformed(ActionEvent e) {
		//Declaracion de Variable Que Permitira Controlar la Caja Modificar Ladrillo
		ModificarLadrillo ModLad;
		//Creacion del Control a la variable de referencia
		ModLad = new ModificarLadrillo();
		//Centrar La Ventana Modificar Ladrillo
		ModLad.setLocationRelativeTo(this);
		//Hacer Aparecer la Caja Modificar Ladrillo
		ModLad.setVisible(true);
	}
	protected void mntmListarLadrillosActionPerformed(ActionEvent e) {
		//Declaracion de Variable Que Permitira Controlar la pantalla Listar Ladrillos
		DialogoListar la;
		//Creación del control a la variable de referencia
		la = new DialogoListar();
		//Centrar la ventana Listar
		la.setLocationRelativeTo(this);
		//Hace la ventana listar visible
		la.setVisible(true);
	}
	protected void mntmVenderActionPerformed(ActionEvent e) {
		//Declaracion de Variable Que Permitira Controlar la pantalla Vender
		Vender PVen;
		//Creacion del Control a la variable de referencia
		PVen = new Vender();
		//Centrar La Ventana Vender
		PVen.setLocationRelativeTo(this);
		//Hacer Aparecer la Caja Vender
		PVen.setVisible(true);
	}
	protected void mntmGenerarReporteActionPerformed(ActionEvent e) {
		//Declaracion de Variable Que Permitira Controlar la pantalla Generar Reportes
		GenerarReportes GenReprt;
		//Creacion del Control a la variable de referencia
		GenReprt = new GenerarReportes();
		//Centrar La Ventana Generar Reportes
		GenReprt.setLocationRelativeTo(this);
		//Hacer Aparecer la Caja Vender
		GenReprt.setVisible(true);
	}
	protected void mntmConfigurarObsequiosActionPerformed(ActionEvent e) {
		//Declaracion de Variable Que Permitira Controlar la Caja Configurar Obsequio
		ConfigurarObsequio configObs;
		//Creacion del Control a la variable de referencia
		configObs = new ConfigurarObsequio();
		//Centrar La Ventana Configurar Obsequio
		configObs.setLocationRelativeTo(this);
		//Hacer Aparecer la Caja Configurar Obsequio
		configObs.setVisible(true);
	}
	protected void mntmAcercaDeTiendaActionPerformed(ActionEvent e) {
		//Declaracion de Variable Que Permitira Controlar la Caja Ayuda
		Ayuda acercTienda;
		//Creacion del Control a la variable de referencia
		acercTienda = new Ayuda();
		//Centrar La Ventana Ayuda
		acercTienda.setLocationRelativeTo(this);
		//Hacer Aparecer la Caja Ayuda
		acercTienda.setVisible(true);
	}
	protected void mntmConfigDescuentosActionPerformed(ActionEvent e) {
		//Declaracion de Variable Que Permitira Controlar la Caja Configurar Descuentos
		ConfigurarDescuentos ConfigDes;
		//Creacion del Control a la variable de referencia
		ConfigDes = new ConfigurarDescuentos();
		//Centrar La Ventana Configurar Descuentos
		ConfigDes.setLocationRelativeTo(this);
		//Hacer Aparecer la Caja Configurar Descuentos
		ConfigDes.setVisible(true);
	}
}
