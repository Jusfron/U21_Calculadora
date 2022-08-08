package ud21.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

//import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calc;
	
	@BeforeEach
	public void before() {			
		calc = new Calculadora();
	}
	
	@Test
	void testCalculadora() {
		assertNotNull(calc);
	}

	@Test
	void testConversion() {
		Double esperado = 0.0;
		Double resultado = calc.conversion();
		assertEquals(esperado, resultado, 0.001);
	}

	@Test
	void testConversionDoubleDivisaDivisa() {
		calc.setDivisaInput(calc.getDivisa("Yen"));
		calc.setDivisaOutput(calc.getDivisa("Libra"));
		calc.setValorInput(50.0);
		Double esperado = 0.31;
		Double resultado = calc.conversion();
		assertEquals(esperado, resultado, 0.01);
	}

	/*@Test
	void testGetDivisas() {
		fail("Not yet implemented");
	}*/

	@Test
	void testGetDivisa() {
		Divisa esperado = new Divisa("Europa","Euro","€",0.9804);
		Divisa resultado = calc.getDivisa("Euro");
		assertEquals(esperado.getFactorConversion(), resultado.getFactorConversion(), 0.1);
		assertEquals(esperado.getNombre(), resultado.getNombre());
		assertEquals(esperado.getSimbolo(), resultado.getSimbolo());
		
		//Caso null
		esperado = new Divisa("Wakanda","Inu","WKD",0.00000001255);
		assertNull(calc.getDivisa("Wakanda"));
	}

	@Test
	void testGetDivisaBySimbol() {
		Divisa esperado = new Divisa("Europa","Euro","€",0.9804);
		Divisa resultado = calc.getDivisaBySimbol("€");
		assertEquals(esperado.getFactorConversion(), resultado.getFactorConversion(), 0.1);
		assertEquals(esperado.getNombre(), resultado.getNombre());
		assertEquals(esperado.getSimbolo(), resultado.getSimbolo());
		
		//Caso null
		esperado = new Divisa("Wakanda","Inu","WKD",0.00000001255);
		assertNull(calc.getDivisaBySimbol("WKD"));
	}

	/*@Test
	void testGetValorInput() {
		fail("Not yet implemented");
	}

	@Test
	void testGetValorOutput() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDivisaInput() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDivisaOutput() {
		fail("Not yet implemented");
	}*/

	@Test
	void testSetDivisaInput() {	
		/*ArrayList<Divisa> divisas = calc.getDivisas();
		divisas.add(new Divisa("Chequia","Corona Checa","Kč",0.041));
		calc.setDivisaInput(new Divisa("Chequia","Corona Checa","Kč",0.041));	
		
		String div = calc.getDivisa("Corona Checa").getSimbolo();
		String divEspe = 
		assertEquals(calc.getDivisa("Corona Checa").getSimbolo(),calc.getDivisa(null));
		*/
	}

	@Test
	void testSetDivisaOutput() {
		Double esperado = 1349.7;
		calc.setDivisaOutput(calc.getDivisa("Yen"));
		calc.setValorInput(10.0);
		Double resultado = calc.conversion();
		assertEquals(esperado, resultado, 0.1);
	}

	@Test
	void testSetValorInput() {
		Double esperado = 0.07;
		calc.setDivisaInput(calc.getDivisa("Yen"));
		calc.setValorInput(10.0);
		Double resultado = calc.conversion();
		assertEquals(esperado, resultado, 0.01);
	}

	/*@Test
	void testSetValorOutput() {
		fail("Not yet implemented");
	}*/

}
