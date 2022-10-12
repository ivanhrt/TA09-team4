package ej3;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int num_pag;
	
	private final String STRING_DEFAULT = "";
	private final int NUM_PAG_DEFAULT = 0;
	
	public Libro() {
		this.isbn = STRING_DEFAULT;
		this.titulo = STRING_DEFAULT;
		this.autor = STRING_DEFAULT;
		this.num_pag = NUM_PAG_DEFAULT;
	}
	
	public Libro(String isbn, String titulo, String autor, int num_pag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.num_pag = num_pag;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNum_pag() {
		return num_pag;
	}

	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}

	@Override
	public String toString() {
		return "El libro " + titulo +" con ISBN "+ isbn + " creado por el autor " + autor + " tiene " + num_pag + " páginas";
	}
	
	
	
}
