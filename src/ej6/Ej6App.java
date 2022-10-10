package ej6;

public class Ej6App {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Indiana Jones", 7.56,153,7,"Spielberg");
		Sala sala = new Sala(2,2);
		Espectador espectador_1 = new Espectador("Juan",6,50.5);
		Espectador espectador_2 = new Espectador("Pepe",23,6);
		Espectador espectador_3 = new Espectador("Eustaquio",18,50.5);
		Espectador espectador_4 = new Espectador("Alberto",23,50.5);
		Espectador espectador_5 = new Espectador("Stefania",25,50.5);
		Espectador espectador_6 = new Espectador("Jennifer",30,50.5);
		Espectador espectador_7 = new Espectador("Sonia",45,50.5);
		
		llenarSala(pelicula, espectador_1, sala);
		llenarSala(pelicula, espectador_2, sala);
		llenarSala(pelicula, espectador_3, sala);
		llenarSala(pelicula, espectador_4, sala);
		llenarSala(pelicula, espectador_5, sala);
		llenarSala(pelicula, espectador_6, sala);
		llenarSala(pelicula, espectador_7, sala);
		
	}

	public static void llenarSala(Pelicula pelicula, Espectador espectador, Sala sala) {
		
		//Impido acceder a un menor de edad saliendo del metodo si no pasa el if
		if (espectador.getEdad()<pelicula.getEdad_min()) {
			System.out.println(espectador.getNombre()+" No tiene la edad mínima");
			return;
		}
		
		//Impido acceder si no tiene suficiente dinero saliendo del metodo si no pasa el if
		if (espectador.getDinero()<pelicula.getPrecio_entrada()) {
			System.out.println(espectador.getNombre()+" No tiene suficiente dinero");
			return;
		}
		
		if(sala.contarLLeno()) {
			System.out.println(espectador.getNombre()+" La sala ya esta llena");
			return;
		}
		
		System.out.println(espectador.getNombre()+" Tu asiento para la pelicula "+pelicula.getPelicula()+" es:");
		sala.ocuparAsiento();
	}
	
}