package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
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
	protected void btnGrabarActionPerformed(ActionEvent e) {
		//AGREGAR EL CODIGO PARA QUE EL BOTON GRABAR FUNCIONE
	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		//Configar el botón cerrar para que haga su acción
		dispose();
	}
}
