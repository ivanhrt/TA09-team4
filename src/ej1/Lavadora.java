package ej1;

public class Lavadora extends Electrodomestico{
	
	private final double CARGA_DEFECTO = 5.0;
	private double carga;
	
	public Lavadora() {
		this.setCarga(CARGA_DEFECTO);
	}
	
	public Lavadora(double precioBase, double peso) {
		super(precioBase,peso);
		this.setCarga(CARGA_DEFECTO);
	}
	
	public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
		super(precioBase,color,consumo,peso);
		this.setCarga(carga);
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public double precioFinal(){
		double precio_final=super.precioFinal();
		if (carga>30) {
			precio_final += 50;
		}
		return precio_final;
	}
	
}
