package ej6;

import java.util.Random;

public class Sala {
	
	private int filas;
	private int columnas;
	private String[][] sala;
	
	public Sala() {
		this.filas=0;
		this.columnas=0;
	}
	
	public Sala(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
		//Genero una matriz de numero de filas i numero de columnas que representan los asientos del cine
		this.sala = new String[this.filas][this.columnas];
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
	
	public String[][] getSala() {
		return sala;
	}
	
	//contar el numero de huecos que hay en la matriz
	public double contarAsientos() {
		double n_asientos = this.columnas*this.filas;
		return n_asientos;
	}
	
	//Metodo que cuenta cuantos huecos tienen el String Ocupado, si todos los huecos tienen este String, entonces el cine esta lleno
	public boolean contarLLeno() {
		//constante donde se le suma uno por cada espacio que tenga el string Ocupado 
		int contador=0;
		for (int i=0;i<this.columnas;i++) {
			for (int j=0; j<this.filas;j++) {
				if (this.sala[i][j].equals("Ocupado")) {
					contador++;
				}
			}
		}
		if (contador==(this.filas*this.columnas)) {
			return true;
		}
		return false;
	}
	
	//Ocupar un asiento
	public void ocuparAsiento() {
		Random rad = new Random();
		Random rad_1 = new Random();
		int n_filas=0;
		int n_columna = 0;
		do {
			//cojo numero random para la fila y para la columna y miro si tiene el string Ocupado, en caso positivo entonces busca otro lugar
			n_filas = rad.nextInt(this.filas);
			n_columna = rad_1.nextInt(this.columnas);
		}while(this.sala[n_filas][n_columna].equals("Ocupado"));
		
		//el lugar assignado pasa a guardar el String Ocupado
		this.sala[n_filas][n_columna]="Ocupado";
		System.out.println((this.filas-n_filas)+(char)(n_columna+65));
		
	}
}
