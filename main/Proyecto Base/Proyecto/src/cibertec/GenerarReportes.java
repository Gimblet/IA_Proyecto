package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GenerarReportes extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTipoReporte;
	private JComboBox<String> cboTipoReporte;
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
					GenerarReportes dialog = new GenerarReportes();
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
	public GenerarReportes() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 668, 300);
		getContentPane().setLayout(null);
		
		lblTipoReporte = new JLabel("Tipo de Reporte");
		lblTipoReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoReporte.setBounds(10, 11, 98, 17);
		getContentPane().add(lblTipoReporte);
		
		cboTipoReporte = new JComboBox<String>();
		cboTipoReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboTipoReporte.setModel(new DefaultComboBoxModel<String>(new String[] {"Ventas por modelo", "Comparaci\u00F3n con el precio promedio", "Comparaci\u00F3n con la cantidad \u00F3ptima", "Estadistica general"}));
		cboTipoReporte.setBounds(118, 8, 390, 22);
		getContentPane().add(cboTipoReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCerrarActionPerformed(e);
			}
		});
		btnCerrar.setBounds(553, 8, 89, 25);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 632, 211);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		dispose();
	}
}
