package ej3;

public class Catalogo implements Catalogable {
	
	public void compararPaginas(Libro libro[]) {
		
		int n_pag = 0;
		String titulo = "";
		
		//hago un bucle para que saque el valor del numero de paginas de todos los objetos metidos en el array
		for (int i=0; i<libro.length;i++) {
			int n_pag_for = libro[i].getNum_pag();
			if (n_pag_for > n_pag) {
				n_pag = n_pag_for;
				titulo = libro[i].getTitulo();
			}
		}
		
		System.out.println("El libro con más páginas es "+titulo+" que tiene "+n_pag+" páginas");
	}
	
}