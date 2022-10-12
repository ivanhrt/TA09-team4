package ej6;

import java.util.Random;

public class Sala {

	private int filas;
	private int columnas;
	private int[][] sala;

	public Sala() {
		this.filas = 0;
		this.columnas = 0;
		this.sala = new int[this.filas][this.columnas];
	}

	public Sala(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
		// Genero una matriz de numero de filas i numero de columnas que representan los
		// asientos del cine
		this.sala = new int[this.filas][this.columnas];
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

	public int[][] getSala() {
		return sala;
	}

	// contar el numero de huecos que hay en la matriz
	public double contarAsientos() {
		double n_asientos = this.columnas * this.filas;
		return n_asientos;
	}

	// Metodo que cuenta cuantos huecos tienen el String Ocupado, si todos los
	// huecos tienen este String, entonces el cine esta lleno
	public boolean contarLLeno() {
		// constante donde se le suma uno por cada espacio que tenga el string Ocupado
		int contador = 0;
		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				if (this.sala[i][j] == 1) {
					contador++;
				}
			}
		}
		if (contador == (this.filas * this.columnas)) {
			return true;
		}
		return false;
	}

	// Ocupar un asiento
	public void ocuparAsiento(Espectador espectador, Pelicula pelicula) {
		
		// Impido acceder a un menor de edad saliendo del metodo si no pasa el if
		if (espectador.getEdad() < pelicula.getEdad_min()) {
			System.out.println("No tiene la edad mínima");
			return;
		}

		// Impido acceder si no tiene suficiente dinero saliendo del metodo si no pasa
		// el if
		if (espectador.getDinero() < pelicula.getPrecio_entrada()) {
			System.out.println("No tiene suficiente dinero");
			return;
		}

		if (contarLLeno()) {
			System.out.println("La sala ya esta llena");
			return;
		}

		System.out.println(espectador.getNombre()+" tu asiento para la pelicula " + pelicula.getPelicula() + " es:");
		Random rad = new Random();
		Random rad_1 = new Random();
		int n_filas = 0;
		int n_columna = 0;
		do {
			// cojo numero random para la fila y para la columna y miro si tiene el string
			// Ocupado, en caso positivo entonces busca otro lugar
			n_filas = rad.nextInt(this.filas);
			n_columna = rad_1.nextInt(this.columnas);
		} while (this.sala[n_filas][n_columna] == 1);
		int numero_columna = n_columna + 'A';
		char letra_columna = (char) numero_columna;
		// el lugar assignado pasa a guardar el String Ocupado
		this.sala[n_filas][n_columna] = 1;
		System.out.println("" + (this.filas - n_filas) + letra_columna);

	}
}
