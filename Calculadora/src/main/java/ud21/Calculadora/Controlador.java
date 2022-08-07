package ud21.Calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
					actionCmbInput();
					actionCmbOutput();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	private void actionBtnCE() {

		ventanaCalc.getBtnCE().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaCalc.setLblDivisaInput("0");
				ventanaCalc.setLblDivisaOutput("0");
				ventanaCalc.setLblValorConversion("1 $ = 1 €"); // como no vamos a actualizar valores se puede
																// establecer Default.
			}
		});

	}

	private void actionBtnBorrar() {

		ventanaCalc.getBtnBorrar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String valorInput = ventanaCalc.getTextLblDivisaInput();
				
				if(valorInput.length()>1) {					
					valorInput = valorInput.substring(0, valorInput.length()-1);				
					ventanaCalc.setLblDivisaInput(valorInput);
				}else{
					ventanaCalc.setLblDivisaInput("0");
				}
				
			}
		});

	}

	private void actionBtnNums() {
		ActionListener listenerNums = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// Calculadora.anadir

				
				String numero = ventanaCalc.getTextLblDivisaInput();
				if(numero == "0") {
					ventanaCalc.setLblDivisaInput(e.getActionCommand());
				} else {
					ventanaCalc.setLblDivisaInput(numero+e.getActionCommand());
				}

				calculadora.setValorInput(Double.parseDouble(numero+e.getActionCommand()));
				ventanaCalc.setLblDivisaOutput(Double.toString(calculadora.conversion())  );
			}

		};

		for (JButton boton : ventanaCalc.getBtnNums()) {
			boton.addActionListener(listenerNums);
		}
	}

	private void actionBtn0() {
		ventanaCalc.getBtnCero().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String numero = ventanaCalc.getTextLblDivisaInput();
				if(numero != "0") {
					ventanaCalc.setLblDivisaInput(numero+e.getActionCommand());
				}
				calculadora.setValorInput(Double.parseDouble(numero+e.getActionCommand()));
				ventanaCalc.setLblDivisaOutput(Double.toString(calculadora.conversion())  );

			}

		});
	}

	private void actionBtnComa() {// ionela
		/*
		 * ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent arg0) {
		 * 
		 * }};
		 */

	}

	private void actionCmbInput() {// ionela
		ventanaCalc.getCmbInput().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ponerSimboloDivisa(ventanaCalc.getCmbInput(), ventanaCalc.getLblSimboloInput());

			}
		});
	}

	private void actionCmbOutput() {// ionela
		ventanaCalc.getCmbOutput().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerSimboloDivisa(ventanaCalc.getCmbOutput(), ventanaCalc.getLblSimboloOutput());

			}
		});
	}

	private void textLblValorConversion() {// ionela

	}

	private void ponerSimboloDivisa(JComboBox comboBox, JLabel label) {
		String opcionSeleccionada = comboBox.getSelectedItem().toString();
		switch (opcionSeleccionada) {
		case "Estados Unidos - Dólar":
			label.setText("$");
			break;

		case "Europa - Euro":
			label.setText("€");

			break;

		case "Reino Unido - Libra":
			label.setText("£");

			break;

		case "Japón - Yen":
			label.setText("¥");

			break;

		default:
			break;
		}

	}

}
