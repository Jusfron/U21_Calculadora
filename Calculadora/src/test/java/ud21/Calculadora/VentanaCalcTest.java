package ud21.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VentanaCalcTest {
	public VentanaCalc ventana;

	@BeforeEach
	public void before() {
		ventana = new VentanaCalc();
	}

	@Test
	void testGetBtnNums() {
		JButton[] botones = new JButton[9];
		ventana.setBtnNums(botones);
		JButton[] respuesta = ventana.getBtnNums();
		for (int i = 0; i < botones.length; i++) {
			assertEquals(botones[i], respuesta[i]);
		}

	}

	@Test
	void testGetBtnBorrar() {
		JButton b = new JButton();
		ventana.setBtnBorrar(b);
		JButton respuesta = ventana.getBtnBorrar();
		assertEquals(b, respuesta);
	}

	@Test
	void testGetBtnCE() {
		JButton b = new JButton();
		ventana.setBtnCE(b);
		JButton respuesta = ventana.getBtnCE();
		assertEquals(b, respuesta);
	}

	@Test
	void testGetBtnCero() {
		JButton b = new JButton();
		ventana.setBtnCero(b);
		JButton respuesta = ventana.getBtnCero();
		assertEquals(b, respuesta);
	}

	@Test
	void testGetBtnPunto() {
		JButton b = new JButton();
		ventana.setBtnPunto(b);
		JButton respuesta = ventana.getBtnPunto();
		assertEquals(b, respuesta);
	}

	@Test
	void testGetLblSimboloInput() {
		JLabel lblPrueba = new JLabel();
		ventana.setLblSimboloInput(lblPrueba);
		JLabel respuesta = ventana.getLblSimboloInput();
		assertEquals(lblPrueba, respuesta);
	}

	@Test
	void testGetLblSimboloOutput() {
		JLabel lblPrueba = new JLabel();
		ventana.setLblSimboloOutput(lblPrueba);
		JLabel respuesta = ventana.getLblSimboloOutput();
		assertEquals(lblPrueba, respuesta);
	}

	@Test
	void testGetCmbOutput() {
		JComboBox combo = new JComboBox();
		ventana.setCmbOutput(combo);
		JComboBox respuesta = ventana.getCmbOutput();
		assertEquals(combo, respuesta);
	}

	@Test
	void testGetCmbInput() {
		JComboBox combo = new JComboBox();
		ventana.setCmbInput(combo);
		JComboBox respuesta = ventana.getCmbInput();
		assertEquals(combo, respuesta);

	}

	@Test
	void testGetContentPane() {
		JPanel contentPane = new JPanel();
		ventana.setContentPane(contentPane);
		JPanel respuesta = ventana.getContentPane();
		assertEquals(contentPane, respuesta);
	}

	@Test
	void testGetLblDivisaInput() {
		JLabel labelPrueba = new JLabel();
		ventana.setLblDivisaInput(labelPrueba);
		JLabel respuesta = ventana.getLblDivisaInput();
		assertEquals(labelPrueba, respuesta);

	}

	@Test
	void testGetLblDivisaOutput() {
		JLabel labelPrueba = new JLabel();
		ventana.setLblDivisaOutput(labelPrueba);
		JLabel respuesta = ventana.getLblDivisaOutput();
		assertEquals(labelPrueba, respuesta);
	}

	@Test
	void testGetLblValorConversion() {
		JLabel labelPrueba = new JLabel();
		ventana.setLblValorConversion(labelPrueba);
		JLabel respuesta = ventana.getLblValorConversion();
		assertEquals(labelPrueba, respuesta);
	}

	@Test
	void testGetTextLblDivisaInput() {
		ventana.setLblDivisaInput("hola");
		String respuesta = ventana.getTextLblDivisaInput();
		assertEquals("hola", respuesta);
	}

	@Test
	void testGetLblValorConversionString() {
		ventana.setLblValorConversion("prueba");
		String respuesta = ventana.getLblValorConversionString();
		assertEquals("prueba", respuesta);

	}

	@Test
	void testGetLblDivisaOutputString() {
		ventana.setLblDivisaOutput("prueba");
		String respuesta = ventana.getLblDivisaOutputString();
		assertEquals("prueba", respuesta);
	}

}
