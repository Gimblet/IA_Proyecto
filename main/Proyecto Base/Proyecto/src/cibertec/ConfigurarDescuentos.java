package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarDescuentos extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txt1to5mil;
	private JLabel lbl1to5mil;
	private JTextField txt6to10mil;
	private JLabel lbl6to10mil;
	private JTextField txt11to15mil;
	private JLabel lbl11to15mil;
	private JTextField txt16to20mil;
	private JLabel lbl16to20mil;
	private JTextField txtMoreThan20mil;
	private JLabel lblTMoreThan20mil;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblPer1;
	private JLabel lblPer2;
	private JLabel lblPer3;
	private JLabel lblPer4;
	private JLabel lblPer5;

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
					ConfigurarDescuentos dialog = new ConfigurarDescuentos();
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
	public ConfigurarDescuentos() {
		setTitle("Configurar Porcentajes de Descuento");
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(null);
		
		txt1to5mil = new JTextField();
		txt1to5mil.setText("5.0");
		txt1to5mil.setColumns(10);
		txt1to5mil.setBounds(139, 11, 96, 20);
		getContentPane().add(txt1to5mil);
		
		lbl1to5mil = new JLabel("1 a 5 millares");
		lbl1to5mil.setBounds(10, 8, 96, 24);
		getContentPane().add(lbl1to5mil);
		
		txt6to10mil = new JTextField();
		txt6to10mil.setText("7.5");
		txt6to10mil.setColumns(10);
		txt6to10mil.setBounds(139, 42, 96, 20);
		getContentPane().add(txt6to10mil);
		
		lbl6to10mil = new JLabel("6 a 10 millares");
		lbl6to10mil.setBounds(10, 40, 96, 24);
		getContentPane().add(lbl6to10mil);
		
		txt11to15mil = new JTextField();
		txt11to15mil.setText("10.0");
		txt11to15mil.setColumns(10);
		txt11to15mil.setBounds(139, 73, 96, 20);
		getContentPane().add(txt11to15mil);
		
		lbl11to15mil = new JLabel("11 a 15 millares");
		lbl11to15mil.setBounds(10, 72, 96, 24);
		getContentPane().add(lbl11to15mil);
		
		txt16to20mil = new JTextField();
		txt16to20mil.setText("12.5");
		txt16to20mil.setColumns(10);
		txt16to20mil.setBounds(139, 104, 96, 20);
		getContentPane().add(txt16to20mil);
		
		lbl16to20mil = new JLabel("16 a 20 millares");
		lbl16to20mil.setBounds(10, 104, 96, 24);
		getContentPane().add(lbl16to20mil);
		
		txtMoreThan20mil = new JTextField();
		txtMoreThan20mil.setText("15.0");
		txtMoreThan20mil.setColumns(10);
		txtMoreThan20mil.setBounds(139, 135, 96, 20);
		getContentPane().add(txtMoreThan20mil);
		
		lblTMoreThan20mil = new JLabel("M\u00E1s de 20 millares");
		lblTMoreThan20mil.setBounds(10, 136, 107, 24);
		getContentPane().add(lblTMoreThan20mil);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(335, 44, 89, 23);
		getContentPane().add(btnCancelar);
		
		lblPer1 = new JLabel("%");
		lblPer1.setBounds(245, 14, 11, 14);
		getContentPane().add(lblPer1);
		
		lblPer2 = new JLabel("%");
		lblPer2.setBounds(245, 48, 11, 14);
		getContentPane().add(lblPer2);
		
		lblPer3 = new JLabel("%");
		lblPer3.setBounds(245, 76, 11, 14);
		getContentPane().add(lblPer3);
		
		lblPer4 = new JLabel("%");
		lblPer4.setBounds(245, 107, 11, 14);
		getContentPane().add(lblPer4);
		
		lblPer5 = new JLabel("%");
		lblPer5.setBounds(245, 138, 11, 14);
		getContentPane().add(lblPer5);

	}
	protected void btnCancelarActionPerformed(ActionEvent e) {
		dispose();
	}
}
