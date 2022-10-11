package ej1;

public class Ej1App {

	public static void main(String[] args) {
		Electrodomestico elecs[] = new Electrodomestico[10];
		inicializarElec(elecs);
		
		for(int i=0;i<elecs.length;i++) {
			System.out.println(elecs[i]);
			System.out.println("Precio final = "+elecs[i].precioFinal()+" €");
		}

	}

	private static void inicializarElec(Electrodomestico[] elecs) {
		elecs[0]=new Electrodomestico(300, "rojo", 'd',25);
		elecs[1]=new Lavadora(300, "morado", 'e',25,29);
		elecs[2]=new Electrodomestico(500, "azul", 'f',27);
		elecs[3]=new Lavadora(450, "gris", 'a',26,35);
		elecs[4]=new Television(200, "negro", 'a',10,1440,false);
		elecs[5]=new Lavadora(600, "rojo", 'b',24,35);
		elecs[6]=new Television(100, "gris", 'c',15,2160,true);
		elecs[7]=new Lavadora(170, "rosa", 'd',39,25);
		elecs[8]=new Television(150, "rojo", 'd',27,1080,false);
		elecs[9]=new Television(300, "purpura", 'd',12,1440,false);
		
	}

}
