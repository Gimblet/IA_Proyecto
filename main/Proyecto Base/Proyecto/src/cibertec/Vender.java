package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Vender extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textPrecio;
	private JTextField textCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Vender dialog = new Vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Vender() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 11, 46, 14);
			contentPanel.add(lblModelo);
		}
		
		JLabel lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 36, 58, 14);
		contentPanel.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 46, 14);
		contentPanel.add(lblCantidad);
		
		JComboBox cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Venta 1", "Venta 2", "Venta 3"}));
		cboModelo.setBounds(78, 7, 179, 22);
		contentPanel.add(cboModelo);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(334, 32, 89, 23);
		contentPanel.add(btnCerrar);
		
		JButton btnVender = new JButton("Vender");
		btnVender.setBounds(334, 7, 89, 23);
		contentPanel.add(btnVender);
		
		textPrecio = new JTextField();
		textPrecio.setEditable(false);
		textPrecio.setBounds(78, 33, 179, 20);
		contentPanel.add(textPrecio);
		textPrecio.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(78, 58, 179, 20);
		contentPanel.add(textCantidad);
		textCantidad.setColumns(10);
	}
}
