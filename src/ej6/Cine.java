package ej6;

public class Cine {

	protected String pelicula;
	protected double precio_entrada;
	
	public Cine() {
		this.pelicula = "";
		this.precio_entrada=0.0;
	}
	
	public Cine(String pelicula, double precio_entrada) {
		this.pelicula=pelicula;
		this.precio_entrada=precio_entrada;
	}
	
	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio_entrada() {
		return precio_entrada;
	}

	public void setPrecio_entrada(double precio_entrada) {
		this.precio_entrada = precio_entrada;
	}
	
}
