package ej5;

import ej5.Profesor.Asignaturas;

public class Ej5App {

	public static void main(String[] args) {
		
		Profesor profesor = new Profesor("Jose",30,'H',Asignaturas.FILOSOFIA);
		Aula aula = new Aula (1, 20, Asignaturas.FILOSOFIA);
		Estudiantes estudiante[] = new Estudiantes[20];
		estudiante[0]= new Estudiantes("Juan",18,'H',8);
		estudiante[1]= new Estudiantes("Ivan",17,'H',6);
		estudiante[2]= new Estudiantes("Oscar",16,'H',9);
		estudiante[3]= new Estudiantes("Alberto",20,'H',5);
		estudiante[4]= new Estudiantes("Javier",18,'H',3);
		estudiante[5]= new Estudiantes("Matias",18,'H',4);
		estudiante[6]= new Estudiantes("Ruben",21,'H',8);
		estudiante[7]= new Estudiantes("German",16,'H',2);
		estudiante[8]= new Estudiantes("Roger",19,'H',10);
		estudiante[9]= new Estudiantes("Jaime",17,'H',6);
		estudiante[10]= new Estudiantes("Ariadna",20,'M',9);
		estudiante[11]= new Estudiantes("Elena",23,'M',10);
		estudiante[12]= new Estudiantes("Raquel",17,'M',4);
		estudiante[13]= new Estudiantes("Judit",16,'M',3);
		estudiante[14]= new Estudiantes("Marina",18,'M',7);
		estudiante[15]= new Estudiantes("Nerea",20,'M',8);
		estudiante[16]= new Estudiantes("Silvia",19,'M',6);
		estudiante[17]= new Estudiantes("Vanesa",22,'M',2);
		estudiante[18]= new Estudiantes("Martina",21,'M',7);
		estudiante[19]= new Estudiantes("Natalia",18,'M',6);
		
		aula.hayClase(profesor, estudiante);

	}

}
