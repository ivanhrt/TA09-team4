package ej3;

public class Ej3App {

	public static void main(String[] args) {
		Libro libros[] = new Libro[2];
		
		libros[0] = new Libro("589-258-25-7465-256", "El viaje al centro de la tierra", "Julio Verne", 274);
		libros[1]= new Libro("33-8237-41-396-72", "El señor de los anillos", "J. R. R. Tolkien", 1392);
		
		System.out.println(libros[0].toString());
		System.out.println(libros[1].toString());
	
		Catalogo catalogo_1 = new Catalogo();
		catalogo_1.compararPaginas(libros);
	}

}