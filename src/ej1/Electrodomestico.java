package ej1;

public class Electrodomestico {
	
	private static final double PRECIOBASEINICIAL = 100;
	private static final String COLORINICIAL = "BLANCO";
	private static final char CONSUMOINICIAL = 'F';
	private static final double PESOINICIAL = 5;
	
	protected double precioBase;
	protected String color;
	protected char consumo;
	protected double peso;

	public Electrodomestico() {
		this.setPrecioBase(PRECIOBASEINICIAL);
		this.setColor(COLORINICIAL);
		this.setConsumo(CONSUMOINICIAL);
		this.setPeso(PESOINICIAL);
		
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.setPrecioBase(precioBase);
		this.setPeso(peso);
		this.setColor(COLORINICIAL);
		this.setConsumo(CONSUMOINICIAL);
		
	}
	
	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		this.setPrecioBase(precioBase);
		this.setPeso(peso);
		this.setColor(comprobarColor(color));
		this.setConsumo(comprobarConsumo(consumo));
	}
	
	public String comprobarColor(String color) {
		//blanco, negro, rojo, azul y gris
		color = color.toUpperCase();
		
		if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
			
			return color;
		}
		else
			return "BLANCO";
	}
	
	private char comprobarConsumo(char consumo) {
		if (consumo>='A' && consumo<='F') {
			return consumo;
		}
		else if (consumo>='a' && consumo<='f'){
			System.out.println((char) (consumo-'a'+'A'));
			return (char) (consumo-'a'+'A');
		}
		else
			return CONSUMOINICIAL;
		
	}
	
	public String toString() {
		return "Precio - "+this.precioBase+" €"+
				"\nColor - "+this.color+
				"\nConsumo - "+this.consumo+
				"\nPeso - "+this.peso+" Kg";
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
