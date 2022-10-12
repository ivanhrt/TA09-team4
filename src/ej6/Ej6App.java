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
		sala.ocuparAsiento(espectador_1, pelicula);
		sala.ocuparAsiento(espectador_2, pelicula);
		sala.ocuparAsiento(espectador_3, pelicula);
		sala.ocuparAsiento(espectador_4, pelicula);
		sala.ocuparAsiento(espectador_5, pelicula);
		sala.ocuparAsiento(espectador_6, pelicula);
		sala.ocuparAsiento(espectador_7, pelicula);
	}
	
}