package ud21.Calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
	
	VentanaCalc ventanaCalc;

	public Controlador() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalc ventanaCalc = new VentanaCalc();
					ventanaCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void actionBtnCE() {
		/*ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		}*/
	}
	
	private void actionBtnBorrar() {
		/*ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
			}
		}*/
	}
	
	private void actionBtnNums() {
		/*ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
			}
		}*/
	}
	
	private void actionBtn0() {
		/*ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
			}
		}*/
	}
	
	private void actionBtnComa() {
		/*ventanaCalc.getBtnAnadirPalabra().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
			}
		}*/
	}
	
}
