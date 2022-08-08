package ud21.Calculadora;

import java.util.ArrayList;

public class Calculadora {

	private ArrayList<Divisa> divisas;
	private Double valorInput;
	private Divisa divisaInput;
	private Divisa divisaOutput;

	public Calculadora() {
		divisas = new ArrayList<Divisa>();
		divisas.add(new Divisa("Estados Unidos", "Dólar", "$", 1.0));
		divisas.add(new Divisa("Europa", "Euro", "€", 0.9818));
		divisas.add(new Divisa("Reino Unido", "Libra", "£", 0.8282));
		divisas.add(new Divisa("Japón", "Yen", "¥", 134.97));
		valorInput = 0.0;
		divisaInput = getDivisa("Dólar");
		divisaOutput = getDivisa("Euro");
	}

	public Double conversion() {
		return conversion(valorInput, divisaInput, divisaOutput);
	}

	public Double conversion(Double cantidad, Divisa divisaInput, Divisa divisaOutput) {
		Double resultado;

		resultado = cantidad / divisaInput.getFactorConversion() * divisaOutput.getFactorConversion();
		resultado = Math.round(resultado*100.0)/100.0;

		return resultado;
	}

	public Divisa getDivisa(String nombre) {
		for (Divisa divisa : divisas) {
			if (divisa.getNombre().equals(nombre)) {
				return divisa;
			}
		}
		return null;
	}

	public Divisa getDivisaBySimbol(String simbol) {
		for (Divisa divisa : divisas) {
			if (divisa.getSimbolo().equals(simbol)) {
				return divisa;
			}
		}
		return null;
	}

	public void setDivisaInput(Divisa divisaInput) {
		this.divisaInput = divisaInput;
	}

	public void setDivisaOutput(Divisa divisaOutput) {
		this.divisaOutput = divisaOutput;
	}

	public void setValorInput(Double valorInput) {
		this.valorInput = valorInput;
	}

	/*public String inputToString() {
		String resultado = "";
		int valorSinDecimales = valorInput.intValue();
		if (valorInput > Integer.valueOf(valorSinDecimales)) {
			resultado += valorInput.toString();
		} else {
			resultado += valorSinDecimales;
		}
		resultado += " " + divisaInput.getSimbolo();

		return resultado;
	}

	public String outputToString() {
		String resultado = "";
		int valorSinDecimales = valorOutput.intValue();
		if (valorOutput > Integer.valueOf(valorSinDecimales)) {
			resultado += valorOutput.toString();
		} else {
			resultado += valorSinDecimales;
		}
		resultado += " " + divisaOutput.getSimbolo();

		return resultado;
	}*/

}
