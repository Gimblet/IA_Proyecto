package cibertec;


import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class DialogoListar extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JButton btnListar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	

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
			DialogoListar dialog = new DialogoListar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoListar() {
		setTitle("Listado de  ladrillos");
		setBounds(100, 100, 600, 390);
		getContentPane().setLayout(null);
		contentPanel.setBounds(414, 0, 20, 23);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCerrarActionPerformed(e);
			}
		});
		btnCerrar.setBounds(205, 317, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnListarActionPerformed(e);
			}
		});
		btnListar.setBounds(304, 317, 89, 23);
		getContentPane().add(btnListar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 26, 564, 285);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
	}
	
	//Procesa la accion del botón listar
	
	protected void btnListarActionPerformed(ActionEvent e) {
		txtS.setText("LISTADO DE LADRILLOS" + "\n" + "\n");
		imprimir("Modelo                     : " + Tienda.modelo0);
		imprimir("Precio                     : S/ " + Tienda.precio0);
		imprimir("Ancho (cm)                 : " + Tienda.ancho0 + " cm");
		imprimir("largo (cm)                 : " + Tienda.largo0 + " cm");
		imprimir("Espesor (cm)               : " + Tienda.espesor0 + " cm");
		imprimir("Cantidad Optima (millares) : " + Tienda.cantidadoptima0 + "\n");
		
		imprimir("Modelo                     : " + Tienda.modelo1);
		imprimir("Precio                     : S/ " + Tienda.precio1);
		imprimir("Ancho (cm)                 : " + Tienda.ancho1 + " cm");
		imprimir("largo (cm)                 : " + Tienda.largo1 + " cm");
		imprimir("Espesor (cm)               : " + Tienda.espesor1 + " cm");
		imprimir("Cantidad Optima (millares) : " + Tienda.cantidadoptima1 + "\n");
		
		imprimir("Modelo                     : " + Tienda.modelo2);
		imprimir("Precio                     : S/ " + Tienda.precio2);
		imprimir("Ancho (cm)                 : " + Tienda.ancho2 + " cm");
		imprimir("largo (cm)                 : " + Tienda.largo2 + " cm");
		imprimir("Espesor (cm)               : " + Tienda.espesor2 + " cm");
		imprimir("Cantidad Optima (millares) : " + Tienda.cantidadoptima2 + "\n");
		
		imprimir("Modelo                     : " + Tienda.modelo3);
		imprimir("Precio                     : S/ " + Tienda.precio3);
		imprimir("Ancho (cm)                 : " + Tienda.ancho3 + " cm");
		imprimir("largo (cm)                 : " + Tienda.largo3 + " cm");
		imprimir("Espesor (cm)               : " + Tienda.espesor3 + " cm");
		imprimir("Cantidad Optima (millares) : " + Tienda.cantidadoptima3 + "\n");
		
		imprimir("Modelo                     : " + Tienda.modelo4);
		imprimir("Precio                     : S/ " + Tienda.precio4);
		imprimir("Ancho (cm)                 : " + Tienda.ancho4 + " cm");
		imprimir("largo (cm)                 : " + Tienda.largo4 + " cm");
		imprimir("Espesor (cm)               : " + Tienda.espesor4 + " cm");
		imprimir("Cantidad Optima (millares) : " + Tienda.cantidadoptima4);
	}
	
	void imprimir(String cad) {
		txtS.append(cad + "\n");
	}
	
	protected void btnCerrarActionPerformed(ActionEvent e) { 
		dispose(); 
	}
}
