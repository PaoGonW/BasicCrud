package co.edu.politecnicointernacional.crud_JDBC.logica;

import java.awt.EventQueue;

import co.edu.politecnicointernacional.crud_JDBC.vista.CrudAPP;

public class Crud_Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudAPP frame = new CrudAPP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
