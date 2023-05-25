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
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

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
		lblTienda.setBounds(157, 26, 106, 30);
		getContentPane().add(lblTienda);
		
		lblNewLabel = new JLabel("Elaborado por Damian, Diego, Franco, Julieta y Benjamin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(53, 96, 323, 105);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("25/05/2023");
		lblNewLabel_1.setBounds(157, 172, 121, 30);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Lima,Per\u00FA");
		lblNewLabel_2.setBounds(157, 199, 63, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Vendemos todo tipo de ladrillo de calidad y mejor precio");
		lblNewLabel_3.setBounds(55, 52, 334, 46);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Ubicacion: Jr. Los Helenios 4060");
		lblNewLabel_4.setBounds(101, 96, 210, 14);
		getContentPane().add(lblNewLabel_4);

	}
}
