package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vender extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox<String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

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
					Vender dialog = new Vender();
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
	public Vender() {
		setTitle("Vender");
		setBounds(100, 100, 520, 300);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 36, 59, 14);
		getContentPane().add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 46, 14);
		getContentPane().add(lblCantidad);
		
		cboModelo = new JComboBox<String>();
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {"Ladrillo King Kong 18 Huecos", "Ladrillo King Kong Macizo", "Ladrillo Pandereta Acanalada", "Ladrillo Patelero", "Ladrillo Techo Hueco"}));
		cboModelo.setBounds(85, 7, 250, 22);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(85, 33, 250, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(85, 58, 250, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(405, 7, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCerrarActionPerformed(e);
			}
		});
		btnCerrar.setBounds(405, 32, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 484, 164);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		//Cierra la ventana de la pantalla Vender pero sin cerrar el programa entero
		dispose();
	}
	
	protected void RecuadroAvancedeVentas() {
		//Hace que el recuadro  Avance de ventas aparezca despues de 5 ventas
		
		
		
	}
	
}
