package ud21.Calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

	VentanaCalc ventanaCalc;
	Calculadora calculadora;

	public Controlador() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalc ventanaCalc = new VentanaCalc();
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

	private void actionBtnCE() {
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * } }
		 */
	}

	private void actionBtnBorrar() {
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * } }
		 */
	}

	private void actionBtnNums() {
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * } }
		 */
	}

	private void actionBtn0() {
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * } }
		 */
	}

	private void actionBtnComa() {
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * } }
		 */

	}

	private void actionCmbInput() {
		ventanaCalc.getCmbInput().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String divisaSeleccionada = ventanaCalc.getCmbInput().getSelectedItem().toString();

			}
		});
	}

	private void actionCmbOutput() {
		ventanaCalc.getCmbOutput().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String divisaSeleccionada = ventanaCalc.getCmbOutput().getSelectedItem().toString();

			}
		});
	}
}
