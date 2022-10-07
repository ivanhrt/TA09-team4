package ej6;

public class Sala {
	
	private int filas;
	private int columnas;
	
	public Sala() {
		this.filas=0;
		this.columnas=0;
	}
	
	public Sala(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	public String[][] generarSala(){
		String sala[][] = new String[this.columnas][this.filas];
		return sala;
	}
	
	public double contarAsientos() {
		double n_asientos = this.columnas*this.filas;
		return n_asientos;
	}
	
}
