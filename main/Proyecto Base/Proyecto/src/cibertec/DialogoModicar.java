package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoListar extends JDialog implements ActionListener {
	private JLabel lblModelo;
	private JComboBox<String> comboCodigo;
	private JButton btnCerrar;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblCan”ptima;
	private JTextField textPrecio;
	private JTextField textAncho;
	private JTextField textLargo;
	private JTextField texEspesor;
	private JTextField textField_4;
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
					DialogoListar dialog = new DialogoListar();
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
	public DialogoListar() {
		setModal(true);
		setTitle("Modificar Ladrillo");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 28, 44, 21);
		getContentPane().add(lblModelo);
		
		comboCodigo = new JComboBox<String>();
		comboCodigo.setModel(new DefaultComboBoxModel<String>(new String[] {"Ladrillo King Kong 18 Huecos", "Ladrillo Pandereta", "Ladrillo de Techo 30 x 30"}));
		comboCodigo.setBounds(112, 28, 181, 20);
		getContentPane().add(comboCodigo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(324, 27, 89, 23);
		getContentPane().add(btnCerrar);
		
		lblPrecio = new JLabel("Precio(S/)");
		lblPrecio.setBounds(10, 60, 61, 14);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho(cm)");
		lblAncho.setBounds(10, 85, 67, 32);
		getContentPane().add(lblAncho);
		
		lblLargo = new JLabel("Largo(cm)");
		lblLargo.setBounds(10, 134, 61, 14);
		getContentPane().add(lblLargo);
		
		lblEspesor = new JLabel("Espesor(mm)");
		lblEspesor.setBounds(8, 172, 63, 14);
		getContentPane().add(lblEspesor);
		
		lblCan”ptima = new JLabel("Can \u00D3ptima(millares)");
		lblCan”ptima.setBounds(8, 210, 138, 14);
		getContentPane().add(lblCan”ptima);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(112, 57, 181, 23);
		getContentPane().add(textPrecio);
		textPrecio.setColumns(10);
		
		textAncho = new JTextField();
		textAncho.setBounds(112, 91, 181, 20);
		getContentPane().add(textAncho);
		textAncho.setColumns(10);
		
		textLargo = new JTextField();
		textLargo.setBounds(112, 130, 181, 23);
		getContentPane().add(textLargo);
		textLargo.setColumns(10);
		
		texEspesor = new JTextField();
		texEspesor.setBounds(112, 169, 181, 20);
		getContentPane().add(texEspesor);
		texEspesor.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(112, 207, 181, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(324, 56, 89, 23);
		getContentPane().add(btnGrabar);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			btnCerrarActionPerformed(arg0);
		}
	}
	protected void btnCerrarActionPerformed(ActionEvent arg0) {
	}
}
