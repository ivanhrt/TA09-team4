package ej5;

import java.util.Random;

public abstract class  Persona {
	
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean asistencia;
	
	protected final String NOMBRE_DEFAULT = "";
	protected final int EDAD_DEFAULT=0;
	protected final char SEXO='H';
	protected final boolean ASISTENCIA_DEFAULT=true;
	
	public Persona() {
		this.nombre=NOMBRE_DEFAULT;
		this.edad=EDAD_DEFAULT;
		this.sexo=SEXO;
		this.asistencia=ASISTENCIA_DEFAULT;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.asistencia=ASISTENCIA_DEFAULT;
	}
	
	public boolean asistenciaProbabilidad() {
		return true;
	}

	public boolean isAsistencia() {
		return asistencia;
	}

	public char getSexo() {
		return sexo;
	}

	public String getNombre() {
		return nombre;
	}
	
}