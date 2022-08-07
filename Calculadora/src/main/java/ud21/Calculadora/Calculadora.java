package ud21.Calculadora;

import java.util.ArrayList;

public class Calculadora {
	
	private ArrayList<Divisa> divisas;
	private Double valorInput;
	private Double valorOutput;
	private Divisa divisaInput;
	private Divisa divisaOutput;
	
	
	public Calculadora() {
		
	}
	
	public Double conversion() {
		return conversion(valorInput, divisaInput, divisaOutput);
	}
	
	public Double conversion(Double cantidad, Divisa divisaInput, Divisa divisaOutput) {
		
		return cantidad;
	}

}
