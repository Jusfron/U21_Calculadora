package ud21.Calculadora;

import java.awt.EventQueue;

public class Controlador {

	public Controlador() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalc frame = new VentanaCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
}
