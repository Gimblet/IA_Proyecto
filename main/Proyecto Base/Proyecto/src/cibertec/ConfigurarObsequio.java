package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequio extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTipoObs;
	private JTextField txtObs;
	private JLabel lbl1to5mil;
	private JTextField txt1to5mil;
	private JLabel lbl6to10mil;
	private JTextField txt6to10mil;
	private JLabel lbl11to15mil;
	private JTextField txt11to15mil;
	private JLabel lbl16to20mil;
	private JTextField txt16to20mil;
	private JLabel lblTMoreThan20mil;
	private JTextField txtMoreThan20mil;
	private JButton btnAceptar;
	private JButton btnCancelar;

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
					ConfigurarObsequio dialog = new ConfigurarObsequio();
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
	public ConfigurarObsequio() {
		setTitle("Configurar Obsequio");
		setModal(true);
		setBounds(100, 100, 450, 252);
		getContentPane().setLayout(null);
		
		lblTipoObs = new JLabel("Tipo de obsequio");
		lblTipoObs.setBounds(10, 14, 96, 24);
		getContentPane().add(lblTipoObs);
		
		txtObs = new JTextField();
		txtObs.setText("Badilejo");
		txtObs.setBounds(157, 13, 96, 20);
		getContentPane().add(txtObs);
		txtObs.setColumns(10);
		
		lbl1to5mil = new JLabel("1 a 5 millares");
		lbl1to5mil.setBounds(10, 52, 96, 20);
		getContentPane().add(lbl1to5mil);
		
		txt1to5mil = new JTextField();
		txt1to5mil.setText("1");
		txt1to5mil.setBounds(157, 46, 96, 20);
		getContentPane().add(txt1to5mil);
		txt1to5mil.setColumns(10);
		
		lbl6to10mil = new JLabel("6 a 10 millares");
		lbl6to10mil.setBounds(10, 86, 84, 24);
		getContentPane().add(lbl6to10mil);
		
		txt6to10mil = new JTextField();
		txt6to10mil.setText("3");
		txt6to10mil.setBounds(157, 79, 96, 20);
		getContentPane().add(txt6to10mil);
		txt6to10mil.setColumns(10);
		
		lbl11to15mil = new JLabel("11 a 15 millares");
		lbl11to15mil.setBounds(10, 124, 96, 14);
		getContentPane().add(lbl11to15mil);
		
		txt11to15mil = new JTextField();
		txt11to15mil.setText("5");
		txt11to15mil.setBounds(157, 112, 96, 20);
		getContentPane().add(txt11to15mil);
		txt11to15mil.setColumns(10);
		
		lbl16to20mil = new JLabel("16 a 20 millares");
		lbl16to20mil.setBounds(10, 152, 96, 14);
		getContentPane().add(lbl16to20mil);
		
		txt16to20mil = new JTextField();
		txt16to20mil.setText("7");
		txt16to20mil.setBounds(157, 145, 96, 20);
		getContentPane().add(txt16to20mil);
		txt16to20mil.setColumns(10);
		
		lblTMoreThan20mil = new JLabel("M\u00E1s de 20 millares");
		lblTMoreThan20mil.setBounds(10, 180, 107, 14);
		getContentPane().add(lblTMoreThan20mil);
		
		txtMoreThan20mil = new JTextField();
		txtMoreThan20mil.setText("9");
		txtMoreThan20mil.setBounds(157, 178, 96, 20);
		getContentPane().add(txtMoreThan20mil);
		txtMoreThan20mil.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(335, 12, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(335, 45, 89, 23);
		getContentPane().add(btnCancelar);

	}

	protected void btnCancelarActionPerformed(ActionEvent e) {
		//Cierra La Ventana Configurar Obsequio Al precionar el bot�n "Cancelar"
		dispose();
	}
}
