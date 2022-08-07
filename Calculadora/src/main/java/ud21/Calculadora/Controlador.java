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
				 ventanaCalc.setLblDivisaInput("0");
				 ventanaCalc.setLblDivisaOutput("0");
				 ventanaCalc.setLblValorConversion("1 $ = 1 €"); //como no vamos a actualizar valores se puede establecer Default. 
			 }
		 });		 
	}

	private void actionBtnBorrar() {//joana
		
		ventanaCalc.getBtnBorrar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorInput = ventanaCalc.getTextLblDivisaInput();
				//StringUtils.chop(valorInput);
			}
		 });
			 
	}

	private void actionBtnNums() {//david
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * }};
		 */
	}

	private void actionBtn0() {//david
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * }};
		 */
	}

	private void actionBtnComa() {//ionela
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * }};
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
