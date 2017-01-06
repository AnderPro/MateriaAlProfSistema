package com.epn;

public class Aplicacion {

	public static void main(String[] args) {
		//Profesor
		String id1="0401394200";
		String nombre1="Anderson";
		String apellido1="Morillo";
		
		//profesor 2
		String id2="123";
		String nombre2="Mirana";
		String apellido2="Rivaldo";
		
		//profesor 3
		String id3="1234";
		String nombre3="Jorge";
		String apellido3="Suárez";
		
		Profesor p1=new Profesor(id1,nombre1,apellido1);
		Profesor p2=new Profesor(id2,nombre2,apellido2);
		Profesor p3=new Profesor(id3,nombre3,apellido3);
		
		//alumno1
		String id4="111";
		String nombre4="Israel";
		String apellido4="Pérez";
		int edad1=26;
		
		//alumno2
		String id5="666";
		String nombre5="Diablo";
		String apellido5="Satanás";
		int edad2=666;
		//alumno3
		String id6="222";
		String nombre6="Ana";
		String apellido6="Pérez";
		int edad3=18;
		
		Alumno a1=new Alumno(id4,nombre4,apellido4,edad1);
		Alumno a2=new Alumno(id5,nombre5,apellido5,edad2);
		Alumno a3=new Alumno(id6,nombre6,apellido6,edad3);
		
		//materia 1
	   String nom1="Sistemas de Comunicaciones";
	   Profesor [] profesores1={p1,p2};
       Alumno[] alumnos1={a1};
       
       //materia 2
       String nom2="Estructuras de Datos";
	   Profesor [] profesores2={p2,p3};
       Alumno[] alumnos2={a2,a3};
       
       //materia 3
       String nom3="Matematicas Discretas";
	   Profesor [] profesores3={p1};
       Alumno[] alumnos3={a1,a2};
       
       String nom4="Arquitectura de Computadores";
	   Profesor [] profesores4={p2};
       Alumno[] alumnos4={a1,a2,a3};
       
       
       Materia m1= new Materia(nom1,profesores1,alumnos1);
       Materia m2= new Materia(nom2,profesores2,alumnos2);
       Materia m3= new Materia(nom3,profesores3,alumnos3);
       Materia m4= new Materia(nom4,profesores4,alumnos4);
       
       Materia materias[]={m1,m2,m3,m4};
			
			Sistema sistema=new Sistema(materias);
			
			System.out.println(sistema.materiaPorProfesor("123"));
	
	}

}

