package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarLadrillo extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblCanOptima;
	private JComboBox<String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtCanOpMil;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarLadrillo dialog = new ModificarLadrillo();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ModificarLadrillo() {
		setTitle("Modificar Ladrillo");
		setBounds(100, 100, 442, 278);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(19, 15, 46, 22);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(19, 52, 50, 22);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(19, 89, 54, 22);
		getContentPane().add(lblAncho);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(19, 126, 54, 22);
		getContentPane().add(lblLargo);
		
		lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(19, 163, 65, 22);
		getContentPane().add(lblEspesor);
		
		lblCanOptima = new JLabel("Can. \u00D3ptima (millares)");
		lblCanOptima.setBounds(19, 200, 106, 22);
		getContentPane().add(lblCanOptima);
		
		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Se encarga de repetir la funcion al momento de usar el comboBox
				mostrarValoresPrincipales();
			}
		});
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {"Ladrillo King Kong 18 Huecos", "Ladrillo King Long Macizo", "Ladrillo Pandereta Acanalada", "Ladrillo Patelero", "Ladrillo Techo Hueco"}));
		cboModelo.setBounds(135, 15, 184, 22);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(135, 52, 184, 22);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(135, 89, 184, 22);
		getContentPane().add(txtAncho);
		
		txtLargo = new JTextField();
		txtLargo.setColumns(10);
		txtLargo.setBounds(135, 126, 184, 22);
		getContentPane().add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(135, 163, 184, 22);
		getContentPane().add(txtEspesor);
		
		txtCanOpMil = new JTextField();
		txtCanOpMil.setColumns(10);
		txtCanOpMil.setBounds(135, 200, 184, 22);
		getContentPane().add(txtCanOpMil);
		
		//Se encarga de iniciar el combo box con un valor predeterminado (0)
		mostrarValoresPrincipales();
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCerrarActionPerformed(e);
			}
		});
		btnCerrar.setBounds(329, 15, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGrabarActionPerformed(e);
			}
		});
		btnGrabar.setBounds(329, 52, 89, 23);
		getContentPane().add(btnGrabar);

	}
	
	//Se encarga de mostrar los valores al usar el ComboBox
	
	void mostrarValoresPrincipales() {
		int mod;
		mod = obtenerIndex();
		switch(mod) {
		case 0: 
			mostrarLadrillo(Tienda.precio0,Tienda.ancho0,Tienda.largo0,Tienda.espesor0,Tienda.cantidadoptima0);
			break;
		case 1:
			mostrarLadrillo(Tienda.precio1,Tienda.ancho1,Tienda.largo1,Tienda.espesor1,Tienda.cantidadoptima1);
			break;
		case 2:
			mostrarLadrillo(Tienda.precio2,Tienda.ancho2,Tienda.largo2,Tienda.espesor2,Tienda.cantidadoptima2);
			break;
		case 3:
			mostrarLadrillo(Tienda.precio3,Tienda.ancho3,Tienda.largo3,Tienda.espesor3,Tienda.cantidadoptima3);
			break;
		default:
			mostrarLadrillo(Tienda.precio4,Tienda.ancho4,Tienda.largo4,Tienda.espesor4,Tienda.cantidadoptima4);
		}
	}
	
	void mostrarLadrillo(double pre, double anch, double lar, double espe, int canop) {
		txtPrecio.setText(pre + "");
		txtAncho.setText(anch + "");
		txtLargo.setText(lar + "");
		txtEspesor.setText(espe + "");
		txtCanOpMil.setText(canop + "");
	}
	
	int obtenerIndex() {
		return cboModelo.getSelectedIndex();
	}
	
	//Acción del botón Grabar
	
	protected void btnGrabarActionPerformed(ActionEvent e) {
		double prec, anch, larg, espe;
		int caop, mod;
		mod = obtenerIndex();
		prec = leerPrecio();
		anch = leerAncho();
		larg = leerLargo();
		espe = leerEspesor();
		caop = leerCantidadOptima();
		switch(mod) {
		case 0:
			modificarCaso0(prec, anch, larg, espe, caop);
			break;
		case 1:
			modificarCaso1(prec, anch, larg, espe, caop);
			break;
		case 2:
			modificarCaso2(prec, anch, larg, espe, caop);
			break;
		case 3:
			modificarCaso3(prec, anch, larg, espe, caop);
			break;
		default:
			modificarCaso4(prec, anch, larg, espe, caop);
			break;
		}
	}
	
	//Se encarga de modificar los valores seleccionados
	
	void modificarCaso0(double prec, double anch, double larg, double espe, int caop){
		if (prec <= 0) {
			JOptionPane.showMessageDialog(this, "El precio tiene que ser mayor que 0");
			txtPrecio.requestFocus();
			txtPrecio.selectAll();
		}
		
		else if (anch <= 0) {
			JOptionPane.showMessageDialog(this, "El ancho tiene que ser mayor que 0");
			txtAncho.requestFocus();
			txtAncho.selectAll();
		}
		
		else if(larg <= 0) {
			JOptionPane.showMessageDialog(this, "El largo tiene que ser mayor que 0");
			txtLargo.requestFocus();
			txtLargo.selectAll();
		}
		
		else if(espe <= 0) {
			JOptionPane.showMessageDialog(this, "El espesor tiene que ser mayor que 0");
			txtEspesor.requestFocus();
			txtEspesor.selectAll();
		}
		
		else if(caop <= 0) {
			JOptionPane.showMessageDialog(this, "La cantidad Optima tiene que ser mayor que 0");
			txtCanOpMil.requestFocus();
			txtCanOpMil.selectAll();
		}
		
		else {
			Tienda.precio0 = prec;
			Tienda.ancho0 = anch;
			Tienda.largo0 = larg;
			Tienda.espesor0 = espe;
			Tienda.cantidadoptima0 = caop;
			JOptionPane.showMessageDialog(this, "Cambios guardados correctamente");
			dispose();
		}
	}
	
	void modificarCaso1(double prec, double anch, double larg, double espe, int caop){
		if (prec <= 0) {
			JOptionPane.showMessageDialog(this, "El precio tiene que ser mayor que 0");
			txtPrecio.requestFocus();
			txtPrecio.selectAll();
		}
		
		else if (anch <= 0) {
			JOptionPane.showMessageDialog(this, "El ancho tiene que ser mayor que 0");
			txtAncho.requestFocus();
			txtAncho.selectAll();
		}
		
		else if(larg <= 0) {
			JOptionPane.showMessageDialog(this, "El largo tiene que ser mayor que 0");
			txtLargo.requestFocus();
			txtLargo.selectAll();
		}
		
		else if(espe <= 0) {
			JOptionPane.showMessageDialog(this, "El espesor tiene que ser mayor que 0");
			txtEspesor.requestFocus();
			txtEspesor.selectAll();
		}
		
		else if(caop <= 0) {
			JOptionPane.showMessageDialog(this, "La cantidad Optima tiene que ser mayor que 0");
			txtCanOpMil.requestFocus();
			txtCanOpMil.selectAll();
		}
		
		else {
			Tienda.precio1 = prec;
			Tienda.ancho1 = anch;
			Tienda.largo1 = larg;
			Tienda.espesor1 = espe;
			Tienda.cantidadoptima1 = caop;
			JOptionPane.showMessageDialog(this, "Cambios guardados correctamente");
			dispose();
		}
	}
	
	void modificarCaso2(double prec, double anch, double larg, double espe, int caop){
		if (prec <= 0) {
			JOptionPane.showMessageDialog(this, "El precio tiene que ser mayor que 0");
			txtPrecio.requestFocus();
			txtPrecio.selectAll();
		}
		
		else if (anch <= 0) {
			JOptionPane.showMessageDialog(this, "El ancho tiene que ser mayor que 0");
			txtAncho.requestFocus();
			txtAncho.selectAll();
		}
		
		else if(larg <= 0) {
			JOptionPane.showMessageDialog(this, "El largo tiene que ser mayor que 0");
			txtLargo.requestFocus();
			txtLargo.selectAll();
		}
		
		else if(espe <= 0) {
			JOptionPane.showMessageDialog(this, "El espesor tiene que ser mayor que 0");
			txtEspesor.requestFocus();
			txtEspesor.selectAll();
		}
		
		else if(caop <= 0) {
			JOptionPane.showMessageDialog(this, "La cantidad Optima tiene que ser mayor que 0");
			txtCanOpMil.requestFocus();
			txtCanOpMil.selectAll();
		}
		
		else {
			Tienda.precio2 = prec;
			Tienda.ancho2 = anch;
			Tienda.largo2 = larg;
			Tienda.espesor2 = espe;
			Tienda.cantidadoptima2 = caop;
			JOptionPane.showMessageDialog(this, "Cambios guardados correctamente");
			dispose();
		}
	}
	
	void modificarCaso3(double prec, double anch, double larg, double espe, int caop){
		if (prec <= 0) {
			JOptionPane.showMessageDialog(this, "El precio tiene que ser mayor que 0");
			txtPrecio.requestFocus();
			txtPrecio.selectAll();
		}
		
		else if (anch <= 0) {
			JOptionPane.showMessageDialog(this, "El ancho tiene que ser mayor que 0");
			txtAncho.requestFocus();
			txtAncho.selectAll();
		}
		
		else if(larg <= 0) {
			JOptionPane.showMessageDialog(this, "El largo tiene que ser mayor que 0");
			txtLargo.requestFocus();
			txtLargo.selectAll();
		}
		
		else if(espe <= 0) {
			JOptionPane.showMessageDialog(this, "El espesor tiene que ser mayor que 0");
			txtEspesor.requestFocus();
			txtEspesor.selectAll();
		}
		
		else if(caop <= 0) {
			JOptionPane.showMessageDialog(this, "La cantidad Optima tiene que ser mayor que 0");
			txtCanOpMil.requestFocus();
			txtCanOpMil.selectAll();
		}
		
		else {
			Tienda.precio3 = prec;
			Tienda.ancho3 = anch;
			Tienda.largo3 = larg;
			Tienda.espesor3 = espe;
			Tienda.cantidadoptima3 = caop;
			JOptionPane.showMessageDialog(this, "Cambios guardados correctamente");
			dispose();
		}
	}
	
	void modificarCaso4(double prec, double anch, double larg, double espe, int caop){
		if (prec <= 0) {
			JOptionPane.showMessageDialog(this, "El precio tiene que ser mayor que 0");
			txtPrecio.requestFocus();
			txtPrecio.selectAll();
		}
		
		else if (anch <= 0) {
			JOptionPane.showMessageDialog(this, "El ancho tiene que ser mayor que 0");
			txtAncho.requestFocus();
			txtAncho.selectAll();
		}
		
		else if(larg <= 0) {
			JOptionPane.showMessageDialog(this, "El largo tiene que ser mayor que 0");
			txtLargo.requestFocus();
			txtLargo.selectAll();
		}
		
		else if(espe <= 0) {
			JOptionPane.showMessageDialog(this, "El espesor tiene que ser mayor que 0");
			txtEspesor.requestFocus();
			txtEspesor.selectAll();
		}
		
		else if(caop <= 0) {
			JOptionPane.showMessageDialog(this, "La cantidad Optima tiene que ser mayor que 0");
			txtCanOpMil.requestFocus();
			txtCanOpMil.selectAll();
		}
		
		else {
			Tienda.precio4 = prec;
			Tienda.ancho4 = anch;
			Tienda.largo4 = larg;
			Tienda.espesor4 = espe;
			Tienda.cantidadoptima4 = caop;
			JOptionPane.showMessageDialog(this, "Cambios guardados correctamente");
			dispose();
		}
	}
	
	double leerPrecio() {
		return Double.parseDouble(txtPrecio.getText());
	}
	
	double leerAncho() {
		return Double.parseDouble(txtAncho.getText());
	}
	
	double leerLargo() {
		return Double.parseDouble(txtLargo.getText());
	}
	
	double leerEspesor() {
		return Double.parseDouble(txtEspesor.getText());

	}
	
	int leerCantidadOptima() {
		return Integer.parseInt(txtCanOpMil.getText());
	}
	
	protected void btnCerrarActionPerformed(ActionEvent e) {
		//Ciera la ventana pero no todo el programa
		dispose();
	}
	
}
