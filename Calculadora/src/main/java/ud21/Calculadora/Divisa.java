package ud21.Calculadora;

public class Divisa {
	
	private String nombre;
	private String pais;
	private String simbolo;
	private Double factorConversion;
	
	public Divisa(String pais,String nombre,String simbolo, Double factorConversion) {
		this.pais = pais;
		this.nombre = nombre;		
		this.simbolo = simbolo;
		this.factorConversion = factorConversion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public Double getFactorConversion() {
		return factorConversion;
	}
	
	/*
	public String getPais() {
		return pais;
	}	
	*/
}
