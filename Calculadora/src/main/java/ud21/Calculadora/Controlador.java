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
		ActionListener listenerNums = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
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
