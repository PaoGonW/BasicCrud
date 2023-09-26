package co.edu.politecnicointernacional.ProyectoFinal.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField txName;
	private JTextField txPrice;
	private JTextField txCant;
	private JTextField txIdCod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 428, 254);
		contentPane.add(tabbedPane);
		
		JPanel jpncrear = new JPanel();
		tabbedPane.addTab("Create", null, jpncrear, null);
		jpncrear.setLayout(null);
		
		JLabel lblName = new JLabel("Producto");
		lblName.setBounds(50, 35, 48, 14);
		jpncrear.add(lblName);
		
		txName = new JTextField();
		txName.setBounds(108, 32, 108, 20);
		jpncrear.add(txName);
		txName.setColumns(10);
		
		JLabel lblUnd = new JLabel("Unidad");
		lblUnd.setBounds(50, 78, 48, 14);
		jpncrear.add(lblUnd);
		
		JComboBox comboBoxUnd = new JComboBox();
		comboBoxUnd.setModel(new DefaultComboBoxModel(new String[] {"---", "Libra", "Kilos", "Paquetes"}));
		comboBoxUnd.setBounds(108, 74, 94, 22);
		jpncrear.add(comboBoxUnd);
		
		JLabel lblPrice = new JLabel("Precio");
		lblPrice.setBounds(50, 121, 48, 14);
		jpncrear.add(lblPrice);
		
		txPrice = new JTextField();
		txPrice.setBounds(108, 118, 96, 20);
		jpncrear.add(txPrice);
		txPrice.setColumns(10);
		
		JLabel lblCant = new JLabel("Cantidad");
		lblCant.setBounds(234, 121, 48, 14);
		jpncrear.add(lblCant);
		
		txCant = new JTextField();
		txCant.setText("");
		txCant.setBounds(292, 118, 96, 20);
		jpncrear.add(txCant);
		txCant.setColumns(10);
		
		JButton btnCreate = new JButton("REGISTRAR");
		btnCreate.setBounds(162, 167, 120, 23);
		jpncrear.add(btnCreate);
		
		JLabel lblIdCod = new JLabel("Código");
		lblIdCod.setBounds(234, 35, 48, 14);
		jpncrear.add(lblIdCod);
		
		txIdCod = new JTextField();
		txIdCod.setBounds(292, 32, 96, 20);
		jpncrear.add(txIdCod);
		txIdCod.setColumns(10);
		
		JPanel jpnleer = new JPanel();
		tabbedPane.addTab("Read", null, jpnleer, null);
		jpnleer.setLayout(null);
		
		JPanel jpnactualizar = new JPanel();
		tabbedPane.addTab("Update", null, jpnactualizar, null);
		jpnactualizar.setLayout(null);
		
		JPanel jpneliminar = new JPanel();
		tabbedPane.addTab("Delete", null, jpneliminar, null);
		jpneliminar.setLayout(null);
	}
}
