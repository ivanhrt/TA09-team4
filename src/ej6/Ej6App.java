package ej6;

public class Ej6App {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula();
		Espectador espectador = new Espectador();
		Sala sala = new Sala();
		
	}

	public static void llenarSala(Pelicula pelicula, Espectador espectador, Sala sala) {
		//Contador de asientos ocupados
		int contador = 0;
		
		String[][] salas=sala.generarSala();
		double n_asientos = sala.contarAsientos();
		
		//Impido acceder a un menor de edad saliendo del metodo si no pasa el if
		if (espectador.getEdad()<pelicula.getEdad_min()) {
			System.out.println("No tiene la edad mínima");
			return;
		}
		
		//Impido acceder si no tiene suficiente dinero saliendo del metodo si no pasa el if
		if (espectador.getDinero()<pelicula.getPrecio_entrada()) {
			System.out.println("No tiene suficiente dinero");
			return;
		}
		
		//Marcare con O de ocupado, la posicion de la matriz donde asiente una persona, por eso hago un recuento de O si es el mismo que el numero de posiciones, entonces la sala esta llena
		for (int i=0;i<salas.length;i++) {
			for (int j=0; j<salas[i].length;j++) {
				if (salas[i][j].equals("O")) {
					contador++;
				}
			}
		}
		
		if(contador==n_asientos) {
			System.out.println("La sala ya esta llena");
			return;
		}
		
	}
	
}
