package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Ayuda extends JDialog {
	private JLabel lblTienda;
	private JLabel lblinformacion;
	private JLabel lbldireccion;
	private JLabel lblelaboracion;
	private JLabel lblfecha;
	private JLabel lblestado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ayuda dialog = new Ayuda();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Ayuda() {
		setTitle("Acerda de tienda");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblTienda = new JLabel("Tienda de ladrillos");
		lblTienda.setForeground(Color.BLACK);
		lblTienda.setBackground(Color.BLACK);
		lblTienda.setLabelFor(lblTienda);
		lblTienda.setBounds(143, 34, 106, 30);
		getContentPane().add(lblTienda);
		
		lblinformacion = new JLabel("Vendemos todo tipo de ladrillos, de la mejor calidad y mejor precio.");
		lblinformacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblinformacion.setBackground(new Color(240, 240, 240));
		lblinformacion.setToolTipText("");
		lblinformacion.setBounds(10, 34, 399, 105);
		getContentPane().add(lblinformacion);
		
		lbldireccion = new JLabel("Jr.Los Helenios 4060");
		lbldireccion.setBounds(136, 97, 125, 46);
		getContentPane().add(lbldireccion);
		
		lblelaboracion = new JLabel("Elaborado por Diego, Dami\u00E1n, Franco, Julieta y Benjam\u00EDn");
		lblelaboracion.setBounds(67, 138, 342, 30);
		getContentPane().add(lblelaboracion);
		
		lblfecha = new JLabel("25/05/2023");
		lblfecha.setBounds(157, 156, 66, 46);
		getContentPane().add(lblfecha);
		
		lblestado = new JLabel("Lima, Per\u00FA");
		lblestado.setBounds(157, 203, 66, 14);
		getContentPane().add(lblestado);

	}
}
