package ej1;

public class Ej1App {

	public static void main(String[] args) {
		Electrodomestico elecs[] = new Electrodomestico[10];
		elecs[0]=new Electrodomestico(300, "rojo", 'd',25);
		elecs[1]=new Lavadora(300, "rojo", 'd',25,35);
		
		for(int i=0;i<2;i++) {
			System.out.println(elecs[i].precioFinal());
		}

	}

}
