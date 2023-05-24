package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConsultar extends JDialog implements ActionListener {
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
	private JTextField txtCanOptima;
	private JButton btnCerrar;

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
					DialogoConsultar dialog = new DialogoConsultar();
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
	public DialogoConsultar() {
		setModal(true);
		setTitle("Consultar Ladrillo");
		setBounds(100, 100, 441, 278);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 15, 46, 22);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 52, 50, 22);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 89, 54, 22);
		getContentPane().add(lblAncho);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(10, 126, 54, 22);
		getContentPane().add(lblLargo);
		
		lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(10, 163, 65, 22);
		getContentPane().add(lblEspesor);
		
		lblCanOptima = new JLabel("Can. \u00D3ptima (millares)");
		lblCanOptima.setBounds(10, 200, 106, 22);
		getContentPane().add(lblCanOptima);
		
		cboModelo = new JComboBox<String>();
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {"Ladrillo King Kong 18 Huecos", "Ladrillo King Long Macizo", "Ladrillo Pandereta Acanalada", "Ladrillo Patelero", "Ladrillo Techo Hueco"}));
		cboModelo.setBounds(126, 15, 184, 22);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(126, 53, 184, 20);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(126, 90, 184, 20);
		getContentPane().add(txtAncho);
		
		txtLargo = new JTextField();
		txtLargo.setEditable(false);
		txtLargo.setColumns(10);
		txtLargo.setBounds(126, 127, 184, 20);
		getContentPane().add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setEditable(false);
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(126, 163, 184, 20);
		getContentPane().add(txtEspesor);
		
		txtCanOptima = new JTextField();
		txtCanOptima.setEditable(false);
		txtCanOptima.setColumns(10);
		txtCanOptima.setBounds(126, 201, 184, 20);
		getContentPane().add(txtCanOptima);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(326, 15, 89, 23);
		getContentPane().add(btnCerrar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			btnCerrarActionPerformed(e);
		}
	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		dispose();
	}
}
