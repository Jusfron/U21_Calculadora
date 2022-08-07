package ud21.Calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controlador {

	VentanaCalc ventanaCalc;
	Calculadora calculadora;

	public Controlador() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaCalc = new VentanaCalc();
					ventanaCalc.setVisible(true);

					calculadora = new Calculadora();

					actionBtnCE();
					actionBtnBorrar();
					actionBtnNums();
					actionBtn0();
					actionBtnComa();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	private void actionBtnCE() {//joana
		
		 ventanaCalc.getBtnCE().addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 
			 }
		 });		 
	}

	private void actionBtnBorrar() {//joana
		
		ventanaCalc.getBtnBorrar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		 });
			 
	}

	private void actionBtnNums() {
		ActionListener listenerNums = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//Calculadora.anadir
			}
			
		};
		
		for (JButton boton : ventanaCalc.getBtnNums()) {
			boton.addActionListener(listenerNums);
		}
	}

	private void actionBtn0() {
		ventanaCalc.getBtnCero().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		});
	}

	private void actionBtnComa() {
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * } }
=======
	private void actionBtnComa() {//ionela
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * }};
>>>>>>> branch 'main' of https://github.com/Jusfron/U21_Calculadora
		 */

	}

	private void actionCmbInput() {//ionela
		ventanaCalc.getCmbInput().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String divisaSeleccionada = ventanaCalc.getCmbInput().getSelectedItem().toString();

			}
		});
	}

	private void actionCmbOutput() {//ionela
		ventanaCalc.getCmbOutput().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String divisaSeleccionada = ventanaCalc.getCmbOutput().getSelectedItem().toString();

			}
		});
	}
}
