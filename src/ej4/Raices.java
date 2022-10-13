package ej4;

public class Raices implements Raizable{
	
	private double a,b,c;

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	
	public double getDiscriminante() {
		return b*b-(4*a*c);
	}
	
	public boolean tieneRaices() {
		if (this.getDiscriminante()>0)
			return true;
		else 
			return false;
	}
	
	public boolean tieneRaiz() {
		if (this.getDiscriminante()==0)
			return true;
		else
			return false;
	}
	
	public void obtenerRaices() {
		double sA;
		double sB;
		sA = ((-this.b)+Math.sqrt(getDiscriminante())) / (2*a);
		sB = ((-this.b)-Math.sqrt(getDiscriminante())) / (2*a);
		System.out.println("Las soluciones son "+sA+ " y "+sB);
	}
	
	public void obtenerRaiz() {
		double sA;
		sA = ((-b)) / (2*a);
		
		System.out.println("La única solución es "+sA);
	}
	
	public void calcular() {
		if (tieneRaices())
			obtenerRaices();
		else if(tieneRaiz())
			obtenerRaiz();
		else
			System.out.println("La ecuación no tiene solución");
	}
	
	
	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
	
	

}
