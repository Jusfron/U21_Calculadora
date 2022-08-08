package ud21.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.EventQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControladorTest {

	Controlador control;
	
	@BeforeEach
	public void before() {
		control = new Controlador();
	}
	
	@Test
	void testControlador() {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//al estar en otro hilo, tanto ventana como calculadora del controlador son null. por tanto todo falla.
				VentanaCalc ventana = control.getVentanaCalc();		
				Calculadora calcu = control.getCalculadora();
				
				ventana.getBtnCE().doClick(); //da error ya que ventana es null
			}
		});
		
		/*control.actionBtnCE();
		control.actionBtnBorrar();
		control.actionBtnNums();
		control.actionBtn0();
		control.actionBtnPunto();
		control.actionCmbInput();
		control.actionCmbOutput();*/
	}

}
