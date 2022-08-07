package ud21.Calculadora;

public class Divisa {
	
	private String nombre;
	private Double factorConversion;
	
	public Divisa(String nombre, Double factorConversion) {
		this.nombre = nombre;
		this.factorConversion = factorConversion;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getFactorConversion() {
		return factorConversion;
	}
	
	

}
