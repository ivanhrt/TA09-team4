package ej5;

import java.util.Random;

public class Estudiantes extends Persona {
	
	private int calificacion;
	
	private final int CALIFICACION_DEFAULT = 0;
	
	public Estudiantes() {
		super();
		this.calificacion=CALIFICACION_DEFAULT;
		
	}
	
	public Estudiantes(String nombre, int edad, char sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion=calificacion;
		this.asistencia=asistenciaProbabilidad();
	}
	
	@Override
	public boolean asistenciaProbabilidad() {
		Random rad = new Random();
		int num_aleatorio = rad.nextInt(1000)+1;
		if (num_aleatorio>500) {
			return false;
		}
		return true;
	}
	
	public void setAsistencia(boolean asistencia) {
		this.asistencia=asistencia;
	}

	public int getCalificacion() {
		return calificacion;
	}

}
