package co.edu.politecnicointernacional.ProyectoFinal.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewEjm extends JFrame {

	private JPanel contentPane;
	private JTextField txName;
	private JTextField txId;
	private JTextField txCargo;
	private JTextField txCorreo;
	private JTextField txTel;
	private JTextField txCod;
	private JTextField txCodCons;
	private JTextField textNameCons;
	private JTextField txCedCons;
	private JTextField txApll;
	private JTextField txNameAct;
	private JTextField txApllAct;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEjm frame = new ViewEjm();
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
	public ViewEjm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 418, 244);
		contentPane.add(tabbedPane);
		
		JPanel jpncrear = new JPanel();
		tabbedPane.addTab("Crear", null, jpncrear, null);
		jpncrear.setLayout(null);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setBounds(28, 23, 48, 14);
		jpncrear.add(lblName);
		
		txName = new JTextField();
		txName.setBounds(86, 20, 122, 20);
		jpncrear.add(txName);
		txName.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(28, 98, 48, 14);
		jpncrear.add(lblCargo);
		
		JLabel lblId = new JLabel("Cedula");
		lblId.setBounds(28, 59, 48, 14);
		jpncrear.add(lblId);
		
		JLabel lblEmail = new JLabel("Correo");
		lblEmail.setBounds(28, 137, 48, 14);
		jpncrear.add(lblEmail);
		
		txId = new JTextField();
		txId.setText("");
		txId.setBounds(86, 56, 96, 20);
		jpncrear.add(txId);
		txId.setColumns(10);
		
		txCargo = new JTextField();
		txCargo.setBounds(86, 95, 96, 20);
		jpncrear.add(txCargo);
		txCargo.setColumns(10);
		
		txCorreo = new JTextField();
		txCorreo.setText("");
		txCorreo.setBounds(86, 134, 199, 20);
		jpncrear.add(txCorreo);
		txCorreo.setColumns(10);
		
		txTel = new JTextField();
		txTel.setBounds(281, 92, 96, 20);
		jpncrear.add(txTel);
		txTel.setColumns(10);
		
		JLabel lblTel = new JLabel("Telefono");
		lblTel.setBounds(211, 95, 48, 14);
		jpncrear.add(lblTel);
		
		JLabel lblCod = new JLabel("Código");
		lblCod.setBounds(211, 59, 48, 14);
		jpncrear.add(lblCod);
		
		txCod = new JTextField();
		txCod.setText("");
		txCod.setBounds(281, 56, 96, 20);
		jpncrear.add(txCod);
		txCod.setColumns(10);
		
		JButton btnNewButton = new JButton("CREAR");
		btnNewButton.setBounds(288, 171, 89, 23);
		jpncrear.add(btnNewButton);
		
		txApll = new JTextField();
		txApll.setBounds(281, 20, 122, 20);
		jpncrear.add(txApll);
		txApll.setColumns(10);
		
		JLabel lblApll = new JLabel("Apellido");
		lblApll.setBounds(211, 23, 48, 14);
		jpncrear.add(lblApll);
		
		JPanel jpnleer = new JPanel();
		tabbedPane.addTab("Leer", null, jpnleer, null);
		jpnleer.setLayout(null);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBounds(146, 151, 124, 23);
		jpnleer.add(btnConsultar);
		
		txCodCons = new JTextField();
		txCodCons.setBounds(97, 11, 96, 20);
		jpnleer.add(txCodCons);
		txCodCons.setColumns(10);
		
		JLabel lblCodCons = new JLabel("Código");
		lblCodCons.setBounds(24, 14, 48, 14);
		jpnleer.add(lblCodCons);
		
		JLabel lblNameCons = new JLabel("Nombre");
		lblNameCons.setBounds(24, 49, 48, 14);
		jpnleer.add(lblNameCons);
		
		textNameCons = new JTextField();
		textNameCons.setBounds(97, 46, 277, 20);
		jpnleer.add(textNameCons);
		textNameCons.setColumns(10);
		
		txCedCons = new JTextField();
		txCedCons.setBounds(97, 77, 96, 20);
		jpnleer.add(txCedCons);
		txCedCons.setColumns(10);
		
		JLabel lblIdCons = new JLabel("Cedula");
		lblIdCons.setBounds(24, 80, 48, 14);
		jpnleer.add(lblIdCons);
		
		JPanel jpnactualizar = new JPanel();
		tabbedPane.addTab("Actualizar", null, jpnactualizar, null);
		jpnactualizar.setLayout(null);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(158, 171, 121, 23);
		jpnactualizar.add(btnActualizar);
		
		JLabel lblNameAct = new JLabel("Nombre");
		lblNameAct.setBounds(24, 11, 48, 14);
		jpnactualizar.add(lblNameAct);
		
		txNameAct = new JTextField();
		txNameAct.setColumns(10);
		txNameAct.setBounds(75, 8, 122, 20);
		jpnactualizar.add(txNameAct);
		
		JLabel lblApllAct = new JLabel("Apellido");
		lblApllAct.setBounds(218, 11, 48, 14);
		jpnactualizar.add(lblApllAct);
		
		txApllAct = new JTextField();
		txApllAct.setColumns(10);
		txApllAct.setBounds(263, 8, 122, 20);
		jpnactualizar.add(txApllAct);
		
		JPanel jpneliminar = new JPanel();
		tabbedPane.addTab("Eliminar", null, jpneliminar, null);
		jpneliminar.setLayout(null);
	}

}
