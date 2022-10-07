package ej6;

public class Pelicula extends Cine{
	private double duracion;
	private int edad_min;
	private String director;
	
	public Pelicula() {
		this.duracion = 0.0;
		this.edad_min=0;
		this.director="";
	}
	
	public Pelicula(String pelicula, double precio, double duracion, int edad_min, String director) {
		super(pelicula,precio);
		this.duracion=duracion;
		this.edad_min=edad_min;
		this.director=director;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdad_min() {
		return edad_min;
	}

	public void setEdad_min(int edad_min) {
		this.edad_min = edad_min;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
