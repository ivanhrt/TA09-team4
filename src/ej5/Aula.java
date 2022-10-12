package ej5;

import java.util.ArrayList;

import ej5.Profesor.Asignaturas;

public class Aula {
	
	private int identificador;
	private int num_max;
	private Asignaturas asignatura;
	
	private final Asignaturas ASIGNATURA_DEFAULT = Asignaturas.MATEMATICAS;
	private final int IDENTIFICADOR_DEFAULT = 0;
	private final int NUM_MAX_DEFAULT = 0;
	
	public Aula() {
		this.identificador=IDENTIFICADOR_DEFAULT;
		this.num_max=NUM_MAX_DEFAULT;
		this.asignatura = ASIGNATURA_DEFAULT;
	}
	
	public Aula(int identificador, int num_max, Asignaturas asignatura) {
		this.identificador=identificador;
		this.num_max=num_max;
		this.asignatura = asignatura;
	}
	
	public void hayClase(Profesor profesor, Estudiantes estudiante[]) {
		
		if (profesor.isAsistencia()==false) {
			System.out.println("El profesor no esta");
			return;
		}
		
		if (profesor.getAsignatura()!=asignatura) {
			System.out.println("El profesor no es de esta asignatura");
			return;
		}
		
		if (estudiante.length>num_max) {
			System.out.println("El numero de alumnos supera la capacidad del aula");
			return;
		}
		
		double contador = 0;
		for (int i=0; i<estudiante.length; i++) {
			if (estudiante[i].isAsistencia() == true) {
				contador++;
			}
		}
		
		double calculo=(contador/estudiante.length)*100;
		if (calculo>50) {
		} else {
			System.out.println("No se llega a la mitad de los alumnos");
			return;
		}
		
		ArrayList<String> alumnos_hombres = new ArrayList<>();
		ArrayList<String> alumnos_mujeres = new ArrayList<>();
		ArrayList<String> asistencia_alumnos_hombres = new ArrayList<>();
		ArrayList<String> asistencia_alumnos_mujeres = new ArrayList<>();
		ArrayList<Integer> notas_alumnos_hombres = new ArrayList<>();
		ArrayList<Integer> notas_alumnos_mujeres = new ArrayList<>();
		
		for (int i=0; i<estudiante.length; i++) {
			if (estudiante[i].getSexo() == 'H') {
				alumnos_hombres.add(estudiante[i].getNombre());
				notas_alumnos_hombres.add(estudiante[i].getCalificacion());
				if (estudiante[i].isAsistencia()==true) {
					asistencia_alumnos_hombres.add("Presente");
				} else {
					asistencia_alumnos_hombres.add("No Presente");
				}
			} else if (estudiante[i].getSexo() == 'M'){
				alumnos_mujeres.add(estudiante[i].getNombre());
				notas_alumnos_mujeres.add(estudiante[i].getCalificacion());
				if (estudiante[i].isAsistencia()==true) {
					asistencia_alumnos_mujeres.add("Presente");
				} else {
					asistencia_alumnos_mujeres.add("No Presente");
				}
			}
		}
		System.out.println("Las notas de los alumnos");
		for (int j=0; j<alumnos_hombres.size();j++) {
			System.out.println(alumnos_hombres.get(j)+"  "+notas_alumnos_hombres.get(j)+"  "+asistencia_alumnos_hombres.get(j));
		}
		
		System.out.println("\n");
		
		System.out.println("Las notas de las alumnas");
		for (int j=0; j<alumnos_mujeres.size();j++) {
			System.out.println(alumnos_mujeres.get(j)+"  "+notas_alumnos_mujeres.get(j)+"  "+asistencia_alumnos_mujeres.get(j));
		}
	}
}