package ud21.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class DivisaTest {
	
	Divisa divisa;

	@BeforeEach
	public void before() {
		String pais = "Chequia";
		String nombre = "Corona checa";
		String simbolo = "Kç";
		Double factorConv = 0.1583;	
		divisa = new Divisa(pais,nombre,simbolo,factorConv);
	}
	
	@Test
	void testGetNombre() {
		String nombreDiv = divisa.getNombre();
		String nombreDivEsperado = "Corona checa";
		assertEquals(nombreDivEsperado,nombreDiv);
	}

	@Test
	void testGetSimbolo() {
		String simbolDiv = divisa.getSimbolo();
		String simbolDivEsperado = "Kç";
		assertEquals(simbolDivEsperado,simbolDiv);
	}

	@Test
	void testGetFactorConversion() {
		Double FactorDiv = divisa.getFactorConversion();
		Double FactorDivEsperado = 0.1583;
		assertEquals(FactorDivEsperado,FactorDiv);
	}

}
