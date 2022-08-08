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
		calc.setValorInput(10.0);
	}
	
	@Test
	void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	void testConversion() {
		fail("Not yet implemented");
	}

	@Test
	void testConversionDoubleDivisaDivisa() {
		fail("Not yet implemented");
	}

	/*@Test
	void testGetDivisas() {
		fail("Not yet implemented");
	}*/

	@Test
	void testGetDivisa() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDivisaBySimbol() {
		fail("Not yet implemented");
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
				
		Divisa divisa = calc.getDivisa("Libra");
		calc.setDivisaInput(divisa);
		
		Double result = calc.conversion();
		
		assertEquals(11.85, result);		
		
	}

	@Test
	void testSetDivisaOutput() {
		fail("Not yet implemented");
	}

	@Test
	void testSetValorInput() {
		fail("Not yet implemented");
	}

	/*@Test
	void testSetValorOutput() {
		fail("Not yet implemented");
	}*/

}
