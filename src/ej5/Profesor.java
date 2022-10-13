package ej5;

import java.util.Random;

public class Profesor extends Persona {
	
	enum Asignaturas{MATEMATICAS,FILOSOFIA,FISICA};
	
	private Asignaturas asignatura;
	
	private final Asignaturas ASIGNATURA_DEFAULT = Asignaturas.MATEMATICAS;
	
	public Profesor() {
		this.asignatura = ASIGNATURA_DEFAULT;
	}
	
	public Profesor(String nombre, int edad, char sexo, Asignaturas asignatura) {
		super(nombre, edad, sexo);
		this.asistencia = asistenciaProbabilidad();
		this.asignatura = asignatura;
	}
	
	@Override
	public boolean asistenciaProbabilidad() {
		Random rad = new Random();
		int num_aleatorio = rad.nextInt(1000)+1;
		if (num_aleatorio>800) {
			return false;
		}
		return true;
	}
	
	public void setAsistencia(boolean asistencia) {
		this.asistencia=asistencia;
	}

	public Asignaturas getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignaturas asignatura) {
		this.asignatura = asignatura;
	}
}