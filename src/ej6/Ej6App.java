package ej6;

public class Ej6App {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Indiana Jones", 7.56,153,7,"Spielberg");
		Espectador espectador = new Espectador("",0,"Juan",23,50.5);
		Sala sala = new Sala(7,5);
		llenarSala(pelicula, espectador, sala);
		
	}

	public static void llenarSala(Pelicula pelicula, Espectador espectador, Sala sala) {
		
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
		
		if(sala.contarLLeno()) {
			System.out.println("La sala ya esta llena");
			return;
		}
		
		System.out.println("Tu asiento para la pelicula "+pelicula.getPelicula()+" es:");
		sala.ocuparAsiento();
	}
	
}
