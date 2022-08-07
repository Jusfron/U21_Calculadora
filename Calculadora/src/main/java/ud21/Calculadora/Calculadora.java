package ud21.Calculadora;

import java.util.ArrayList;

public class Calculadora {
	
	private ArrayList<Divisa> divisas;
	private Double valorInput;
	private Double valorOutput;
	private Divisa divisaInput;
	private Divisa divisaOutput;
	
	
	public Calculadora() {
		divisas = new ArrayList<Divisa>();
		divisas.add(new Divisa("Estados Unidos","Dólar", "$", 1.0));
		divisas.add(new Divisa("Europa","Euro", "€", 0.9818));
		divisas.add(new Divisa("Reino Unido", "Libra", "£", 0.8282));
		divisas.add(new Divisa("Japón","Yen", "¥", 134.97));
		valorInput = 0.0;
		valorOutput = 0.0;
		divisaInput = getDivisa("Dólar");
		divisaOutput = getDivisa("Euro");
	}
	
	public Double conversion() {
		return conversion(valorInput, divisaInput, divisaOutput);
	}
	
	public Double conversion(Double cantidad, Divisa divisaInput, Divisa divisaOutput) {
		
		return cantidad;
	}

	public ArrayList<Divisa> getDivisas() {
		return divisas;
	}
	
	public Divisa getDivisa(String nombre) {
		for (Divisa divisa : divisas) {
			if(divisa.getNombre().equals(nombre)) {
				return divisa;
			}
		}
		return null;
	}

	public Double getValorInput() {
		return valorInput;
	}

	public Double getValorOutput() {
		return valorOutput;
	}

	public Divisa getDivisaInput() {
		return divisaInput;
	}

	public Divisa getDivisaOutput() {
		return divisaOutput;
	}
	
	

}
