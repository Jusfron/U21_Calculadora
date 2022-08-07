package ud21.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class DivisaTest {
	
	Divisa divisa;

	@BeforeEach
	public void before() {
		String pais = "Reino Unido";
		String nombre = "Libra";
		String simbolo = "£";
		Double factorConv = 0.8282;	
		divisa = new Divisa(pais,nombre,simbolo,factorConv);
	}
	
	@Test
	void testDivisa() {
		Divisa divisa2 = new Divisa("Reino Unido","Libra","£",0.8282);
		assertNotNull(divisa2);
	}

	@Test
	void testGetNombre() {
		String nombreDiv = divisa.getNombre();
		String nombreDivEsperado = "Libra";
		assertEquals(nombreDivEsperado,nombreDiv);
	}

	@Test
	void testGetSimbolo() {
		String simbolDiv = divisa.getSimbolo();
		String simbolDivEsperado = "£";
		assertEquals(simbolDivEsperado,simbolDiv);
	}

	@Test
	void testGetFactorConversion() {
		Double FactorDiv = divisa.getFactorConversion();
		Double FactorDivEsperado = 0.8282;
		assertEquals(FactorDivEsperado,FactorDiv);
	}

	/*@Test
	void testGetPais() {
		String paisDiv = divisa.getPais();
		String paisDivEsperado = "Reino Unido";
		assertEquals(paisDivEsperado,paisDiv);
	}*/

}
