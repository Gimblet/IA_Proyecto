package cibertec;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Ayuda extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTitulo;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			Ayuda dialog = new Ayuda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ayuda() {
		setTitle("Acerca de Tienda");
		setModal(true);
		setBounds(100, 100, 415, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTitulo = new JLabel("Venta de Ladrillos");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setLabelFor(this);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(125, 28, 149, 25);
		contentPanel.add(lblTitulo);
		
		lblNewLabel = new JLabel("Autores");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(170, 60, 58, 25);
		contentPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Diego Dami\u00E1n\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(160, 92, 79, 18);
		contentPanel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Franco Enriquez");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(150, 117, 98, 14);
		contentPanel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Julieta");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(181, 138, 36, 14);
		contentPanel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Benjamin");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(173, 159, 53, 14);
		contentPanel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Diego Villena");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(162, 180, 74, 18);
		contentPanel.add(lblNewLabel_5);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(155, 226, 89, 23);
		contentPanel.add(btnNewButton);
		
		lblNewLabel_6 = new JLabel("Ubicacion: Jr. Los Helenios 4060");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(92, 205, 215, 14);
		contentPanel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Venta de ladrillos de la mejor marca y mejor precio.");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(40, 7, 319, 14);
		contentPanel.add(lblNewLabel_7);
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		dispose();
	}
}
